/*
 JavaTypeTest.java
 Creation date : 17/07/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type;

import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.CLASS;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.ENUM;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.INTERFACE;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.getJavaTypeCollection;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.valueOfIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import net.sourceforge.mazix.components.ComparableObjectTest;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaType}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public class JavaTypeTest extends ComparableObjectTest < ProgrammingLanguage > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE1 = CLASS;

    /** Java type test 2 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE2 = ENUM;

    /** Java type test 3 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE3 = INTERFACE;

    /** Java type test 4 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE4 = CLASS;

    /** Java type test 5 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType#getJavaTypeCollection()}
     * .
     */
    @Test
    public void testGetProgrammingLanguageCollection() {
        final Collection < JavaType > javaTypes = getJavaTypeCollection();
        assertEquals(3, javaTypes.size());
        assertTrue(javaTypes.contains(CLASS));
        assertTrue(javaTypes.contains(ENUM));
        assertTrue(javaTypes.contains(INTERFACE));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test
    public void testValueOfIgnoringCaseExistingJavaTypeLowerCase() {
        final JavaType javaType = valueOfIgnoringCase(CLASS.getLanguageKeyword().toLowerCase());
        assertEquals(CLASS, javaType);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test
    public void testValueOfIgnoringCaseExistingJavaTypeUpperCase() {
        final JavaType javaType = valueOfIgnoringCase(ENUM.getLanguageKeyword().toUpperCase());
        assertEquals(ENUM, javaType);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOfIgnoringCaseNotExistingJavaType() {
        valueOfIgnoringCase("test");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test(expected = NullPointerException.class)
    public void testValueOfIgnoringCaseNull() {
        valueOfIgnoringCase(null);
    }
}
