/*
 ProgramVersionImplTest.java
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

package net.sourceforge.plantumldependency.commoncli.program.version.impl;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.NOW;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link ProgramVersionImplTest}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ProgramVersionImplTest extends ComparableAndDeepCloneableObjectTest < ProgramVersionImpl > {

    /** Program version test 1 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT1 = new ProgramVersionImpl(1, 0, 0, NOW);

    /** Program version test 2 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT2 = new ProgramVersionImpl(0, 8, 0, NOW);

    /** Program version test 3 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT3 = new ProgramVersionImpl(1, 0, 1, NOW);

    /** Program version test 4 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT4 = new ProgramVersionImpl(258, 1, 250, NOW);

    /** Program version test 5 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT5 = new ProgramVersionImpl(1, 0, 0, new Date());

    /** Program version test 6 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT6 = new ProgramVersionImpl(1, 0, 0, NOW, true);

    /** Program version test 7 instance. */
    @DataPoint
    public static final ProgramVersion PROGRAM_VERSION_ARGUMENT7 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl#getFullVersionNumber()}
     * .
     */
    @Test
    public void testGetFullVersionNumber() {
        final String fullVersionNumber = PROGRAM_VERSION_ARGUMENT1.getFullVersionNumber();
        assertEquals("1.0.0", fullVersionNumber);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl#getFullVersionNumber()}
     * .
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMajorVersionNumber() {
        new ProgramVersionImpl(-1, 0, 0);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl#getFullVersionNumber()}
     * .
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMinorVersionNumber() {
        new ProgramVersionImpl(1, -10, 0);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl#getFullVersionNumber()}
     * .
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRevisionVersionNumber() {
        new ProgramVersionImpl(1, 10, -2);
    }
}
