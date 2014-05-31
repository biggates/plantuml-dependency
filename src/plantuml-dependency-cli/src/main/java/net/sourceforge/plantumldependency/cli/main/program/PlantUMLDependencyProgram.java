/*
 PlantUMLDependencyProgram.java
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

package net.sourceforge.plantumldependency.cli.main.program;

import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.LOGGING_PROPERTIES_PATH;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.PLANTUML_DEPENDENCY_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.InfoConstants.EXECUTION_TIME_INFO;
import static net.sourceforge.plantumldependency.cli.constants.log.InfoConstants.PLANTUML_DEPENDENCY_ARGUMENTS_INFO;
import static net.sourceforge.plantumldependency.cli.constants.log.InfoConstants.STARTING_PLANTUML_DEPENDENCY_INFO;
import static net.sourceforge.plantumldependency.cli.main.program.generated.PlantUMLDependencyProgramVersionImpl.PROGRAM_BUILD_TIME;
import static net.sourceforge.plantumldependency.cli.main.program.generated.PlantUMLDependencyProgramVersionImpl.PROGRAM_VERSION;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static net.sourceforge.plantumldependency.commoncli.constants.CommandLineConstants.PROTECTED_DOT_REGEXP;
import static net.sourceforge.plantumldependency.commoncli.utils.version.ProgramVersionUtils.createProgramVersionFromString;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption;
import net.sourceforge.plantumldependency.cli.main.option.display.name.PlantUMLDependencyDisplayNameOption;
import net.sourceforge.plantumldependency.cli.main.option.display.packagename.PlantUMLDependencyDisplayPackageNameOption;
import net.sourceforge.plantumldependency.cli.main.option.display.type.PlantUMLDependencyDisplayTypeOption;
import net.sourceforge.plantumldependency.cli.main.option.exclude.PlantUMLDependencyExcludeOption;
import net.sourceforge.plantumldependency.cli.main.option.include.PlantUMLDependencyIncludeOption;
import net.sourceforge.plantumldependency.cli.main.option.output.PlantUMLDependencyOutputOption;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;
import net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImpl;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.impl.about.AboutOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseLevelOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.version.VersionOption;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;
import net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;

/**
 * The PlantUML dependency {@link JavaProgram} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.4.0
 */
public final class PlantUMLDependencyProgram extends JavaProgramImpl {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyProgram.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = 8055066636525797910L;

    /** The Maven build timestamp pattern. */
    private static final String MAVEN_BUILD_TIMESTAMP_PATTERN = "yyyyMMdd-HHmm";

    /**
     * The PlantUML Dependency program entry point. Note that this method take an internal logging
     * file and should be used only when the program is used as a stand alone application. If you
     * call PlantUML Dependency from an other Java program, you should use the
     * {@link #processProgramArguments(String[])} method.
     *
     * @param args
     *            command line arguments.
     * @throws PlantUMLDependencyException
     *             if any error occurs when running PlantUML Dependency.
     * @since 1.0.0
     */
    public static void main(final String[] args) throws PlantUMLDependencyException {
        try {
            readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                    PlantUMLDependencyProgram.class);
            processProgramArguments(args);
        } catch (final PlantUMLDependencyException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
            throw e;
        } catch (final IOException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        }
    }

    /**
     * The PlantUML Dependency program entry point from command line arguments.
     *
     * @param args
     *            command line arguments.
     * @throws PlantUMLDependencyException
     *             if any error occurs when running PlantUML Dependency.
     * @since 1.1.1
     */
    public static void processProgramArguments(final String[] args) throws PlantUMLDependencyException {
        final long start = currentTimeMillis();
        LOGGER.log(INFO, STARTING_PLANTUML_DEPENDENCY_INFO);
        LOGGER.log(INFO, buildLogString(PLANTUML_DEPENDENCY_ARGUMENTS_INFO, Arrays.toString(args)));

        try {
            final JavaProgram plantumlDependencyProgram = new PlantUMLDependencyProgram();
            final JavaProgramExecution plantumlDependencyProgramExecution = plantumlDependencyProgram
                    .parseCommandLine(new CommandLineImpl(args));
            plantumlDependencyProgramExecution.execute();
        } catch (final CommandLineException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        } catch (final ParseException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        } catch (final IOException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        }

        LOGGER.log(INFO, buildLogString(EXECUTION_TIME_INFO, currentTimeMillis() - start));
    }

    /**
     * Default constructor.
     *
     * @throws MalformedURLException
     *             if the program URL doesn't have a good format.
     * @throws CommandLineException
     *             if any exception occurs while creating the program.
     * @throws ParseException
     *             if the program versio and the program date can't be properly parsed.
     * @since 1.2.0
     */
    public PlantUMLDependencyProgram() throws MalformedURLException, CommandLineException, ParseException {
        this(createProgramVersionFromString(PROGRAM_VERSION, PROTECTED_DOT_REGEXP, PROGRAM_BUILD_TIME,
                MAVEN_BUILD_TIMESTAMP_PATTERN));
    }

    /**
     * Default constructor.
     *
     * @param programVersion
     *            the current {@link ProgramVersion}, mustn't be <code>null</code>.
     *
     * @throws MalformedURLException
     *             if the program URL doesn't have a good format.
     * @throws CommandLineException
     *             if any exception occurs while creating the program.
     * @since 1.0.0
     */
    private PlantUMLDependencyProgram(final ProgramVersion programVersion) throws MalformedURLException,
            CommandLineException {
        super("PlantUML Dependency", new URL("http://plantuml-depend.sourceforge.net"), "plantuml-dependency-cli-"
                + programVersion.getFullVersionNumber() + ".jar", asList(new String[] {
                "GPL v3, 29 June 2007 (http://www.gnu.org/licenses/gpl-3.0.txt)",
                "LGPL v3, 29 June 2007 (http://www.gnu.org/licenses/lgpl-3.0.txt)"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), programVersion, new StringBuilder(
                        "reverse engineering java source files to generate PlantUML description"));

        final VerboseLevelOption verboseLevelOption = new VerboseLevelOption();
        addOption(verboseLevelOption);

        final AboutOption aboutOption = new AboutOption(this, 2);
        addOption(aboutOption);

        final HelpOption helpOption = new HelpOption(this, 1);
        addOption(helpOption);

        final VersionOption versionOption = new VersionOption(this, 3);
        addOption(versionOption);

        final PlantUMLDependencyDisplayTypeOption displayTypeOption = new PlantUMLDependencyDisplayTypeOption();
        addOption(displayTypeOption);

        final PlantUMLDependencyDisplayNameOption displayNameOption = new PlantUMLDependencyDisplayNameOption();
        addOption(displayNameOption);

        final PlantUMLDependencyDisplayPackageNameOption displayPackageNameOption = new PlantUMLDependencyDisplayPackageNameOption();
        addOption(displayPackageNameOption);

        final PlantUMLDependencyProgrammingLanguageOption programmingLanguageOption = new PlantUMLDependencyProgrammingLanguageOption();
        addOption(programmingLanguageOption);

        final PlantUMLDependencyIncludeOption includeOption = new PlantUMLDependencyIncludeOption(
                programmingLanguageOption);
        addOption(includeOption);

        final PlantUMLDependencyExcludeOption excludeOption = new PlantUMLDependencyExcludeOption();
        addOption(excludeOption);

        final PlantUMLDependencyBaseDirectoryOption baseDirectoryOption = new PlantUMLDependencyBaseDirectoryOption();
        addOption(baseDirectoryOption);

        final PlantUMLDependencyOutputOption outputOption = new PlantUMLDependencyOutputOption(verboseLevelOption,
                programmingLanguageOption, includeOption, excludeOption, displayTypeOption, baseDirectoryOption, 4);
        addOption(outputOption);

        final String[] example1 = new String[] {helpOption.getName()};
        final String[] example2 = new String[] {versionOption.getName(), verboseLevelOption.getName()};
        final String[] example3 = new String[] {outputOption.getName(), "myoutput.txt", baseDirectoryOption.getName(),
                "\"C:\\Users\\PlantUML test\"", includeOption.getName(), "**/*Test.java"};
        final String[] example4 = new String[] {outputOption.getName(), "/home/test/plantuml.txt", "-b", DOT_CHAR,
                includeOption.getName(), "**/*.java", excludeOption.getName(), "**/*Test*.java",
                displayTypeOption.getName(), "implementations,interfaces,extensions,imports,static_imports"};
        final String[] example5 = new String[] {outputOption.getName(), "/home/test/plantuml.txt", "-b", DOT_CHAR,
                includeOption.getName(), "**/*.java", excludeOption.getName(), "**/*Test*.java",
                displayNameOption.getName(), "Test", verboseLevelOption.getName()};
        final String[] example6 = new String[] {outputOption.getName(), "/home/test/plantuml.txt", "-b", DOT_CHAR,
                displayPackageNameOption.getName(), "net.sourceforge.plantumldependency.cli.main.*",
                verboseLevelOption.getName(), verboseLevelOption.getName()};
        addExampleCommandLine(new CommandLineImpl(example1));
        addExampleCommandLine(new CommandLineImpl(example2));
        addExampleCommandLine(new CommandLineImpl(example3));
        addExampleCommandLine(new CommandLineImpl(example4));
        addExampleCommandLine(new CommandLineImpl(example5));
        addExampleCommandLine(new CommandLineImpl(example6));

        addKnownBugOrLimitation("- As PlantUML Dependency reads source files imports, it will generate object - imports relation even if the imports are not used within the object (usually, this raises a warning within the IDE)");
        addKnownBugOrLimitation("- Be careful, in order to correctly parse source files, it is better to have source code which compiles without any errors");
        addKnownBugOrLimitation("- Generated annotations (if used) are only supported by PlantUML 7972 and above");
        addKnownBugOrLimitation("- Import instructions \"import package_name.*\" are ignored because the dependencies are not explicitly defined, use precise imports instead");
        addKnownBugOrLimitation("- Links between dependencies are found out by parsing \"import\" instructions, so PlantUML Dependency won't display dependencies which are called using their full names in the source code");
        addKnownBugOrLimitation("- PlantUML Dependency can be run by JRE 1.6+");
        addKnownBugOrLimitation("- PlantUML Dependency is fully compliant up to Java 1.6 source files (and may work with Java 1.7 source files)");
        addKnownBugOrLimitation("- The generated output file is better when PlantUML Dependency is launched with a JRE matching the parsed source files");
    }
}
