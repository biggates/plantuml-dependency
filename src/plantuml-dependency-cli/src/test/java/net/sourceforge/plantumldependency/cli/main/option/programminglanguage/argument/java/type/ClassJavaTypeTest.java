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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type;

import static net.sourceforge.plantumldependency.cli.generic.type.impl.annotationimpl.AnnotationDependencyTypeImplTest.ANNOTATION_DEPENDENCY_TYPE2;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassAbstractDependencyTypeImplTest.CLASS_ABSTRACT_DEPENDENCY_TYPE1;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassDependencyTypeImplTest.CLASS_DEPENDENCY_TYPE1;
import static net.sourceforge.plantumldependency.cli.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImplTest.INTERFACE_DEPENDENCY_TYPE1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaType.CLASS;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.common.comparable.ComparableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ClassJavaType}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class ClassJavaTypeTest extends ComparableObjectTest < ClassJavaType > {

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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#createAnnotationDependencyType(String, String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateAnnotationDependencyType() throws PlantUMLDependencyException {
        assertEquals(ANNOTATION_DEPENDENCY_TYPE2, JAVA_TYPE1.createAnnotationDependencyType(
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getName(), CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)
     * )} .
     */
    @Test
    public void testCreateDependencyTypeAbstract() {
        assertEquals(CLASS_ABSTRACT_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getName(), CLASS_ABSTRACT_DEPENDENCY_TYPE1.getPackageName(), true,
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getImportDependenciesCollection(),
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentExtensionsDependencies(),
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                CLASS_ABSTRACT_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeNotAbstract() {
        assertEquals(
                CLASS_DEPENDENCY_TYPE1,
                JAVA_TYPE1.createDependencyType(CLASS_DEPENDENCY_TYPE1.getName(),
                        CLASS_DEPENDENCY_TYPE1.getPackageName(), false,
                        CLASS_DEPENDENCY_TYPE1.getImportDependenciesCollection(),
                        CLASS_DEPENDENCY_TYPE1.getParentExtensionsDependencies(),
                        CLASS_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                        CLASS_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateParentDependencyTypeExtention() throws PlantUMLDependencyException {
        assertEquals(CLASS_DEPENDENCY_TYPE1, JAVA_TYPE1.createParentDependencyType(EXTENSION,
                CLASS_DEPENDENCY_TYPE1.getName(), CLASS_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateParentDependencyTypeImplementation() throws PlantUMLDependencyException {
        assertEquals(INTERFACE_DEPENDENCY_TYPE1, JAVA_TYPE1.createParentDependencyType(IMPLEMENTATION,
                INTERFACE_DEPENDENCY_TYPE1.getName(), INTERFACE_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentExtensions(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testExtractParentExtentionsWithEmptyString() throws PlantUMLDependencyException {
        final Set < String > parents = JAVA_TYPE1.extractParentExtensions(BLANK_STRING);
        assertEquals(0, parents.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentExtensions(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testExtractParentExtentionsWithSingleParentWithoutGenerics() throws PlantUMLDependencyException {
        final Set < String > parents = JAVA_TYPE1.extractParentExtensions("Rectangle");
        assertEquals(1, parents.size());
        assertTrue(parents.contains("Rectangle"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testExtractParentImplementationsWithEmptyString() throws PlantUMLDependencyException {
        final Set < String > parents = JAVA_TYPE1.extractParentImplementations(BLANK_STRING);
        assertEquals(0, parents.size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testExtractParentImplementationsWithMultipleParentsWithoutGenerics() throws PlantUMLDependencyException {
        final Set < String > parents = JAVA_TYPE1.extractParentImplementations("Cloneable , Serializable");
        assertEquals(2, parents.size());
        assertTrue(parents.contains("Cloneable"));
        assertTrue(parents.contains("Serializable"));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.ClassJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testExtractParentImplementationsWithSingleParentWithoutGenerics() throws PlantUMLDependencyException {
        final Set < String > parents = JAVA_TYPE1.extractParentImplementations("Cloneable");
        assertEquals(1, parents.size());
        assertTrue(parents.contains("Cloneable"));
    }
}
