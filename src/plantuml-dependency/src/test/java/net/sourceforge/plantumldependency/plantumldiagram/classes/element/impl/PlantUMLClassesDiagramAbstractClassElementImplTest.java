/*
 PlantUMLClassesDiagramAbstractClassElementImplTest.java
 Creation date : 26/12/2011
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

package net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl;

import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImplTest.PLANTUML_STEREOTYPE_TEST6;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.ABSTRACT_CLASS_TAG;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramAbstractClassElementImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramAbstractClassElementImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramAbstractClassElementImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramAbstractClassElementImpl > {

    /** PlantUML classes diagram abstract class element test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST1 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement");

    /** PlantUML classes diagram abstract class element test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.lang.test.EnumClass");

    /** PlantUML classes diagram abstract class element test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST3 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.lang.test.EnumClass");

    /** PlantUML classes diagram abstract class element test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST4 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.lang.test.EnumClass", PLANTUML_STEREOTYPE_TEST6);

    /** PlantUML classes diagram abstract class element test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST5 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "EnumClass", PLANTUML_STEREOTYPE_TEST6);

    /** PlantUML classes diagram abstract class element test 6 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST6 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.lang.Integer");

    /** PlantUML classes diagram abstract class element test 7 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST7 = null;

    /** PlantUML classes diagram abstract class element test 8 instance. */
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST8 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.io.InputStream");

    /** PlantUML classes diagram abstract class element test 9 instance. */
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST9 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "java.io.File");

    /** PlantUML classes diagram abstract class element test 10 instance. */
    public static final PlantUMLClassesDiagramAbstractClassElementImpl PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST10 = new PlantUMLClassesDiagramAbstractClassElementImpl(
            "net.sourceforge.mazix.cli.option.AbstractOption");

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getElementTag()}
     * .
     */
    @Test
    public void testGetElementTag() {
        assertEquals(ABSTRACT_CLASS_TAG, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST4.getElementTag());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals(PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST3.getName(), "java.lang.test.EnumClass");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithoutStereotype() {
        assertEquals(ABSTRACT_CLASS_TAG.getTagName() + PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2.getName(),
                PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST2.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithStereotype() {
        assertEquals(ABSTRACT_CLASS_TAG.getTagName() + PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST4.getName()
                + " << (B,#f0f8ff) Test it ! >>", PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST4.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl#getStereotype()}
     * .
     */
    @Test
    public void testGetStereotype() {
        assertEquals(PLANTUML_STEREOTYPE_TEST6, PLANTUML_ABSTRACT_CLASS_ELEMENT_TEST4.getStereotype());
    }
}
