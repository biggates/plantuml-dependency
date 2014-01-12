/*
 ExcludeFilePatternOptionArgumentImpl.java
 Creation date : 15/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.CURRENT_DIRECTORY;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.utils.fileset.FileSetUtils.createFileSet;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.apache.tools.ant.types.FileSet;

/**
 * The exclude file pattern implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * specifying an exclude {@link FileSet} argument.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ExcludeFilePatternOptionArgumentImpl extends AbstractFilePatternOptionArgumentImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 2975558155322847795L;

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public ExcludeFilePatternOptionArgumentImpl(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory);
    }

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @param fullArgumentDescription
     *            the full argument usage description, explaining what the argument does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @since 1.3.0
     */
    public ExcludeFilePatternOptionArgumentImpl(final boolean optionArgumentIsMandatory,
            final StringBuilder fullArgumentDescription) {
        super(optionArgumentIsMandatory, fullArgumentDescription);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public FileSet parseArgument(final String argument) throws CommandLineException {
        FileSet fileSet = null;

        if (isNotEmpty(argument)) {
            fileSet = createFileSet(CURRENT_DIRECTORY, "**/*", argument);
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return fileSet;
    }
}
