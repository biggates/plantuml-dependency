/*
 DisplayTest.java
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

package net.sourceforge.plantuml.dependency.main.option.display.argument;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.getAllDisplayOptionsFullUsageDescriptions;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.getFullUsageDescriptions;
import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

/**
 * JUnit test classes for {@link Display}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.0
 * @version 1.1.0
 */
public class DisplayTest {

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.Display#getAllDisplayOptionsFullUsageDescriptions()}
     * .
     */
    @Test
    public void testGetAllDisplayOptionsDescriptionAsSeparataredCommaString() {
        assertEquals(
                "\"abstract_classes\" : displays parsed source files which are abstract classes, \"classes\" : displays parsed and seen source files (as import or as extension) which are classes (not abstract), \"enums\" : displays parsed source files which are enums, \"extensions\" : displays dependencies which are extended by parsed source files (i.e. classes or interfaces), \"implementations\" : displays dependencies which are implemented by parsed source files (i.e. interfaces), \"imports\" : displays import (not static) of all parsed source files, \"interfaces\" : displays parsed source and seen source files (as import, as extension or as implementation) files which are interfaces, \"native_methods\" : displays links to the native dependency, \"static_imports\" : displays static imports of all parsed source files",
                getAllDisplayOptionsFullUsageDescriptions());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.Display#getFullUsageDescription()}
     * .
     */
    @Test
    public void testGetFullUsageDescription() {
        assertEquals("\"abstract_classes\" : displays parsed source files which are abstract classes",
                ABSTRACT_CLASSES.getFullUsageDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.Display#getFullUsageDescriptions(java.util.Set)}
     * .
     */
    @Test
    public void testGetFullUsageDescriptionsDefaultSet() {
        assertEquals(
                "\"abstract_classes\" : displays parsed source files which are abstract classes, \"classes\" : displays parsed and seen source files (as import or as extension) which are classes (not abstract), \"enums\" : displays parsed source files which are enums, \"extensions\" : displays dependencies which are extended by parsed source files (i.e. classes or interfaces), \"implementations\" : displays dependencies which are implemented by parsed source files (i.e. interfaces), \"imports\" : displays import (not static) of all parsed source files, \"interfaces\" : displays parsed source and seen source files (as import, as extension or as implementation) files which are interfaces, \"native_methods\" : displays links to the native dependency, \"static_imports\" : displays static imports of all parsed source files",
                getFullUsageDescriptions(DEFAULT_DISPLAY_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.Display#getFullUsageDescriptions(java.util.Set)}
     * .
     */
    @Test
    public void testGetFullUsageDescriptionsWithEmptySet() {
        assertEquals(BLANK_STRING, getFullUsageDescriptions(new TreeSet < Display >()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.display.argument.Display#getUsageDescription()}
     * .
     */
    @Test
    public void testGetUsageDescription() {
        assertEquals("displays parsed source files which are abstract classes", ABSTRACT_CLASSES.getUsageDescription());
    }
}
