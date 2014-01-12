/*
 CommandLineImpl.java
 Creation date : 11/06/2010
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

package net.sourceforge.plantumldependency.commoncli.command.impl;

import static java.util.Arrays.asList;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.MINUS_ONE_RETURN_CODE;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTION_STATUS_ACTIVE_SET;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.ARGUMENT_NOT_FOUND_BUT_MANDATORY_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_ARGUMENTS_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.DUPLICATE_OPTION_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.MANDATORY_OPTION_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.NO_COMMAND_LINE_ARGUMENTS_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.OPTION_NOT_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.OPTION_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.SKIPPING_ARGUMENT_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.InfoConstants.ARGUMENT_NOT_SPECIFIED_INFO;
import static net.sourceforge.plantumldependency.commoncli.constants.log.InfoConstants.OPTION_SPECIFIED_INFO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.Option;
import net.sourceforge.plantumldependency.commoncli.option.OptionWithArgument;

/**
 * The default {@link CommandLine} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class CommandLineImpl implements CommandLine {

    /** Serial version UID. */
    private static final long serialVersionUID = 8593066398749136948L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(CommandLineImpl.class.getName());

    /** The {@link List} of {@link String} of all command line arguments. */
    private List < String > commandLineArguments;

    /**
     * Default constructor.
     *
     * @param args
     *            the command line arguments as an array of {@link String}, mustn't be
     *            <code>null</code>.
     * @since 1.3.0
     */
    public CommandLineImpl(final String[] args) {
        checkNull(args, COMMAND_LINE_ARGUMENTS_NULL_ERROR);

        commandLineArguments = new ArrayList < String >(asList(args));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final CommandLine o) {
        return getCommandLineArgumentsAsString().toString().compareTo(o.getCommandLineArgumentsAsString().toString());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public CommandLine deepClone() {
        CommandLineImpl a = null;

        try {
            a = (CommandLineImpl) super.clone();
            a.commandLineArguments = new ArrayList < String >(getCommandLineArguments());
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
        final CommandLineImpl other = (CommandLineImpl) obj;
        if (commandLineArguments == null) {
            if (other.commandLineArguments != null) {
                return false;
            }
        } else if (!commandLineArguments.equals(other.commandLineArguments)) {
            return false;
        }
        return true;
    }

    /**
     * Find and returns the option index (in the arguments list) if specified on the command line.
     *
     * @param option
     *            the option to look for, mustn't be <code>null</code>.
     * @return the option index (in the arguments list) if specified on the command line, return
     *         {@link net.sourceforge.plantumldependency.common.constants.CommonConstants#MINUS_ONE_RETURN_CODE}
     *         if not specified.
     * @throws CommandLineException
     *             if any error occurs when finding the option index in the command line, for
     *             instance when the option is specified several times in the command line.
     * @since 1.3.0
     */
    private int findAndCheckOptionIndex(final Option option) throws CommandLineException {
        checkNull(option, OPTION_NULL_ERROR);

        int optionIndex = MINUS_ONE_RETURN_CODE;

        for (int i = 0; i < getCommandLineArguments().size(); i++) {
            final String currentArgument = getCommandLineArguments().get(i);
            if (option.getAllNames().contains(currentArgument)) {
                if (optionIndex == MINUS_ONE_RETURN_CODE) {
                    LOGGER.log(INFO, buildLogString(OPTION_SPECIFIED_INFO, option.getAllNames()));
                    optionIndex = i;
                } else {
                    throw new CommandLineException(buildLogString(DUPLICATE_OPTION_ERROR, option.getAllNames()));
                }
            } else {
                LOGGER.log(FINE,
                        buildLogString(SKIPPING_ARGUMENT_FINE, new String[] {currentArgument, option.getName()}));
            }
        }

        if (optionIndex == MINUS_ONE_RETURN_CODE) {
            if (option.isMandatory()) {
                throw new CommandLineException(buildLogString(MANDATORY_OPTION_ERROR, option.getAllNames()));
            } else {
                LOGGER.log(FINE, buildLogString(OPTION_NOT_SPECIFIED_FINE, option.getAllNames()));
            }
        } else {
            LOGGER.log(FINE, buildLogString(OPTION_SPECIFIED_FINE, option.getAllNames()));
        }

        return optionIndex;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String findOptionArgument(final OptionWithArgument < ? > option) throws CommandLineException {
        checkNull(option, OPTION_NULL_ERROR);

        String argumentString = null;

        final int optionIndex = findAndCheckOptionIndex(option);
        if (optionIndex == MINUS_ONE_RETURN_CODE) {
            LOGGER.log(FINE, buildLogString(OPTION_NOT_SPECIFIED_FINE, option.getAllNames()));
        } else {
            final int argumentIndex = optionIndex + 1;
            if (argumentIndex >= getCommandLineArguments().size()) {
                if (option.getOptionArgument().isMandatory()) {
                    throw new CommandLineException(buildLogString(ARGUMENT_NOT_FOUND_BUT_MANDATORY_ERROR,
                            option.getAllNames()));
                }
                LOGGER.log(INFO, buildLogString(ARGUMENT_NOT_SPECIFIED_INFO, option.getAllNames()));
                argumentString = BLANK_STRING;
            } else {
                argumentString = getCommandLineArguments().get(argumentIndex);
                try {
                    option.getOptionArgument().parseArgument(argumentString);
                } catch (final CommandLineException e) {
                    if (option.getOptionArgument().isMandatory()) {
                        throw new CommandLineException(buildLogString(ARGUMENT_NOT_FOUND_BUT_MANDATORY_ERROR,
                                option.getAllNames()), e);
                    }
                    LOGGER.log(INFO, buildLogString(ARGUMENT_NOT_SPECIFIED_INFO, option.getAllNames()));
                    argumentString = BLANK_STRING;
                }
            }
        }

        return argumentString;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public List < String > getCommandLineArguments() {
        return commandLineArguments;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getCommandLineArgumentsAsString() {
        final StringBuilder buffer = new StringBuilder();

        if (getCommandLineArguments().size() == 0) {
            LOGGER.log(FINE, NO_COMMAND_LINE_ARGUMENTS_FINE);
        } else {
            for (int i = 0; i < getCommandLineArguments().size() - 1; i++) {
                final String argument = getCommandLineArguments().get(i);
                buffer.append(argument);
                buffer.append(SPACE_CHAR);
            }

            buffer.append(getCommandLineArguments().get(getCommandLineArguments().size() - 1));
        }

        return buffer;
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
        result = prime * result + ((commandLineArguments == null) ? 0 : commandLineArguments.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean isOptionActiveAndSpecified(final Option option) throws CommandLineException {
        return OPTION_STATUS_ACTIVE_SET.contains(option.getStatus()) && isOptionSpecified(option);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean isOptionSpecified(final Option option) throws CommandLineException {
        return findAndCheckOptionIndex(option) != MINUS_ONE_RETURN_CODE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [commandLineArguments=" + commandLineArguments + "]";
    }
}
