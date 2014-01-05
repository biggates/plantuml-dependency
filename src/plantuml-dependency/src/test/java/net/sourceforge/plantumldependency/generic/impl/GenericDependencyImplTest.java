/*
 GenericDependencyImplTest.java
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

package net.sourceforge.plantumldependency.generic.impl;

import static net.sourceforge.plantumldependency.generic.type.impl.stubimpl.StubDependencyTypeImplTest.STUB_DEPENDENCY_TYPE4;
import static net.sourceforge.plantumldependency.generic.type.impl.stubimpl.StubDependencyTypeImplTest.STUB_DEPENDENCY_TYPE5;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import net.sourceforge.mazix.components.DeepCloneableObjectTest;
import net.sourceforge.plantumldependency.generic.GenericDependency;
import net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link GenericDependencyImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.2.0
 */
public class GenericDependencyImplTest extends DeepCloneableObjectTest < GenericDependencyImpl > {

    /** Generic dependency test 1 instance. */
    @DataPoint
    public static final GenericDependencyImpl GENERIC_DEPENDENCY1 = new GenericDependencyImpl("Number", "java.lang");

    /** Generic dependency test 2 instance. */
    @DataPoint
    public static final GenericDependencyImpl GENERIC_DEPENDENCY2 = new GenericDependencyImpl("Integer", "java.lang");

    /** Generic dependency test 3 instance. */
    @DataPoint
    public static final GenericDependencyImpl GENERIC_DEPENDENCY3 = new GenericDependencyImpl("Number",
            "java.lang.number");

    /** Generic dependency test 4 instance. */
    @DataPoint
    public static final GenericDependencyImpl GENERIC_DEPENDENCY4 = new GenericDependencyImpl("Number", "java.lang");

    /** Generic dependency test 5 instance. */
    @DataPoint
    public static final GenericDependencyImpl GENERIC_DEPENDENCY5 = null;

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl#getDependencyType()}
     * .
     */
    @Test
    public void testGetDependencyType() {
        assertEquals(STUB_DEPENDENCY_TYPE5, GENERIC_DEPENDENCY1.getDependencyType());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl#getFullName()}.
     */
    @Test
    public void testGetFullName() {
        assertEquals(STUB_DEPENDENCY_TYPE5.getFullName(), GENERIC_DEPENDENCY1.getFullName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals(STUB_DEPENDENCY_TYPE5.getName(), GENERIC_DEPENDENCY1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl#getPackageName()}
     * .
     */
    @Test
    public void testGetPackageName() {
        assertEquals(STUB_DEPENDENCY_TYPE5.getPackageName(), GENERIC_DEPENDENCY1.getPackageName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.generic.impl.GenericDependencyImpl#setDependencyType(net.sourceforge.plantumldependency.generic.type.DependencyType)}
     * .
     */
    @Test
    public void testSetDependencyType() {
        final GenericDependency dependencyClone = GENERIC_DEPENDENCY1.deepClone();
        dependencyClone.setDependencyType(STUB_DEPENDENCY_TYPE4);
        assertTrue(STUB_DEPENDENCY_TYPE4 == dependencyClone.getDependencyType());
    }
}
