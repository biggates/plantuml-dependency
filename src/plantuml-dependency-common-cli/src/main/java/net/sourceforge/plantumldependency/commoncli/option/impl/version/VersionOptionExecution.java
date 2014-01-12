/*
 VersionOptionExecution.java
 Creation date : 9/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.impl.version;

import static java.util.logging.Level.INFO;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LEFT_PARENTHESIS_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.RIGHT_PARENTHESIS_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.system.SystemUtils.getSystemPropertiesSetToDisplay;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.IMPORTANT_SYSTEM_PROPERTIES;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.JAVA_PROGRAM_NULL_ERROR;

import java.util.Set;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.AbstractOptionExecution;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;

/**
 * The default option execution associated to the "-version" option, displaying the program usage
 * information.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VersionOptionExecution extends AbstractOptionExecution {

    /** Serial version UID. */
    private static final long serialVersionUID = 5663514744085994950L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(VersionOptionExecution.class.getName());

    /** The java program to display authors information. */
    private JavaProgram javaProgram;

    /** The verbose mode which can affect the version to display, if necessary. */
    private boolean verboseMode;

    /**
     * Full constructor.
     *
     * @param program
     *            the java program to display help information, mustn't be <code>null</code>.
     * @param verboseModeActive
     *            the verbose mode which can affect the version to display.
     * @param optionPriority
     *            the option priority as an integer.
     * @since 1.3.0
     */
    public VersionOptionExecution(final JavaProgram program, final boolean verboseModeActive, final int optionPriority) {
        super(optionPriority);
        setJavaProgram(program);
        setVerboseMode(verboseModeActive);
    }

    /**
     * Default constructor.
     *
     * @param program
     *            the java program to display help information, mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options executions</i>.
     * @since 1.3.0
     */
    public VersionOptionExecution(final JavaProgram program, final int optionPriority) {
        this(program, true, optionPriority);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public VersionOptionExecution deepClone() {
        final VersionOptionExecution a = (VersionOptionExecution) super.deepClone();
        a.javaProgram = getJavaProgram().deepClone();
        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void execute() throws CommandLineException {
        final StringBuilder buffer = new StringBuilder(getJavaProgram().getName());
        buffer.append(" version ");
        buffer.append(getJavaProgram().getVersion().getFullVersionNumber());
        buffer.append(SPACE_CHAR);
        buffer.append(LEFT_PARENTHESIS_CHAR);
        buffer.append(getJavaProgram().getVersion().getCompilationTime());
        buffer.append(RIGHT_PARENTHESIS_CHAR);
        buffer.append(SPACE_CHAR);

        Set < String > systemPropertiesSetToDisplay = null;
        if (isVerboseMode()) {
            systemPropertiesSetToDisplay = getSystemPropertiesSetToDisplay();
        } else {
            systemPropertiesSetToDisplay = getSystemPropertiesSetToDisplay(IMPORTANT_SYSTEM_PROPERTIES);
        }

        for (final String propertyToDisplay : systemPropertiesSetToDisplay) {
            buffer.append(LINE_CHAR);
            buffer.append(propertyToDisplay);
        }

        final String bufferStr = buffer.toString();
        System.out.println(bufferStr);
        LOGGER.log(INFO, bufferStr);
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
     * Gets the value of <code>verboseMode</code>.
     *
     * @return the value of <code>verboseMode</code>.
     * @see #setVerboseMode(boolean)
     * @since 1.3.0
     */
    private boolean isVerboseMode() {
        return verboseMode;
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
     * Sets the value of <code>verboseMode</code>.
     *
     * @param value
     *            the <code>verboseMode</code> to set, can be <code>null</code>.
     * @see #isVerboseMode()
     * @since 1.3.0
     */
    private void setVerboseMode(final boolean value) {
        verboseMode = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + ", javaProgram=" + javaProgram + ", verboseMode="
                + verboseMode + "]";
    }
}
