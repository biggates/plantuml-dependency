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
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ONLY_PACKAGES;
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
 * @version 1.0
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
                "DISPLAY_OPTIONS specifies the objects to be treated, it is a separated comma list with these possible values : [only_packages, classes, interfaces, abstract_classes, static_imports, imports, enums, methods, attributes, only_parsed_objects, native_links, implementations, extensions]. These arguments implementations may differ following the chosen PROGRAMMING_LANGUAGE.",
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
        final Set < Display > argument = DISPLAY_OPTION_ARGUMENT1.parseArgument("only_packages");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(ONLY_PACKAGES));
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
        final Set < Display > argument = DISPLAY_OPTION_ARGUMENT1.parseArgument("onLY_PACKaGES");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(ONLY_PACKAGES));
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
