/*
 AbstractOptionArgument.java
 Creation date : 2/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LEFT_BRACKET_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.RIGHT_BRACKET_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.HASHCODE_PRIME_NUMBER1;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.HASHCODE_PRIME_NUMBER2;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.BEFORE;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.FULL_USAGE_DESCRIPTION_NULL_ERROR;

import java.util.logging.Logger;

/**
 * The abstract implementation of the {@link OptionArgument} interface, providing common behaviors.
 *
 * @param <A>
 *            the argument type to parse.
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class AbstractOptionArgument < A > implements OptionArgument < A > {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractOptionArgument.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -9201749588723279692L;

    /** The boolean telling if the argument is mandatory or not. */
    private boolean mandatory;

    /**
     * The full argument usage description, explaining what the argument does (used for helping
     * message).
     */
    private StringBuilder fullUsageDescription;

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @param fullArgumentDescription
     *            the full argument usage description, explaining what the argument does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @since 1.3.0
     */
    protected AbstractOptionArgument(final boolean optionArgumentIsMandatory,
            final StringBuilder fullArgumentDescription) {
        setMandatory(optionArgumentIsMandatory);
        setFullUsageDescription(new StringBuilder(fullArgumentDescription));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final OptionArgument < A > o) {
        final int comparison;

        if (this == o) {
            comparison = EQUAL.getResult();
        } else {
            if (mandatory == o.isMandatory()) {
                comparison = fullUsageDescription.toString().compareTo(o.getFullUsageDescription().toString());
            } else if (mandatory) {
                comparison = AFTER.getResult();
            } else {
                comparison = BEFORE.getResult();
            }
        }

        return comparison;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public OptionArgument < A > deepClone() {
        AbstractOptionArgument < A > a = null;

        try {
            a = (AbstractOptionArgument < A >) super.clone();
            a.fullUsageDescription = new StringBuilder(getFullUsageDescription());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractOptionArgument < ? > other = (AbstractOptionArgument < ? >) obj;
        if (fullUsageDescription == null) {
            if (other.fullUsageDescription != null) {
                return false;
            }
        } else if (other.fullUsageDescription == null) {
            return true;
        } else if (!fullUsageDescription.toString().equals(other.fullUsageDescription.toString())) {
            return false;
        }
        if (mandatory != other.mandatory) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getFullUsageDescription() {
        return fullUsageDescription;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getMainUsage() {
        StringBuilder buffer = null;

        if (isMandatory()) {
            buffer = new StringBuilder(getMainUsageDescription());
        } else {
            buffer = new StringBuilder(LEFT_BRACKET_CHAR);
            buffer.append(getMainUsageDescription());
            buffer.append(RIGHT_BRACKET_CHAR);
        }

        return buffer;
    }

    /**
     * Get the main argument usage constant.
     *
     * @return the main argument usage constant, as a String.
     * @since 1.3.0
     */
    protected abstract String getMainUsageDescription();

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullUsageDescription == null) ? 0 : fullUsageDescription.toString().hashCode());
        result = prime * result + (mandatory ? HASHCODE_PRIME_NUMBER1 : HASHCODE_PRIME_NUMBER2);
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of <code>fullUsageDescription</code>.
     *
     * @param value
     *            the <code>fullUsageDescription</code> to set, can be <code>null</code>.
     * @see #getFullUsageDescription()
     * @since 1.3.0
     */
    private void setFullUsageDescription(final StringBuilder value) {
        checkNull(value, FULL_USAGE_DESCRIPTION_NULL_ERROR);

        fullUsageDescription = value;
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

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [fullUsageDescription=" + fullUsageDescription + ", mandatory="
                + mandatory + "]";
    }
}
