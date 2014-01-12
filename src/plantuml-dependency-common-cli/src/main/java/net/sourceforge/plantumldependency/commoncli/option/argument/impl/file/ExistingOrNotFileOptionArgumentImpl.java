/*
 ExistingOrNotFileOptionArgumentImpl.java
 Creation date : 19/11/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.file;

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.NON_DIRECTORY_FILE_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.FILE_ARGUMENT_NOT_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.FILE_ARGUMENT_SPECIFIED_FINE;

import java.io.File;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The file implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * specifying a non directory existing or non existing {@link File} argument.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ExistingOrNotFileOptionArgumentImpl extends AbstractOptionArgument < File > {

    /** Serial version UID. */
    private static final long serialVersionUID = 8823679291565787057L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(ExistingOrNotFileOptionArgumentImpl.class.getName());

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "FILE";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies a valid file path, where the file can exist or not and is not a directory. It can be absolute or relative. If the file already exists, it overrides it.";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public ExistingOrNotFileOptionArgumentImpl(final boolean optionArgumentIsMandatory) {
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
    public File parseArgument(final String argument) throws CommandLineException {
        File file = null;

        if (isNotEmpty(argument)) {
            file = new File(argument);
            if (file.isDirectory()) {
                throw new CommandLineException(buildLogString(NON_DIRECTORY_FILE_ARGUMENT_ERROR, argument));
            } else if (file.exists()) {
                LOGGER.log(FINE, buildLogString(FILE_ARGUMENT_SPECIFIED_FINE, argument));
            } else {
                LOGGER.log(FINE, buildLogString(FILE_ARGUMENT_NOT_SPECIFIED_FINE, argument));
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return file;
    }
}
