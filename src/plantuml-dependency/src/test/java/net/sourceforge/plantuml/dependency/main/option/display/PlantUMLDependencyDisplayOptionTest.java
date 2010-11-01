/*
 PlantUMLDependencyDisplayOptionTest.java
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

package net.sourceforge.plantuml.dependency.main.option.display;

import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.COMMAND_LINE7;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ONLY_PACKAGES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayOption}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyDisplayOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyDisplayOption > {

    /** Display directory option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayOption DISPLAY_OPTION1 = new PlantUMLDependencyDisplayOption();

    /** Display directory option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayOption DISPLAY_OPTION2 = new PlantUMLDependencyDisplayOption();

    /** Display directory option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayOption DISPLAY_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final Set < Display > argument = DISPLAY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE7);
        assertEquals(3, argument.size());
        assertTrue(argument.contains(ENUMS));
        assertTrue(argument.contains(ONLY_PACKAGES));
        assertTrue(argument.contains(STATIC_IMPORTS));
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
        DISPLAY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
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
        final Set < Display > argument = DISPLAY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(8, argument.size());
        assertTrue(argument.contains(CLASSES));
        assertTrue(argument.contains(ENUMS));
        assertTrue(argument.contains(IMPORTS));
        assertTrue(argument.contains(INTERFACES));
        assertTrue(argument.contains(NATIVE_METHODS));
        assertTrue(argument.contains(STATIC_IMPORTS));
        assertTrue(argument.contains(IMPLEMENTATIONS));
        assertTrue(argument.contains(EXTENSIONS));
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
        DISPLAY_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE5);
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
        final Set < Display > defaultArgument = DISPLAY_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
        assertEquals(8, defaultArgument.size());
        assertTrue(defaultArgument.contains(CLASSES));
        assertTrue(defaultArgument.contains(ENUMS));
        assertTrue(defaultArgument.contains(IMPORTS));
        assertTrue(defaultArgument.contains(INTERFACES));
        assertTrue(defaultArgument.contains(NATIVE_METHODS));
        assertTrue(defaultArgument.contains(STATIC_IMPORTS));
        assertTrue(defaultArgument.contains(IMPLEMENTATIONS));
        assertTrue(defaultArgument.contains(EXTENSIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     * 
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = DISPLAY_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(CLASSES + COMMA_CHAR + ENUMS + COMMA_CHAR + IMPORTS + COMMA_CHAR + INTERFACES + COMMA_CHAR
                + STATIC_IMPORTS + COMMA_CHAR + NATIVE_METHODS + COMMA_CHAR + IMPLEMENTATIONS + COMMA_CHAR + EXTENSIONS,
                defaultArgument);
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-d, --display DISPLAY_OPTIONS\n\t\tTo specify class diagram objects to display. If not specified, the default is classes,enums,imports,interfaces,static_imports,native_methods,implementations,extensions\n\t\tDISPLAY_OPTIONS specifies the objects to be treated, it is a separated comma list with these possible values : [only_packages, classes, interfaces, abstract_classes, static_imports, imports, enums, methods, attributes, only_parsed_objects, native_methods, implementations, extensions]. These arguments implementations may differ following the chosen PROGRAMMING_LANGUAGE.",
                DISPLAY_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-d DISPLAY_OPTIONS", DISPLAY_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.AbstractOptionWithArgument#getValueSeparator()}.
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, DISPLAY_OPTION1.getValueSeparator());
    }
}
