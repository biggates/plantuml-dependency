/*
 PlantUMLDependencyProgrammingLanguageOptionArgument.java
 Creation date : 18/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument;

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.PROGRAMMING_LANGUAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.getProgrammingLanguageNamesSet;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.valueOfIgnoringCase;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument;

/**
 * The programming language implementation of the
 * {@link net.sourceforge.mazix.cli.option.argument.OptionArgument} interface, specifying a
 * {@link ProgrammingLanguage} argument.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyProgrammingLanguageOptionArgument extends AbstractOptionArgument < ProgrammingLanguage > {

    /** Serial version UID. */
    private static final long serialVersionUID = -151684884591596960L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "PROGRAMMING_LANGUAGE";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE
            + " specifies the programming language contains in the source files to analyse. Possible values : "
            + getProgrammingLanguageNamesSet() + DOT_CHAR;

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.0
     */
    public PlantUMLDependencyProgrammingLanguageOptionArgument(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuffer(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public ProgrammingLanguage parseArgument(final String argument) throws CommandLineException {
        ProgrammingLanguage language = null;

        if (isNotEmpty(argument)) {
            try {
                language = valueOfIgnoringCase(argument.toUpperCase());
            } catch (final IllegalArgumentException e) {
                throw new CommandLineException(e.getMessage(), e);
            }
        } else {
            throw new CommandLineException(PROGRAMMING_LANGUAGE_NAME_NULL_ERROR);
        }

        return language;
    }
}
