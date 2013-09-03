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
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ANNOTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
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
 * @version 1.2.0
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
        assertTrue(argument.contains(CLASSES));
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
        assertEquals(10, argument.size());
        assertTrue(argument.contains(ABSTRACT_CLASSES));
        assertTrue(argument.contains(ANNOTATIONS));
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
     * {@link net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.mazix.cli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = DISPLAY_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(ABSTRACT_CLASSES + COMMA_CHAR + ANNOTATIONS + COMMA_CHAR + CLASSES + COMMA_CHAR + ENUMS
                + COMMA_CHAR + EXTENSIONS + COMMA_CHAR + IMPLEMENTATIONS + COMMA_CHAR + IMPORTS + COMMA_CHAR
                + INTERFACES + COMMA_CHAR + NATIVE_METHODS + COMMA_CHAR + STATIC_IMPORTS, defaultArgument);
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
        assertEquals(10, defaultArgument.size());
        assertTrue(defaultArgument.contains(ABSTRACT_CLASSES));
        assertTrue(defaultArgument.contains(ANNOTATIONS));
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
     * Test method for {@link net.sourceforge.mazix.cli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-d, --display DISPLAY_OPTIONS\n\t\tTo specify class diagram objects to display. If not specified, the default is [abstract_classes, annotations, classes, enums, extensions, implementations, imports, interfaces, native_methods, static_imports]\n\t\tDISPLAY_OPTIONS specifies display options when generating the plantuml output file, it is a separated comma list with these possible values : [abstract_classes, annotations, classes, enums, extensions, implementations, imports, interfaces, native_methods, static_imports]. \"abstract_classes\" : displays parsed source files which are abstract classes, \"annotations\" : displays parsed source files which are annotations and annotations (upon classes and methods) of all parsed source files, \"classes\" : displays parsed source files which are classes (not abstract) and also dependencies which are considered as classes (because they are imported or extended), \"enums\" : displays parsed source files which are enums, \"extensions\" : displays dependencies which are extended by parsed source files (i.e. classes or interfaces), \"implementations\" : displays dependencies which are implemented by parsed source files (i.e. interfaces), \"imports\" : displays import (not static) of all parsed source files, \"interfaces\" : displays parsed source and seen source files (as import, as extension or as implementation) files which are interfaces, \"native_methods\" : displays links to the native dependency, \"static_imports\" : displays static imports of all parsed source files.",
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
