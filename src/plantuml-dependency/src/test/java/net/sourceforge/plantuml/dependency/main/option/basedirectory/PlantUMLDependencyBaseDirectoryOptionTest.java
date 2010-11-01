/*
 PlantUMLDependencyBaseDirectoryOptionTest.java
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

package net.sourceforge.plantuml.dependency.main.option.basedirectory;

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE4;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyBaseDirectoryOption}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyBaseDirectoryOptionTest extends
        DeepCloneableObjectTest < PlantUMLDependencyBaseDirectoryOption > {

    /** Base directory option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyBaseDirectoryOption BASE_DIRECTORY_OPTION1 = new PlantUMLDependencyBaseDirectoryOption();

    /** Base directory option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyBaseDirectoryOption BASE_DIRECTORY_OPTION2 = new PlantUMLDependencyBaseDirectoryOption();

    /** Base directory option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyBaseDirectoryOption BASE_DIRECTORY_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final File argument = BASE_DIRECTORY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE1);
        assertEquals(DOT_CHAR, argument.getName());
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
        BASE_DIRECTORY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE2);
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
        final File argument = BASE_DIRECTORY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DOT_CHAR, argument.getName());
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
        BASE_DIRECTORY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE4);
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
        final File defaultArgument = BASE_DIRECTORY_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertEquals(DOT_CHAR, defaultArgument.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = BASE_DIRECTORY_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(DOT_CHAR, defaultArgument);
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-b, --basedir DIR\n\t\tThe base directory where to look for source files. If not specified, the default pattern is \".\" i.e. the directory where the program is launched from.\n\t\tDIR specifies a valid and exsiting directory path, not a single file. It can be absolute or relative.",
                BASE_DIRECTORY_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-b DIR", BASE_DIRECTORY_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getValueSeparator()}.
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, BASE_DIRECTORY_OPTION1.getValueSeparator());
    }
}
