/*
 CppProgrammingLanguage.java
 Creation date : 19/06/2010
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument;

import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.CPP_NOT_IMPLEMENTED_YET_ERROR;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.ProgrammingLanguageContext;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.impl.CppProgrammingLanguageContext;

/**
 * The C++ {@link ProgrammingLanguage} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
class CppProgrammingLanguage extends ProgrammingLanguage {

    /** Serial version UID. */
    private static final long serialVersionUID = 5226406064459624517L;

    /**
     * Default constructor.
     *
     * @param programmingLanguageName
     *            the programming language name to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @since 1.0.0
     */
    protected CppProgrammingLanguage(final String programmingLanguageName) {
        super(programmingLanguageName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public ProgrammingLanguageContext createNewContext(final Set < DisplayType > displayTypesOpt) {
        return new CppProgrammingLanguageContext(displayTypesOpt);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public GenericDependency readDependencyFromFile(final String sourceFileContent,
            final ProgrammingLanguageContext programmingLanguageContext) {
        throw new UnsupportedOperationException(CPP_NOT_IMPLEMENTED_YET_ERROR);
    }
}
