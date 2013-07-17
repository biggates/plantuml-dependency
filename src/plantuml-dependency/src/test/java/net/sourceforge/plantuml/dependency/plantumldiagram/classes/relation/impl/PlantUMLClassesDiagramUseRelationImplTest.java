/*
 PlantUMLClassesDiagramUseRelationImplTest.java
 Creation date : 5/02/2012
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.impl;

import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImplTest.PLANTUML_ANNOTATION_ELEMENT_TEST1;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImplTest.PLANTUML_ANNOTATION_ELEMENT_TEST2;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImplTest.PLANTUML_ANNOTATION_ELEMENT_TEST3;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImplTest.PLANTUML_ANNOTATION_ELEMENT_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImplTest.PLANTUML_ANNOTATION_ELEMENT_TEST6;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST1;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST2;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST6;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST7;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST8;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST9;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImplTest.PLANTUML_ENUM_ELEMENT_TEST3;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImplTest.PLANTUML_ENUM_ELEMENT_TEST6;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST3;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST5;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelationType.USE_RELATION_TYPE;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramUseRelationImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramUseRelationImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramUseRelationImpl > {

    /** PlantUML classes diagram use relation test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST1 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST1, PLANTUML_CLASS_ELEMENT_TEST2);

    /** PlantUML classes diagram use relation test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST2 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST1, PLANTUML_ENUM_ELEMENT_TEST3);

    /** PlantUML classes diagram use relation test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST3 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST3, PLANTUML_CLASS_ELEMENT_TEST2);

    /** PlantUML classes diagram use relation test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST4 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST5, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5);

    /** PlantUML classes diagram use relation test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST5 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST7);

    /** PlantUML classes diagram use relation test 6 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST6 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram use relation test 7 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST7 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST9);

    /** PlantUML classes diagram use relation test 8 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST8 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST7);

    /** PlantUML classes diagram use relation test 9 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST9 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram use relation test 10 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST10 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST9);

    /** PlantUML classes diagram use relation test 11 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST11 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST7);

    /** PlantUML classes diagram use relation test 12 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST12 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram use relation test 13 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST13 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST9);

    /** PlantUML classes diagram use relation test 14 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST14 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST7);

    /** PlantUML classes diagram use relation test 15 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST15 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram use relation test 16 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST16 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST9);

    /** PlantUML classes diagram use relation test 17 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST17 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ANNOTATION_ELEMENT_TEST1, PLANTUML_CLASS_ELEMENT_TEST7);

    /** PlantUML classes diagram use relation test 18 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST18 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ANNOTATION_ELEMENT_TEST1, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram use relation test 19 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST19 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ANNOTATION_ELEMENT_TEST1, PLANTUML_CLASS_ELEMENT_TEST9);

    /** PlantUML classes diagram use relation test 20 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST20 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ANNOTATION_ELEMENT_TEST1, PLANTUML_ANNOTATION_ELEMENT_TEST5);

    /** PlantUML classes diagram use relation test 21 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST21 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ANNOTATION_ELEMENT_TEST1, PLANTUML_ANNOTATION_ELEMENT_TEST3);

    /** PlantUML classes diagram use relation test 22 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST22 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST2);

    /** PlantUML classes diagram use relation test 23 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST23 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST3);

    /** PlantUML classes diagram use relation test 24 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST24 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST6);

    /** PlantUML classes diagram use relation test 25 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST25 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_ANNOTATION_ELEMENT_TEST6);

    /** PlantUML classes diagram use relation test 26 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST26 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST5);

    /** PlantUML classes diagram use relation test 27 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST27 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST6);

    /** PlantUML classes diagram use relation test 28 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST28 = new PlantUMLClassesDiagramUseRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST6);

    /** PlantUML classes diagram use relation test 29 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramUseRelationImpl PLANTUML_USE_RELATION_TEST29 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getFirstElement()}
     * .
     */
    @Test
    public void testGetFirstElement() {
        assertEquals(PLANTUML_CLASS_ELEMENT_TEST1, PLANTUML_USE_RELATION_TEST1.getFirstElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescription() {
        assertEquals(PLANTUML_CLASS_ELEMENT_TEST5.getName()
                + PLANTUML_USE_RELATION_TEST4.getType().getRightRelationSymbol()
                + PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5.getName(),
                PLANTUML_USE_RELATION_TEST4.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getSecondElement()}
     * .
     */
    @Test
    public void testGetSecondElement() {
        assertEquals(PLANTUML_CLASS_ELEMENT_TEST2, PLANTUML_USE_RELATION_TEST1.getSecondElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getType()}
     * .
     */
    @Test
    public void testGetType() {
        assertEquals(USE_RELATION_TYPE, PLANTUML_USE_RELATION_TEST1.getType());
    }
}
