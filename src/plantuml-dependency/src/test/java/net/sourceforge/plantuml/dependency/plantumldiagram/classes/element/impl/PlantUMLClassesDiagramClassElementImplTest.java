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

import static org.junit.Assert.fail;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImplTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version
 */
public class PlantUMLClassesDiagramClassElementImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLClassesDiagramImplTest > {

    /** PlantUML classes diagram test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASSES_ELEMENT_TEST1 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage");

    /** PlantUML classes diagram test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASSES_ELEMENT_TEST2 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.generic.GenericDependency");

    /** PlantUML classes diagram test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASSES_ELEMENT_TEST3 = new PlantUMLClassesDiagramClassElementImpl(
            "net.sourceforge.plantuml.dependency.generic.GenericDependency");

    /** PlantUML classes diagram test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramClassElementImpl PLANTUML_CLASSES_ELEMENT_TEST4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescription() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getElementTag()}
     * .
     */
    @Test
    public void testGetElementTag() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.AbstractPlantUMLClassesDiagramElement#getName()}
     * .
     */
    @Test
    public void testGetName() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassesDiagramClassElementImpl#getStereotype()}
     * .
     */
    @Test
    public void testGetStereotype() {
        fail("Not yet implemented");
    }

}
