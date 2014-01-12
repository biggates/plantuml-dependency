/*
 AbstractFilePatternOptionArgumentImpl.java
 Creation date : 5/06/2010
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

import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

import org.apache.tools.ant.types.FileSet;

/**
 * An abstract implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * providing common behaviors for Ant {@link FileSet} arguments.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class AbstractFilePatternOptionArgumentImpl extends AbstractOptionArgument < FileSet > {

    /** Serial version UID. */
    private static final long serialVersionUID = -8732226016764025008L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "FILE_PATTERN";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies a file pattern, with the same syntax as ANT patterns. It means that \"**\", \"*\" or \"?\" special characters can be used. For more information, please consult http://ant.apache.org/manual/dirtasks.html.";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public AbstractFilePatternOptionArgumentImpl(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuilder(USAGE_DESCRIPTION));
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
    public AbstractFilePatternOptionArgumentImpl(final boolean optionArgumentIsMandatory,
            final StringBuilder fullArgumentDescription) {
        super(optionArgumentIsMandatory, fullArgumentDescription);
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
}
