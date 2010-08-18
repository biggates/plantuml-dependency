/*
 ClassJavaTypeTest.java
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

import static net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassAbstractDependencyTypeImplTest.CLASS_ABSTRACT_DEPENDENCY_TYPE1;
import static net.sourceforge.plantuml.dependency.generic.type.impl.classimpl.ClassDependencyTypeImplTest.CLASS_DEPENDENCY_TYPE1;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType.CLASS;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import net.sourceforge.mazix.components.ObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ClassJavaType}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class ClassJavaTypeTest extends ObjectTest < ClassJavaType > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE1 = CLASS;

    /** Java type test 2 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE2 = CLASS;

    /** Java type test 3 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ClassJavaType#createDependencyType(java.lang.String, java.lang.String, boolean, java.util.Set, java.util.Set, java.util.Set)}
     * .
     */
    @Test
    public void testCreateDependencyTypeNotAbstract() {
        assertEquals(CLASS_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(CLASS_DEPENDENCY_TYPE1
                .getName(), CLASS_DEPENDENCY_TYPE1.getPackageName(), false, CLASS_DEPENDENCY_TYPE1
                .getImportDependencies(), CLASS_DEPENDENCY_TYPE1.getParentInterfaces(),
                CLASS_DEPENDENCY_TYPE1.getParentClasses()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ClassJavaType#createDependencyType(java.lang.String, java.lang.String, boolean, java.util.Set, java.util.Set, java.util.Set)}
     * .
     */
    @Test
    public void testCreateDependencyTypeAbstract() {
        assertEquals(CLASS_ABSTRACT_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(CLASS_ABSTRACT_DEPENDENCY_TYPE1
                .getName(), CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPackageName(), true, CLASS_ABSTRACT_DEPENDENCY_TYPE1
                .getImportDependencies(), CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentInterfaces(),
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentClasses()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ClassJavaType#createParentDependencyType(net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testCreateParentDependencyType() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentExtentions(java.lang.String)}
     * .
     */
    @Test
    public void testExtractParentExtentions() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentImplementations(java.lang.String)}
     * .
     */
    @Test
    public void testExtractParentImplementations() {
        fail("Not yet implemented");
    }
}
