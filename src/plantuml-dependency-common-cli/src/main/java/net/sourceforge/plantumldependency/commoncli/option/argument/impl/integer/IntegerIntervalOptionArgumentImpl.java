/*
 IntegerIntervalOptionArgumentImpl.java
 Creation date : 20/10/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.integer;

import static java.lang.Integer.valueOf;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.INTEGER_OUT_OF_RANGE_ARGUMENT_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.NOT_INTEGER_ARGUMENT_ERROR;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The integer interval implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * specifying an {@link Integer} argument within a interval.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class IntegerIntervalOptionArgumentImpl extends AbstractOptionArgument < Integer > {

    /** Serial version UID. */
    private static final long serialVersionUID = -1321717914491985645L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "INTEGER";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE + " specifies an integer within an interval, between ";

    /** The and string constant. */
    protected static final String AND_STRING = " and ";

    /**
     * The maximum {@link Integer} to accept, including it, must be higher than <code>minimum</code>
     * .
     */
    private Integer maximum;

    /**
     * The minimum {@link Integer} to accept, including it, must be lower than <code>maximum</code>
     * .
     */
    private Integer minimum;

    /**
     * Default constructor.
     *
     * @param min
     *            the minimum {@link Integer} to accept, including it, must be lower than
     *            <code>maximum</code>.
     * @param max
     *            the maximum {@link Integer} to accept, including it, must be higher than
     *            <code>minimum</code>.
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public IntegerIntervalOptionArgumentImpl(final Integer min, final Integer max,
            final boolean optionArgumentIsMandatory) {
        this(min, max, optionArgumentIsMandatory, new StringBuilder(USAGE_DESCRIPTION + min + AND_STRING + max
                + DOT_CHAR));
    }

    /**
     * Default constructor.
     *
     * @param min
     *            the minimum {@link Integer} to accept, including it, must be lower than
     *            <code>maximum</code>.
     * @param max
     *            the maximum {@link Integer} to accept, including it, must be higher than
     *            <code>minimum</code>.
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @param fullArgumentDescription
     *            the full argument usage description, explaining what the argument does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @since 1.3.0
     */
    public IntegerIntervalOptionArgumentImpl(final Integer min, final Integer max,
            final boolean optionArgumentIsMandatory, final StringBuilder fullArgumentDescription) {
        super(optionArgumentIsMandatory, fullArgumentDescription);
        setMaximum(max);
        setMinimum(min);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * Gets the value of <code>maximum</code>.
     *
     * @return the value of <code>maximum</code>.
     * @see #setMaximum(Integer)
     * @since 1.3.0
     */
    private Integer getMaximum() {
        return maximum;
    }

    /**
     * Gets the value of <code>minimum</code>.
     *
     * @return the value of <code>minimum</code>.
     * @see #setMinimum(Integer)
     * @since 1.3.0
     */
    private Integer getMinimum() {
        return minimum;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Integer parseArgument(final String argument) throws CommandLineException {
        Integer integer = null;

        if (isNotEmpty(argument)) {
            try {
                integer = valueOf(argument);
                if (integer.compareTo(getMinimum()) < 0) {
                    throw new CommandLineException(buildLogString(INTEGER_OUT_OF_RANGE_ARGUMENT_ERROR, new Object[] {
                            argument, getMinimum(), getMaximum()}));
                } else if (integer.compareTo(getMaximum()) > 0) {
                    throw new CommandLineException(buildLogString(INTEGER_OUT_OF_RANGE_ARGUMENT_ERROR, new Object[] {
                            argument, getMinimum(), getMaximum()}));
                }
            } catch (final NumberFormatException e) {
                throw new CommandLineException(buildLogString(NOT_INTEGER_ARGUMENT_ERROR, argument), e);
            }
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return integer;
    }

    /**
     * Sets the value of <code>maximum</code>.
     *
     * @param value
     *            the <code>maximum</code> to set, can be <code>null</code>.
     * @see #getMaximum()
     * @since 1.3.0
     */
    private void setMaximum(final Integer value) {
        maximum = value;
    }

    /**
     * Sets the value of <code>minimum</code>.
     *
     * @param value
     *            the <code>minimum</code> to set, can be <code>null</code>.
     * @see #getMinimum()
     * @since 1.3.0
     */
    private void setMinimum(final Integer value) {
        minimum = value;
    }
}
