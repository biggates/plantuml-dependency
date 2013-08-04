/*
 AnnotationDependencyTypeImplTest.java
 Creation date : 14/07/2013
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

package net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl;

import static java.util.Arrays.asList;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY52;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY53;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET6;
import static net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST2;
import static net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST24;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST17;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST18;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST19;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST20;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST21;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link AnnotationDependencyTypeImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.2.0
 * @version 1.2.0
 */
public class AnnotationDependencyTypeImplTest extends DeepCloneableObjectTest < AnnotationDependencyTypeImpl > {

    /** Annotation dependency type test 1 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE1 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 2 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE2 = new AnnotationDependencyTypeImpl(
            "Integer", "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 3 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE3 = new AnnotationDependencyTypeImpl(
            "Override", "net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl",
            IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 4 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE4 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", new ImportDependenciesCollectionImpl(), GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 5 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE5 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", IMPORT_COLLECTION_TEST2, new TreeSet < GenericDependency >());

    /** Annotation dependency type test 6 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE6 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", IMPORT_COLLECTION_TEST2, GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 7 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE7 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", new ImportDependenciesCollectionImpl(), new TreeSet < GenericDependency >());

    /** Annotation dependency type test 8 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE8 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", IMPORT_COLLECTION_TEST24, GENERIC_DEPENDENCY_SET6);

    /** Annotation dependency type test 9 instance. */
    @DataPoint
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE9 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getAnnotations()}
     * .
     */
    @Test
    public void testGetAnnotations() {
        final Set < GenericDependency > annotations = ANNOTATION_DEPENDENCY_TYPE1.getAnnotations();
        assertEquals(2, annotations.size());
        assertTrue(annotations.contains(GENERIC_DEPENDENCY52));
        assertTrue(annotations.contains(GENERIC_DEPENDENCY53));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Override", ANNOTATION_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getImportDependenciesCollection()}
     * .
     */
    @Test
    public void testGetImportDependenciesCollection() {
        final Set < GenericDependency > importDependencies = ANNOTATION_DEPENDENCY_TYPE1
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
        assertEquals("Override", ANNOTATION_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", ANNOTATION_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getParentInterfaces()}
     * .
     */
    @Test
    public void testGetParentInterfaces() {
        final Set < GenericDependency > parentInterfaces = ANNOTATION_DEPENDENCY_TYPE1.getParentInterfaces();
        assertEquals(0, parentInterfaces.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramElement()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElement() {
        assertEquals(new PlantUMLClassesDiagramAnnotationElementImpl("java.lang.Override"),
                ANNOTATION_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(java.util.Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithImportDependenciesAndAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST18, PLANTUML_USE_RELATION_TEST19,
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST21})),
                ANNOTATION_DEPENDENCY_TYPE8.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(java.util.Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithoutImportDependenciesAndWithoutAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE7.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_OPTIONS));
    }
}
