/*
 PlantUMLDependencyProgrammingLanguageOptionArgumentTest.java
 Creation date : 13/07/2010
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

package net.sourceforge.plantumldependency.main.option.programminglanguage.argument;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantumldependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.argument.OptionArgument;
import net.sourceforge.mazix.components.ObjectTest;
import net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument;
import net.sourceforge.plantumldependency.main.option.programminglanguage.argument.ProgrammingLanguage;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyProgrammingLanguageOptionArgument}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyProgrammingLanguageOptionArgumentTest extends
        ObjectTest < PlantUMLDependencyProgrammingLanguageOptionArgument > {

    /** Programming language option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < ProgrammingLanguage > PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1 = new PlantUMLDependencyProgrammingLanguageOptionArgument(
            true);

    /** Programming language option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < ProgrammingLanguage > PROGRAMMING_LANGUAGE_OPTION_ARGUMENT2 = new PlantUMLDependencyProgrammingLanguageOptionArgument(
            false);

    /** Programming language option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < ProgrammingLanguage > PROGRAMMING_LANGUAGE_OPTION_ARGUMENT3 = new PlantUMLDependencyProgrammingLanguageOptionArgument(
            true);

    /** Programming language option argument test 4 instance. */
    @DataPoint
    public static final OptionArgument < ProgrammingLanguage > PROGRAMMING_LANGUAGE_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "PROGRAMMING_LANGUAGE specifies the programming language contains in the source files to analyse. Possible values : [cpp, java].",
                PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("PROGRAMMING_LANGUAGE", PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[PROGRAMMING_LANGUAGE]", PROGRAMMING_LANGUAGE_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentCppLowerCase() throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(CPP.getName()
                .toUpperCase());
        assertEquals(CPP, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentCppUpperCase() throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(CPP.getName()
                .toUpperCase());
        assertEquals(CPP, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentJavaLowerCase() throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(JAVA.getName()
                .toLowerCase());
        assertEquals(JAVA, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentJavaUpperCase() throws CommandLineException {
        final ProgrammingLanguage argument = PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(JAVA.getName()
                .toUpperCase());
        assertEquals(JAVA, argument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadString() throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument("hello");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.main.option.programminglanguage.argument.PlantUMLDependencyProgrammingLanguageOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        PROGRAMMING_LANGUAGE_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }
}
