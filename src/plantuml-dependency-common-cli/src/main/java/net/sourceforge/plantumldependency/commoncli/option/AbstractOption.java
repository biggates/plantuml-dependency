/*
 AbstractOption.java
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

package net.sourceforge.plantumldependency.commoncli.option;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.TAB_CHAR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.FULL_USAGE_DESCRIPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_SECONDARY_NAMES_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_STATUS_NULL_ERROR;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * The abstract implementation of the {@link Option} interface, providing common behaviors.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class AbstractOption implements Option {

    /** Serial version UID. */
    private static final long serialVersionUID = -2714033818095664600L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractOption.class.getName());

    /**
     * The full option usage description, explaining what the option does (used for helping
     * message).
     */
    private StringBuilder fullUsageDescription;

    /** The option main name (for instance "-v" or "-o"). */
    private String name;

    /** The {@link Set} containing all option secondary names. */
    private Set < String > secondaryNames;

    /** The option status, telling if the option is active, inactive or hidden. */
    private OptionStatus status;

    /**
     * Default constructor.
     *
     * @param optionName
     *            the option main name (for instance "-v" or "-o"), mustn't be <code>null</code>.
     * @param optionSecondaryNames
     *            the {@link Set} containing all option secondary names, mustn't be
     *            <code>null</code> but may be empty. <i>Note : a new {@link Set} is created.</i>
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @param optionStatus
     *            the option status, telling if the option is active, inactive or hidden, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    protected AbstractOption(final String optionName, final Set < String > optionSecondaryNames,
            final StringBuilder fullOptionDescription, final OptionStatus optionStatus) {
        setName(optionName);
        setSecondaryNames(new TreeSet < String >(optionSecondaryNames));
        setFullUsageDescription(new StringBuilder(fullOptionDescription));
        setStatus(optionStatus);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final Option o) {
        return getName().compareTo(o.getName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Option deepClone() {
        AbstractOption a = null;

        try {
            a = (AbstractOption) super.clone();
            a.fullUsageDescription = new StringBuilder(getFullUsageDescription());
            a.secondaryNames = new TreeSet < String >(getSecondaryNames());
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
        final AbstractOption other = (AbstractOption) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
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
    public Set < String > getAllNames() {
        final Set < String > allNames = new TreeSet < String >(getSecondaryNames());
        allNames.add(getName());
        return allNames;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getFullUsage() {
        final StringBuilder buffer = new StringBuilder(getName());

        for (final String secondaryName : getSecondaryNames()) {
            buffer.append(COMMA_CHAR);
            buffer.append(SPACE_CHAR);
            buffer.append(secondaryName);
        }

        buffer.append(getFullUsageAdditions());
        buffer.append(LINE_CHAR);
        buffer.append(TAB_CHAR);
        buffer.append(TAB_CHAR);
        buffer.append(getFullUsageDescription());
        buffer.append(getFullUsageDescriptionAdditions());

        return buffer;
    }

    /**
     * Gets the full option usage additions, which can add additional information for the option
     * synopsis information (if necessary, used for helping message).
     *
     * @return the full option usage additions.
     * @since 1.3.0
     */
    protected abstract StringBuilder getFullUsageAdditions();

    /**
     * Gets the value of <code>fullUsageDescription</code>.
     *
     * @return the value of <code>fullUsageDescription</code>.
     * @see #setFullUsageDescription(StringBuilder)
     * @since 1.3.0
     */
    private StringBuilder getFullUsageDescription() {
        return fullUsageDescription;
    }

    /**
     * Gets the full option usage additions, which can add additional description explaining what
     * the option does (if necessary, used for helping message).
     *
     * @return the full option usage additions.
     * @since 1.3.0
     */
    protected abstract StringBuilder getFullUsageDescriptionAdditions();

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getMainUsage() {
        final StringBuilder buffer = new StringBuilder(getName());
        buffer.append(getMainUsageAdditions());
        return buffer;
    }

    /**
     * Gets the full option main usage additions, which can add additional information for the main
     * option synopsis information (if necessary, used for helping message).
     *
     * @return the full option main usage additions.
     * @since 1.3.0
     */
    protected abstract StringBuilder getMainUsageAdditions();

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < String > getSecondaryNames() {
        return secondaryNames;
    }

    /**
     * Gets the value of <code>status</code>.
     *
     * @return the value of <code>status</code>.
     * @since 1.3.0
     */
    @Override
    public OptionStatus getStatus() {
        return status;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean isMandatory() {
        return getStatus().isMandatory();
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
     * Sets the value of <code>name</code>.
     *
     * @param value
     *            the <code>name</code> to set, can be <code>null</code>.
     * @see #getName()
     * @since 1.3.0
     */
    private void setName(final String value) {
        checkNull(value, OPTION_NAME_NULL_ERROR);

        name = value;
    }

    /**
     * Sets the value of <code>secondaryNames</code>.
     *
     * @param value
     *            the <code>secondaryNames</code> to set, can be <code>null</code>.
     * @see #getSecondaryNames()
     * @since 1.3.0
     */
    private void setSecondaryNames(final Set < String > value) {
        checkNull(value, OPTION_SECONDARY_NAMES_NULL_ERROR);

        secondaryNames = value;
    }

    /**
     * Sets the value of <code>status</code>.
     *
     * @param value
     *            the <code>status</code> to set, can be <code>null</code>.
     * @see #getStatus()
     * @since 1.3.0
     */
    private void setStatus(final OptionStatus value) {
        checkNull(value, OPTION_STATUS_NULL_ERROR);

        status = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [fullUsageDescription=" + fullUsageDescription + ", name=" + name
                + ", secondaryNames=" + secondaryNames + ", status=" + status + "]";
    }
}
