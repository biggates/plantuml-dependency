/*
 ComparableResult.java
 Creation date : 01/06/2010
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

package net.sourceforge.plantumldependency.common.utils.comparable;

/**
 * This enumeration type lists comparable results, i.e. results which are returned by the
 * {@link java.lang.Comparable#compareTo} method.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public enum ComparableResult {

    /** The "before" comparable result. */
    BEFORE(-1, 1),
    /** The "after" comparable result. */
    AFTER(1, -1),
    /** The "equal" comparable result. */
    EQUAL(0, 0);

    /**
     * Gets the {@link ComparableResult} instance following a comparable value.
     *
     * @param comparableResult
     *            the comparable value to build the {@link ComparableResult} instance from.
     * @return the {@link ComparableResult} instance associated to the passed comparable value.
     * @since 1.3.0
     */
    public static ComparableResult valueOf(final int comparableResult) {
        ComparableResult result = null;

        if (comparableResult == 0) {
            result = EQUAL;
        } else if (comparableResult < 0) {
            result = BEFORE;
        } else if (comparableResult > 0) {
            result = AFTER;
        }

        return result;
    }

    /**
     * The integer value which is returned by the {@link java.lang.Comparable#compareTo} method to
     * tell if the current instance is ordered before, after or is the same.
     */
    private int result;

    /**
     * The integer value which is the logical reverse of the returned value by the
     * {@link java.lang.Comparable#compareTo} method.
     */
    private int reverseResult;

    /**
     * Default constructor with the result value.
     *
     * @param comparableResult
     *            The integer value of the result to return.
     * @param reverseValue
     *            The integer value of the reverse result to return.
     * @since 1.3.0
     */
    private ComparableResult(final int comparableResult, final int reverseValue) {
        setResult(comparableResult);
        setReverseResult(reverseValue);
    }

    /**
     * Gets the value of result.
     *
     * @return the value of result.
     * @since 1.3.0
     */
    public int getResult() {
        return result;
    }

    /**
     * Gets the reverse of the result, i.e. BEFORE if it is AFTER, AFTER if it is BEFORE, and EQUAL
     * if it is EQUAL.
     *
     * @return the reverse of the normal result.
     * @since 1.3.0
     */
    public int getReverseResult() {
        return reverseResult;
    }

    /**
     * Sets the value of result.
     *
     * @param value
     *            the result to set.
     * @see #getResult()
     * @since 1.3.0
     */
    private void setResult(final int value) {
        result = value;
    }

    /**
     * Sets the value of reverseResult.
     *
     * @param value
     *            the reverseResult to set.
     * @see #getReverseResult()
     * @since 1.3.0
     */
    private void setReverseResult(final int value) {
        reverseResult = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        final String str = super.toString();
        return str.toLowerCase();
    }
}
