/*
 ComparableAndDeepCloneableObjectTest.java
 Creation date : 12/12/2011
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

package net.sourceforge.plantumldependency.common;

import static java.lang.Boolean.TRUE;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.valueOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult;

import org.junit.Ignore;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Generic JUnit test classes for testing classes which implements {@link Comparable} and
 * {@link DeepCloneable}, allowing to test <code>compareTo()</code> and <code>deepClone()</code>
 * methods.<br>
 * This class may be used to test a class which implements both {@link Comparable} and
 * {@link DeepCloneable} interfaces.
 *
 * @param <T>
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
@Ignore
@RunWith(Theories.class)
public abstract class ComparableAndDeepCloneableObjectTest < T > extends ObjectTestWithString < T > {

    /**
     * Protected constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    protected ComparableAndDeepCloneableObjectTest() {
        super();
    }

    /**
     * For any non-null reference values x and y, multiple invocations of
     * <code>x.compareTo(y)</code> consistently return <code>true</code> or consistently return
     * <code>false</code>, provided no information used in equals comparisons on the objects is
     * modified.
     *
     * @param x
     *            the first object to compare.
     * @param y
     *            the second object to compare.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void compareToIsConsistent(final T x, final T y) {
        assumeThat(x, instanceOf(Comparable.class));
        assumeThat(y, instanceOf(Comparable.class));

        final Comparable < T > comparableObject = (Comparable < T >) x;
        final int alwaysTheSame = comparableObject.compareTo(y);

        for (int i = 0; i < 30; i++) {
            assertThat(comparableObject.compareTo(y), is(alwaysTheSame));
        }
    }

    /**
     * If two objects are equal according to the <code>equals(Object)</code> method, then calling
     * the <code>compareTo()</code> method on each of the two objects must produce the same integer
     * result.
     *
     * @param x
     *            the first object to compare.
     * @param y
     *            the second object to compare.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void compareToIsConsistentWithEquals(final T x, final T y) {
        assumeThat(x, instanceOf(Comparable.class));
        assumeThat(x.equals(y), is(TRUE));

        final Comparable < T > firstComparableObject = (Comparable < T >) x;
        final ComparableResult firstResult = valueOf(firstComparableObject.compareTo(y));

        assertThat(firstResult == EQUAL, is(TRUE));
    }

    /**
     * For any non-null reference values x and y, <code>x.compareTo(y)</code> should return
     * <code>true</code> if and only if <code>y.compareTo(x)</code> returns <code>true</code>.
     *
     * @param x
     *            the first object to compare.
     * @param y
     *            the second object to compare.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void compareToIsSymmetric(final T x, final T y) {
        assumeThat(x, instanceOf(Comparable.class));
        assumeThat(y, instanceOf(Comparable.class));

        final Comparable < T > firstComparableObject = (Comparable < T >) x;
        final Comparable < T > secondComparableObject = (Comparable < T >) y;
        final ComparableResult firstResult = valueOf(firstComparableObject.compareTo(y));
        final ComparableResult secondResult = valueOf(secondComparableObject.compareTo(x));

        assertThat(firstResult.getResult(), is(secondResult.getReverseResult()));
    }

    /**
     * For any non-null reference values x, y, and z, if <code>x.compareTo(y)</code> returns
     * <code>true</code> and <code>x.compareTo(z)</code> returns <code>true</code>, then
     * <code>x.compareTo(z)</code> should return <code>true</code>.
     *
     * @param x
     *            the first object to compare.
     * @param y
     *            the second object to compare.
     * @param z
     *            the third object to compare.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void compareToIsTransitive(final T x, final T y, final T z) {
        assumeThat(x, instanceOf(Comparable.class));
        assumeThat(y, instanceOf(Comparable.class));
        assumeThat(z, instanceOf(Comparable.class));

        final Comparable < T > firstComparableObject = (Comparable < T >) x;
        final Comparable < T > secondComparableObject = (Comparable < T >) y;
        final ComparableResult firstResult = valueOf(firstComparableObject.compareTo(y));
        final ComparableResult secondResult = valueOf(secondComparableObject.compareTo(z));
        final ComparableResult thirdResult = valueOf(firstComparableObject.compareTo(z));

        assumeThat(firstResult == secondResult, is(TRUE));
        assertThat(thirdResult == secondResult, is(TRUE));
    }

    /**
     * Test that <code>x.compareTo(y)</code> where x and y are the same datapoint instance works.
     * User must provide datapoints that are not equal.
     *
     * @param x
     *            the first object to compare.
     * @param y
     *            the second object to compare.
     * @since 1.3.0
     */
    @SuppressWarnings("unchecked")
    @Theory
    public void compareToWorks(final T x, final T y) {
        assumeThat(x, instanceOf(Comparable.class));
        assumeThat(x == y, is(TRUE));

        final Comparable < T > firstComparableObject = (Comparable < T >) x;
        final ComparableResult firstResult = valueOf(firstComparableObject.compareTo(y));

        assertThat(firstResult == EQUAL, is(TRUE));
    }

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
