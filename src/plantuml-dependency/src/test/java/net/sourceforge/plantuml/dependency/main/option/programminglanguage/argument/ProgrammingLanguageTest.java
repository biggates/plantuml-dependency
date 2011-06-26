/*
 ProgrammingLanguageTest.java
 Creation date : 13/07/2010
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
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.JAVA;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.getProgrammingLanguageCollection;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.getProgrammingLanguageNamesSet;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage.valueOfIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Set;

import net.sourceforge.mazix.components.ObjectTest;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ProgrammingLanguage}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class ProgrammingLanguageTest extends ObjectTest < ProgrammingLanguage > {

    /** Programming language test 1 instance. */
    @DataPoint
    public static final ProgrammingLanguage PROGRAMMING_LANGUAGE1 = JAVA;

    /** Programming language test 2 instance. */
    @DataPoint
    public static final ProgrammingLanguage PROGRAMMING_LANGUAGE2 = CPP;

    /** Programming language test 3 instance. */
    @DataPoint
    public static final ProgrammingLanguage PROGRAMMING_LANGUAGE3 = JAVA;

    /** Programming language test 4 instance. */
    @DataPoint
    public static final ProgrammingLanguage PROGRAMMING_LANGUAGE4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#getProgrammingLanguageCollection()}
     * .
     */
    @Test
    public void testGetProgrammingLanguageCollection() {
        final Collection < ProgrammingLanguage > programmingLanguages = getProgrammingLanguageCollection();
        assertEquals(2, programmingLanguages.size());
        assertTrue(programmingLanguages.contains(CPP));
        assertTrue(programmingLanguages.contains(JAVA));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#getProgrammingLanguageNamesSet()}
     * .
     */
    @Test
    public void testGetProgrammingLanguageNamesSet() {
        final Set < String > programmingLanguageNames = getProgrammingLanguageNamesSet();
        assertEquals(2, programmingLanguageNames.size());
        assertTrue(programmingLanguageNames.contains(CPP.getName()));
        assertTrue(programmingLanguageNames.contains(JAVA.getName()));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test
    public void testValueOfIgnoringCaseExistingProgrammingLanguageLowerCase() {
        final ProgrammingLanguage programmingLanguage = valueOfIgnoringCase(CPP.getName().toLowerCase());
        assertEquals(CPP, programmingLanguage);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test
    public void testValueOfIgnoringCaseExistingProgrammingLanguageUpperCase() {
        final ProgrammingLanguage programmingLanguage = valueOfIgnoringCase(JAVA.getName().toUpperCase());
        assertEquals(JAVA, programmingLanguage);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOfIgnoringCaseNotExistingProgrammingLanguage() {
        valueOfIgnoringCase("test");
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage#valueOfIgnoringCase(java.lang.String)}
     * .
     */
    @Test(expected = NullPointerException.class)
    public void testValueOfIgnoringCaseNull() {
        valueOfIgnoringCase(null);
    }
}
