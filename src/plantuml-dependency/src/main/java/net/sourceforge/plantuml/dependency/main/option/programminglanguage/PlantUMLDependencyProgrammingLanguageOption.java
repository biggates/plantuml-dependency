/*
 PlantUMLDependencyProgrammingLanguageOption.java
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage;

import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.mazix.cli.option.status.OptionStatus.ACTIVE_OPTION_STATUS;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;

import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.AbstractOptionWithArgument;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;

/**
 * The programming language option, allowing to specify the source file programming language to
 * analyze. <i>Note : no option should have the same main or secondary names</i>.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyProgrammingLanguageOption extends AbstractOptionWithArgument < ProgrammingLanguage > {

    /** Serial version UID. */
    private static final long serialVersionUID = 1482556561536453265L;

    /** The default programming language when the option is not specified. */
    public static final ProgrammingLanguage DEFAULT_PROGRAMMING_LANGUAGE = JAVA;

    /**
     * Default constructor.
     * 
     * @since 1.0
     */
    public PlantUMLDependencyProgrammingLanguageOption() {
        super("-l", unmodifiableSet(new TreeSet < String >()), false,
                new PlantUMLDependencyProgrammingLanguageOptionArgument(true), new StringBuffer(
                        "To choose the programming language to reverse engineering. If not specified, the default programming language is \""
                                + DEFAULT_PROGRAMMING_LANGUAGE.getName() + "\"."), SPACE_CHAR, ACTIVE_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getDefaultArgumentAsString(final CommandLine commandLine) throws CommandLineException {
        return DEFAULT_PROGRAMMING_LANGUAGE.getName();
    }
}
