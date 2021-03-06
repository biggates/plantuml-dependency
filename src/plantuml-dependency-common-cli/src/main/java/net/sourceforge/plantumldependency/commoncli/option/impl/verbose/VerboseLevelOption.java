/*
 VerboseLevelOption.java
 Creation date : 31/10/2010
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
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.log.LevelOptionArgumentImpl;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * A more advanced implementation managing the "-verbose" option with a logging level. <i>Note : no
 * option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VerboseLevelOption extends AbstractOptionWithArgument < Level > {

    /** Serial version UID. */
    private static final long serialVersionUID = -3207782116090972597L;

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
    public VerboseLevelOption() {
        this(new LevelOptionArgumentImpl(false), new StringBuilder("To display log information."), SPACE_CHAR,
                ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * Full constructor.
     *
     * @param argument
     *            the option argument, mustn't be <code>null</code>.
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @param valSepararator
     *            the option - argument separator. Most of the time, it is a single space " " but it
     *            may be "=" or "-", mustn't be <code>null</code>.
     * @param optionStatus
     *            the option status, telling if the option is active, inactive or hidden, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    public VerboseLevelOption(final OptionArgument < Level > argument, final StringBuilder fullOptionDescription,
            final String valSepararator, final OptionStatus optionStatus) {
        super(OPTION_MAIN_SYNOPSIS, OPTION_SYNOPSIS, argument, fullOptionDescription, valSepararator, optionStatus);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public VerboseLevelOption deepClone() {
        return (VerboseLevelOption) super.deepClone();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        return WARNING.getName();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        return INFO.getName();
    }
}
