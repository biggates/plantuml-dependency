/*
 PlantUMLDependencyIncludeOption.java
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

package net.sourceforge.plantumldependency.cli.main.option.include;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.DEFAULT_INCLUDE_OPTIONS;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.PROGRAMMING_LANGUAGE_OPTION_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption.DEFAULT_PROGRAMMING_LANGUAGE;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_OPTIONAL_OPTION_STATUS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.AbstractOptionWithArgument;
import net.sourceforge.plantumldependency.commoncli.option.argument.impl.filepattern.IncludeFilePatternOptionArgumentImpl;

import org.apache.tools.ant.types.FileSet;

/**
 * The include option, allowing to specify an include file pattern, like ANT. <i>Note : no option
 * should have the same main or secondary names</i>.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public class PlantUMLDependencyIncludeOption extends AbstractOptionWithArgument < FileSet > {

    /** Serial version UID. */
    private static final long serialVersionUID = -7573306659605231967L;

    /** Option main synopsis. */
    public static final String OPTION_MAIN_SYNOPSIS = "-i";

    /** Option synopsis alias. */
    public static final Set < String > OPTION_SYNOPSIS = unmodifiableSet(new TreeSet < String >(
            asList(new String[] {"--include"})));

    /** The programming language option. */
    private PlantUMLDependencyProgrammingLanguageOption programmingLanguageOption;

    /**
     * Default constructor.
     *
     * @param programmingLanguageOpt
     *            the {@link PlantUMLDependencyProgrammingLanguageOption} instance, to know what is
     *            the programming language to parse, mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public PlantUMLDependencyIncludeOption(final PlantUMLDependencyProgrammingLanguageOption programmingLanguageOpt) {
        super(OPTION_MAIN_SYNOPSIS, OPTION_SYNOPSIS, new IncludeFilePatternOptionArgumentImpl(true), new StringBuilder(
                "To include files that match the provided pattern. If not specified, the default pattern is \"**/*."
                        + DEFAULT_PROGRAMMING_LANGUAGE.getName() + "\"."), SPACE_CHAR, ACTIVE_OPTIONAL_OPTION_STATUS);
        setProgrammingLanguageOption(programmingLanguageOpt);
        // FIXME to uncomment if the PlantUMLDependencyProgrammingLanguageOption passes to ACTIVE
        // (not
        // HIDDEN)
        // super(
        // OPTION_MAIN_SYNOPSIS,
        // OPTION_SYNOPSIS,
        // new IncludeFilePatternOptionArgumentImpl(true),
        // new StringBuilder(
        // "To include files that match the provided pattern. If not specified, the default pattern is \"**/*.PROGRAMMING_LANGUAGE_FILE_EXTENSION\" depending on the programming language chosen (only \""
        // + DEFAULT_PROGRAMMING_LANGUAGE.getName() + "\" is supported by now)."), SPACE_CHAR,
        // ACTIVE_OPTIONAL_OPTION_STATUS);
        // setProgrammingLanguageOption(programmingLanguageOpt);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionNotSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_INCLUDE_OPTIONS
                + getProgrammingLanguageOption().findAndParseArgumentOrGetDefaultArgument(commandLine).getName();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String getDefaultArgumentAsStringIfOptionSpecified(final CommandLine commandLine)
            throws CommandLineException {
        return DEFAULT_INCLUDE_OPTIONS
                + getProgrammingLanguageOption().findAndParseArgumentOrGetDefaultArgument(commandLine).getName();
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
}
