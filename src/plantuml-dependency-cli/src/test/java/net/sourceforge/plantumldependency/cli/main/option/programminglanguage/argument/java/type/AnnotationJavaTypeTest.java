/*
 AnnotationJavaTypeTest.java
 Creation date : 18/07/2013
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

import static net.sourceforge.plantumldependency.cli.generic.type.impl.annotationimpl.AnnotationDependencyTypeImplTest.ANNOTATION_DEPENDENCY_TYPE1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaType.ANNOTATION;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.common.comparable.ComparableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link AnnotationJavaType}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.2.0
 * @version 1.3.0
 */
public class AnnotationJavaTypeTest extends ComparableObjectTest < AnnotationJavaType > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE1 = ANNOTATION;

    /** Java type test 2 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE2 = ANNOTATION;

    /** Java type test 3 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#createAnnotationDependencyType(java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateAnnotationDependencyType() throws PlantUMLDependencyException {
        assertEquals(ANNOTATION_DEPENDENCY_TYPE1, JAVA_TYPE1.createAnnotationDependencyType(
                ANNOTATION_DEPENDENCY_TYPE1.getName(), ANNOTATION_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#createDependencyType(java.lang.String, java.lang.String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, java.util.Set, java.util.Set, java.util.Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeAnnotationAbstract() {
        assertEquals(ANNOTATION_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(
                ANNOTATION_DEPENDENCY_TYPE1.getName(), ANNOTATION_DEPENDENCY_TYPE1.getPackageName(), true,
                ANNOTATION_DEPENDENCY_TYPE1.getImportDependenciesCollection(), new TreeSet < GenericDependency >(),
                ANNOTATION_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                ANNOTATION_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeAnnotationNotAbstract() {
        assertEquals(ANNOTATION_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(
                ANNOTATION_DEPENDENCY_TYPE1.getName(), ANNOTATION_DEPENDENCY_TYPE1.getPackageName(), false,
                ANNOTATION_DEPENDENCY_TYPE1.getImportDependenciesCollection(), new TreeSet < GenericDependency >(),
                ANNOTATION_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                ANNOTATION_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testCreateParentDependencyTypeExtension() throws PlantUMLDependencyException {
        JAVA_TYPE1.createParentDependencyType(EXTENSION, ANNOTATION_DEPENDENCY_TYPE1.getName(),
                ANNOTATION_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testCreateParentDependencyTypeImplementation() throws PlantUMLDependencyException {
        JAVA_TYPE1.createParentDependencyType(IMPLEMENTATION, ANNOTATION_DEPENDENCY_TYPE1.getName(),
                ANNOTATION_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#extractParentExtensions(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#extractParentExtensions(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentExtentionsWithSingleParentWithoutGenerics() throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentExtensions("Rectangle");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#extractParentImplementations(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithMultipleParentsWithoutGenerics() throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable , Serializable");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.AnnotationJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithSingleParentWithoutGenerics() throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable");
    }
}
