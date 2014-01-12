/*
 PlantUMLSpottedCharacterImplTest.java
 Creation date : 24/12/2011
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

package net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl;

import static net.sourceforge.plantumldependency.common.color.HTMLColor.ALICE_BLUE;
import static net.sourceforge.plantumldependency.common.color.HTMLColor.ANTIQUE_WHITE;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.UPPER_ALPHABET_CHAR;
import static org.junit.Assert.assertEquals;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLSpottedCharacterImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.1
 * @version 1.3.0
 */
public class PlantUMLSpottedCharacterImplTest extends
        ComparableAndDeepCloneableObjectTest < PlantUMLSpottedCharacterImpl > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final PlantUMLSpottedCharacterImpl PLANTUML_SPOTTED_CHAR_TEST1 = new PlantUMLSpottedCharacterImpl(
            UPPER_ALPHABET_CHAR[0].charAt(0), ALICE_BLUE);

    /** Java type test 2 instance. */
    @DataPoint
    public static final PlantUMLSpottedCharacterImpl PLANTUML_SPOTTED_CHAR_TEST2 = new PlantUMLSpottedCharacterImpl(
            UPPER_ALPHABET_CHAR[0].charAt(0), ALICE_BLUE);

    /** Java type test 3 instance. */
    @DataPoint
    public static final PlantUMLSpottedCharacterImpl PLANTUML_SPOTTED_CHAR_TEST3 = new PlantUMLSpottedCharacterImpl(
            UPPER_ALPHABET_CHAR[0].charAt(0), ANTIQUE_WHITE);

    /** Java type test 4 instance. */
    @DataPoint
    public static final PlantUMLSpottedCharacterImpl PLANTUML_SPOTTED_CHAR_TEST4 = new PlantUMLSpottedCharacterImpl(
            UPPER_ALPHABET_CHAR[1].charAt(0), ALICE_BLUE);

    /** Java type test 5 instance. */
    @DataPoint
    public static final PlantUMLSpottedCharacterImpl PLANTUML_SPOTTED_CHAR_TEST5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImpl#getCharacter()}
     * .
     */
    @Test
    public void testGetCharacter() {
        assertEquals(UPPER_ALPHABET_CHAR[0].charAt(0), PLANTUML_SPOTTED_CHAR_TEST1.getCharacter());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImpl#getColor()}
     * .
     */
    @Test
    public void testGetColor() {
        assertEquals(ANTIQUE_WHITE, PLANTUML_SPOTTED_CHAR_TEST3.getColor());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.stereotype.impl.PlantUMLSpottedCharacterImpl#getPlantUMLTextDescription()}
     * .
     */
    @Test
    public void testGetPlantUMLTextDescription() {
        assertEquals("(A,#faebd7)", PLANTUML_SPOTTED_CHAR_TEST3.getPlantUMLTextDescription());
    }
}
