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
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.DEFAULT_DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_SET3;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ABSTRACT_CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.DISPLAY_OPTIONS;
import static net.sourceforge.plantuml.dependency.plantumldiagram.classes.impl.PlantUMLClassesDiagramImplTest.PLANTUML_CLASSES_DIAGRAM_TEST2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import net.sourceforge.mazix.components.ComparableAndDeepCloneableObjectTest;
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
 * @version 1.1.0
 */
public class JavaProgrammingLanguageContextTest extends
        ComparableAndDeepCloneableObjectTest < JavaProgrammingLanguageContextTest > {

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
            DEFAULT_DISPLAY_OPTIONS);

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
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "TestReadDependencyFromFileInterfaceWithoutPackage",
                    "net.sourceforge.plantuml.dependency.main.option.programminglanguage")})), DISPLAY_OPTIONS);

    /** Java programming language test 5 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT5 = new JavaProgrammingLanguageContext(
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {
                    new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                            "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                    new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
            new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                    "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})), DISPLAY_OPTIONS);

    /** Java programming language test 6 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT6 = new JavaProgrammingLanguageContext();

    /** Java programming language test 7 instance. */
    @DataPoint
    public static final JavaProgrammingLanguageContext JAVA_PROGRAMMING_LANGUAGE_CONTEXT7 = null;

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
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addPotentialJavaLangSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddPotentialJavaLangSeenDependenciesWithExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT4
                .deepClone();
        javaProgrammingLanguageContext.addPotentialJavaLangSeenDependencies(new GenericDependencyImpl(
                "TestReadDependencyFromFileInterfaceWithoutPackage",
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage"));
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(1, javaProgrammingLanguageContext.getPotentialJavaLangSeenDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#addPotentialJavaLangSeenDependencies(GenericDependency)}
     * .
     */
    @Test
    public void testAddPotentialJavaLangSeenDependenciesWithNotExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT4
                .deepClone();
        javaProgrammingLanguageContext.addPotentialJavaLangSeenDependencies(new GenericDependencyImpl("DeepCloneable",
                "net.sourceforge.mazix.components.clone"));
        assertEquals(3, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(2, javaProgrammingLanguageContext.getPotentialJavaLangSeenDependencies().size());
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
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getParsedOrSeenDependency(java.lang.String)}
     * .
     */
    @Test
    public void testGetParsedOrSeenDependencyWithExistingDependency() {
        assertEquals(
                new GenericDependencyImpl("TestReadDependencyFromFileInterfaceWithoutPackage",
                        "net.sourceforge.plantuml.dependency.main.option.programminglanguage"),
                JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                        .getParsedOrSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getParsedOrSeenDependency(java.lang.String)}
     * .
     */
    @Test
    public void testGetParsedOrSeenDependencyWithNotExistingDependency() {
        assertNull(JAVA_PROGRAMMING_LANGUAGE_CONTEXT2
                .getParsedOrSeenDependency("net.sourceforge.test.GenericDependency"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getPlantUMLClassesDiagram()}
     * .
     */
    @Test
    public void testGetPlantUMLClassesDiagram() {
        assertEquals(PLANTUML_CLASSES_DIAGRAM_TEST2, JAVA_PROGRAMMING_LANGUAGE_CONTEXT2.getPlantUMLClassesDiagram());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#getPotentialJavaLangSeenDependencies()}
     * .
     */
    @Test
    public void testGetPotentialJavaLangSeenDependencies() {
        assertEquals(1, JAVA_PROGRAMMING_LANGUAGE_CONTEXT4.getPotentialJavaLangSeenDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#hasToDisplay(net.sourceforge.plantuml.dependency.main.option.display.argument.Display)}
     * .
     */
    @Test
    public void testHasToDisplayWithExistingDisplay() {
        assertTrue(JAVA_PROGRAMMING_LANGUAGE_CONTEXT2.hasToDisplay(ABSTRACT_CLASSES));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang()}
     * .
     */
    @Test
    public void testRemoveAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang() {
        final GenericDependency dependency = new GenericDependencyImpl(
                "TestReadDependencyFromFileInterfaceWithoutPackage",
                "net.sourceforge.plantuml.dependency.main.option.programminglanguage");
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = new JavaProgrammingLanguageContext(
                new TreeSet < GenericDependency >(asList(new GenericDependency[] {dependency,
                        new GenericDependencyImpl("GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
                new TreeSet < GenericDependency >(asList(new GenericDependency[] {new GenericDependencyImpl(
                        "GenericDependency", "net.sourceforge.plantuml.dependency.generic")})),
                new TreeSet < GenericDependency >(asList(new GenericDependency[] {dependency})), DISPLAY_OPTIONS);
        javaProgrammingLanguageContext.removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang();
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(1, javaProgrammingLanguageContext.getParsedDependencies().size());
        assertEquals(0, javaProgrammingLanguageContext.getPotentialJavaLangSeenDependencies().size());
        assertNotNull(javaProgrammingLanguageContext
                .getParsedOrSeenDependency("java.lang.TestReadDependencyFromFileInterfaceWithoutPackage"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#removePotentialJavaLangSeenDependency(String)}
     * .
     */
    @Test
    public void testRemovePotentialJavaLangSeenDependencyWithExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT4
                .deepClone();
        javaProgrammingLanguageContext
                .removePotentialJavaLangSeenDependency("net.sourceforge.plantuml.dependency.main.option.programminglanguage.TestReadDependencyFromFileInterfaceWithoutPackage");
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(0, javaProgrammingLanguageContext.getPotentialJavaLangSeenDependencies().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext#removePotentialJavaLangSeenDependency(String)}
     * .
     */
    @Test
    public void testRemovePotentialJavaLangSeenDependencyWithNotExistingDependency() {
        final JavaProgrammingLanguageContext javaProgrammingLanguageContext = (JavaProgrammingLanguageContext) JAVA_PROGRAMMING_LANGUAGE_CONTEXT4
                .deepClone();
        javaProgrammingLanguageContext
                .removePotentialJavaLangSeenDependency("net.sourceforge.mazix.components.clone.DeepCloneable");
        assertEquals(2, javaProgrammingLanguageContext.getParsedAndSeenDependencies().size());
        assertEquals(1, javaProgrammingLanguageContext.getPotentialJavaLangSeenDependencies().size());
    }

    // TODO better test the getPlantUMLDiagram method with display option and with specific context
}
