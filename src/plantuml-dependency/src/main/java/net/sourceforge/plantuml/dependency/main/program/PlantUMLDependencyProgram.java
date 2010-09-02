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

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sourceforge.mazix.cli.command.impl.CommandLineImpl;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.impl.about.AboutOption;
import net.sourceforge.mazix.cli.option.impl.help.HelpOption;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseOption;
import net.sourceforge.mazix.cli.option.impl.version.VersionOption;
import net.sourceforge.mazix.cli.program.JavaProgram;
import net.sourceforge.mazix.cli.program.execution.JavaProgramExecution;
import net.sourceforge.mazix.cli.program.impl.JavaProgramImpl;
import net.sourceforge.mazix.cli.program.version.ProgramVersion;
import net.sourceforge.mazix.cli.program.version.impl.ProgramVersionImpl;
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
 * @version 1.0
 */
public final class PlantUMLDependencyProgram {

    /** Serial version UID. */
    private static final long serialVersionUID = 8055066636525797910L;

    /**
     * Initializes and creates the {@link JavaProgram} instance which contain all program
     * information.
     * 
     * @return the {@link JavaProgram} instance.
     * @throws MalformedURLException
     *             if the program URL doesn't have a good format.
     * @since 1.0
     */
    private static JavaProgram createProgramInformation() throws MalformedURLException {
        final String programName = "PlantUML Dependency";
        final String programJarName = "plantuml-dependency.jar";
        final URL programURL = new URL("http://plantuml-depend.sourceforge.net");
        final String programDescription = "reverse engineering java source files to generate PlantUML description";
        final List < String > programLicenses = new ArrayList < String >();
        programLicenses.add("GPL v3");
        programLicenses.add("LGPL v3");
        final List < String > programAuthors = new ArrayList < String >();
        programAuthors.add("Benjamin Croizet (graffity2199@yahoo.fr)");
        final ProgramVersion programVersion = new ProgramVersionImpl(1, 0, 0, new Date());
        return new JavaProgramImpl(programName, programURL, programJarName, programLicenses, programAuthors,
                programVersion, new StringBuffer(programDescription));
    }

    /**
     * The PlantUML dependency program entry point.
     * 
     * @param args
     *            command line arguments.
     * @throws MalformedURLException
     *             if the program URL doesn't have a good format.
     * @throws CommandLineException
     *             if any command line exception occurs.
     * @since 1.0
     */
    public static void main(final String[] args) throws MalformedURLException, CommandLineException {
        final JavaProgram plantumlDependencyProgram = createProgramInformation();

        final VerboseOption verboseOption = new VerboseOption();
        plantumlDependencyProgram.addOption(verboseOption);

        final AboutOption aboutOption = new AboutOption(plantumlDependencyProgram, 2);
        plantumlDependencyProgram.addOption(aboutOption);

        final HelpOption helpOption = new HelpOption(plantumlDependencyProgram, 1);
        plantumlDependencyProgram.addOption(helpOption);

        final VersionOption versionOption = new VersionOption(plantumlDependencyProgram, verboseOption, 3);
        plantumlDependencyProgram.addOption(versionOption);

        final PlantUMLDependencyDisplayOption displayOption = new PlantUMLDependencyDisplayOption();
        plantumlDependencyProgram.addOption(displayOption);

        final PlantUMLDependencyProgrammingLanguageOption programmingLanguageOption = new PlantUMLDependencyProgrammingLanguageOption();
        plantumlDependencyProgram.addOption(programmingLanguageOption);

        final PlantUMLDependencyIncludeOption includeOption = new PlantUMLDependencyIncludeOption(
                programmingLanguageOption);
        plantumlDependencyProgram.addOption(includeOption);

        final PlantUMLDependencyExcludeOption excludeOption = new PlantUMLDependencyExcludeOption();
        plantumlDependencyProgram.addOption(excludeOption);

        final PlantUMLDependencyBaseDirectoryOption baseDirectoryOption = new PlantUMLDependencyBaseDirectoryOption();
        plantumlDependencyProgram.addOption(baseDirectoryOption);

        final PlantUMLDependencyOutputOption outputOption = new PlantUMLDependencyOutputOption(verboseOption,
                programmingLanguageOption, includeOption, excludeOption, displayOption, baseDirectoryOption, 4);
        plantumlDependencyProgram.addOption(outputOption);

        final String[] example2 = new String[] {helpOption.getName()};
        final String[] example1 = new String[] {versionOption.getName(), verboseOption.getName()};
        final String[] example3 = new String[] {outputOption.getName(), "plantuml.txt", includeOption.getName(),
                "**/*Test.java"};
        final String[] example4 = new String[] {outputOption.getName(), "/home/test/plantuml.txt", "-b", DOT_CHAR,
                includeOption.getName(), "**/*.java", excludeOption.getName(), "**/*Test*.java",
                displayOption.getName(), "only_packages,interfaces", verboseOption.getName()};
        plantumlDependencyProgram.addExampleCommandLine(new CommandLineImpl(example1));
        plantumlDependencyProgram.addExampleCommandLine(new CommandLineImpl(example2));
        plantumlDependencyProgram.addExampleCommandLine(new CommandLineImpl(example3));
        plantumlDependencyProgram.addExampleCommandLine(new CommandLineImpl(example4));
        
        plantumlDependencyProgram.addKnownBugOrLimitation("Be careful, in order to correctly parse source files, they must compile without any errors");

        final JavaProgramExecution plantumlDependencyProgramExecution = plantumlDependencyProgram
                .parseCommandLine(new CommandLineImpl(args));
        plantumlDependencyProgramExecution.execute();
    }

    /**
     * Private constructor to prevent from instantiation.
     * 
     * @since 1.0
     */
    private PlantUMLDependencyProgram() {
        super();
    }
}
