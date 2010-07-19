/*
 ClassAbstractDependencyTypeImplTest.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl.classimpl;

import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET3;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ClassAbstractDependencyTypeImpl}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class ClassAbstractDependencyTypeImplTest extends DeepCloneableObjectTest < ClassAbstractDependencyTypeImpl > {

    /** Class abstract dependency type test 1 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE1 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", GENERIC_DEPENDENCY_SET1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 2 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE2 = new ClassAbstractDependencyTypeImpl(
            "FileOutputStream", "java.lang", GENERIC_DEPENDENCY_SET1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 3 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE3 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.io", GENERIC_DEPENDENCY_SET1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 4 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE4 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", new TreeSet < GenericDependency >(), GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 5 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE5 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", GENERIC_DEPENDENCY_SET1, new TreeSet < GenericDependency >(),
            GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 6 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE6 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", GENERIC_DEPENDENCY_SET1, GENERIC_DEPENDENCY_SET3,
            new TreeSet < GenericDependency >());

    /** Class abstract dependency type test 7 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE7 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", GENERIC_DEPENDENCY_SET1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2);

    /** Class abstract dependency type test 8 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE8 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependencies()}
     * .
     */
    @Test
    public void testGetImportDependencies() {
        final Set < GenericDependency > importDependencies = CLASS_ABSTRACT_DEPENDENCY_TYPE1.getImportDependencies();
        assertEquals(3, importDependencies.size());
        assertTrue(importDependencies.contains(GENERIC_DEPENDENCY1));
        assertTrue(importDependencies.contains(new GenericDependencyImpl("Serializable", "java.io")));
        assertTrue(importDependencies.contains(new GenericDependencyImpl("Comparable", "java.lang")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals("Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImpl#getParentClasses()}
     * .
     */
    @Test
    public void testGetParentClasses() {
        final Set < GenericDependency > parentClasses = CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentClasses();
        assertEquals(1, parentClasses.size());
        assertTrue(parentClasses.contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentInterfaces()}
     * .
     */
    @Test
    public void testGetParentInterfaces() {
        final Set < GenericDependency > parentInterfaces = CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentInterfaces();
        assertEquals(2, parentInterfaces.size());
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Serializable", "java.io")));
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Comparable", "java.lang")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLDeclaration()}
     * .
     */
    @Test
    public void testGetPlantUMLDeclaration() {
        assertEquals("\nabstract java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPlantUMLDeclaration()
                .toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLLinksDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLLinksDescription() {
        assertEquals(
                "\njava.lang.Integer ..> java.io.Serializable\njava.lang.Integer ..> java.lang.Comparable\njava.lang.Integer ..> java.lang.Number\njava.io.Serializable <|-- java.lang.Integer\njava.lang.Comparable <|-- java.lang.Integer\njava.lang.Number <|-- java.lang.Integer",
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPlantUMLLinksDescription().toString());
    }
}
