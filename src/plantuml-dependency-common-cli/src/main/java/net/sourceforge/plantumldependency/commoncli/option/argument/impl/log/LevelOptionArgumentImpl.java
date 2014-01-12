/*
 LevelOptionArgumentImpl.java
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.log;

import static java.util.logging.Level.parse;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.NOT_LOG_LEVEL_ARGUMENT_ERROR;

import java.util.logging.Level;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The log level implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * specifying a log {@link Level} argument.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class LevelOptionArgumentImpl extends AbstractOptionArgument < Level > {

    /** Serial version UID. */
    private static final long serialVersionUID = -456175880858276198L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "VERBOSE_LEVEL";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies the verbose level. The argument may consist of either a level name or an integer value. Classical values are : \"SEVERE\":1000, \"WARNING\":900, \"INFO\":800, \"CONFIG\":700, \"FINE\":500, \"FINER\":400, \"FINEST\":300. By default, if the verbose option is specified but the level is not set, the value \"INFO\":800 is taken. If not specified, the default value is \"WARNING\":900.";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public LevelOptionArgumentImpl(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuilder(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Level parseArgument(final String argument) throws CommandLineException {
        Level level = null;

        if (isNotEmpty(argument)) {
            try {
                level = parse(argument);
            } catch (final IllegalArgumentException e) {
                throw new CommandLineException(buildLogString(NOT_LOG_LEVEL_ARGUMENT_ERROR, argument), e);
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return level;
    }
}
