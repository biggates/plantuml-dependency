/*
 PlantUMLDependencyDisplayTypeOptionTest.java
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

package net.sourceforge.plantumldependency.cli.main.option.display.type;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_TYPES_OPTIONS_STRING;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE5;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE6;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.COMMAND_LINE7;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ABSTRACT_CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ANNOTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.ENUMS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.EXTENSIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.IMPLEMENTATIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.IMPORTS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.INTERFACES;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.NATIVE_METHODS;
import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.STATIC_IMPORTS;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayTypeOption}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayTypeOptionTest extends DeepCloneableObjectTest < PlantUMLDependencyDisplayTypeOption > {

    /** Display directory option test 1 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayTypeOption DISPLAY_TYPE_OPTION1 = new PlantUMLDependencyDisplayTypeOption();

    /** Display directory option test 2 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayTypeOption DISPLAY_TYPE_OPTION2 = new PlantUMLDependencyDisplayTypeOption();

    /** Display directory option test 3 instance. */
    @DataPoint
    public static final PlantUMLDependencyDisplayTypeOption DISPLAY_TYPE_OPTION3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentAsStringOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testFindAndParseArgumentAsStringOrGetDefaultArgumentWithExistingOption() throws CommandLineException {
        final String argument = DISPLAY_TYPE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE7);
        assertEquals("classes,static_imports,enums", argument);
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
        DISPLAY_TYPE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE6);
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
        final String argument = DISPLAY_TYPE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE3);
        assertEquals(DEFAULT_DISPLAY_TYPES_OPTIONS_STRING, argument);
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
        DISPLAY_TYPE_OPTION1.findAndParseArgumentAsStringOrGetDefaultArgument(COMMAND_LINE5);
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
        final Set < DisplayType > argument = DISPLAY_TYPE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE7);
        assertEquals(3, argument.size());
        assertTrue(argument.contains(ENUMS));
        assertTrue(argument.contains(CLASSES));
        assertTrue(argument.contains(STATIC_IMPORTS));
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
        DISPLAY_TYPE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE6);
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
        final Set < DisplayType > argument = DISPLAY_TYPE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE3);
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
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#findAndParseArgumentOrGetDefaultArgument(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testFindAndParseArgumentOrGetDefaultArgumentWithTwoExistingOption() throws CommandLineException {
        DISPLAY_TYPE_OPTION1.findAndParseArgumentOrGetDefaultArgument(COMMAND_LINE5);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.PlantUMLDependencyDisplayTypeOption#getDefaultArgumentAsStringIfOptionSpecified(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetDefaultArgumentAsStringIfOptionSpecified() throws CommandLineException {
        final String defaultArgument = DISPLAY_TYPE_OPTION1.getDefaultArgumentAsStringIfOptionSpecified(COMMAND_LINE1);
        assertEquals(ABSTRACT_CLASSES + COMMA_CHAR + ANNOTATIONS + COMMA_CHAR + CLASSES + COMMA_CHAR + ENUMS
                + COMMA_CHAR + EXTENSIONS + COMMA_CHAR + IMPLEMENTATIONS + COMMA_CHAR + IMPORTS + COMMA_CHAR
                + INTERFACES + COMMA_CHAR + NATIVE_METHODS + COMMA_CHAR + STATIC_IMPORTS, defaultArgument);
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
        final Set < DisplayType > defaultArgument = DISPLAY_TYPE_OPTION1.getDefaultArgumentIfOptionSpecified(COMMAND_LINE1);
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
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getFullUsage()}.
     */
    @Test
    public void testGetFullUsage() {
        assertEquals(
                "-dt, --display-type DISPLAY_TYPES_OPTIONS\n\t\tTo specify class diagram objects to display. If not specified, the default is [abstract_classes,annotations,classes,enums,extensions,implementations,imports,interfaces,native_methods,static_imports]\n\t\tDISPLAY_TYPES_OPTIONS specifies display types options when generating the plantUML output file, it is a separated comma list with these possible values : [abstract_classes,annotations,classes,enums,extensions,implementations,imports,interfaces,native_methods,static_imports]. \"abstract_classes\" : displays parsed source files which are abstract classes and relations to abstract classes, \"annotations\" : displays parsed source files which are annotations, annotations (upon classes and methods) of all parsed source files and relations to annotations, \"classes\" : displays parsed source files which are classes (not abstract), dependencies which are considered as classes (because they are imported or extended but not parsed) and relations to classes, \"enums\" : displays parsed source files which are enums and relations to enums, \"extensions\" : displays relations between dependencies which are extended by parsed source files (i.e. classes or interfaces) if their type is displayed, \"implementations\" : displays relations between dependencies which are implemented by parsed source files (i.e. interfaces) if their type is displayed, \"imports\" : displays relations from parsed source files to import dependencies (not static) if their type is displayed, \"interfaces\" : displays parsed source files which are interfaces, dependencies which are considered as interfaces (because they are implemented but not parsed) and relations to interfaces, \"native_methods\" : displays relations from parsed source files to the native dependency if they use native methods, \"static_imports\" : displays relations from parsed source files to import dependencies (only static) if their type is displayed.",
                DISPLAY_TYPE_OPTION1.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOption#getMainUsage()}.
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("-dt DISPLAY_TYPES_OPTIONS", DISPLAY_TYPE_OPTION1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument#getValueSeparator()}
     * .
     */
    @Test
    public void testGetValueSeparator() {
        assertEquals(SPACE_CHAR, DISPLAY_TYPE_OPTION1.getValueSeparator());
    }
}
