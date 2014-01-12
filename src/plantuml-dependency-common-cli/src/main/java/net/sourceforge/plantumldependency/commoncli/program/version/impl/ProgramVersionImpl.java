/*
 ProgramVersionImpl.java
 Creation date : 8/06/2010
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

package net.sourceforge.plantumldependency.commoncli.program.version.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.HASHCODE_PRIME_NUMBER1;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.HASHCODE_PRIME_NUMBER2;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.BEFORE;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMPILATION_TIME_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.NOT_POSITIVE_VERSION_NUMBER_ERROR;

import java.util.Date;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;

/**
 * The default {@link ProgramVersion} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class ProgramVersionImpl implements ProgramVersion {

    /** Serial version UID. */
    private static final long serialVersionUID = 3475034667983466083L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(ProgramVersionImpl.class.getName());

    /** The program major version number. */
    private int majorVersionNumber;

    /** The program minor version number. */
    private int minorVersionNumber;

    /** The program revision version number. */
    private int revisionVersionNumber;

    /** The program compilation time. */
    private Date compilationTime;

    /** The boolean telling if the program version is a snapshot. */
    private boolean snapshot;

    /**
     * Medium constructor.
     *
     * @param majorVersion
     *            the program major version number, must be positive.
     * @param minorVersion
     *            the program minor version number, must be positive.
     * @param revisionVersion
     *            the program revision version number, must be positive.
     * @since 1.3.0
     */
    public ProgramVersionImpl(final int majorVersion, final int minorVersion, final int revisionVersion) {
        this(majorVersion, minorVersion, revisionVersion, new Date(), false);
    }

    /**
     * Medium constructor.
     *
     * @param majorVersion
     *            the program major version number, must be positive.
     * @param minorVersion
     *            the program minor version number, must be positive.
     * @param revisionVersion
     *            the program revision version number, must be positive.
     * @param compilation
     *            the program compilation time, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public ProgramVersionImpl(final int majorVersion, final int minorVersion, final int revisionVersion,
            final Date compilation) {
        this(majorVersion, minorVersion, revisionVersion, compilation, false);
    }

    /**
     * Full constructor.
     *
     * @param majorVersion
     *            the program major version number, must be positive.
     * @param minorVersion
     *            the program minor version number, must be positive.
     * @param revisionVersion
     *            the program revision version number, must be positive.
     * @param compilation
     *            the program compilation time, mustn't be <code>null</code>.
     * @param isSnapshot
     *            the boolean telling if the program version is a snapshot
     * @since 1.3.0
     */
    public ProgramVersionImpl(final int majorVersion, final int minorVersion, final int revisionVersion,
            final Date compilation, final boolean isSnapshot) {
        setCompilationTime(compilation);
        setMajorVersionNumber(majorVersion);
        setMinorVersionNumber(minorVersion);
        setRevisionVersionNumber(revisionVersion);
        setSnapshot(isSnapshot);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final ProgramVersion o) {
        if (this == o) {
            return EQUAL.getResult();
        }
        int comparison = getMajorVersionNumber() < o.getMajorVersionNumber() ? BEFORE.getResult()
                : getMajorVersionNumber() == o.getMajorVersionNumber() ? EQUAL.getResult() : AFTER.getResult();
        if (comparison == EQUAL.getResult()) {
            comparison = getMinorVersionNumber() < o.getMinorVersionNumber() ? BEFORE.getResult()
                    : getMinorVersionNumber() == o.getMinorVersionNumber() ? EQUAL.getResult() : AFTER.getResult();
            if (comparison == EQUAL.getResult()) {
                comparison = getRevisionVersionNumber() < o.getRevisionVersionNumber() ? BEFORE.getResult()
                        : getRevisionVersionNumber() == o.getRevisionVersionNumber() ? EQUAL.getResult() : AFTER
                                .getResult();
                if (comparison == EQUAL.getResult()) {
                    comparison = getCompilationTime().compareTo(o.getCompilationTime());
                    if (comparison == EQUAL.getResult()) {
                        return isSnapshot() == o.isSnapshot() ? EQUAL.getResult() : isSnapshot() ? AFTER.getResult()
                                : BEFORE.getResult();
                    }
                    return comparison;

                }
                return comparison;

            }
            return comparison;

        }
        return comparison;

    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public ProgramVersion deepClone() {
        ProgramVersionImpl p = null;

        try {
            p = (ProgramVersionImpl) super.clone();
            p.compilationTime = (Date) getCompilationTime().clone();
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return p;
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
        final ProgramVersionImpl other = (ProgramVersionImpl) obj;
        if (compilationTime == null) {
            if (other.compilationTime != null) {
                return false;
            }
        } else if (!compilationTime.equals(other.compilationTime)) {
            return false;
        }
        if (majorVersionNumber != other.majorVersionNumber) {
            return false;
        }
        if (minorVersionNumber != other.minorVersionNumber) {
            return false;
        }
        if (revisionVersionNumber != other.revisionVersionNumber) {
            return false;
        }
        if (snapshot != other.snapshot) {
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
    public Date getCompilationTime() {
        return new Date(compilationTime.getTime());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getFullVersionNumber() {
        return getMajorVersionNumber() + DOT_CHAR + getMinorVersionNumber() + DOT_CHAR + getRevisionVersionNumber();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int getMajorVersionNumber() {
        return majorVersionNumber;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int getMinorVersionNumber() {
        return minorVersionNumber;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int getRevisionVersionNumber() {
        return revisionVersionNumber;
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
        result = prime * result + ((compilationTime == null) ? 0 : compilationTime.hashCode());
        result = prime * result + majorVersionNumber;
        result = prime * result + minorVersionNumber;
        result = prime * result + revisionVersionNumber;
        result = prime * result + (snapshot ? HASHCODE_PRIME_NUMBER1 : HASHCODE_PRIME_NUMBER2);
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean isSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of <code>compilationTime</code>.
     *
     * @param value
     *            the <code>compilationTime</code> to set, mustn't be <code>null</code>.
     * @see #getCompilationTime()
     * @since 1.3.0
     */
    private void setCompilationTime(final Date value) {
        checkNull(value, COMPILATION_TIME_NULL_ERROR);

        compilationTime = value;
    }

    /**
     * Sets the value of <code>majorVersionNumber</code>.
     *
     * @param value
     *            the <code>majorVersionNumber</code> to set, can be <code>null</code>.
     * @see #getMajorVersionNumber()
     * @since 1.3.0
     */
    private void setMajorVersionNumber(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException(buildLogString(NOT_POSITIVE_VERSION_NUMBER_ERROR, value));
        }
        majorVersionNumber = value;
    }

    /**
     * Sets the value of <code>minorVersionNumber</code>.
     *
     * @param value
     *            the <code>minorVersionNumber</code> to set, can be <code>null</code>.
     * @see #getMinorVersionNumber()
     * @since 1.3.0
     */
    private void setMinorVersionNumber(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException(buildLogString(NOT_POSITIVE_VERSION_NUMBER_ERROR, value));
        }
        minorVersionNumber = value;
    }

    /**
     * Sets the value of <code>revisionVersionNumber</code>.
     *
     * @param value
     *            the <code>revisionVersionNumber</code> to set, can be <code>null</code>.
     * @see #getRevisionVersionNumber()
     * @since 1.3.0
     */
    private void setRevisionVersionNumber(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException(buildLogString(NOT_POSITIVE_VERSION_NUMBER_ERROR, value));
        }
        revisionVersionNumber = value;
    }

    /**
     * Sets the value of <code>snapshot</code>.
     *
     * @param value
     *            the <code>snapshot</code> to set, can be <code>null</code>.
     * @see #isSnapshot()
     * @since 1.3.0
     */
    private void setSnapshot(final boolean value) {
        snapshot = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [compilationTime=" + compilationTime + ", majorVersionNumber="
                + majorVersionNumber + ", minorVersionNumber=" + minorVersionNumber + ", revisionVersionNumber="
                + revisionVersionNumber + ", snapshot=" + snapshot + "]";
    }
}
