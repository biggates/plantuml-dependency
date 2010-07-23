/*
 StubDependencyTypeImplTest.java
 Creation date : 17/07/2010
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

package net.sourceforge.plantuml.dependency.generic.type.impl.stubimpl;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link StubDependencyTypeImpl}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class StubDependencyTypeImplTest extends DeepCloneableObjectTest < StubDependencyTypeImpl > {

    /** Stub dependency type test 1 instance. */
    @DataPoint
    public static final StubDependencyTypeImpl STUB_DEPENDENCY_TYPE1 = new StubDependencyTypeImpl("Integer",
            "java.lang");

    /** Stub dependency type test 2 instance. */
    @DataPoint
    public static final StubDependencyTypeImpl STUB_DEPENDENCY_TYPE2 = new StubDependencyTypeImpl("FileOutputStream",
            "java.lang");

    /** Stub dependency type test 3 instance. */
    @DataPoint
    public static final StubDependencyTypeImpl STUB_DEPENDENCY_TYPE3 = new StubDependencyTypeImpl("Integer", "java.io");

    /** Stub dependency type test 4 instance. */
    @DataPoint
    public static final StubDependencyTypeImpl STUB_DEPENDENCY_TYPE4 = new StubDependencyTypeImpl("Integer",
            "java.lang");

    /** Stub dependency type test 5 instance. */
    @DataPoint
    public static final StubDependencyTypeImpl STUB_DEPENDENCY_TYPE5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Integer", STUB_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependencies()}
     * .
     */
    @Test
    public void testGetImportDependencies() {
        final Set < GenericDependency > importDependencies = STUB_DEPENDENCY_TYPE1.getImportDependencies();
        assertEquals(0, importDependencies.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals("Integer", STUB_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", STUB_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentInterfaces()}
     * .
     */
    @Test
    public void testGetParentInterfaces() {
        final Set < GenericDependency > parentInterfaces = STUB_DEPENDENCY_TYPE1.getParentInterfaces();
        assertEquals(0, parentInterfaces.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLDeclaration()}
     * .
     */
    @Test
    public void testGetPlantUMLDeclaration() {
        assertEquals("\nclass java.lang.Integer", STUB_DEPENDENCY_TYPE1.getPlantUMLDeclaration().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLLinksDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLLinksDescription() {
        assertEquals(BLANK_STRING, STUB_DEPENDENCY_TYPE1.getPlantUMLLinksDescription().toString());
    }
}
