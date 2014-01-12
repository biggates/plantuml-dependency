/*
 AboutOption.java
 Creation date : 2/06/2010
 Copyright © Benjamin Croizet (graffity2199@yahoo.fr)

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 or GNU Lesser General Public License as published by the
 Free Software Foundation; either version 3 of the License,
 or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received copies of the GNU General Public License
 and GNU Lesser General Public License along with this program;
 if not, write to the Free Software Foundation, Inc.,
 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 http://www.fsf.org/licensing/licenses/gpl.html
 http://www.gnu.org/licenses/lgpl.html
 */

package net.sourceforge.plantumldependency.commoncli.option.impl.about;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.JAVA_PROGRAM_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.OPTION_NOT_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOption;
import net.sourceforge.plantumldependency.commoncli.option.execution.ExecutableOption;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;

/**
 * A default implementation managing the "-about" option, displaying the program authors
 * information. <i>Note : no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class AboutOption extends AbstractOption implements ExecutableOption {

    /** Serial version UID. */
    private static final long serialVersionUID = -89198534939353471L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AboutOption.class.getName());

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-about";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >(asList(new String[] {
            "--author", "--authors"})));

    /** The java program to display authors information. */
    private JavaProgram javaProgram;

    /** The option priority. */
    private int priority;

    /**
     * Default constructor.
     *
     * @param program
     *            the java program to display authors information, mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options</i>.
     * @since 1.3.0
     */
    public AboutOption(final JavaProgram program, final int optionPriority) {
        this(new StringBuilder("To display information about " + program.getName() + ", its license and its authors."),
                program, optionPriority, ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * Full constructor.
     *
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @param program
     *            the java program to display authors information, mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options</i>.
     * @param optionStatus
     *            the option status, telling if the option is active, inactive or hidden, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    public AboutOption(final StringBuilder fullOptionDescription, final JavaProgram program, final int optionPriority,
            final OptionStatus optionStatus) {
        super(OPTION_MAIN_SYNOPSIS, OPTION_SYNOPSIS, fullOptionDescription, optionStatus);
        setJavaProgram(program);
        setPriority(optionPriority);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public AboutOption deepClone() {
        final AboutOption a = (AboutOption) super.deepClone();
        a.javaProgram = getJavaProgram().deepClone();
        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getFullUsageAdditions() {
        return new StringBuilder();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getFullUsageDescriptionAdditions() {
        return new StringBuilder();
    }

    /**
     * Gets the value of <code>javaProgram</code>.
     *
     * @return the value of <code>javaProgram</code>.
     * @see #setJavaProgram(JavaProgram)
     * @since 1.3.0
     */
    private JavaProgram getJavaProgram() {
        return javaProgram;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getMainUsageAdditions() {
        return new StringBuilder();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public OptionExecution parseCommandLine(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        OptionExecution optionExecution = null;

        if (commandLine.isOptionActiveAndSpecified(this)) {
            optionExecution = new AboutOptionExecution(getJavaProgram(), getPriority());
        } else {
            LOGGER.log(FINE, buildLogString(OPTION_NOT_SPECIFIED_FINE, getAllNames()));
        }

        return optionExecution;
    }

    /**
     * Sets the value of <code>javaProgram</code>.
     *
     * @param value
     *            the <code>javaProgram</code> to set, can be <code>null</code>.
     * @see #getJavaProgram()
     * @since 1.3.0
     */
    private void setJavaProgram(final JavaProgram value) {
        checkNull(value, JAVA_PROGRAM_NULL_ERROR);

        javaProgram = value;
    }

    /**
     * Sets the value of <code>priority</code>.
     *
     * @param value
     *            the <code>priority</code> to set.
     * @see #getPriority()
     * @since 1.3.0
     */
    private void setPriority(final int value) {
        priority = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + ", javaProgram=" + javaProgram + ", priority="
                + priority + "]";
    }
}
