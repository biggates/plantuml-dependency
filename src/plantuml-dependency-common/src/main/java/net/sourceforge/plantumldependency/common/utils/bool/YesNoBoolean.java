/*
 YesNoBoolean.java
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

package net.sourceforge.plantumldependency.common.utils.bool;

/**
 * This enumeration type lists "yes" and "no" string.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public enum YesNoBoolean {

    /** The "yes" boolean. */
    YES(true, 1),
    /** The "no" boolean. */
    NO(false, 0);

    /** The boolean value which usually represents the enum variable. */
    private boolean booleanValue;

    /** The integer value which usually represents the enum variable. */
    private int intRepresentation;

    /**
     * Default constructor with the boolean value.
     *
     * @param booleanVal
     *            The boolean value to affect.
     * @param integerRepresentation
     *            The integer representation to affect.
     * @since 1.3.0
     */
    private YesNoBoolean(final boolean booleanVal, final int integerRepresentation) {
        setBooleanValue(booleanVal);
        setIntRepresentation(integerRepresentation);
    }

    /**
     * Gets the value of booleanValue.
     *
     * @return the value of booleanValue.
     * @since 1.3.0
     */
    public boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * Gets the value of intRepresentation.
     *
     * @return the value of intRepresentation.
     * @since 1.3.0
     */
    public int getIntRepresentation() {
        return intRepresentation;
    }

    /**
     * Gets the value of intRepresentation as a String.
     *
     * @return the value of intRepresentation as a String.
     * @see #getIntRepresentation()
     * @since 1.3.0
     */
    public String getIntRepresentationAsString() {
        return Integer.toString(intRepresentation);
    }

    /**
     * Sets the value of booleanValue.
     *
     * @param value
     *            the booleanValue to set.
     * @see #getBooleanValue()
     * @since 1.3.0
     */
    private void setBooleanValue(final boolean value) {
        booleanValue = value;
    }

    /**
     * Sets the value of intRepresentation.
     *
     * @param value
     *            the intRepresentation to set.
     * @see #getIntRepresentation()
     * @since 1.3.0
     */
    private void setIntRepresentation(final int value) {
        intRepresentation = value;
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
