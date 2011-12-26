/*
 PlantUMLClassElementImplTest.java
 Creation date : 23/12/2011
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl;

import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImplTest.PLANTUML_STEREOTYPE_TEST6;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.CLASS_TAG;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramImpl}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramClassElementImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramImpl > {

    /** PlantUML classes diagram test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASS_ELEMENT_TEST1 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage");

    /** PlantUML classes diagram test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASS_ELEMENT_TEST2 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.generic.GenericDependency");

    /** PlantUML classes diagram test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASS_ELEMENT_TEST3 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.generic.GenericDependency");

    /** PlantUML classes diagram test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASS_ELEMENT_TEST4 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.generic.GenericDependency", PLANTUML_STEREOTYPE_TEST6);

    /** PlantUML classes diagram test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASS_ELEMENT_TEST5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getElementTag()}
     * .
     */
    @Test
    public void testGetElementTag() {
        assertEquals(CLASS_TAG, PLANTUML_CLASS_ELEMENT_TEST4.getElementTag());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals(PLANTUML_CLASS_ELEMENT_TEST3.getName(),
                "net.sourceforge.plantuml.dependency.generic.GenericDependency");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithoutStereotype() {
        assertEquals(CLASS_TAG.getTagName() + "net.sourceforge.plantuml.dependency.generic.GenericDependency",
                PLANTUML_CLASS_ELEMENT_TEST2.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescriptionWithStereotype() {
        assertEquals(CLASS_TAG.getTagName()
                + "net.sourceforge.plantuml.dependency.generic.GenericDependency << (B,#f0f8ff) Test it ! >>",
                PLANTUML_CLASS_ELEMENT_TEST4.getPlantUMLTextDescription());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl#getStereotype()}
     * .
     */
    @Test
    public void testGetStereotype() {
        assertEquals(PLANTUML_STEREOTYPE_TEST6, PLANTUML_CLASS_ELEMENT_TEST4.getStereotype());
    }
}
