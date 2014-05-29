/*
 DisplayTypeTest.java
 Creation date : 16/01/2012
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

package net.sourceforge.plantumldependency.cli.main.option.display.argument;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_TYPES_OPTIONS;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType.ABSTRACT_CLASSES;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType.getAllDisplayTypesOptionsFullUsageDescriptions;
import static net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType.getFullUsageDescriptions;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

/**
 * JUnit test classes for {@link DisplayType}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.0
 * @version 1.4.0
 */
public class DisplayTypeTest {

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType#getAllDisplayTypesOptionsFullUsageDescriptions()}
     * .
     */
    @Test
    public void testGetAllDisplayTypesOptionsDescriptionAsSeparataredCommaString() {
        assertEquals(
                "\"abstract_classes\" : displays parsed source files which are abstract classes and relations to abstract classes, \"annotations\" : displays parsed source files which are annotations, annotations (upon classes and methods) of all parsed source files and relations to annotations, \"classes\" : displays parsed source files which are classes (not abstract), dependencies which are considered as classes (because they are imported or extended but not parsed) and relations to classes, \"enums\" : displays parsed source files which are enums and relations to enums, \"extensions\" : displays relations between dependencies which are extended by parsed source files (i.e. classes or interfaces) if their type is displayed, \"implementations\" : displays relations between dependencies which are implemented by parsed source files (i.e. interfaces) if their type is displayed, \"imports\" : displays relations from parsed source files to import dependencies (not static) if their type is displayed, \"interfaces\" : displays parsed source files which are interfaces, dependencies which are considered as interfaces (because they are implemented but not parsed) and relations to interfaces, \"native_methods\" : displays relations from parsed source files to the native dependency if they use native methods, \"static_imports\" : displays relations from parsed source files to import dependencies (only static) if their type is displayed",
                getAllDisplayTypesOptionsFullUsageDescriptions());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals(
                "\"abstract_classes\" : displays parsed source files which are abstract classes and relations to abstract classes",
                ABSTRACT_CLASSES.getFullUsageDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType#getFullUsageDescriptions(java.util.Set)}
     * .
     */
    @Test
    public void testGetFullUsageDescriptionsDefaultSet() {
        assertEquals(
                "\"abstract_classes\" : displays parsed source files which are abstract classes and relations to abstract classes, \"annotations\" : displays parsed source files which are annotations, annotations (upon classes and methods) of all parsed source files and relations to annotations, \"classes\" : displays parsed source files which are classes (not abstract), dependencies which are considered as classes (because they are imported or extended but not parsed) and relations to classes, \"enums\" : displays parsed source files which are enums and relations to enums, \"extensions\" : displays relations between dependencies which are extended by parsed source files (i.e. classes or interfaces) if their type is displayed, \"implementations\" : displays relations between dependencies which are implemented by parsed source files (i.e. interfaces) if their type is displayed, \"imports\" : displays relations from parsed source files to import dependencies (not static) if their type is displayed, \"interfaces\" : displays parsed source files which are interfaces, dependencies which are considered as interfaces (because they are implemented but not parsed) and relations to interfaces, \"native_methods\" : displays relations from parsed source files to the native dependency if they use native methods, \"static_imports\" : displays relations from parsed source files to import dependencies (only static) if their type is displayed",
                getFullUsageDescriptions(DEFAULT_DISPLAY_TYPES_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType#getFullUsageDescriptions(java.util.Set)}
     * .
     */
    @Test
    public void testGetFullUsageDescriptionsWithEmptySet() {
        assertEquals(BLANK_STRING, getFullUsageDescriptions(new TreeSet < DisplayType >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.display.argument.DisplayType#getUsageDescription()}
     * .
     */
    @Test
    public void testGetUsageDescription() {
        assertEquals("displays parsed source files which are abstract classes and relations to abstract classes",
                ABSTRACT_CLASSES.getUsageDescription());
    }
}
