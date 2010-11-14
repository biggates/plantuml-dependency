/*
 CppProgrammingLanguageTest.java
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument;

import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.CPP;
import static org.junit.Assert.assertTrue;
import net.sourceforge.mazix.components.ObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link CppProgrammingLanguage}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class CppProgrammingLanguageTest extends ObjectTest < CppProgrammingLanguage > {

    /** C++ programming language test 1 instance. */
    @DataPoint
    public static final ProgrammingLanguage CPP_PROGRAMMING_LANGUAGE1 = CPP;

    /** C++ programming language test 2 instance. */
    @DataPoint
    public static final ProgrammingLanguage CPP_PROGRAMMING_LANGUAGE2 = CPP;

    /** C++ programming language test 3 instance. */
    @DataPoint
    public static final ProgrammingLanguage CPP_PROGRAMMING_LANGUAGE3 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.CppProgrammingLanguage#readDependencyFromFile(String, net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext)}
     * .
     */
    @Test
    public void testReadDependencyFromFile() {
        // TODO not implemented yet
        assertTrue(true);
    }
}
