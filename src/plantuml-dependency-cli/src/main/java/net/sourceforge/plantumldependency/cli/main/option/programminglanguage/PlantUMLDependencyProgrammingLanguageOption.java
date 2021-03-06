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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage;

import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;

/**
 * The programming language option, allowing to specify the source file programming language to
 * analyze. <i>Note : no option should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class PlantUMLDependencyProgrammingLanguageOption extends AbstractOptionWithArgument < ProgrammingLanguage > {

    /** Serial version UID. */
    private static final long serialVersionUID = 1482556561536453265L;

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-l";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >());

    /** The default programming language when the option is not specified. */
    public static final ProgrammingLanguage DEFAULT_PROGRAMMING_LANGUAGE = JAVA;

    /**
     * Default constructor.
     *
     * @since 1.0.0
     */
    public PlantUMLDependencyProgrammingLanguageOption() {
        super(OPTION_MAIN_SYNOPSIS, OPTION_SYNOPSIS, new PlantUMLDependencyProgrammingLanguageOptionArgument(true),
                new StringBuilder(
                        "To choose the programming language to reverse engineering. If not specified, the default programming language is \""
                                + DEFAULT_PROGRAMMING_LANGUAGE.getName() + "\"."), SPACE_CHAR,
                HIDDEN_OPTIONAL_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_PROGRAMMING_LANGUAGE.getName();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_PROGRAMMING_LANGUAGE.getName();
    }
}
