/*
 PlantUMLDependencyOutputOptionExecution1Test.java
 Creation date : 07/09/2013
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

package net.sourceforge.plantumldependency.cli.main.option.output;

import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET10;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET11;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET2;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET3;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET4;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET5;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET6;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET7;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET8;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyDisplaySetTestConstants.DISPLAY_TYPE_SET9;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyTestConstants.FILE_SET1;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static org.junit.Assert.assertEquals;

import java.io.File;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution;

import org.junit.After;
import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyOutputOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.2.0
 * @version 1.3.0
 */
public class PlantUMLDependencyOutputOptionExecution1Test {

    /** Test file 1 instance. */
    private static final File TEST_FILE1 = new File("plantuml.txt");

    /**
     * This method is called after all tests, it is used to remove the temporary file used for the
     * tests.
     *
     * @since 1.2.0
     */
    @After
    public void removeFile() {
        TEST_FILE1.delete();
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute10() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET10, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\nclass javax.native.NativeCall << (N,#ffff00) >>\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute11() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET11, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute2() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET2, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nannotation java.lang.Deprecated\r\nannotation java.lang.Override\r\nannotation java.lang.SuppressWarnings\r\nannotation javax.annotation.Generated\r\nannotation javax.xml.bind.annotation.XmlType\r\nannotation javax.xml.ws.soap.Addressing\r\nannotation net.sourceforge.plantumldependency.main.option.output.Annotationinterface\r\nannotation net.sourceforge.plantumldependency.main.option.output.AnotherAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.MappedSuperclass\r\nannotation net.sourceforge.plantumldependency.main.option.output.MyAnnotation\r\nannotation net.sourceforge.plantumldependency.main.option.output.Testabstract\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute3() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET3, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass1\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass2\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass5\r\nabstract class net.sourceforge.plantumldependency.main.option.output.AbstractClass6\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass3\r\nabstract class net.sourceforge.plantumldependency.main.option.output.test.AbstractClass4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute4() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET4, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nclass java.lang.annotation.ElementType\r\nclass java.util.Arrays\r\nclass java.util.Iterator\r\nclass java.util.Set\r\nclass java.util.TreeSet\r\nclass java.util.logging.Level\r\nclass java.util.logging.Logger\r\nclass net.sourceforge.mazix.components.constants.CharacterConstants\r\nclass net.sourceforge.plantumldependency.generic.GenericDependency\r\nclass net.sourceforge.plantumldependency.generic.type.DependencyType\r\nclass net.sourceforge.plantumldependency.main.option.output.Class1\r\nclass net.sourceforge.plantumldependency.main.option.output.Class2\r\nclass net.sourceforge.plantumldependency.main.option.output.Class5\r\nclass net.sourceforge.plantumldependency.main.option.output.Class6\r\nclass net.sourceforge.plantumldependency.main.option.output.Class7\r\nclass net.sourceforge.plantumldependency.main.option.output.Class8\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class3\r\nclass net.sourceforge.plantumldependency.main.option.output.test.Class4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute5() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET5, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum1\r\nenum net.sourceforge.plantumldependency.main.option.output.Enum6\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute6() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET6, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute7() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET7, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute8() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET8, 1);
        outputOptionExecution.execute();
        assertEquals("@startuml\r\n@enduml", readFileIntoString(TEST_FILE1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute9() throws CommandLineException {
        final PlantUMLDependencyOutputOptionExecution outputOptionExecution = new PlantUMLDependencyOutputOptionExecution(
                TEST_FILE1, JAVA, FILE_SET1, DISPLAY_TYPE_SET9, 1);
        outputOptionExecution.execute();
        assertEquals(
                "@startuml\r\ninterface java.lang.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface1\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface2\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface5\r\ninterface net.sourceforge.plantumldependency.main.option.output.Interface6\r\ninterface net.sourceforge.plantumldependency.main.option.output.Readable\r\ninterface net.sourceforge.plantumldependency.main.option.output.TeaaTest\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface3\r\ninterface net.sourceforge.plantumldependency.main.option.output.test.Interface4\r\n@enduml",
                readFileIntoString(TEST_FILE1));
    }
}
