/*
 PlantUMLClassesDiagramAnnotationElementImplTest.java
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl;

import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImplTest.PLANTUML_STEREOTYPE_TEST6;
import static net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.ANNOTATION_TAG;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramAnnotationElementImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.2.0
 * @version 1.2.0
 */
public class PlantUMLClassesDiagramAnnotationElementImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramAnnotationElementImpl > {

    /** PlantUML classes diagram annotation element test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST1 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "java.lang.Override");

    /** PlantUML classes diagram annotation element test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST2 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "java.lang.Deprecated");

    /** PlantUML classes diagram annotation element test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST3 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "javax.annotation.Generated");

    /** PlantUML classes diagram annotation element test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST4 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "java.annotation.Generated", PLANTUML_STEREOTYPE_TEST6);

    /** PlantUML classes diagram annotation element test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST5 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "javax.lang.Deprecated");

    /** PlantUML classes diagram annotation element test 6 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST6 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "javax.lang.Override");

    /** PlantUML classes diagram annotation element test 7 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST7 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "javax.lang.Override", PLANTUML_STEREOTYPE_TEST6);

    /** PlantUML classes diagram annotation element test 8 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST8 = null;

    /** PlantUML classes diagram annotation element test 9 instance. */
    public static final PlantUMLClassesDiagramAnnotationElementImpl PLANTUML_ANNOTATION_ELEMENT_TEST9 = new PlantUMLClassesDiagramAnnotationElementImpl(
            "java.lang.annotation.Target");

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getElementTag()}
     * .
     */
    @Test
    public void testGetElementTag() {
        assertEquals(ANNOTATION_TAG, PLANTUML_ANNOTATION_ELEMENT_TEST1.getElementTag());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals(PLANTUML_ANNOTATION_ELEMENT_TEST1.getName(), "java.lang.Override");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithoutStereotype() {
        assertEquals(ANNOTATION_TAG.getTagName() + PLANTUML_ANNOTATION_ELEMENT_TEST1.getName(),
                PLANTUML_ANNOTATION_ELEMENT_TEST1.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithStereotype() {
        assertEquals(ANNOTATION_TAG.getTagName() + PLANTUML_ANNOTATION_ELEMENT_TEST4.getName()
                + " << (B,#f0f8ff) Test it ! >>", PLANTUML_ANNOTATION_ELEMENT_TEST4.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAnnotationElementImpl#getStereotype()}
     * .
     */
    @Test
    public void testGetStereotype() {
        assertEquals(PLANTUML_STEREOTYPE_TEST6, PLANTUML_ANNOTATION_ELEMENT_TEST4.getStereotype());
    }
}
