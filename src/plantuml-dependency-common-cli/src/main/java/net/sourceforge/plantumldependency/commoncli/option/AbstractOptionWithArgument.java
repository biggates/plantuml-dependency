/*
 AbstractOptionWithArgument.java
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

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.TAB_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_ARGUMENT_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.ARGUMENT_AS_STRING_ALREADY_FOUND_FINE;

import java.util.Set;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;

/**
 * The abstract implementation of the {@link OptionWithArgument} interface, providing common
 * behaviors.
 *
 * @param <A>
 *            the argument type to parse.
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.4.0
 */
public abstract class AbstractOptionWithArgument < A > extends AbstractOption implements OptionWithArgument < A > {

    /** Serial version UID. */
    private static final long serialVersionUID = 6525955986370555309L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractOptionWithArgument.class.getName());

    /** The option argument. */
    private OptionArgument < A > optionArgument;

    /**
     * The option - argument separator. Most of the time, it is a single space " " but it may be "="
     * or "-".
     */
    private String valueSeparator;

    /**
     * Default constructor.
     *
     * @param optionName
     *            the option main name (for instance "-v" or "-o"), mustn't be <code>null</code>.
     * @param optionSecondaryNames
     *            the {@link Set} containing all option secondary names, mustn't be
     *            <code>null</code> but may be empty. <i>Note : a new {@link Set} is created.</i>
     * @param argument
     *            the option argument, mustn't be <code>null</code>.
     * @param fullOptionDescription
     *            the full option usage description, explaining what the option does (used for
     *            helping message). <i>Note : a new {@link StringBuilder} is created.</i>
     * @param valSepararator
     *            the option - argument separator. Most of the time, it is a single space " " but it
     *            may be "=" or "-", mustn't be <code>null</code>.
     * @param optionStatus
     *            the option status, telling if the option is active, inactive or hidden, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    protected AbstractOptionWithArgument(final String optionName, final Set < String > optionSecondaryNames,
            final OptionArgument < A > argument, final StringBuilder fullOptionDescription,
            final String valSepararator, final OptionStatus optionStatus) {
        super(optionName, optionSecondaryNames, fullOptionDescription, optionStatus);
        setValueSeparator(valSepararator);
        setOptionArgument(argument);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Option deepClone() {
        final AbstractOptionWithArgument < A > a = (AbstractOptionWithArgument < A >) super.deepClone();
        a.optionArgument = getOptionArgument().deepClone();
        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.4.0
     */
    @Override
    public String findAndParseArgumentAsStringOrGetDefaultArgument(final CommandLine commandLine)
            throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        String argumentString = commandLine.findOptionArgument(this);

        if (argumentString == null) {
            argumentString = getDefaultArgumentAsStringIfOptionNotSpecified(commandLine);
        } else if (argumentString.length() == 0) {
            argumentString = getDefaultArgumentAsStringIfOptionSpecified(commandLine);
        } else {
            LOGGER.log(FINE, buildLogString(ARGUMENT_AS_STRING_ALREADY_FOUND_FINE, argumentString));
        }

        return argumentString;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public A findAndParseArgumentOrGetDefaultArgument(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        final String argumentString = commandLine.findOptionArgument(this);
        A argument = null;

        if (argumentString == null) {
            argument = getDefaultArgumentIfOptionNotSpecified(commandLine);
        } else if (argumentString.length() == 0) {
            argument = getDefaultArgumentIfOptionSpecified(commandLine);
        } else {
            argument = getOptionArgument().parseArgument(argumentString);
        }

        return argument;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public A getDefaultArgumentIfOptionNotSpecified(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        return getOptionArgument().parseArgument(getDefaultArgumentAsStringIfOptionNotSpecified(commandLine));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public A getDefaultArgumentIfOptionSpecified(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        return getOptionArgument().parseArgument(getDefaultArgumentAsStringIfOptionSpecified(commandLine));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getFullUsageAdditions() {
        final StringBuilder buffer = new StringBuilder(getValueSeparator());
        buffer.append(getOptionArgument().getMainUsage());
        return buffer;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getFullUsageDescriptionAdditions() {
        final StringBuilder buffer = new StringBuilder(LINE_CHAR);
        buffer.append(TAB_CHAR);
        buffer.append(TAB_CHAR);
        buffer.append(getOptionArgument().getFullUsageDescription());
        return buffer;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected StringBuilder getMainUsageAdditions() {
        final StringBuilder buffer = new StringBuilder(getValueSeparator());
        buffer.append(getOptionArgument().getMainUsage());
        return buffer;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public OptionArgument < A > getOptionArgument() {
        return optionArgument;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getValueSeparator() {
        return valueSeparator;
    }

    /**
     * Sets the value of <code>optionArgument</code>.
     *
     * @param value
     *            the <code>optionArgument</code> to set, can be <code>null</code>.
     * @see #getOptionArgument()
     * @since 1.3.0
     */
    private void setOptionArgument(final OptionArgument < A > value) {
        checkNull(value, OPTION_ARGUMENT_NULL_ERROR);

        optionArgument = value;
    }

    /**
     * Sets the value of <code>valueSeparator</code>.
     *
     * @param value
     *            the <code>valueSeparator</code> to set, can be <code>null</code>.
     * @see #getValueSeparator()
     * @since 1.3.0
     */
    private void setValueSeparator(final String value) {
        checkNull(value, OPTION_ARGUMENT_NULL_ERROR);

        valueSeparator = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [optionArgument=" + optionArgument + ", valueSeparator=" + valueSeparator
                + "]";
    }
}
