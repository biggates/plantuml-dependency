/*
 PlantUMLDependencyDisplayOptionArgumentTest.java
 Creation date : 6/07/2010
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

package net.sourceforge.plantuml.dependency.main.option.display.argument;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.argument.OptionArgument;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayOptionArgument}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.2.0
 */
public class PlantUMLDependencyDisplayOptionArgumentTest extends
        DeepCloneableObjectTest < PlantUMLDependencyDisplayOptionArgument > {

    /** Display option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < Set < Display > > DISPLAY_OPTION_ARGUMENT1 = new PlantUMLDependencyDisplayOptionArgument(
            true);

    /** Display option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < Set < Display > > DISPLAY_OPTION_ARGUMENT2 = new PlantUMLDependencyDisplayOptionArgument(
            false);

    /** Display option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Set < Display > > DISPLAY_OPTION_ARGUMENT3 = new PlantUMLDependencyDisplayOptionArgument(
            true);

    /** Display option argument test 4 instance. */
    @DataPoint
    public static final OptionArgument < Set < Display > > DISPLAY_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "DISPLAY_OPTIONS specifies display options when generating the plantuml output file, it is a separated comma list with these possible values : [abstract_classes, annotations, classes, enums, extensions, implementations, imports, interfaces, native_methods, static_imports]. \"abstract_classes\" : displays parsed source files which are abstract classes, \"annotations\" : displays parsed source files which are annotations and annotations (upon classes and methods) of all parsed source files, \"classes\" : displays parsed source files which are classes (not abstract) and also dependencies which are considered as classes (because they are imported or extended), \"enums\" : displays parsed source files which are enums, \"extensions\" : displays dependencies which are extended by parsed source files (i.e. classes or interfaces), \"implementations\" : displays dependencies which are implemented by parsed source files (i.e. interfaces), \"imports\" : displays import (not static) of all parsed source files, \"interfaces\" : displays parsed source and seen source files (as import, as extension or as implementation) files which are interfaces, \"native_methods\" : displays links to the native dependency, \"static_imports\" : displays static imports of all parsed source files.",
                DISPLAY_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument#getMainUsage()}.
     */
    @Test
    public void testGetMainUsageWithMandatory() {
        assertEquals("DISPLAY_OPTIONS", DISPLAY_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.mazix.cli.option.argument.AbstractOptionArgument#getMainUsage()}.
     */
    @Test
    public void testGetMainUsageWithNoMandatory() {
        assertEquals("[DISPLAY_OPTIONS]", DISPLAY_OPTION_ARGUMENT2.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentLowerCase() throws CommandLineException {
        final Set < Display > argument = DISPLAY_OPTION_ARGUMENT1.parseArgument("classes");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(CLASSES));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        DISPLAY_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentUpperCase() throws CommandLineException {
        final Set < Display > argument = DISPLAY_OPTION_ARGUMENT1.parseArgument("cLassES");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(CLASSES));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadString() throws CommandLineException {
        DISPLAY_OPTION_ARGUMENT1.parseArgument("hello,packages");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        DISPLAY_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }
}
