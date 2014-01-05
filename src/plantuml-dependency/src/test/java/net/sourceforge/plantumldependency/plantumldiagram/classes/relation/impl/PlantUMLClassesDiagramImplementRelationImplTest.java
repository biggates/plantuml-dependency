/*
 PlantUMLClassesDiagramImplementRelationImplTest.java
 Creation date : 5/01/2012
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

package net.sourceforge.plantumldependency.plantumldiagram.classes.relation.impl;

import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST1;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST10;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST11;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST12;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST13;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST18;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST6;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST7;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST8;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImplTest.PLANTUML_ENUM_ELEMENT_TEST3;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImplTest.PLANTUML_ENUM_ELEMENT_TEST6;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST11;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST12;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST3;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST5;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelationType.IMPLEMENT_RELATION_TYPE;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramImplementRelationImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramImplementRelationImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.2.0
 */
public class PlantUMLClassesDiagramImplementRelationImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramImplementRelationImpl > {

    /** PlantUML classes diagram implement relation test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST1 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST1, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2);

    /** PlantUML classes diagram implement relation test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST2 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST1, PLANTUML_ENUM_ELEMENT_TEST3);

    /** PlantUML classes diagram implement relation test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST3 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST3, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2);

    /** PlantUML classes diagram implement relation test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST4 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST6);

    /** PlantUML classes diagram implement relation test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST5 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_CLASS_ELEMENT_TEST10);

    /** PlantUML classes diagram implement relation test 6 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST6 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_CLASS_ELEMENT_TEST11);

    /** PlantUML classes diagram implement relation test 7 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST7 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_CLASS_ELEMENT_TEST12);

    /** PlantUML classes diagram implement relation test 8 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST8 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_CLASS_ELEMENT_TEST8);

    /** PlantUML classes diagram implement relation test 9 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST9 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST12);

    /** PlantUML classes diagram implement relation test 10 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST10 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST18);

    /** PlantUML classes diagram implement relation test 11 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST11 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST10);

    /** PlantUML classes diagram implement relation test 12 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST12 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST10);

    /** PlantUML classes diagram implement relation test 13 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST13 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST12);

    /** PlantUML classes diagram implement relation test 14 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST14 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_INTERFACE_ELEMENT_TEST5, PLANTUML_CLASS_ELEMENT_TEST13);

    /** PlantUML classes diagram implement relation test 15 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST15 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST10);

    /** PlantUML classes diagram implement relation test 16 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST16 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST11);

    /** PlantUML classes diagram implement relation test 17 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST17 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST12);

    /** PlantUML classes diagram implement relation test 18 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST18 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6, PLANTUML_CLASS_ELEMENT_TEST18);

    /** PlantUML classes diagram implement relation test 19 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST19 = null;

    /** PlantUML classes diagram implement relation test 20 instance. */
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST20 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_INTERFACE_ELEMENT_TEST11);

    /** PlantUML classes diagram implement relation test 21 instance. */
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST21 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_CLASS_ELEMENT_TEST7, PLANTUML_INTERFACE_ELEMENT_TEST12);

    /** PlantUML classes diagram implement relation test 22 instance. */
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST22 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_INTERFACE_ELEMENT_TEST11);

    /** PlantUML classes diagram implement relation test 23 instance. */
    public static final PlantUMLClassesDiagramImplementRelationImpl PLANTUML_IMPLEMENT_RELATION_TEST23 = new PlantUMLClassesDiagramImplementRelationImpl(
            PLANTUML_ENUM_ELEMENT_TEST6, PLANTUML_INTERFACE_ELEMENT_TEST12);

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getFirstElement()}
     * .
     */
    @Test
    public void testGetFirstElement() {
        assertEquals(PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST1, PLANTUML_IMPLEMENT_RELATION_TEST1.getFirstElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescription() {
        assertEquals(
                PLANTUML_INTERFACE_ELEMENT_TEST5.getName()
                        + PLANTUML_IMPLEMENT_RELATION_TEST12.getType().getRightRelationSymbol()
                        + PLANTUML_CLASS_ELEMENT_TEST10.getName(),
                PLANTUML_IMPLEMENT_RELATION_TEST12.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getSecondElement()}
     * .
     */
    @Test
    public void testGetSecondElement() {
        assertEquals(PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2, PLANTUML_IMPLEMENT_RELATION_TEST1.getSecondElement());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.relation.AbstractPlantUMLClassesDiagramRelation#getType()}
     * .
     */
    @Test
    public void testGetType() {
        assertEquals(IMPLEMENT_RELATION_TYPE, PLANTUML_IMPLEMENT_RELATION_TEST1.getType());
    }
}
