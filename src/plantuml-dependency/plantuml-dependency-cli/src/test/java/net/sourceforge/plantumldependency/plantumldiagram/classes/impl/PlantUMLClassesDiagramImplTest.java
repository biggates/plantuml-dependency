/*
 PlantUMLClassesDiagramImplTest.java
 Creation date : 10/12/2011
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

package net.sourceforge.plantumldependency.plantumldiagram.classes.impl;

import static java.util.Arrays.asList;
import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.plantumldependency.constants.PlantUMLConstants.END_PLANTUML;
import static net.sourceforge.plantumldependency.constants.PlantUMLConstants.START_PLANTUML;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImplTest.PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST3;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST1;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImplTest.PLANTUML_CLASS_ELEMENT_TEST2;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramEnumElementImplTest.PLANTUML_ENUM_ELEMENT_TEST3;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramInterfaceElementImplTest.PLANTUML_INTERFACE_ELEMENT_TEST3;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.relation.impl.PlantUMLClassesDiagramUseRelationImplTest.PLANTUML_USE_RELATION_TEST1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl;
import net.sourceforge.plantumldependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.2.0
 */
public class PlantUMLClassesDiagramImplTest extends DeepCloneableObjectTest < PlantUMLClassesDiagramImpl > {

    /** PlantUML classes diagram test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST1 = new PlantUMLClassesDiagramImpl();

    /** PlantUML classes diagram test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST2 = new PlantUMLClassesDiagramImpl(
            new TreeSet < PlantUMLClassesDiagramElement >(asList(new PlantUMLClassesDiagramElement[] {
                    PLANTUML_CLASS_ELEMENT_TEST2, PLANTUML_CLASS_ELEMENT_TEST1})),
            new TreeSet < PlantUMLClassesDiagramRelation >());

    /** PlantUML classes diagram test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST3 = new PlantUMLClassesDiagramImpl(
            new TreeSet < PlantUMLClassesDiagramElement >(asList(new PlantUMLClassesDiagramElement[] {
                    PLANTUML_CLASS_ELEMENT_TEST2, PLANTUML_CLASS_ELEMENT_TEST1})),
            new TreeSet < PlantUMLClassesDiagramRelation >());

    /** PlantUML classes diagram test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST4 = new PlantUMLClassesDiagramImpl();

    /** PlantUML classes diagram test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST5 = new PlantUMLClassesDiagramImpl(
            new TreeSet < PlantUMLClassesDiagramElement >(asList(new PlantUMLClassesDiagramElement[] {
                    PLANTUML_CLASS_ELEMENT_TEST2, PLANTUML_CLASS_ELEMENT_TEST1, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST3,
                    PLANTUML_ENUM_ELEMENT_TEST3, PLANTUML_INTERFACE_ELEMENT_TEST3})),
            new TreeSet < PlantUMLClassesDiagramRelation >(
                    asList(new PlantUMLClassesDiagramRelation[] {PLANTUML_USE_RELATION_TEST1})));

    /** PlantUML classes diagram test 6 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST6 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLClassesDiagramElements()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElements() {
        assertEquals(2, PLANTUML_CLASSES_DIAGRAM_TEST2.getPlantUMLClassesDiagramElements().size());
        assertTrue(PLANTUML_CLASSES_DIAGRAM_TEST2.getPlantUMLClassesDiagramElements().contains(
                PLANTUML_CLASS_ELEMENT_TEST2));
        assertTrue(PLANTUML_CLASSES_DIAGRAM_TEST2.getPlantUMLClassesDiagramElements().contains(
                PLANTUML_CLASS_ELEMENT_TEST1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLClassesDiagramRelations()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations() {
        assertEquals(1, PLANTUML_CLASSES_DIAGRAM_TEST5.getPlantUMLClassesDiagramRelations().size());
        assertTrue(PLANTUML_CLASSES_DIAGRAM_TEST5.getPlantUMLClassesDiagramRelations().contains(
                PLANTUML_USE_RELATION_TEST1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionEmpty() {
        assertEquals(START_PLANTUML + LINE_SEPARATOR + END_PLANTUML,
                PLANTUML_CLASSES_DIAGRAM_TEST4.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithAllDifferentElements() {
        assertEquals(
                START_PLANTUML + LINE_SEPARATOR + PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST3.getPlantUMLTextDescription()
                        + LINE_SEPARATOR + PLANTUML_CLASS_ELEMENT_TEST1.getPlantUMLTextDescription() + LINE_SEPARATOR
                        + PLANTUML_CLASS_ELEMENT_TEST2.getPlantUMLTextDescription() + LINE_SEPARATOR
                        + PLANTUML_ENUM_ELEMENT_TEST3.getPlantUMLTextDescription() + LINE_SEPARATOR
                        + PLANTUML_INTERFACE_ELEMENT_TEST3.getPlantUMLTextDescription() + LINE_SEPARATOR
                        + PLANTUML_USE_RELATION_TEST1.getPlantUMLTextDescription() + LINE_SEPARATOR + END_PLANTUML,
                PLANTUML_CLASSES_DIAGRAM_TEST5.getPlantUMLTextDescription());
    }
}
