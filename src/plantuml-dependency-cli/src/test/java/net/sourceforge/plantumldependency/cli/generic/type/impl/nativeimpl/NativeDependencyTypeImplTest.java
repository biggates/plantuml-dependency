/*
 NativeDependencyTypeImplTest.java
 Creation date : 22/10/2010
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

package net.sourceforge.plantumldependency.cli.generic.type.impl.nativeimpl;

import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_TYPES_OPTIONS;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.NATIVE_PLANTUML_STEREOTYPE;
import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link NativeDependencyTypeImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class NativeDependencyTypeImplTest extends DeepCloneableObjectTest < NativeDependencyTypeImplTest > {

    /** Native dependency type test 1 instance. */
    @DataPoint
    public static final NativeDependencyTypeImpl NATIVE_DEPENDENCY_TYPE1 = new NativeDependencyTypeImpl("Integer",
            "java.lang");

    /** Native dependency type test 2 instance. */
    @DataPoint
    public static final NativeDependencyTypeImpl NATIVE_DEPENDENCY_TYPE2 = new NativeDependencyTypeImpl(
            "FileOutputStream", "java.lang");

    /** Native dependency type test 3 instance. */
    @DataPoint
    public static final NativeDependencyTypeImpl NATIVE_DEPENDENCY_TYPE3 = new NativeDependencyTypeImpl("Integer",
            "java.io");

    /** Native dependency type test 4 instance. */
    @DataPoint
    public static final NativeDependencyTypeImpl NATIVE_DEPENDENCY_TYPE4 = new NativeDependencyTypeImpl("Integer",
            "java.lang");

    /** Native dependency type test 5 instance. */
    @DataPoint
    public static final NativeDependencyTypeImpl NATIVE_DEPENDENCY_TYPE5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Integer", NATIVE_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals("Integer", NATIVE_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", NATIVE_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramElement()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElement() {
        assertEquals(new PlantUMLClassesDiagramClassElementImpl("java.lang.Integer", NATIVE_PLANTUML_STEREOTYPE),
                NATIVE_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                NATIVE_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_TYPES_OPTIONS,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }
}
