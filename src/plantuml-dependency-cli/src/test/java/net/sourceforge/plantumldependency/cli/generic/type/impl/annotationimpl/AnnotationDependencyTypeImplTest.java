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

package net.sourceforge.plantumldependency.cli.generic.type.impl.annotationimpl;

import static java.util.Arrays.asList;
import static java.util.regex.Pattern.compile;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_TYPES_OPTIONS;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY_NAME;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY_PACKAGE_NAME;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET1023;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET1024;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET12;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET13;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET14;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET15;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET16;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET17;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET18;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET19;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET2;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET20;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET21;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET22;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET23;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET24;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET25;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET26;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET27;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET28;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET29;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET30;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET31;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET32;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET33;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET34;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET35;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET36;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET37;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET38;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET39;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET40;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET41;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET42;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET43;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET44;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET45;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET46;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET47;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET48;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET49;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET50;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET51;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET52;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET53;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET54;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET55;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET56;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY52;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY53;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.GENERIC_DEPENDENCY_SET6;
import static net.sourceforge.plantumldependency.cli.generic.impl.GenericDependencyImplTest.GENERIC_DEPENDENCY1;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST2;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST24;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImplTest.IMPORT_COLLECTION_TEST25;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST17;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST18;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST19;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST20;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST22;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST30;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST31;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST32;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST33;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST34;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST35;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST36;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST37;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST38;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST39;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST40;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST41;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.ImportDependenciesCollectionImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;
import net.sourceforge.plantumldependency.common.clone.DeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link AnnotationDependencyTypeImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.2.0
 * @version 1.4.0
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
            "Override", "net.sourceforge.plantumldependency.generic.type.impl.annotationimpl", IMPORT_COLLECTION_TEST2,
            GENERIC_DEPENDENCY_SET6);

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

    /** Annotation dependency type test 10 instance. */
    public static final AnnotationDependencyTypeImpl ANNOTATION_DEPENDENCY_TYPE10 = new AnnotationDependencyTypeImpl(
            "Override", "java.lang", IMPORT_COLLECTION_TEST25, GENERIC_DEPENDENCY_SET6);

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getAnnotationsDependencies()}
     * .
     */
    @Test
    public void testGetAnnotationsDependencies() {
        final Set < GenericDependency > annotationsDependencies = ANNOTATION_DEPENDENCY_TYPE1
                .getAnnotationsDependencies();
        assertEquals(2, annotationsDependencies.size());
        assertTrue(annotationsDependencies.contains(GENERIC_DEPENDENCY52));
        assertTrue(annotationsDependencies.contains(GENERIC_DEPENDENCY53));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Override", ANNOTATION_DEPENDENCY_TYPE1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getImportDependenciesCollection()}
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
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals("Override", ANNOTATION_DEPENDENCY_TYPE1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", ANNOTATION_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getParentExtensionsDependencies()}
     * .
     */
    @Test
    public void testGetParentExtensionsDependencies() {
        final Set < GenericDependency > parentExtensionsDependencies = ANNOTATION_DEPENDENCY_TYPE1
                .getParentExtensionsDependencies();
        assertEquals(0, parentExtensionsDependencies.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getParentImplementationsDependencies()}
     * .
     */
    @Test
    public void testGetParentImplementationsDependencies() {
        final Set < GenericDependency > parentImplementationsDependencies = ANNOTATION_DEPENDENCY_TYPE1
                .getParentImplementationsDependencies();
        assertEquals(0, parentImplementationsDependencies.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramElement()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElement() {
        assertEquals(new PlantUMLClassesDiagramAnnotationElementImpl("java.lang.Override"),
                ANNOTATION_DEPENDENCY_TYPE1.getPlantUMLClassesDiagramElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations1024() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST19, PLANTUML_USE_RELATION_TEST20,
                PLANTUML_USE_RELATION_TEST22, PLANTUML_USE_RELATION_TEST30, PLANTUML_USE_RELATION_TEST31,
                PLANTUML_USE_RELATION_TEST32, PLANTUML_USE_RELATION_TEST33, PLANTUML_USE_RELATION_TEST34,
                PLANTUML_USE_RELATION_TEST35, PLANTUML_USE_RELATION_TEST36, PLANTUML_USE_RELATION_TEST37,
                PLANTUML_USE_RELATION_TEST38, PLANTUML_USE_RELATION_TEST39, PLANTUML_USE_RELATION_TEST40,
                PLANTUML_USE_RELATION_TEST41})), ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(
                DISPLAY_TYPE_SET1024, DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN,
                DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations1024WithAllPackageNamePatternAndLimitedNamePattern() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST36, PLANTUML_USE_RELATION_TEST38})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET1024,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, compile(".*able.*")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations1024WithLimitedPackageNamePatternAndAllNamePattern() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST19, PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST31,
                PLANTUML_USE_RELATION_TEST36, PLANTUML_USE_RELATION_TEST37, PLANTUML_USE_RELATION_TEST38,
                PLANTUML_USE_RELATION_TEST41})), ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(
                DISPLAY_TYPE_SET1024, compile(".*lang.*"), DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations1024WithLimitedPackageNamePatternAndLimitedNamePattern() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST36, PLANTUML_USE_RELATION_TEST38})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET1024,
                        compile(".*lang.*"), compile(".*able.*")));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations1024WithNativePackageNamePatternAndNativeNamePattern() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET1024,
                        compile(NATIVE_DEPENDENCY_PACKAGE_NAME), compile(NATIVE_DEPENDENCY_NAME)));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations12() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET12,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations13() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET13,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations14() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET14,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations15() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET15,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations16() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET16,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations17() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET17,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations18() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET18,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations19() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22, PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET19,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations20() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22, PLANTUML_USE_RELATION_TEST31})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET20,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations21() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET21,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations22() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET22,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations23() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET23,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations24() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET24,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations25() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST32, PLANTUML_USE_RELATION_TEST33})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET25,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations26() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET26,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations27() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET27,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations28() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST40})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET28,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations29() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET29,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations30() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET30,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations31() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET31,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations32() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST19})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET32,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations33() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET33,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations34() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET34,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations35() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST34, PLANTUML_USE_RELATION_TEST38, PLANTUML_USE_RELATION_TEST19})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET35,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations36() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET36,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations37() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET37,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations38() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST35})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET38,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations39() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET39,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations40() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET40,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations41() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST39})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET41,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations42() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET42,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations43() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET43,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations44() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET44,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations45() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET45,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations46() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET46,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations47() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET47,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations48() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET48,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations49() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET49,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations50() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET50,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations51() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST36, PLANTUML_USE_RELATION_TEST41})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET51,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations52() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET52,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations53() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET53,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations54() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET54,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations55() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST37})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET55,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations56() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(
                asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST30})),
                ANNOTATION_DEPENDENCY_TYPE10.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET56,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithImportDependenciesAndAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST18, PLANTUML_USE_RELATION_TEST19,
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE8.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_TYPES_OPTIONS,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithImportDependenciesAndAnnotationsAndAnnotationsDisplay() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST20, PLANTUML_USE_RELATION_TEST22})),
                ANNOTATION_DEPENDENCY_TYPE8.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET2,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithImportDependenciesAndAnnotationsAndNotAnnotationsDisplay() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(asList(new PlantUMLClassesDiagramRelation[] {
                PLANTUML_USE_RELATION_TEST17, PLANTUML_USE_RELATION_TEST18, PLANTUML_USE_RELATION_TEST19})),
                ANNOTATION_DEPENDENCY_TYPE8.getPlantUMLClassesDiagramRelations(DISPLAY_TYPE_SET1023,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.generic.type.impl.DependencyTypeImpl#getPlantUMLClassesDiagramRelations(Set)}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelationsWithoutImportDependenciesAndWithoutAnnotations() {
        assertEquals(new TreeSet < PlantUMLClassesDiagramRelation >(),
                ANNOTATION_DEPENDENCY_TYPE7.getPlantUMLClassesDiagramRelations(DEFAULT_DISPLAY_TYPES_OPTIONS,
                        DEFAULT_DISPLAY_PACKAGE_NAME_OPTIONS_PATTERN, DEFAULT_DISPLAY_NAME_OPTIONS_PATTERN));
    }
}
