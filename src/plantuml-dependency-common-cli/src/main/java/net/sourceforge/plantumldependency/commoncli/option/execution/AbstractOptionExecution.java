/*
 AbstractOptionExecution.java
 Creation date : 25/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.execution;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.BEFORE;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;

import java.util.logging.Logger;

/**
 * The abstract implementation of the {@link OptionExecution} interface, providing common behaviors.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class AbstractOptionExecution implements OptionExecution {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractOptionExecution.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -6822376158952497623L;

    /** The option priority. */
    private int priority;

    /**
     * Default constructor.
     *
     * @param optionPriority
     *            The option priority. <i>Note : the priority must be unique amongst all
     *            options</i>.
     * @since 1.3.0
     */
    protected AbstractOptionExecution(final int optionPriority) {
        setPriority(optionPriority);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final OptionExecution o) {
        final int comparison;
        if (getPriority() < o.getPriority()) {
            comparison = BEFORE.getResult();
        } else if (getPriority() == o.getPriority()) {
            comparison = EQUAL.getResult();
        } else {
            comparison = AFTER.getResult();
        }
        return comparison;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public OptionExecution deepClone() {
        OptionExecution o = null;

        try {
            o = (AbstractOptionExecution) super.clone();
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return o;
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
        final AbstractOptionExecution other = (AbstractOptionExecution) obj;
        if (priority != other.priority) {
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
    public int getPriority() {
        return priority;
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
        result = prime * result + priority;
        return result;
    }

    /**
     * Sets the value of <code>priority</code>.
     *
     * @param value
     *            the <code>priority</code> to set.
     * @see #getPriority()
     * @since 1.3.0
     */
    private void setPriority(final int value) {
        priority = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [priority=" + priority + "]";
    }
}
