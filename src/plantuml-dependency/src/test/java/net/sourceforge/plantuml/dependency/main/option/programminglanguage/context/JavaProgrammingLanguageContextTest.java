/*
 JavaProgrammingLanguageContextTest.java
 Creation date : 2/09/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.context;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaProgrammingLanguageContext}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaProgrammingLanguageContextTest {

    /** Java programming language test 1 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext PROGRAMMING_LANGUAGE_OPTION1 = new JavaProgrammingLanguageContext();

    /** Java programming language test 2 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext PROGRAMMING_LANGUAGE_OPTION2 = new JavaProgrammingLanguageContext(
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})));

    /** Java programming language test 3 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext PROGRAMMING_LANGUAGE_OPTION3 = new JavaProgrammingLanguageContext();

    /** Java programming language test 4 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext PROGRAMMING_LANGUAGE_OPTION4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.JavaProgrammingLanguageContext#addOrReplaceDependencies(net.sourceforge.plantuml.dependency.generic.GenericDependency)}
     * .
     */
    @Test
    public void testAddOrReplaceDependenciesWithExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) PROGRAMMING_LANGUAGE_OPTION2
                .deepClone();
        javaProgrammingLanguageContext.addOrReplaceDependencies(new GenericDependencyImpl(
                "TestReadDependencyFromFileInterfaceWithoutPackage",
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage"));
        assertEquals(2, javaProgrammingLanguageContext.getAllDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.JavaProgrammingLanguageContext#addOrReplaceDependencies(net.sourceforge.plantuml.dependency.generic.GenericDependency)}
     * .
     */
    @Test
    public void testAddOrReplaceDependenciesWithNotExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) PROGRAMMING_LANGUAGE_OPTION2
                .deepClone();
        javaProgrammingLanguageContext.addOrReplaceDependencies(new GenericDependencyImpl("DeepCloneable",
                "net.sourceforge.mazix.components.clone"));
        assertEquals(3, javaProgrammingLanguageContext.getAllDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.JavaProgrammingLanguageContext#getAllDependencies()}
     * .
     */
    @Test
    public void testGetAllDependencies() {
        assertEquals(2, PROGRAMMING_LANGUAGE_OPTION2.getAllDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.JavaProgrammingLanguageContext#getDependencies(java.lang.String)}
     * .
     */
    @Test
    public void testGetDependenciesWithExistingDependency() {
        assertEquals(
                new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                        "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                PROGRAMMING_LANGUAGE_OPTION2
                        .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.JavaProgrammingLanguageContext#getDependencies(java.lang.String)}
     * .
     */
    @Test
    public void testGetDependenciesWithNotExistingDependency() {
        assertNull(PROGRAMMING_LANGUAGE_OPTION2.getDependencies("net.sourceforge.test.GenericDependency"));
    }
}
