/*
 DeepCloneableObjectTest.java
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

package net.sourceforge.plantumldependency.common.clone;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import net.sourceforge.plantumldependency.common.ObjectTestWithString;

import org.junit.Ignore;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Generic JUnit test classes for {@link Object} which are {@link DeepCloneable}, i.e. to test the
 * <code>deepClone()</code> method.<br>
 * This class may be used to test a class which only implements {@link DeepCloneable}.
 *
 * @param <T>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
@Ignore
@RunWith(Theories.class)
public abstract class DeepCloneableObjectTest < T > extends ObjectTestWithString < T > {

    /**
     * For any non-null reference values x and y, the class of <code>x.deepClone()</code> should be
     * equal to the class of x.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void deepCloneClassAreEquals(final T x) {
        assumeThat(x, instanceOf(DeepCloneable.class));
        final DeepCloneable < T > deepCloneableObject = (DeepCloneable < T >) x;
        assertTrue(deepCloneableObject.getClass().equals((deepCloneableObject.deepClone()).getClass()));
    }

    /**
     * For any non-null reference values x, <code>x.deepClone()</code> should not have the same
     * reference as x.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void deepCloneReferencesAreDifferent(final T x) {
        assumeThat(x, instanceOf(DeepCloneable.class));
        final DeepCloneable < T > deepCloneableObject = (DeepCloneable < T >) x;
        assertFalse(deepCloneableObject == deepCloneableObject.deepClone());
    }

    /**
     * For any non-null reference values x and y, <code>x.deepClone()</code> should be equal to x.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void deepClonesAreEquals(final T x) {
        assumeThat(x, instanceOf(DeepCloneable.class));
        final DeepCloneable < T > deepCloneableObject = (DeepCloneable < T >) x;
        assertTrue(deepCloneableObject.equals(deepCloneableObject.deepClone()));
    }
}
