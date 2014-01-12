/*
 VerboseOption.java
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

package net.sourceforge.plantumldependency.commoncli.option.impl.verbose;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOption;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * A default implementation managing the "-verbose" option, allowing to set the program debug
 * option. <i>Note : no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VerboseOption extends AbstractOption {

    /** Serial version UID. */
    private static final long serialVersionUID = -5847253494029333067L;

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-v";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >(
            asList(new String[] {"--verbose"})));

    /**
     * Default constructor.
     *
     * @since 1.3.0
     */
    public VerboseOption() {
        this(new StringBuilder("To display log information."), ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * Full constructor.
     *
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @param optionStatus
     *            the option status, telling if the option is active, inactive or hidden, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    public VerboseOption(final StringBuilder fullOptionDescription, final OptionStatus optionStatus) {
        super("-v", unmodifiableSet(new TreeSet < String >(asList(new String[] {"--verbose"}))), fullOptionDescription,
                optionStatus);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public VerboseOption deepClone() {
        return (VerboseOption) super.deepClone();
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
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getMainUsageAdditions() {
        return new StringBuilder();
    }

    /**
     * Read and parses the command to see if the verbose option has been specified.
     *
     * @param commandLine
     *            the {@link CommandLine} instance to read and parse, mustn't be <code>null</code>.
     * @return <code>true</code> if the verbose option has been specified, <code>false</code>
     *         otherwise.
     * @throws CommandLineException
     *             if any error occurs when reading or parsing the command line.
     * @since 1.3.0
     */
    public boolean isVerboseModeActive(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        return commandLine.isOptionActiveAndSpecified(this);
    }
}
