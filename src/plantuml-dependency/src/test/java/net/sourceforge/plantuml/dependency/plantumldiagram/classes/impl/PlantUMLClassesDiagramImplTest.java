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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl;

import static java.util.Arrays.asList;
import static org.junit.Assert.fail;

import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.impl.PlantUMLClassElementImpl;
import net.sourceforge.plantuml.dependency.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramImplTest extends DeepCloneableObjectTest < PlantUMLClassesDiagramImplTest > {

    /** PlantUML classes diagram test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST1 = new PlantUMLClassesDiagramImpl();

    /** PlantUML classes diagram test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST2 = new PlantUMLClassesDiagramImpl(
            new TreeSet < PlantUMLClassesDiagramElement >(
                    asList(new PlantUMLClassesDiagramElement[] {
                            new PlantUMLClassElementImpl(
                                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"),
                            new PlantUMLClassElementImpl(
                                    "net.sourceforge.plantuml.dependency.generic.GenericDependency")})),
            new TreeSet < PlantUMLClassesDiagramRelation >());

    /** PlantUML classes diagram test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST3 = new PlantUMLClassesDiagramImpl();

    /** PlantUML classes diagram test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramImpl PLANTUML_CLASSES_DIAGRAM_TEST4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getDescription()}
     * .
     */
    @Test
    public void testGetDescription() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLClassesDiagramElements()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramElements() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl#getPlantUMLClassesDiagramRelations()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagramRelations() {
        fail("Not yet implemented");
    }
}
