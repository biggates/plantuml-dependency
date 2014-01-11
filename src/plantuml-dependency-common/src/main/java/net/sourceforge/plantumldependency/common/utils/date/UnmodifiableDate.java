/*
 UnmodifiableDate.java
 Creation date : 3/06/2011
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

package net.sourceforge.plantumldependency.common.utils.date;

import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.IMMUTABLE_DATE_ERROR;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.util.Date;

/**
 * An immutable version of the {@link Date} class.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.3.0
 * @version 1.3.0
 */
public class UnmodifiableDate extends Date {

    /** Serial version UID. */
    private static final long serialVersionUID = -1580684205510917528L;

    /**
     * Default constructor.
     *
     * @since 1.3.0
     */
    public UnmodifiableDate() {
        super();
    }

    /**
     * Medium constructor, with a {@link Date} instance.
     *
     * @param date
     *            the original {@link Date} instance to get immutable.
     * @since 1.3.0
     */
    public UnmodifiableDate(final Date date) {
        super(date.getTime());
    }

    /**
     * Allocates a <code>Date</code> object and initializes it to represent the specified number of
     * milliseconds since the standard base time known as "the epoch", namely January 1, 1970,
     * 00:00:00 GMT.
     *
     * @param date
     *            the milliseconds since January 1, 1970, 00:00:00 GMT.
     * @see java.lang.System#currentTimeMillis()
     * @since 1.3.0
     */
    public UnmodifiableDate(final long date) {
        super(date);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setDate(final int date) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setHours(final int hours) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setMinutes(final int minutes) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setMonth(final int month) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setSeconds(final int seconds) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setTime(final long time) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void setYear(final int year) {
        throw new IllegalArgumentException(buildLogString(IMMUTABLE_DATE_ERROR, this));
    }
}
