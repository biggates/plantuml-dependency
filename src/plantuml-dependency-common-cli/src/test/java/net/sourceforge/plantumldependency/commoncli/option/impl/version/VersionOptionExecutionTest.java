/*
 VersionOptionExecutionTest.java
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

package net.sourceforge.plantumldependency.commoncli.option.impl.version;

import static net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImplTest.JAVA_PROGRAM1;
import static net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImplTest.JAVA_PROGRAM8;
import static org.junit.Assert.assertTrue;
import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link VersionOptionExecution}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class VersionOptionExecutionTest extends ComparableAndDeepCloneableObjectTest < VersionOptionExecution > {

    /** Version option execution test 1 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION1 = new VersionOptionExecution(JAVA_PROGRAM1,
            true, 1);

    /** Version option execution test 2 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION2 = new VersionOptionExecution(JAVA_PROGRAM8,
            true, 1);

    /** Version option execution test 3 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION3 = new VersionOptionExecution(JAVA_PROGRAM1,
            false, 1);

    /** Version option execution test 4 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION4 = new VersionOptionExecution(JAVA_PROGRAM1,
            true, 2);

    /** Version option execution test 5 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION5 = new VersionOptionExecution(JAVA_PROGRAM1,
            true, 1);

    /** Version option execution test 6 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION6 = new VersionOptionExecution(JAVA_PROGRAM1, 1);

    /** Version option execution test 6 instance. */
    @DataPoint
    public static final VersionOptionExecution VERSION_OPTION_EXECUTION7 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.version.VersionOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute() throws CommandLineException {
        VERSION_OPTION_EXECUTION1.execute();
        assertTrue(true);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.option.impl.version.VersionOptionExecution#execute()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testExecute2() throws CommandLineException {
        VERSION_OPTION_EXECUTION3.execute();
        assertTrue(true);
    }
}
