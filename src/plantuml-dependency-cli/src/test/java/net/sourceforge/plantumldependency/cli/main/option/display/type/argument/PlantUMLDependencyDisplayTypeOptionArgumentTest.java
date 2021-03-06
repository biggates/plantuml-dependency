/*
 PlantUMLDependencyDisplayTypeOptionArgumentTest.java
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

package net.sourceforge.plantumldependency.cli.main.option.display.type.argument;

import static net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType.CLASSES;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLDependencyDisplayTypeOptionArgument}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyDisplayTypeOptionArgumentTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLDependencyDisplayTypeOptionArgument > {

    /** Display type option argument test 1 instance. */
    @DataPoint
    public static final OptionArgument < Set < DisplayType > > DISPLAY_TYPE_OPTION_ARGUMENT1 = new PlantUMLDependencyDisplayTypeOptionArgument();

    /** Display type option argument test 2 instance. */
    @DataPoint
    public static final OptionArgument < Set < DisplayType > > DISPLAY_TYPE_OPTION_ARGUMENT2 = new PlantUMLDependencyDisplayTypeOptionArgument();

    /** Display type option argument test 3 instance. */
    @DataPoint
    public static final OptionArgument < Set < DisplayType > > DISPLAY_TYPE_OPTION_ARGUMENT4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "DISPLAY_TYPES_OPTIONS specifies display types options when generating the plantUML output file, it is a separated comma list with these possible values : [abstract_classes,annotations,classes,enums,extensions,implementations,imports,interfaces,native_methods,static_imports]. \"abstract_classes\" : displays parsed source files which are abstract classes and relations to abstract classes, \"annotations\" : displays parsed source files which are annotations, annotations (upon classes and methods) of all parsed source files and relations to annotations, \"classes\" : displays parsed source files which are classes (not abstract), dependencies which are considered as classes (because they are imported or extended but not parsed) and relations to classes, \"enums\" : displays parsed source files which are enums and relations to enums, \"extensions\" : displays relations between dependencies which are extended by parsed source files (i.e. classes or interfaces) if their type is displayed, \"implementations\" : displays relations between dependencies which are implemented by parsed source files (i.e. interfaces) if their type is displayed, \"imports\" : displays relations from parsed source files to import dependencies (not static) if their type is displayed, \"interfaces\" : displays parsed source files which are interfaces, dependencies which are considered as interfaces (because they are implemented but not parsed) and relations to interfaces, \"native_methods\" : displays relations from parsed source files to the native dependency if they use native methods, \"static_imports\" : displays relations from parsed source files to import dependencies (only static) if their type is displayed.",
                DISPLAY_TYPE_OPTION_ARGUMENT1.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument#getMainUsage()}
     * .
     */
    @Test
    public void testGetMainUsage() {
        assertEquals("DISPLAY_TYPES_OPTIONS", DISPLAY_TYPE_OPTION_ARGUMENT1.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentLowerCase() throws CommandLineException {
        final Set < DisplayType > argument = DISPLAY_TYPE_OPTION_ARGUMENT1.parseArgument("classes");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(CLASSES));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentNull() throws CommandLineException {
        DISPLAY_TYPE_OPTION_ARGUMENT1.parseArgument(null);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseArgumentUpperCase() throws CommandLineException {
        final Set < DisplayType > argument = DISPLAY_TYPE_OPTION_ARGUMENT1.parseArgument("cLassES");
        assertEquals(1, argument.size());
        assertTrue(argument.contains(CLASSES));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithBadString() throws CommandLineException {
        DISPLAY_TYPE_OPTION_ARGUMENT1.parseArgument("hello,packages");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.type.argument.PlantUMLDependencyDisplayTypeOptionArgument#parseArgument(java.lang.String)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseArgumentWithEmptyString() throws CommandLineException {
        DISPLAY_TYPE_OPTION_ARGUMENT1.parseArgument(BLANK_STRING);
    }
}
