/*
 PlantUMLClassesDiagramElementTagTest.java
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

package net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag;

import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.ABSTRACT_CLASS_TAG;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.CLASS_TAG;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.ENUM_TAG;
import static net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag.INTERFACE_TAG;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ObjectTest;
import net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link PlantUMLClassesDiagramElementTag}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.1
 * @version 1.1.1
 */
public class PlantUMLClassesDiagramElementTagTest extends ObjectTest < PlantUMLClassesDiagramElementTag > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramElementTag TAG_TEST1 = ABSTRACT_CLASS_TAG;

    /** Java type test 2 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramElementTag TAG_TEST2 = CLASS_TAG;

    /** Java type test 3 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramElementTag TAG_TEST3 = ENUM_TAG;

    /** Java type test 4 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramElementTag TAG_TEST4 = INTERFACE_TAG;

    /** Java type test 5 instance. */
    @DataPoint
    public static final PlantUMLClassesDiagramElementTag TAG_TEST5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.plantumldiagram.classes.element.tag.PlantUMLClassesDiagramElementTag#getTagName()}
     * .
     */
    @Test
    public void testGetTagName() {
        assertEquals("abstract class ", TAG_TEST1.getTagName());
        assertEquals("class ", TAG_TEST2.getTagName());
        assertEquals("enum ", TAG_TEST3.getTagName());
        assertEquals("interface ", TAG_TEST4.getTagName());
    }
}
