/*
 PlantUMLDependencyOutputOption.java
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

package net.sourceforge.plantumldependency.cli.main.option.output;

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.BASE_DIRECTORY_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.DISPLAY_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.EXCLUDE_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.INCLUDE_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.PROGRAMMING_LANGUAGE_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.setLevelOfAllLoggersAndHandlers;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.VERBOSE_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.commoncli.constants.log.FineConstants.OPTION_NOT_SPECIFIED_FINE;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.io.File;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption;
import net.sourceforge.plantumldependency.cli.main.option.display.PlantUMLDependencyDisplayOption;
import net.sourceforge.plantumldependency.cli.main.option.display.argument.Display;
import net.sourceforge.plantumldependency.cli.main.option.exclude.PlantUMLDependencyExcludeOption;
import net.sourceforge.plantumldependency.cli.main.option.include.PlantUMLDependencyIncludeOption;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.file.ExistingOrNotFileOptionArgumentImpl;
import net.sourceforge.plantumldependency.commoncli.option.execution.ExecutableOption;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;
import net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseLevelOption;

import org.apache.tools.ant.types.FileSet;

/**
 * The output option, allowing to specify an output file, processing the input source files and
 * generating the plantUML description. <i>Note : no option should have the same main or secondary
 * names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class PlantUMLDependencyOutputOption extends OutputOption implements ExecutableOption {

    /** Serial version UID. */
    private static final long serialVersionUID = -1629517125349614965L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyOutputOption.class.getName());

    /** The verbose option. */
    private VerboseLevelOption verboseLevelOption;

    /** The programming language option. */
    private PlantUMLDependencyProgrammingLanguageOption programmingLanguageOption;

    /** The include option. */
    private PlantUMLDependencyIncludeOption includeOption;

    /** The exclude option. */
    private PlantUMLDependencyExcludeOption excludeOption;

    /** The display option. */
    private PlantUMLDependencyDisplayOption displayOption;

    /** The base directory option. */
    private PlantUMLDependencyBaseDirectoryOption baseDirOption;

    /** The option priority. */
    private int priority;

    /**
     * Default constructor.
     *
     * @param verboseLvlOpt
     *            the {@link VerboseLevelOption} instance, to display log information, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageOpt
     *            the {@link PlantUMLDependencyProgrammingLanguageOption} instance, to know what is
     *            the programming language to parse, mustn't be <code>null</code>.
     * @param includeOpt
     *            the {@link PlantUMLDependencyIncludeOption} instance, to know input files to
     *            include for parsing, mustn't be <code>null</code>.
     * @param excludeOpt
     *            the {@link PlantUMLDependencyExcludeOption} instance, to know exclude files which
     *            mustn't be parsed, mustn't be <code>null</code>.
     * @param displayOpt
     *            the {@link PlantUMLDependencyDisplayOption} instance, to know which information to
     *            display in the plantUML generated file, mustn't be <code>null</code>.
     * @param baseDirOpt
     *            the {@link PlantUMLDependencyBaseDirectoryOption} instance, to know the base
     *            directory where to look for source files, mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options</i>.
     * @since 1.0.0
     */
    public PlantUMLDependencyOutputOption(final VerboseLevelOption verboseLvlOpt,
            final PlantUMLDependencyProgrammingLanguageOption programmingLanguageOpt,
            final PlantUMLDependencyIncludeOption includeOpt, final PlantUMLDependencyExcludeOption excludeOpt,
            final PlantUMLDependencyDisplayOption displayOpt, final PlantUMLDependencyBaseDirectoryOption baseDirOpt,
            final int optionPriority) {
        super(new ExistingOrNotFileOptionArgumentImpl(true), new StringBuilder(
                "To specify the output file path where to generate the PlantUML description."), SPACE_CHAR,
                ACTIVE_OPTIONAL_OPTION_STATUS);
        setVerboseLevelOption(verboseLvlOpt);
        setProgrammingLanguageOption(programmingLanguageOpt);
        setIncludeOption(includeOpt);
        setExcludeOption(excludeOpt);
        setDisplayOption(displayOpt);
        setBaseDirOption(baseDirOpt);
        setPriority(optionPriority);
    }

    /**
     * Gets the value of <code>baseDirOption</code>.
     *
     * @return the value of <code>baseDirOption</code>.
     * @see #setBaseDirOption(PlantUMLDependencyBaseDirectoryOption)
     * @since 1.0.0
     */
    private PlantUMLDependencyBaseDirectoryOption getBaseDirOption() {
        return baseDirOption;
    }

    /**
     * Gets the value of <code>displayOption</code>.
     *
     * @return the value of <code>displayOption</code>.
     * @see #setDisplayOption(PlantUMLDependencyDisplayOption)
     * @since 1.0.0
     */
    private PlantUMLDependencyDisplayOption getDisplayOption() {
        return displayOption;
    }

    /**
     * Gets the value of <code>excludeOption</code>.
     *
     * @return the value of <code>excludeOption</code>.
     * @see #setExcludeOption(PlantUMLDependencyExcludeOption)
     * @since 1.0.0
     */
    private PlantUMLDependencyExcludeOption getExcludeOption() {
        return excludeOption;
    }

    /**
     * Gets the value of <code>includeOption</code>.
     *
     * @return the value of <code>includeOption</code>.
     * @see #setIncludeOption(PlantUMLDependencyIncludeOption)
     * @since 1.0.0
     */
    private PlantUMLDependencyIncludeOption getIncludeOption() {
        return includeOption;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the value of <code>programmingLanguageOption</code>.
     *
     * @return the value of <code>programmingLanguageOption</code>.
     * @see #setProgrammingLanguageOption(PlantUMLDependencyProgrammingLanguageOption)
     * @since 1.0.0
     */
    private PlantUMLDependencyProgrammingLanguageOption getProgrammingLanguageOption() {
        return programmingLanguageOption;
    }

    /**
     * Gets the value of <code>verboseLevelOption</code>.
     *
     * @return the value of <code>verboseLevelOption</code>.
     * @see #setVerboseLevelOption(VerboseLevelOption)
     * @since 1.0.0
     */
    private VerboseLevelOption getVerboseLevelOption() {
        return verboseLevelOption;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public OptionExecution parseCommandLine(final CommandLine commandLine) throws CommandLineException {
        OptionExecution optionExecution = null;

        final Level verboseLevel = getVerboseLevelOption().findAndParseArgumentOrGetDefaultArgument(commandLine);
        setLevelOfAllLoggersAndHandlers(verboseLevel);

        if (commandLine.isOptionSpecified(this)) {
            final File outputFile = findAndParseArgumentOrGetDefaultArgument(commandLine);
            final String excludes = commandLine.findOptionArgument(getExcludeOption());
            final FileSet includesExcludes = getIncludeOption().findAndParseArgumentOrGetDefaultArgument(commandLine);
            includesExcludes.setExcludes(excludes);
            final File baseDirectory = getBaseDirOption().findAndParseArgumentOrGetDefaultArgument(commandLine);
            includesExcludes.setDir(baseDirectory);
            final Set < Display > displayOptions = getDisplayOption().findAndParseArgumentOrGetDefaultArgument(
                    commandLine);
            final ProgrammingLanguage programmingLanguage = getProgrammingLanguageOption()
                    .findAndParseArgumentOrGetDefaultArgument(commandLine);
            optionExecution = new PlantUMLDependencyOutputOptionExecution(outputFile, programmingLanguage,
                    includesExcludes, displayOptions, getPriority());
        } else {
            LOGGER.log(FINE, buildLogString(OPTION_NOT_SPECIFIED_FINE, getAllNames()));
        }

        return optionExecution;
    }

    /**
     * Sets the value of <code>baseDirOption</code>.
     *
     * @param value
     *            the <code>baseDirOption</code> to set, can be <code>null</code>.
     * @see #getBaseDirOption()
     * @since 1.0.0
     */
    private void setBaseDirOption(final PlantUMLDependencyBaseDirectoryOption value) {
        checkNull(value, BASE_DIRECTORY_OPTION_NULL_ERROR);

        baseDirOption = value;
    }

    /**
     * Sets the value of <code>displayOption</code>.
     *
     * @param value
     *            the <code>displayOption</code> to set, can be <code>null</code>.
     * @see #getDisplayOption()
     * @since 1.0.0
     */
    private void setDisplayOption(final PlantUMLDependencyDisplayOption value) {
        checkNull(value, DISPLAY_OPTION_NULL_ERROR);

        displayOption = value;
    }

    /**
     * Sets the value of <code>excludeOption</code>.
     *
     * @param value
     *            the <code>excludeOption</code> to set, can be <code>null</code>.
     * @see #getExcludeOption()
     * @since 1.0.0
     */
    private void setExcludeOption(final PlantUMLDependencyExcludeOption value) {
        checkNull(value, EXCLUDE_OPTION_NULL_ERROR);

        excludeOption = value;
    }

    /**
     * Sets the value of <code>includeOption</code>.
     *
     * @param value
     *            the <code>includeOption</code> to set, can be <code>null</code>.
     * @see #getIncludeOption()
     * @since 1.0.0
     */
    private void setIncludeOption(final PlantUMLDependencyIncludeOption value) {
        checkNull(value, INCLUDE_OPTION_NULL_ERROR);

        includeOption = value;
    }

    /**
     * Sets the value of <code>priority</code>.
     *
     * @param value
     *            the <code>priority</code> to set.
     * @see #getPriority()
     * @since 1.0.0
     */
    private void setPriority(final int value) {
        priority = value;
    }

    /**
     * Sets the value of <code>programmingLanguageOption</code>.
     *
     * @param value
     *            the <code>programmingLanguageOption</code> to set, can be <code>null</code>.
     * @see #getProgrammingLanguageOption()
     * @since 1.0.0
     */
    private void setProgrammingLanguageOption(final PlantUMLDependencyProgrammingLanguageOption value) {
        checkNull(value, PROGRAMMING_LANGUAGE_OPTION_NULL_ERROR);

        programmingLanguageOption = value;
    }

    /**
     * Sets the value of <code>verboseLevelOption</code>.
     *
     * @param value
     *            the <code>verboseLevelOption</code> to set, can be <code>null</code>.
     * @see #getVerboseLevelOption()
     * @since 1.0.0
     */
    private void setVerboseLevelOption(final VerboseLevelOption value) {
        checkNull(value, VERBOSE_OPTION_NULL_ERROR);

        verboseLevelOption = value;
    }
}
