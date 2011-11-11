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

import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.IMPORT_DEPENDENCIES_COLLECTION1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET4;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;

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
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2, false);

    /** Class abstract dependency type test 2 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE2 = new ClassAbstractDependencyTypeImpl(
            "FileOutputStream", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2,
            false);

    /** Class abstract dependency type test 3 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE3 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.io", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2, false);

    /** Class abstract dependency type test 4 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE4 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", new ImportDependenciesCollectionImpl(), GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET2, false);

    /** Class abstract dependency type test 5 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE5 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, new TreeSet < GenericDependency >(),
            GENERIC_DEPENDENCY_SET2, false);

    /** Class abstract dependency type test 6 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE6 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3,
            new TreeSet < GenericDependency >(), false);

    /** Class abstract dependency type test 7 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE7 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2, false);

    /** Class abstract dependency type test 8 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE8 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET4, GENERIC_DEPENDENCY_SET3, false);

    /** Class abstract dependency type test 9 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE9 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET2,
            new TreeSet < GenericDependency >(), false);

    /** Class abstract dependency type test 10 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE10 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang");

    /** Class abstract dependency type test 11 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE11 = new ClassAbstractDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_DEPENDENCIES_COLLECTION1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET2, true);

    /** Class abstract dependency type test 12 instance. */
    @DataPoint
    public static final ClassAbstractDependencyTypeImpl CLASS_ABSTRACT_DEPENDENCY_TYPE12 = null;

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
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependenciesCollection()}
     * .
     */
    @Test
    public void testGetImportDependencies() {
        final Set < GenericDependency > importDependencies = CLASS_ABSTRACT_DEPENDENCY_TYPE1
                .getImportDependenciesCollection().getAllImportDependencies();
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
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Cloneable", "javax.lang")));
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Set", "java.lang")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLDeclaration(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLDeclaration() {
        assertEquals(LINE_SEPARATOR + "abstract class java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE1
                .getPlantUMLDeclaration(DEFAULT_DISPLAY_OPTIONS).toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLLinksDescription(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLLinksDescriptionWithInterfaceAndImportDependencies() {
        assertEquals(LINE_SEPARATOR + "java.lang.Integer ..> java.io.Serializable" + LINE_SEPARATOR
                + "java.lang.Integer ..> java.lang.Comparable" + LINE_SEPARATOR
                + "java.lang.Number <|-- java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE9
                .getPlantUMLLinksDescription(DEFAULT_DISPLAY_OPTIONS).toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLLinksDescription(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLLinksDescriptionWithoutParentNorInterfaceAndImportDependencies() {
        assertEquals(LINE_SEPARATOR + "java.lang.Integer ..> java.io.Serializable" + LINE_SEPARATOR
                + "java.lang.Integer ..> java.lang.Comparable" + LINE_SEPARATOR
                + "java.lang.Integer ..> java.lang.Number" + LINE_SEPARATOR + "java.lang.Object <|-- java.lang.Integer"
                + LINE_SEPARATOR + "java.lang.Set <|-- java.lang.Integer" + LINE_SEPARATOR
                + "javax.lang.Cloneable <|-- java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE8
                .getPlantUMLLinksDescription(DEFAULT_DISPLAY_OPTIONS).toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLLinksDescription(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLLinksDescriptionWithParentAndImportDependencies() {
        assertEquals(LINE_SEPARATOR + "java.lang.Integer ..> java.io.Serializable" + LINE_SEPARATOR
                + "java.lang.Integer ..> java.lang.Comparable" + LINE_SEPARATOR
                + "java.lang.Set <|-- java.lang.Integer" + LINE_SEPARATOR
                + "javax.lang.Cloneable <|-- java.lang.Integer" + LINE_SEPARATOR
                + "java.lang.Number <|-- java.lang.Integer", CLASS_ABSTRACT_DEPENDENCY_TYPE7
                .getPlantUMLLinksDescription(DEFAULT_DISPLAY_OPTIONS).toString());
    }
}
