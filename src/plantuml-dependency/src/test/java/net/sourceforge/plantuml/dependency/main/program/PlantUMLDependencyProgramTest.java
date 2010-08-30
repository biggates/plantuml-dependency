/*
 PlantUMLDependencyProgramTest.java
 Creation date : 10/07/2010
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

package net.sourceforge.plantuml.dependency.main.program;

import static net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram.main;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;

import java.net.MalformedURLException;

import net.sourceforge.mazix.cli.exception.CommandLineException;

import org.junit.Test;

/**
 * JUnit test classes for {@link PlantUMLDependencyProgram}.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyProgramTest {

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     * 
     * @throws CommandLineException
     * @throws MalformedURLException
     */
    @Test
    public void testMainWithPrimaryHelpOption() throws MalformedURLException, CommandLineException {
        main(new String[] {"-h"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     * 
     * @throws CommandLineException
     * @throws MalformedURLException
     */
    @Test
    public void testMainWithSecondaryOption() throws MalformedURLException, CommandLineException {
        main(new String[] {"-h"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     * 
     * @throws CommandLineException
     * @throws MalformedURLException
     */
    @Test
    public void testMainWithPrimaryVersionOption() throws MalformedURLException, CommandLineException {
        main(new String[] {"-version"});
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram#main(java.lang.String[])}
     * .
     * 
     * @throws CommandLineException
     * @throws MalformedURLException
     */
    @Test(expected = CommandLineException.class)
    public void testMainWithoutExecutionOption() throws MalformedURLException, CommandLineException {
        main(new String[] {"-l", DEFAULT_PROGRAMMING_LANGUAGE.getName(), "-i", "**/*.java"});
    }
    
    // TODO finish with all options and compare generated files
}
