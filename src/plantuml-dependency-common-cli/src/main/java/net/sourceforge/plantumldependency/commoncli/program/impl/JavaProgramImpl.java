/*
 JavaProgramImpl.java
 Creation date : 3/06/2010
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

package net.sourceforge.plantumldependency.commoncli.program.impl;

import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.HYPHEN_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LEFT_PARENTHESIS_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.RIGHT_PARENTHESIS_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.TAB_CHAR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNullOrEmpty;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.EXAMPLES_OPTIONS_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.JAVA_JAR_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.KNOWN_BUGS_OR_LIMITATIONS_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.MANDATORY_OPTIONS_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTIONAL_OPTIONS_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTIONS_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTION_STATUS_ACTIVE_SET;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTION_STATUS_MANDATORY_SET;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.OPTION_STATUS_SET;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.USAGE_CMD;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.DUPLICATE_OPTION_NAME_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.DUPLICATE_OPTION_PRIORITY_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.FULL_USAGE_DESCRIPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.FULL_USAGE_EXAMPLES_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.KNOWN_BUG_OR_LIMITATION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.MANDATORY_OPTIONS_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.NO_OPTION_EXECUTIONS_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTIONAL_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTIONS_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_STATUS_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.OPTION_STATUS_SET_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_AUTHORS_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_JAR_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_LICENSES_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_TITLE_DESCRIPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_URL_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.PROGRAM_VERSION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.ANALYSING_COMMAND_LINE_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.NO_COMMAND_LINE_EXAMPLES_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.NO_KNOWN_BUGS_OR_LIMITATIONS_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.NO_MANDATORY_OPTIONS_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.NO_OPTIONAL_OPTIONS_FINE;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.OPTION_NOT_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.Option;
import net.sourceforge.plantumldependency.commoncli.option.execution.ExecutableOption;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;
import net.sourceforge.plantumldependency.commoncli.program.execution.impl.JavaProgramExecutionImpl;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;

/**
 * The default implementation of the {@link JavaProgram} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class JavaProgramImpl implements JavaProgram {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaProgramImpl.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = 6320611334395831389L;

    /**
     * This method finds all duplicate option names in a {@link Set} following the passed
     * {@link Option}.
     *
     * @param option
     *            the option to check names from, mustn't be <code>null</code>.
     * @param optionsSet
     *            the {@link Set} of all options to check duplicates, mustn't be <code>null</code>.
     * @return the {@link Set} of all duplicate names found, return an empty set if no one is found.
     * @since 1.3.0
     */
    private static Set < String > checkDuplicateOptionNames(final Option option, final Set < Option > optionsSet) {
        checkNull(option, OPTION_NULL_ERROR);
        checkNull(optionsSet, OPTIONS_NULL_ERROR);

        final Set < String > duplicateNames = new TreeSet < String >();
        for (final Option opt : optionsSet) {
            for (final String optionName : option.getAllNames()) {
                if (opt.getAllNames().contains(optionName)) {
                    duplicateNames.add(optionName);
                }
            }
        }

        return duplicateNames;
    }

    /**
     * This method finds all duplicate option priorities in a {@link Set} following the passed
     * {@link Option}.
     *
     * @param option
     *            the option to check priorities from, mustn't be <code>null</code>.
     * @param optionsSet
     *            the {@link Set} of all options to check duplicates, mustn't be <code>null</code>.
     * @return the {@link Set} of all duplicate priorities found, return an empty set if no one is
     *         found.
     * @since 1.3.0
     */
    private static Set < Integer > checkDuplicateOptionPriorities(final ExecutableOption option,
            final Set < ExecutableOption > optionsSet) {
        checkNull(option, OPTION_NULL_ERROR);
        checkNull(optionsSet, OPTIONS_NULL_ERROR);

        final Set < Integer > duplicatePriorities = new TreeSet < Integer >();
        for (final ExecutableOption opt : optionsSet) {
            if (opt.getPriority() == option.getPriority()) {
                duplicatePriorities.add(opt.getPriority());
            }
        }

        return duplicatePriorities;
    }

    /**
     * Creates the {@link JavaProgramExecution} instance to execute the program.
     *
     * @param optionExecutions
     *            the {@link Set} of all {@link OptionExecution} which will be executed by the
     *            {@link JavaProgramExecution} instance.
     * @return the {@link JavaProgramExecution} instance to execute the program
     * @since 1.3.0
     */
    private static JavaProgramExecution createJavaProgramExecution(final Set < OptionExecution > optionExecutions) {
        return new JavaProgramExecutionImpl(optionExecutions);
    }

    /**
     * Generates the program main usage description.
     *
     * @param fullJarName
     *            the program jar name, mustn't be <code>null</code>.
     * @param mandatoryOptions
     *            the {@link Set} of all mandatory {@link Option}, mustn't be <code>null</code>.
     * @param optionalOptions
     *            the {@link Set} of all optional {@link Option}, mustn't be <code>null</code>.
     * @return the {@link StringBuilder} containing the program main usage description.
     * @since 1.3.0
     */
    private static StringBuilder generateMainUsageDescription(final String fullJarName,
            final Set < Option > mandatoryOptions, final Set < Option > optionalOptions) {
        checkNull(fullJarName, PROGRAM_JAR_NAME_NULL_ERROR);
        checkNull(mandatoryOptions, MANDATORY_OPTIONS_NULL_ERROR);
        checkNull(optionalOptions, OPTIONAL_OPTION_NULL_ERROR);

        final StringBuilder buffer = new StringBuilder(JAVA_JAR_CMD);

        buffer.append(fullJarName);
        buffer.append(SPACE_CHAR);
        for (final Option option : mandatoryOptions) {
            buffer.append(option.getMainUsage());
            buffer.append(SPACE_CHAR);
        }

        if (optionalOptions.size() > 0) {
            buffer.append(OPTIONS_CMD);
        } else {
            LOGGER.log(FINE, NO_OPTIONAL_OPTIONS_FINE);
        }

        return buffer;
    }

    /**
     * Generates the program options full usage description.
     *
     * @param titleDescription
     *            the program title description, mustn't be <code>null</code>.
     * @param options
     *            the {@link Set} of all program {@link Option}, mustn't be <code>null</code>.
     * @return the {@link StringBuilder} containing the program options full usage description.
     * @since 1.3.0
     */
    private static StringBuilder generateOptionsFullUsageDescription(final String titleDescription,
            final Set < Option > options) {
        checkNull(titleDescription, PROGRAM_TITLE_DESCRIPTION_NULL_ERROR);
        checkNull(options, OPTIONS_NULL_ERROR);

        final StringBuilder buffer = new StringBuilder(LINE_CHAR);
        buffer.append(titleDescription);

        for (final Option option : options) {
            buffer.append(LINE_CHAR);
            buffer.append(LINE_CHAR);
            buffer.append(TAB_CHAR);
            buffer.append(option.getFullUsage());
        }

        return buffer;
    }

    /** The program name. */
    private String name;

    /** The {@link List} of all program license names. */
    private List < String > licenseNames;

    /** The {@link List} of all program authors. */
    private List < String > authors;

    /** The program version. */
    private ProgramVersion version;

    /** The jar name. */
    private String jarName;

    /** The {@link Set} of all program options. */
    private Set < Option > allOptions;

    /** The program website URL. */
    private URL url;

    /** The program full usage description. */
    private StringBuilder fullUsageDescription;

    /** The {@link Set} of all program example command lines. */
    private Set < CommandLine > fullUsageExamplesSet;

    /** The {@link Set} of all program known bugs or limitations. */
    private Set < String > knownBugsOrLimitationsSet;

    /**
     * Default constructor.
     *
     * @param programName
     *            the program name, mustn't be <code>null</code>.
     * @param programUrl
     *            the program website URL, mustn't be <code>null</code>.
     * @param fullJarName
     *            the program jar name, mustn't be <code>null</code>.
     * @param programLicenses
     *            the {@link List} of all program license names, mustn't be <code>null</code>.
     * @param programAuthors
     *            the {@link List} of all program authors, mustn't be <code>null</code>.
     * @param programVersion
     *            the program version, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public JavaProgramImpl(final String programName, final URL programUrl, final String fullJarName,
            final List < String > programLicenses, final List < String > programAuthors,
            final ProgramVersion programVersion) {
        this(programName, programUrl, fullJarName, programLicenses, programAuthors, programVersion, new StringBuilder());
    }

    /**
     * Full constructor.
     *
     * @param programName
     *            the program name, mustn't be <code>null</code>.
     * @param programUrl
     *            the program website URL, mustn't be <code>null</code>.
     * @param fullJarName
     *            the program jar name, mustn't be <code>null</code>.
     * @param programLicenses
     *            the {@link List} of all program license names, mustn't be <code>null</code>.
     * @param programAuthors
     *            the {@link List} of all program authors, mustn't be <code>null</code>.
     * @param programVersion
     *            the program version, mustn't be <code>null</code>.
     * @param fullProgramDescription
     *            the program full usage description, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    public JavaProgramImpl(final String programName, final URL programUrl, final String fullJarName,
            final List < String > programLicenses, final List < String > programAuthors,
            final ProgramVersion programVersion, final StringBuilder fullProgramDescription) {
        setName(programName);
        setUrl(programUrl);
        setJarName(fullJarName);
        setLicenseNames(programLicenses);
        setVersion(programVersion);
        setAuthors(programAuthors);
        setFullUsageDescription(fullProgramDescription);
        setAllOptions(new TreeSet < Option >());
        setFullUsageExamplesSet(new TreeSet < CommandLine >());
        setKnownBugsOrLimitationsSet(new TreeSet < String >());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void addExampleCommandLine(final CommandLine exampleCommandLine) throws CommandLineException {
        checkNull(exampleCommandLine, COMMAND_LINE_NULL_ERROR);

        getFullUsageExamplesSet().add(exampleCommandLine);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void addKnownBugOrLimitation(final String bugOrLimitationDescription) throws CommandLineException {
        checkNullOrEmpty(bugOrLimitationDescription, KNOWN_BUG_OR_LIMITATION_NULL_ERROR);
        getKnownBugsOrLimitationsSet().add(bugOrLimitationDescription);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public void addOption(final Option option) throws CommandLineException {
        checkNull(option, OPTION_NULL_ERROR);

        final Set < String > duplicateNames = checkDuplicateOptionNames(option, getOriginalAllOptions());
        if (duplicateNames.size() > 0) {
            throw new CommandLineException(buildLogString(DUPLICATE_OPTION_NAME_ERROR, duplicateNames));
        } else if (option instanceof ExecutableOption) {
            final ExecutableOption executableOption = (ExecutableOption) option;
            final Set < Integer > duplicatePriorities = checkDuplicateOptionPriorities(executableOption,
                    getAllExecutableOptions());
            if (duplicatePriorities.size() > 0) {
                throw new CommandLineException(buildLogString(DUPLICATE_OPTION_PRIORITY_ERROR, duplicatePriorities));
            }
            getOriginalAllOptions().add(option);
        } else {
            getOriginalAllOptions().add(option);
        }
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final JavaProgram o) {
        return getName().compareTo(o.getName());
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public JavaProgram deepClone() {
        JavaProgramImpl a = null;

        try {
            a = (JavaProgramImpl) super.clone();
            a.licenseNames = new ArrayList < String >(getLicenseNames());
            a.authors = getAuthors();
            a.version = getVersion().deepClone();
            // FIXME Can't clone options because some of them have a reference to the JavaProgram
            // instance
            a.allOptions = getAllOptions();
            a.fullUsageDescription = new StringBuilder(getFullUsageDescription());
            a.fullUsageExamplesSet = new TreeSet < CommandLine >();
            for (final CommandLine commandLine : getFullUsageExamplesSet()) {
                a.fullUsageExamplesSet.add(commandLine.deepClone());
            }
            a.knownBugsOrLimitationsSet = new TreeSet < String >(getKnownBugsOrLimitationsSet());
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
        final JavaProgramImpl other = (JavaProgramImpl) obj;
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
    public Set < ExecutableOption > getAllExecutableOptions() {
        return getAllExecutableOptions(OPTION_STATUS_SET);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < ExecutableOption > getAllExecutableOptions(final OptionStatus status) {
        checkNull(status, OPTION_STATUS_NULL_ERROR);

        final Set < OptionStatus > statusSet = new TreeSet < OptionStatus >();
        statusSet.add(status);
        return getAllExecutableOptions(statusSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < ExecutableOption > getAllExecutableOptions(final Set < OptionStatus > statusSet) {
        checkNull(statusSet, OPTION_STATUS_SET_NULL_ERROR);

        final Set < ExecutableOption > allExecutableOptions = new TreeSet < ExecutableOption >();
        for (final Option option : getOriginalAllOptions()) {
            if (option instanceof ExecutableOption && statusSet.contains(option.getStatus())) {
                allExecutableOptions.add((ExecutableOption) option);
            }
        }

        return allExecutableOptions;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < Option > getAllMandatoryOptions() {
        return getAllOptions(OPTION_STATUS_MANDATORY_SET);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < Option > getAllOptionalActiveOptions() {
        return getAllOptions(ACTIVE_OPTIONAL_OPTION_STATUS);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < Option > getAllOptions() {
        return getAllOptions(OPTION_STATUS_SET);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < Option > getAllOptions(final OptionStatus status) {
        checkNull(status, OPTION_STATUS_NULL_ERROR);

        final Set < OptionStatus > statusSet = new TreeSet < OptionStatus >();
        statusSet.add(status);
        return getAllOptions(statusSet);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Set < Option > getAllOptions(final Set < OptionStatus > statusSet) {
        checkNull(statusSet, OPTION_STATUS_SET_NULL_ERROR);

        final Set < Option > options = new TreeSet < Option >();
        for (final Option option : allOptions) {
            if (statusSet.contains(option.getStatus())) {
                options.add(option);
            }
        }

        return options;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public List < String > getAuthors() {
        return new ArrayList < String >(authors);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getFullUsage() {
        final StringBuilder buffer = new StringBuilder(getMainUsage());
        buffer.append(LINE_CHAR);

        if (getAllMandatoryOptions().size() > 0) {
            buffer.append(generateOptionsFullUsageDescription(MANDATORY_OPTIONS_CMD, getAllMandatoryOptions()));
        } else {
            LOGGER.log(FINE, NO_MANDATORY_OPTIONS_FINE);
        }

        buffer.append(LINE_CHAR);

        if (getAllOptionalActiveOptions().size() > 0) {
            buffer.append(generateOptionsFullUsageDescription(OPTIONAL_OPTIONS_CMD, getAllOptionalActiveOptions()));
        } else {
            LOGGER.log(FINE, NO_OPTIONAL_OPTIONS_FINE);
        }

        buffer.append(LINE_CHAR);
        buffer.append(LINE_CHAR);
        buffer.append(getFullUsageExamples());

        buffer.append(LINE_CHAR);
        buffer.append(LINE_CHAR);
        buffer.append(getKnownBugsOrLimitations());

        return buffer;
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
    public StringBuilder getFullUsageExamples() {
        final StringBuilder buffer = new StringBuilder();

        if (getFullUsageExamplesSet().size() > 0) {
            buffer.append(EXAMPLES_OPTIONS_CMD);
            buffer.append(LINE_CHAR);

            for (final CommandLine commandLineExample : getFullUsageExamplesSet()) {
                buffer.append(LINE_CHAR);
                buffer.append(TAB_CHAR);
                buffer.append(JAVA_JAR_CMD);
                buffer.append(getJarName());
                buffer.append(SPACE_CHAR);
                buffer.append(commandLineExample.getCommandLineArgumentsAsString());
            }

        } else {
            LOGGER.log(FINE, NO_COMMAND_LINE_EXAMPLES_FINE);
        }

        return buffer;
    }

    /**
     * Gets the value of <code>fullUsageExamplesSet</code>.
     *
     * @return the value of <code>fullUsageExamplesSet</code>.
     * @see #setFullUsageExamplesSet(Set)
     * @since 1.3.0
     */
    private Set < CommandLine > getFullUsageExamplesSet() {
        return fullUsageExamplesSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String getJarName() {
        return jarName;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getKnownBugsOrLimitations() {
        final StringBuilder buffer = new StringBuilder();

        if (getKnownBugsOrLimitationsSet().size() > 0) {
            buffer.append(KNOWN_BUGS_OR_LIMITATIONS_CMD);
            buffer.append(LINE_CHAR);

            for (final String knownBugOrLimitation : getKnownBugsOrLimitationsSet()) {
                buffer.append(LINE_CHAR);
                buffer.append(TAB_CHAR);
                buffer.append(knownBugOrLimitation);
            }

        } else {
            LOGGER.log(FINE, NO_KNOWN_BUGS_OR_LIMITATIONS_FINE);
        }

        return buffer;
    }

    /**
     * Gets the value of <code>knownBugsOrLimitationsSet</code>.
     *
     * @return the value of <code>knownBugsOrLimitationsSet</code>.
     * @see #setKnownBugsOrLimitationsSet(Set)
     * @since 1.3.0
     */
    private Set < String > getKnownBugsOrLimitationsSet() {
        return knownBugsOrLimitationsSet;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public List < String > getLicenseNames() {
        return new ArrayList < String >(licenseNames);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public StringBuilder getMainUsage() {
        final StringBuilder buffer = new StringBuilder(getName());
        if (getFullUsageDescription().length() != 0) {
            buffer.append(SPACE_CHAR);
            buffer.append(HYPHEN_CHAR);
            buffer.append(SPACE_CHAR);
            buffer.append(getFullUsageDescription());
        }

        buffer.append(SPACE_CHAR);
        buffer.append(LEFT_PARENTHESIS_CHAR);
        buffer.append(getUrl());
        buffer.append(RIGHT_PARENTHESIS_CHAR);

        buffer.append(LINE_CHAR);
        buffer.append(LINE_CHAR);
        buffer.append(USAGE_CMD);
        buffer.append(LINE_CHAR);
        buffer.append(TAB_CHAR);
        buffer.append(generateMainUsageDescription(getJarName(), getAllMandatoryOptions(),
                getAllOptionalActiveOptions()));
        return buffer;
    }

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
     * Gets the original <code>allOptions</code> attribute, without copying it.
     *
     * @return the value of <code>allOptions</code>.
     * @see #getAllOptions()
     * @since 1.3.0
     */
    private Set < Option > getOriginalAllOptions() {
        return allOptions;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public ProgramVersion getVersion() {
        return version;
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
    public JavaProgramExecution parseCommandLine(final CommandLine commandLine) throws CommandLineException {
        checkNull(commandLine, COMMAND_LINE_NULL_ERROR);

        LOGGER.log(FINE, buildLogString(ANALYSING_COMMAND_LINE_FINE, commandLine));

        JavaProgramExecution programExecution = null;

        final Set < OptionExecution > optionExecutions = new TreeSet < OptionExecution >();
        for (final ExecutableOption executableOption : getAllExecutableOptions(OPTION_STATUS_ACTIVE_SET)) {
            final OptionExecution optionExecution = executableOption.parseCommandLine(commandLine);
            if (optionExecution == null) {
                LOGGER.log(FINE, buildLogString(OPTION_NOT_SPECIFIED_FINE, executableOption));
            } else {
                optionExecutions.add(optionExecution);
            }
        }

        if (optionExecutions.size() > 0) {
            programExecution = createJavaProgramExecution(optionExecutions);
        } else {
            throw new CommandLineException(NO_OPTION_EXECUTIONS_ERROR);
        }

        return programExecution;
    }

    /**
     * Sets the value of <code>allOptions</code>.
     *
     * @param value
     *            the <code>allOptions</code> to set, can be <code>null</code>.
     * @see #getAllOptions()
     * @since 1.3.0
     */
    private void setAllOptions(final Set < Option > value) {
        checkNull(value, OPTIONS_NULL_ERROR);

        allOptions = value;
    }

    /**
     * Sets the value of <code>authors</code>.
     *
     * @param value
     *            the <code>authors</code> to set, can be <code>null</code>.
     * @see #getAuthors()
     * @since 1.3.0
     */
    private void setAuthors(final List < String > value) {
        checkNull(value, PROGRAM_AUTHORS_NULL_ERROR);

        authors = value;
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
     * Sets the value of <code>fullUsageExamplesSet</code>.
     *
     * @param value
     *            the <code>fullUsageExamplesSet</code> to set, can be <code>null</code>.
     * @see #getFullUsageExamplesSet()
     * @since 1.3.0
     */
    private void setFullUsageExamplesSet(final Set < CommandLine > value) {
        checkNull(value, FULL_USAGE_EXAMPLES_NULL_ERROR);

        fullUsageExamplesSet = value;
    }

    /**
     * Sets the value of <code>jarName</code>.
     *
     * @param value
     *            the <code>jarName</code> to set, can be <code>null</code>.
     * @see #getJarName()
     * @since 1.3.0
     */
    private void setJarName(final String value) {
        checkNull(value, PROGRAM_JAR_NAME_NULL_ERROR);

        jarName = value;
    }

    /**
     * Sets the value of <code>knownBugsOrLimitationsSet</code>.
     *
     * @param value
     *            the <code>knownBugsOrLimitationsSet</code> to set, can be <code>null</code>.
     * @see #getKnownBugsOrLimitationsSet()
     * @since 1.3.0
     */
    private void setKnownBugsOrLimitationsSet(final Set < String > value) {
        knownBugsOrLimitationsSet = value;
    }

    /**
     * Sets the value of <code>licenseNames</code>.
     *
     * @param value
     *            the <code>licenseNames</code> to set, can be <code>null</code>.
     * @see #getLicenseNames()
     * @since 1.3.0
     */
    private void setLicenseNames(final List < String > value) {
        checkNull(value, PROGRAM_LICENSES_NULL_ERROR);

        licenseNames = value;
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
        checkNull(value, PROGRAM_NAME_NULL_ERROR);

        name = value;
    }

    /**
     * Sets the value of <code>url</code>.
     *
     * @param value
     *            the <code>url</code> to set, can be <code>null</code>.
     * @see #getUrl()
     * @since 1.3.0
     */
    private void setUrl(final URL value) {
        checkNull(value, PROGRAM_URL_NULL_ERROR);

        url = value;
    }

    /**
     * Sets the value of <code>version</code>.
     *
     * @param value
     *            the <code>version</code> to set, can be <code>null</code>.
     * @see #getVersion()
     * @since 1.3.0
     */
    private void setVersion(final ProgramVersion value) {
        checkNull(value, PROGRAM_VERSION_NULL_ERROR);

        version = value;
    }
}
