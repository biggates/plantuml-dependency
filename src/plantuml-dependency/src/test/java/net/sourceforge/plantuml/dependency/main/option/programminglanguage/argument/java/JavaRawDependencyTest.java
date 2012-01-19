/*
 JavaRawDependencyTest.java
 Creation date : 14/07/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java;

import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.EXTENSIONS_SET1;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.IMPLEMENTATIONS_SET1;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.CLASS;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.INTERFACE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaRawDependency}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public class JavaRawDependencyTest extends ComparableAndDeepCloneableObjectTest < JavaRawDependency > {

    /** Java raw dependency test 1 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY1 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 2 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY2 = new JavaRawDependency(false, "java.lang", CLASS,
            "Byte", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 3 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY3 = new JavaRawDependency(true, "java.io", CLASS, "Byte",
            EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 4 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY4 = new JavaRawDependency(true, "java.lang", INTERFACE,
            "Byte", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 5 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY5 = new JavaRawDependency(true, "java.lang", CLASS,
            "String", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 6 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY6 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", new TreeSet < String >(), IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 7 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY7 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", EXTENSIONS_SET1, new TreeSet < String >(), false);

    /** Java raw dependency test 8 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY8 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, false);

    /** Java raw dependency test 9 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY9 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", EXTENSIONS_SET1, IMPLEMENTATIONS_SET1, true);

    /** Java raw dependency test 10 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY10 = new JavaRawDependency(true, "java.lang", CLASS,
            "Byte", new TreeSet < String >(), new TreeSet < String >(), false);

    /** Java raw dependency test 11 instance. */
    @DataPoint
    public static final JavaRawDependency JAVA_RAW_DEPENDENCY11 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getFullName()}
     * .
     */
    @Test
    public void testGetFullName() {
        assertEquals("java.lang.Byte", JAVA_RAW_DEPENDENCY1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getName()}
     * .
     */
    @Test
    public void testGetName() {
        assertEquals("Byte", JAVA_RAW_DEPENDENCY1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", JAVA_RAW_DEPENDENCY1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getParentExtentions()}
     * .
     */
    @Test
    public void testGetParentExtentions() {
        final Set < String > extensions = JAVA_RAW_DEPENDENCY1.getParentExtentions();
        assertEquals(1, extensions.size());
        assertTrue(extensions.contains("java.lang.Number"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getParentImplementations()}
     * .
     */
    @Test
    public void testGetParentImplementations() {
        final Set < String > implementations = JAVA_RAW_DEPENDENCY1.getParentImplementations();
        assertEquals(2, implementations.size());
        assertTrue(implementations.contains("java.lang.Comparable"));
        assertTrue(implementations.contains("java.io.Serializable"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#getType()}
     * .
     */
    @Test
    public void testGetType() {
        assertEquals(CLASS, JAVA_RAW_DEPENDENCY1.getType());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency#isAbstract()}
     * .
     */
    @Test
    public void testIsAbstract() {
        assertEquals(true, JAVA_RAW_DEPENDENCY1.isAbstract());
    }
}
