/*
 InterfaceJavaTypeTest.java
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
import static net.sourceforge.plantumldependency.cli.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImplTest.INTERFACE_DEPENDENCY_TYPE1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaType.INTERFACE;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.common.comparable.ComparableObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link InterfaceJavaType}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class InterfaceJavaTypeTest extends ComparableObjectTest < InterfaceJavaType > {

    /** Java type test 1 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE1 = INTERFACE;

    /** Java type test 2 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE2 = INTERFACE;

    /** Java type test 3 instance. */
    @DataPoint
    public static final JavaType JAVA_TYPE3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createAnnotationDependencyType(String, String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateAnnotationDependencyType() throws PlantUMLDependencyException {
        assertEquals(ANNOTATION_DEPENDENCY_TYPE2, JAVA_TYPE1.createAnnotationDependencyType(
                INTERFACE_DEPENDENCY_TYPE1.getName(), INTERFACE_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeAbstract() {
        assertEquals(INTERFACE_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(INTERFACE_DEPENDENCY_TYPE1.getName(),
                INTERFACE_DEPENDENCY_TYPE1.getPackageName(), true,
                INTERFACE_DEPENDENCY_TYPE1.getImportDependenciesCollection(), new TreeSet < GenericDependency >(),
                INTERFACE_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                INTERFACE_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeAbstractWithNativeMethods() {
        assertEquals(INTERFACE_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(INTERFACE_DEPENDENCY_TYPE1.getName(),
                INTERFACE_DEPENDENCY_TYPE1.getPackageName(), true,
                INTERFACE_DEPENDENCY_TYPE1.getImportDependenciesCollection(), new TreeSet < GenericDependency >(),
                INTERFACE_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                INTERFACE_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createDependencyType(String, String, boolean, net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection, Set, Set, boolean)}
     * .
     */
    @Test
    public void testCreateDependencyTypeNotAbstract() {
        assertEquals(INTERFACE_DEPENDENCY_TYPE1, JAVA_TYPE1.createDependencyType(INTERFACE_DEPENDENCY_TYPE1.getName(),
                INTERFACE_DEPENDENCY_TYPE1.getPackageName(), false,
                INTERFACE_DEPENDENCY_TYPE1.getImportDependenciesCollection(), new TreeSet < GenericDependency >(),
                INTERFACE_DEPENDENCY_TYPE1.getParentImplementationsDependencies(),
                INTERFACE_DEPENDENCY_TYPE1.getAnnotationsDependencies()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test
    public void testCreateParentDependencyTypeExtention() throws PlantUMLDependencyException {
        assertEquals(INTERFACE_DEPENDENCY_TYPE1, JAVA_TYPE1.createParentDependencyType(EXTENSION,
                INTERFACE_DEPENDENCY_TYPE1.getName(), INTERFACE_DEPENDENCY_TYPE1.getPackageName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#createParentDependencyType(net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType, java.lang.String, java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testCreateParentDependencyTypeImplementation() throws PlantUMLDependencyException {
        JAVA_TYPE1.createParentDependencyType(IMPLEMENTATION, INTERFACE_DEPENDENCY_TYPE1.getName(),
                INTERFACE_DEPENDENCY_TYPE1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentExtensions(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentExtensions(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithMultipleParentsWithImbricatedGenerics()
            throws PlantUMLDependencyException {
        JAVA_TYPE1
                .extractParentImplementations("Cloneable < Toto, Titi < Test > > , Serializable < Integer > , DeepCloneable");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithMultipleParentsWithNotImbricatedGenerics()
            throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable < Toto, Titi > , Serializable < Integer > , DeepCloneable");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
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
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithSingleParentWithImbricatedGenerics()
            throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable < Toto < Test > >");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithSingleParentWithNotImbricatedGenerics()
            throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable < Toto >");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.InterfaceJavaType#extractParentImplementations(java.lang.String)}
     * .
     *
     * @throws PlantUMLDependencyException
     */
    @Test(expected = PlantUMLDependencyException.class)
    public void testExtractParentImplementationsWithSingleParentWithoutGenerics() throws PlantUMLDependencyException {
        JAVA_TYPE1.extractParentImplementations("Cloneable");
    }
}
