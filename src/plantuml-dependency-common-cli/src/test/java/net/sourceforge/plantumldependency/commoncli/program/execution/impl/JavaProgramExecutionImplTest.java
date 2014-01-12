/*
 JavaProgramExecutionImplTest.java
 Creation date : 2/07/2010
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

package net.sourceforge.plantumldependency.commoncli.program.execution.impl;

import static java.util.Arrays.asList;
import static net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImplTest.JAVA_PROGRAM1;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;
import net.sourceforge.plantumldependency.commoncli.option.impl.about.AboutOptionExecution;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaProgramExecutionImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class JavaProgramExecutionImplTest extends ComparableAndDeepCloneableObjectTest < JavaProgramExecutionImpl > {

    /** Java program execution test 1 instance. */
    @DataPoint
    public static final JavaProgramExecution PROGRAM_EXECUTION1 = new JavaProgramExecutionImpl(
            new TreeSet < OptionExecution >());

    /** Java program execution test 2 instance. */
    @DataPoint
    public static final JavaProgramExecution PROGRAM_EXECUTION2 = new JavaProgramExecutionImpl(
            new TreeSet < OptionExecution >(asList(new OptionExecution[] {new AboutOptionExecution(JAVA_PROGRAM1, 1)})));

    /** Java program execution test 3 instance. */
    @DataPoint
    public static final JavaProgramExecution PROGRAM_EXECUTION3 = new JavaProgramExecutionImpl(
            new TreeSet < OptionExecution >());

    /** Java program execution test 4 instance. */
    @DataPoint
    public static final JavaProgramExecution PROGRAM_EXECUTION4 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.execution.impl.JavaProgramExecutionImpl#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute() throws CommandLineException {
        PROGRAM_EXECUTION2.execute();
        assertTrue(true);
    }
}
