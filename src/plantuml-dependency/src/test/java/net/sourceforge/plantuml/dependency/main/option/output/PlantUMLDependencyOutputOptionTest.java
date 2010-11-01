/*
 PlantUMLDependencyOutputOptionTest.java
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

package net.sourceforge.plantuml.dependency.main.option.output;

import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CommonFileConstants.TXT_EXTENSION;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE17;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE18;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE19;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.VERBOSE_LEVEL_OPTION1;
import static net.sourceforge.plantuml.dependency.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOptionTest.BASE_DIRECTORY_OPTION1;
import static net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOptionTest.DISPLAY_OPTION1;
import static net.sourceforge.plantuml.dependency.main.option.exclude.PlantUMLDependencyExcludeOptionTest.EXCLUDE_OPTION1;
import static net.sourceforge.plantuml.dependency.main.option.include.PlantUMLDependencyIncludeOptionTest.INCLUDE_OPTION1;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOptionTest.PROGRAMMING_LANGUAGE_OPTION1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.execution.OptionExecution;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOption}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyOutputOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyOutputOption > {

    /** Output option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION1 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION2 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION3 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 4 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION4 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 5 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION5 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 6 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION6 = new PlantUMLDependencyOutputOption(
            VERBOSE_LEVEL_OPTION1, PROGRAMMING_LANGUAGE_OPTION1, INCLUDE_OPTION1, EXCLUDE_OPTION1, DISPLAY_OPTION1,
            BASE_DIRECTORY_OPTION1, 1);

    /** Output option test 7 instance. */
    @DataPoint
    public static final PlantUMLDependencyOutputOption OUTPUT_OPTION7 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final File argument = OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE1);
        assertEquals("plantuml.txt", argument.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOptionWithNotExistingMandatoryArgument()
            throws CommandLineException {
        OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE17);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithNotExistingNotMandatoryOption()
            throws CommandLineException {
        final File argument = OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE18);
        assertTrue(argument.getName().contains(TXT_EXTENSION));
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        OUTPUT_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE19);
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getDefaultArgumentIfOptionSpecified(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentIfOptionSpecified() throws CommandLineException {
        final File defaultArgument = OUTPUT_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.getName().contains(TXT_EXTENSION));
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.impl.output.OutputOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = OUTPUT_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertTrue(defaultArgument.contains(TXT_EXTENSION));
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-o, --output FILE\n\t\tTo output file path where to generate the PlantUML description.\n\t\tFILE specifies a valid file path, where the file doesn't already exist and is not a directory. It can be absolute or relative.",
                OUTPUT_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-o FILE", OUTPUT_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getValueSeparator()}.
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, OUTPUT_OPTION1.getValueSeparator());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOption#parseCommandLine(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = NullPointerException.class)
    public void testParseCommandLineNull() throws CommandLineException {
        OUTPUT_OPTION1.parseCommandLine(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOption#parseCommandLine(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithExistingOption() throws CommandLineException {
        final OptionExecution optionExecution = OUTPUT_OPTION1.parseCommandLine(COMMAND_LINE1);
        assertNotNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOption#parseCommandLine(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithNotExistingNotMandatoryOption() throws CommandLineException {
        final OptionExecution optionExecution = OUTPUT_OPTION1.parseCommandLine(COMMAND_LINE18);
        assertNull(optionExecution);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOption#parseCommandLine(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseCommandLineWithTwoExistingOption() throws CommandLineException {
        OUTPUT_OPTION1.parseCommandLine(COMMAND_LINE19);
    }
}
