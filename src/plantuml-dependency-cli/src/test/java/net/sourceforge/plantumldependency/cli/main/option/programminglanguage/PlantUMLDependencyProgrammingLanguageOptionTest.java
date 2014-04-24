/*
 PlantUMLDependencyProgrammingLanguageOptionTest.java
 Creation date : 10/07/2010
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

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE14;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE15;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE16;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static org.junit.Assert.assertEquals;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantumldependency.common.ObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyProgrammingLanguageOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyProgrammingLanguageOptionTest extends
        ObjectTest < PlantUMLDependencyProgrammingLanguageOption > {

    /** Programming language option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyProgrammingLanguageOption PROGRAMMING_LANGUAGE_OPTION1 = new PlantUMLDependencyProgrammingLanguageOption();

    /** Programming language option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyProgrammingLanguageOption PROGRAMMING_LANGUAGE_OPTION2 = new PlantUMLDependencyProgrammingLanguageOption();

    /** Programming language option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyProgrammingLanguageOption PROGRAMMING_LANGUAGE_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = PROGRAMMING_LANGUAGE_OPTION1
                .findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE14);
        assertEquals(CPP.getName(), argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE15);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final String argument = PROGRAMMING_LANGUAGE_OPTION1
                .findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE.getName(), argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE16);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION1
                .findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE14);
        assertEquals(CPP, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE15);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION1
                .findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE16);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = PROGRAMMING_LANGUAGE_OPTION1
                .getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE.getName(), defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getDefaultArgumentIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentIfOptionSpecified() throws CommandLineException {
        final ProgrammingLanguage defaultArgument = PROGRAMMING_LANGUAGE_OPTION1
                .getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertEquals(DEFAULT_PROGRAMMING_LANGUAGE, defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-l PROGRAMMING_LANGUAGE\n\t\tTo choose the programming language to reverse engineering. If not specified, the default programming language is \"java\".\n\t\tPROGRAMMING_LANGUAGE specifies the programming language contains in the source files to analyse. Possible values : [cpp, java].",
                PROGRAMMING_LANGUAGE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-l PROGRAMMING_LANGUAGE", PROGRAMMING_LANGUAGE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, PROGRAMMING_LANGUAGE_OPTION1.getValueSeparator());
    }
}
