/*
 PlantUMLDependencyIncludeOptionTest.java
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

package net.sourceforge.plantumldependency.cli.main.option.include;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE13;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE14;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE20;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE9;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOptionTest.PROGRAMMING_LANGUAGE_OPTION1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOptionTest.PROGRAMMING_LANGUAGE_OPTION2;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.apache.tools.ant.types.FileSet;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyIncludeOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class PlantUMLDependencyIncludeOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyIncludeOption > {

    /** Include option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyIncludeOption INCLUDE_OPTION1 = new PlantUMLDependencyIncludeOption(
            PROGRAMMING_LANGUAGE_OPTION1);

    /** Include option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyIncludeOption INCLUDE_OPTION2 = new PlantUMLDependencyIncludeOption(
            PROGRAMMING_LANGUAGE_OPTION2);

    /** Include option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyIncludeOption INCLUDE_OPTION3 = new PlantUMLDependencyIncludeOption(
            PROGRAMMING_LANGUAGE_OPTION1);

    /** Include option test 4 instance. */
    @DataPoint
    public static final PlantUMLDependencyIncludeOption INCLUDE_OPTION4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final FileSet argument = INCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE13);
        assertNotNull(argument);
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
        INCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE20);
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
        final FileSet argument = INCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertNotNull(argument);
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
        INCLUDE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE9);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.include.PlantUMLDependencyIncludeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecifiedWithNotProgrammingLanguageOption()
            throws CommandLineException {
        final String defaultArgument = INCLUDE_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals("**/*." + DEFAULT_PROGRAMMING_LANGUAGE.getName(), defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.include.PlantUMLDependencyIncludeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecifiedWithProgrammingLanguageOption()
            throws CommandLineException {
        final String defaultArgument = INCLUDE_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE14);
        assertEquals("**/*." + CPP.getName(), defaultArgument);
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
        final FileSet defaultArgument = INCLUDE_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertNotNull(defaultArgument);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-i, --include FILE_PATTERN\n\t\tTo include files that match the provided pattern. If not specified, the default pattern is \"**/*."
                        + DEFAULT_PROGRAMMING_LANGUAGE.getName()
                        + "\".\n\t\tFILE_PATTERN specifies a file pattern, with the same syntax as ANT patterns. It means that \"**\", \"*\" or \"?\" special characters can be used. For more information, please consult http://ant.apache.org/manual/dirtasks.html.",
                INCLUDE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-i FILE_PATTERN", INCLUDE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, INCLUDE_OPTION1.getValueSeparator());
    }
}
