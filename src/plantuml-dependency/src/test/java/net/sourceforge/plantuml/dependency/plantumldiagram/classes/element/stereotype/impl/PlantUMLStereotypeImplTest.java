/*
 PlantUMLStereotypeImplTest.java
 Creation date : 25/12/2011
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

package net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl;

import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImplTest.PLANTUML_SPOTTED_CHAR_TEST1;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImplTest.PLANTUML_SPOTTED_CHAR_TEST3;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImplTest.PLANTUML_SPOTTED_CHAR_TEST4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLStereotypeImpl}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLStereotypeImplTest extends ComparableAndDeepCloneableObjectTest < PlantUMLStereotypeImpl > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST1 = new PlantUMLStereotypeImpl("Generic");

    /** Java type test 2 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST2 = new PlantUMLStereotypeImpl("Generic");

    /** Java type test 3 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST3 = new PlantUMLStereotypeImpl(
            PLANTUML_SPOTTED_CHAR_TEST1);

    /** Java type test 4 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST4 = new PlantUMLStereotypeImpl(
            PLANTUML_SPOTTED_CHAR_TEST1);

    /** Java type test 5 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST5 = new PlantUMLStereotypeImpl("Generic",
            PLANTUML_SPOTTED_CHAR_TEST3);

    /** Java type test 6 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST6 = new PlantUMLStereotypeImpl("Test it !",
            PLANTUML_SPOTTED_CHAR_TEST4);

    /** Java type test 7 instance. */
    @DataPoint
    public static final PlantUMLStereotypeImpl PLANTUML_STEREOTYPE_TEST7 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl#getPlantUMLSpottedCharacter()}
     * .
     */
    @Test
    public void testGetPlantUMLSpottedCharacter() {
        assertEquals(PLANTUML_SPOTTED_CHAR_TEST4, PLANTUML_STEREOTYPE_TEST6.getPlantUMLSpottedCharacter());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescription() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl#getText()}
     * .
     */
    @Test
    public void testGetText() {
        assertEquals("Test it !", PLANTUML_STEREOTYPE_TEST6.getText());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.plantumldiagram.classes.element.stereotype.impl.PlantUMLStereotypeImpl#getText()}
     * .
     */
    @Test
    public void testGetTextBlank() {
        assertEquals(BLANK_STRING, PLANTUML_STEREOTYPE_TEST4.getText());
    }
}
