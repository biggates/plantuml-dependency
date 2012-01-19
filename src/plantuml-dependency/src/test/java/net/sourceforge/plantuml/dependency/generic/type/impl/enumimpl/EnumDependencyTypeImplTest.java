/*
 EnumDependencyTypeImplTest.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl.enumimpl;

import static java.util.Arrays.asList;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET3;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST2;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST10;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST11;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST9;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST10;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST8;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST9;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link EnumDependencyTypeImpl}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class EnumDependencyTypeImplTest extends DeepCloneableObjectTest < EnumDependencyTypeImpl > {

    /** Enum dependency type test 1 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE1 = new EnumDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET3, false);

    /** Enum dependency type test 2 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE2 = new EnumDependencyTypeImpl("FileOutputStream",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET3, false);

    /** Enum dependency type test 3 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE3 = new EnumDependencyTypeImpl("Integer", "java.io",
            IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET3, false);

    /** Enum dependency type test 4 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE4 = new EnumDependencyTypeImpl("Integer",
            "java.lang", new ImportDependenciesCollectionImpl(), GENERIC_DEPENDENCY_SET3, false);

    /** Enum dependency type test 5 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE5 = new EnumDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, new TreeSet < GenericDependency >(), false);

    /** Enum dependency type test 6 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE6 = new EnumDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET3, false);

    /** Enum dependency type test 7 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE7 = new EnumDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET2, false);

    /** Enum dependency type test 8 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE8 = new EnumDependencyTypeImpl("Integer",
            "java.lang");

    /** Enum dependency type test 9 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE9 = new EnumDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET3, true);

    /** Enum dependency type test 10 instance. */
    @DataPoint
    public static final EnumDependencyTypeImpl ENUM_DEPENDENCY_TYPE10 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Integer", ENUM_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependenciesCollection()}
     * .
     */
    @Test
    public void testGetImportDependencies() {
        final Set < GenericDependency > importDependencies = ENUM_DEPENDENCY_TYPE1.getImportDependenciesCollection()
                .getAllImportDependencies();
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
        assertEquals("Integer", ENUM_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", ENUM_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentInterfaces()}
     * .
     */
    @Test
    public void testGetParentInterfaces() {
        final Set < GenericDependency > parentInterfaces = ENUM_DEPENDENCY_TYPE1.getParentInterfaces();
        assertEquals(2, parentInterfaces.size());
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Cloneable", "javax.lang")));
        assertTrue(parentInterfaces.contains(new GenericDependencyImpl("Set", "java.lang")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramElement()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElement() {
        assertEquals(new PlantUMLClassesDiagramEnumElementImpl("java.lang.Integer"),
                ENUM_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithInterfaceAndImportDependencies() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST8, PLANTUML_USE_RELATION_TEST9, PLANTUML_IMPLEMENT_RELATION_TEST11})),
                ENUM_DEPENDENCY_TYPE7.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithoutInterfaceAndImportDependencies() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST8, PLANTUML_USE_RELATION_TEST9, PLANTUML_USE_RELATION_TEST10,
                PLANTUML_IMPLEMENT_RELATION_TEST9, PLANTUML_IMPLEMENT_RELATION_TEST10})),
                ENUM_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }
}
