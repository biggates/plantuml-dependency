/*
 OptionStatus.java
 Creation date : 5/10/2010
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

package net.sourceforge.plantumldependency.commoncli.option.status;

/**
 * This enumeration contains all option status.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public enum OptionStatus {

    /** The status which makes an option active and mandatory. */
    ACTIVE_MANDATORY_OPTION_STATUS(true, true),
    /** The status which makes an option active and optional. */
    ACTIVE_OPTIONAL_OPTION_STATUS(false, true),
    /** The status which makes an option inactive and optional. */
    INACTIVE_OPTIONAL_OPTION_STATUS(false, false),
    /** The status which makes an option hidden and optional. */
    HIDDEN_OPTIONAL_OPTION_STATUS(false, true);

    /** The boolean telling if the option is mandatory or not. */
    private boolean mandatory;

    /**
     * The boolean telling if the option is considered active, meaning it has to be taken in the
     * command line when parsing it.
     */
    private boolean active;

    /**
     * Full constructor.
     *
     * @param optionIsMandatory
     *            <code>true</code> if the option is mandatory, <code>false</code> otherwise.
     * @param isActive
     *            <code>true</code> if the option is considered active, meaning it has to be taken
     *            in the command line when parsing it, <code>false</code> otherwise.
     * @since 1.3.0
     */
    private OptionStatus(final boolean optionIsMandatory, final boolean isActive) {
        setMandatory(optionIsMandatory);
        setActive(isActive);
    }

    /**
     * Gets the value of <code>active</code>.
     *
     * @return the value of <code>active</code>.
     * @since 1.3.0
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Gets the boolean which tells if the option is mandatory.
     *
     * @return <code>true</code> if the option is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of <code>active</code>.
     *
     * @param value
     *            the <code>active</code> to set, can be <code>null</code>.
     * @see #isActive()
     * @since 1.3.0
     */
    private void setActive(final boolean value) {
        active = value;
    }

    /**
     * Sets the value of <code>mandatory</code>.
     *
     * @param value
     *            the <code>mandatory</code> to set, can be <code>null</code>.
     * @see #isMandatory()
     * @since 1.3.0
     */
    private void setMandatory(final boolean value) {
        mandatory = value;
    }
}
