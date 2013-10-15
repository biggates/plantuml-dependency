/*
 ClassDependencyTypeImplTest.java
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

import static java.util.Arrays.asList;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET12;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET13;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET14;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET15;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET16;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET17;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET18;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET19;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET20;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET21;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET22;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET23;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET24;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET25;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET26;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET27;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET28;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET29;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET30;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET31;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET32;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET33;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET34;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET35;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET36;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET37;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET38;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET39;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET40;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET41;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET42;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET43;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET44;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET45;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET46;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET47;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET48;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET49;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET50;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET51;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET52;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET53;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET54;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET55;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET56;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY50;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET3;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET5;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET6;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET7;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET8;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST2;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST24;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST25;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramExtendRelationImplTest.PLANTUML_EXTEND_RELATION_TEST7;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST7;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImplTest.PLANTUML_IMPLEMENT_RELATION_TEST8;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST17;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST19;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST20;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST22;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST24;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST25;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST27;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST30;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST31;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST32;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST33;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST34;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST35;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST36;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST37;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST38;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST39;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST6;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ClassDependencyTypeImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.2.0
 */
public class ClassDependencyTypeImplTest extends DeepCloneableObjectTest < ClassDependencyTypeImpl > {

    /** Class dependency type test 1 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE1 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 2 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE2 = new ClassDependencyTypeImpl(
            "FileOutputStream", "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 3 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE3 = new ClassDependencyTypeImpl("Integer",
            "java.io", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET5,
            false);

    /** Class dependency type test 4 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE4 = new ClassDependencyTypeImpl("Integer",
            "java.lang", new ImportDependenciesCollectionImpl(), GENERIC_DEPENDENCY50, GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET2, false);

    /** Class dependency type test 5 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE5 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, new TreeSet < GenericDependency >(),
            GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 6 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE6 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3,
            new TreeSet < GenericDependency >(), false);

    /** Class dependency type test 7 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE7 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, null, GENERIC_DEPENDENCY_SET3, GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 8 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE8 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET5, true);

    /** Class dependency type test 9 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE9 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET3,
            GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 10 instance. */
    @DataPoint
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE10 = null;

    /** Class dependency type test 11 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE11 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST2, null, GENERIC_DEPENDENCY_SET2, GENERIC_DEPENDENCY_SET5, false);

    /** Class dependency type test 12 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE12 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST24, GENERIC_DEPENDENCY1, GENERIC_DEPENDENCY_SET7,
            GENERIC_DEPENDENCY_SET6, false);

    /** Class dependency type test 13 instance. */
    public static final ClassDependencyTypeImpl CLASS_DEPENDENCY_TYPE13 = new ClassDependencyTypeImpl("Integer",
            "java.lang", IMPORT_COLLECTION_TEST25, new GenericDependencyImpl(new ClassDependencyTypeImpl("File",
                    "java.io")), GENERIC_DEPENDENCY_SET8, GENERIC_DEPENDENCY_SET6, false);

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImpl#getAnnotationsDependencies()}
     * .
     */
    @Test
    public void testGetAnnotationsDependencies() {
        final Set < GenericDependency > annotationsDependencies = CLASS_DEPENDENCY_TYPE1.getAnnotationsDependencies();
        assertEquals(1, annotationsDependencies.size());
        assertTrue(annotationsDependencies.contains(GENERIC_DEPENDENCY50));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Integer", CLASS_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependenciesCollection()}
     * .
     */
    @Test
    public void testGetImportDependenciesCollection() {
        final Set < GenericDependency > importDependencies = CLASS_DEPENDENCY_TYPE1.getImportDependenciesCollection()
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
        assertEquals("Integer", CLASS_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", CLASS_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentExtensionsDependencies()}
     * .
     */
    @Test
    public void testGetParentExtensionsDependencies() {
        final Set < GenericDependency > parentExtensionsDependencies = CLASS_DEPENDENCY_TYPE1
                .getParentExtensionsDependencies();
        assertEquals(1, parentExtensionsDependencies.size());
        assertTrue(parentExtensionsDependencies.contains(GENERIC_DEPENDENCY1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentImplementationsDependencies()}
     * .
     */
    @Test
    public void testGetParentImplementationsDependencies() {
        final Set < GenericDependency > parentImplementationsDependencies = CLASS_DEPENDENCY_TYPE1
                .getParentImplementationsDependencies();
        assertEquals(2, parentImplementationsDependencies.size());
        assertTrue(parentImplementationsDependencies.contains(new GenericDependencyImpl("Cloneable", "javax.lang")));
        assertTrue(parentImplementationsDependencies.contains(new GenericDependencyImpl("Set", "java.lang")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramElement()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElement() {
        assertEquals(new PlantUMLClassesDiagramClassElementImpl("java.lang.Integer"),
                CLASS_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations12() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET12));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations13() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET13));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations14() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET14));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations15() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET15));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations16() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET16));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations17() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET17));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations18() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET18));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations19() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22, PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET19));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations20() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22, PLANTUML_USE_RELATION_TEST31})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET20));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations21() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET21));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations22() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET22));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations23() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET23));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations24() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET24));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations25() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST32})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET25));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations26() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET26));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations27() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET27));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations28() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST33})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET28));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations29() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET29));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations30() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET30));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations31() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET31));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations32() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST19})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET32));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations33() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET33));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations34() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET34));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations35() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST34, PLANTUML_USE_RELATION_TEST38})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET35));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations36() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET36));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations37() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET37));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations38() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST35})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET38));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations39() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET39));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations40() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET40));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations41() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST39})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET41));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations42() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET42));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations43() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET43));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations44() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET44));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations45() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET45));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations46() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET46));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations47() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET47));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations48() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET48));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations49() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET49));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations50() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET50));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations51() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST36})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET51));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations52() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET52));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations53() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET53));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations54() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET54));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations55() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST37})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET55));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations56() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                CLASS_DEPENDENCY_TYPE13.getPlantUMLClassesDiagramRelations(DISPLAY_SET56));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithInterfaceAndImportDependenciesAndAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_IMPLEMENT_RELATION_TEST5, PLANTUML_USE_RELATION_TEST5, PLANTUML_USE_RELATION_TEST6,
                PLANTUML_USE_RELATION_TEST25})),
                CLASS_DEPENDENCY_TYPE11.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithParentAndInterfaceAndImportDependenciesAndAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST6, PLANTUML_EXTEND_RELATION_TEST7, PLANTUML_IMPLEMENT_RELATION_TEST7,
                PLANTUML_IMPLEMENT_RELATION_TEST8, PLANTUML_USE_RELATION_TEST24, PLANTUML_USE_RELATION_TEST27})),
                CLASS_DEPENDENCY_TYPE12.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }
}
