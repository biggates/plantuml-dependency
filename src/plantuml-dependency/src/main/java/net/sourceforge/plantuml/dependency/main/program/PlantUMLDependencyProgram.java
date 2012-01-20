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

package net.sourceforge.plantuml.dependency.main.program;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.getProperty;
import static java.util.Arrays.asList;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.cli.utils.version.ProgramVersionUtils.createProgramVersionFromPropertiesFileWithinClassClassloader;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.utils.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.LOGGING_PROPERTIES_PATH;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.VERSION_PROPERTIES_PATH;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.PLANTUML_DEPENDENCY_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.EXECUTION_TIME_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.PLANTUML_DEPENDENCY_ARGUMENTS_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.STARTING_PLANTUML_DEPENDENCY_INFO;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Logger;

import net.sourceforge.mazix.cli.command.impl.CommandLineImpl;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.exception.MissingPropertyException;
import net.sourceforge.mazix.cli.option.impl.about.AboutOption;
import net.sourceforge.mazix.cli.option.impl.help.HelpOption;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseLevelOption;
import net.sourceforge.mazix.cli.option.impl.version.VersionOption;
import net.sourceforge.mazix.cli.program.JavaProgram;
import net.sourceforge.mazix.cli.program.execution.JavaProgramExecution;
import net.sourceforge.mazix.cli.program.impl.JavaProgramImpl;
import net.sourceforge.mazix.cli.program.version.ProgramVersion;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption;
import net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOption;
import net.sourceforge.plantuml.dependency.main.option.exclude.PlantUMLDependencyExcludeOption;
import net.sourceforge.plantuml.dependency.main.option.include.PlantUMLDependencyIncludeOption;
import net.sourceforge.plantuml.dependency.main.option.output.PlantUMLDependencyOutputOption;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;

/**
 * The PlantUML dependency {@link JavaProgram} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.0
 */
public final class PlantUMLDependencyProgram extends JavaProgramImpl {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyProgram.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = 8055066636525797910L;

    /**
     * The PlantUML Dependency program entry point. Note that this method take an internal logging
     * file and should be used only when the program is used as a stand alone application. If you
     * call PlantUML Dependency from an other Java program, you should use the
     * {@link #process(String[])} method.
     *
     * @param args
     *            command line arguments.
     * @throws PlantUMLDependencyException
     *             if any error occurs when running PlantUML Dependency.
     * @since 1.0
     */
    public static void main(final String[] args) throws PlantUMLDependencyException {
        try {
            readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                    PlantUMLDependencyProgram.class);
            process(args);
        } catch (final PlantUMLDependencyException e) {
            LOGGER.log(SEVERE, e.getMessage());
            throw e;
        } catch (final IOException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        }
    }

    /**
     * The PlantUML Dependency program entry point.
     *
     * @param args
     *            command line arguments.
     * @throws PlantUMLDependencyException
     *             if any error occurs when running PlantUML Dependency.
     * @since 1.1.1
     */
    public static void process(final String[] args) throws PlantUMLDependencyException {
        final long start = currentTimeMillis();
        LOGGER.info(STARTING_PLANTUML_DEPENDENCY_INFO);
        LOGGER.info(buildLogString(PLANTUML_DEPENDENCY_ARGUMENTS_INFO, Arrays.toString(args)));

        try {
            final ProgramVersion programVersion = createProgramVersionFromPropertiesFileWithinClassClassloader(
                    VERSION_PROPERTIES_PATH, PlantUMLDependencyProgram.class);
            final JavaProgram plantumlDependencyProgram = new PlantUMLDependencyProgram(programVersion);
            final JavaProgramExecution plantumlDependencyProgramExecution = plantumlDependencyProgram
                    .parseCommandLine(new CommandLineImpl(args));
            plantumlDependencyProgramExecution.execute();
        } catch (final CommandLineException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        } catch (final ParseException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        } catch (final MissingPropertyException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        } catch (final IOException e) {
            throw new PlantUMLDependencyException(PLANTUML_DEPENDENCY_ERROR, e);
        }

        LOGGER.info(buildLogString(EXECUTION_TIME_INFO, (currentTimeMillis() - start)));
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
     *
     * @since 1.0
     */
    public PlantUMLDependencyProgram(final ProgramVersion programVersion) throws MalformedURLException,
            CommandLineException {
        super("PlantUML Dependency", new URL("http://plantuml-depend.sourceforge.net"), "plantuml-dependency-"
                + programVersion.getFullVersionNumber() + ".jar", asList(new String[] {"GPL v3", "LGPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), programVersion, new StringBuffer(
                        "reverse engineering java source files to generate PlantUML description"));

        final VerboseLevelOption verboseLevelOption = new VerboseLevelOption();
        addOption(verboseLevelOption);

        final AboutOption aboutOption = new AboutOption(this, 2);
        addOption(aboutOption);

        final HelpOption helpOption = new HelpOption(this, 1);
        addOption(helpOption);

        final VersionOption versionOption = new VersionOption(this, 3);
        addOption(versionOption);

        final PlantUMLDependencyDisplayOption displayOption = new PlantUMLDependencyDisplayOption();
        addOption(displayOption);

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
                programmingLanguageOption, includeOption, excludeOption, displayOption, baseDirectoryOption, 4);
        addOption(outputOption);

        final String[] example1 = new String[] {helpOption.getName()};
        final String[] example2 = new String[] {versionOption.getName(), verboseLevelOption.getName()};
        final String[] example3 = new String[] {outputOption.getName(), "plantuml.txt", baseDirectoryOption.getName(),
                getProperty("user.dir"), includeOption.getName(), "**/*Test.java"};
        final String[] example4 = new String[] {outputOption.getName(), "/home/test/plantuml.txt", "-b", DOT_CHAR,
                includeOption.getName(), "**/*.java", excludeOption.getName(), "**/*Test*.java",
                displayOption.getName(), "abstract_classes,interfaces", verboseLevelOption.getName()};
        addExampleCommandLine(new CommandLineImpl(example1));
        addExampleCommandLine(new CommandLineImpl(example2));
        addExampleCommandLine(new CommandLineImpl(example3));
        addExampleCommandLine(new CommandLineImpl(example4));

        addKnownBugOrLimitation("- Be careful, in order to correctly parse source files, they must compile without any errors");
        addKnownBugOrLimitation("- Import instructions \"import package_name.*\" are ignored because the dependencies are not explicitly defined, use precise imports instead");
        addKnownBugOrLimitation("- Links between dependencies are found out by parsing \"import\" instructions, so PlantUML Dependency won't display dependencies which are called using their full names in the source code");
    }
}
