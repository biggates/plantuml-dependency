/*
 ObjectTest.java
 Creation date : 08/10/2010
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

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import org.junit.Ignore;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Generic JUnit test classes for {@link Object}, allowing to test <code>equals()</code>,
 * <code>hashcode()</code> and <code>clone()</code> methods.
 *
 * Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @param <T>
 * @since 1.3.0
 * @version 1.3.0
 */
@Ignore
@RunWith(Theories.class)
public abstract class ObjectTest < T > {

    /**
     * Protected constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    protected ObjectTest() {
        super();
    }

    /**
     * For any non-null reference values x and y, multiple invocations of <code>x.equals(y)</code>
     * consistently return <code>true</code> or consistently return <code>false</code>, provided no
     * information used in equals comparisons on the objects is modified.
     *
     * @param x
     *            the first object to test.
     * @param y
     *            the second object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsIsConsistent(final T x, final T y) {
        assumeThat(x, is(not(equalTo(null))));
        final boolean alwaysTheSame = x.equals(y);

        for (int i = 0; i < 30; i++) {
            assertThat(x.equals(y), is(alwaysTheSame));
        }
    }

    /**
     * For any non-null reference value x, <code>x.equals(x)</code> should return <code>true</code>.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsIsReflexive(final T x) {
        assumeThat(x, is(not(equalTo(null))));
        assertThat(x.equals(x), is(TRUE));
    }

    /**
     * For any non-null reference values x and y, <code>x.equals(y)</code> should return
     * <code>true</code> if and only if <code>y.equals(x)</code> returns <code>true</code>.
     *
     * @param x
     *            the first object to test.
     * @param y
     *            the second object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsIsSymmetric(final T x, final T y) {
        assumeThat(x, is(not(equalTo(null))));
        assumeThat(y, is(not(equalTo(null))));
        assumeThat(y.equals(x), is(TRUE));
        assertThat(x.equals(y), is(TRUE));
    }

    /**
     * For any non-null reference values x, y, and z, if <code>x.equals(y)</code> returns
     * <code>true</code> and <code>y.equals(z)</code> returns <code>true</code>, then
     * <code>x.equals(z)</code> should return <code>true</code>.
     *
     * @param x
     *            the first object to test.
     * @param y
     *            the second object to test.
     * @param z
     *            the third object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsIsTransitive(final T x, final T y, final T z) {
        assumeThat(x, is(not(equalTo(null))));
        assumeThat(y, is(not(equalTo(null))));
        assumeThat(z, is(not(equalTo(null))));
        assumeThat(x.equals(y) && y.equals(z), is(TRUE));
        assertThat(z.equals(x), is(TRUE));
    }

    /**
     * For any non-null reference value x, <code>x.equals(null)</code> should return
     * <code>false</code>.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsReturnFalseOnNull(final T x) {
        assumeThat(x, is(not(equalTo(null))));
        assertThat(x.equals(null), is(FALSE));
    }

    /**
     * Test that <code>x.equals(y)</code> where x and y are the same datapoint instance works. User
     * must provide datapoints that are not equal.
     *
     * @param x
     *            the first object to test.
     * @param y
     *            the second object to test.
     * @since 1.3.0
     */
    @Theory
    public void equalsWorks(final T x, final T y) {
        assumeThat(x, is(not(equalTo(null))));
        assumeThat(x == y, is(TRUE));
        assertThat(x.equals(y), is(TRUE));
    }

    /**
     * If two objects are equal according to the <code>equals(Object)</code> method, then calling
     * the <code>hashCode()</code> method on each of the two objects must produce the same integer
     * result.
     *
     * @param x
     *            the first object to test.
     * @param y
     *            the second object to test.
     * @since 1.3.0
     */
    @Theory
    public void hashCodeIsConsistentWithEquals(final T x, final T y) {
        assumeThat(x, is(not(equalTo(null))));
        assumeThat(x.equals(y), is(TRUE));
        assertThat(x.hashCode(), is(equalTo(y.hashCode())));
    }

    /**
     * Whenever it is invoked on the same object more than once the <code>hashCode()</code> method
     * must consistently return the same integer.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @Theory
    public void hashCodeIsSelfConsistent(final T x) {
        assumeThat(x, is(not(equalTo(null))));
        final int alwaysTheSame = x.hashCode();

        for (int i = 0; i < 30; i++) {
            assertThat(x.hashCode(), is(alwaysTheSame));
        }
    }
}
