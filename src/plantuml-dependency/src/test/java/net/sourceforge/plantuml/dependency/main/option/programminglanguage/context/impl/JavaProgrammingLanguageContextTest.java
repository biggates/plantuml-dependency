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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl;

import static java.util.Arrays.asList;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SLASH_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.DISPLAY_SET2;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyTestConstants.DISPLAY_SET3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.TreeSet;

import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaProgrammingLanguageContext}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.0
 */
public class JavaProgrammingLanguageContextTest extends DeepCloneableObjectTest < JavaProgrammingLanguageContextTest > {

    /** Java programming language test 1 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT1 = new JavaProgrammingLanguageContext();

    /** Java programming language test 2 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT2 = new JavaProgrammingLanguageContext(
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            DISPLAY_SET2);

    /** Java programming language test 3 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT3 = new JavaProgrammingLanguageContext(
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            DISPLAY_SET3);

    /** Java programming language test 4 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT4 = new JavaProgrammingLanguageContext(
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})), DISPLAY_SET3);

    /** Java programming language test 5 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT5 = new JavaProgrammingLanguageContext();

    /** Java programming language test 6 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT6 = null;

    /** Test file instance. */
    private static final File TEST_FILE = new File(DOT_CHAR + SLASH_CHAR + "plantumlTest.txt");

    /**
     * This method is called before each test to reset the create a test file.
     *
     * @since 1.0
     */
    @Before
    public void initializeFiles() {
        writeIntoFile("Test", TEST_FILE);
    }

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.0
     */
    @After
    public void removeFile() {
        TEST_FILE.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addParsedAndSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddParsedAndSeenDependenciesWithExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                .deepClone();
        javaProgrammingLanguageContext.addParsedAndSeenDependencies(new GenericDependencyImpl(
                "TestReadDependencyFromFileInterfaceWithoutPackage",
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage"));
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(2, javaProgrammingLanguageContext.getParsedDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addParsedAndSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddParsedAndSeenDependenciesWithNotExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                .deepClone();
        javaProgrammingLanguageContext.addParsedAndSeenDependencies(new GenericDependencyImpl("DeepCloneable",
                "net.sourceforge.mazix.components.clone"));
        assertEquals(3, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(3, javaProgrammingLanguageContext.getParsedDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addParsedAndSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddSeenDependenciesWithExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                .deepClone();
        javaProgrammingLanguageContext.addSeenDependencies(new GenericDependencyImpl(
                "TestReadDependencyFromFileInterfaceWithoutPackage",
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage"));
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(2, javaProgrammingLanguageContext.getParsedDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addParsedAndSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddSeenDependenciesWithNotExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                .deepClone();
        javaProgrammingLanguageContext.addSeenDependencies(new GenericDependencyImpl("DeepCloneable",
                "net.sourceforge.mazix.components.clone"));
        assertEquals(3, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(2, javaProgrammingLanguageContext.getParsedDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getParsedAndSeenDependencies()}
     * .
     */
    @Test
    public void testGetAllDependencies() {
        assertEquals(2, JAVA_PROGRAMMING_LANGUAGE_CONTEXT2.getParsedAndSeenDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getDependencies(java.lang.String)}
     * .
     */
    @Test
    public void testGetDependenciesWithExistingDependency() {
        assertEquals(
                new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                        "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                        .getDependencies("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getDependencies(java.lang.String)}
     * .
     */
    @Test
    public void testGetDependenciesWithNotExistingDependency() {
        assertNull(JAVA_PROGRAMMING_LANGUAGE_CONTEXT2.getDependencies("net.sourceforge.test.GenericDependency"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#writePlantUMLFile(java.io.File)}
     * .
     */
    @Test
    public void testWritePlantUMLFile() {
        JAVA_PROGRAMMING_LANGUAGE_CONTEXT2.writePlantUMLFile(TEST_FILE);
        final String plantumlContent1 = readFileIntoString(TEST_FILE);
        assertEquals(
                "@startuml" + LINE_SEPARATOR + "class net.sourceforge.plantuml.dependency.generic.GenericDependency" + LINE_SEPARATOR + "class net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage" + LINE_SEPARATOR + "@enduml",
                plantumlContent1);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#writePlantUMLFile(java.io.File)}
     * .
     */
    @Test(expected = NullPointerException.class)
    public void testWritePlantUMLFileNull() {
        JAVA_PROGRAMMING_LANGUAGE_CONTEXT1.writePlantUMLFile(null);
    }

    // TODO better test the WritePlantUMLFile method with display option and with specific context
}
