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
public abstract class ObjectTestWithString < T > extends ObjectTest < T > {

    /**
     * Test that <code>x.toString()</code> contains the x class simple name.
     *
     * @param x
     *            the object to test.
     * @since 1.3.0
     */
    @Theory
    public void toStringContainsClassName(final T x) {
        assumeThat(x, is(not(equalTo(null))));
        assertThat(x.toString().contains(x.getClass().getSimpleName()), is(TRUE));
    }
}
