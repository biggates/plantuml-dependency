/*
 JavaProgram.java
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

package net.sourceforge.plantumldependency.commoncli.program;

import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.Set;

import net.sourceforge.plantumldependency.common.clone.DeepCloneable;
import net.sourceforge.plantumldependency.commoncli.command.CommandLine;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.Option;
import net.sourceforge.plantumldependency.commoncli.option.execution.ExecutableOption;
import net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;
import net.sourceforge.plantumldependency.commoncli.program.version.ProgramVersion;

/**
 * The interface which describes a Java program, its name, its authors, its license and all data
 * which can be useful.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public interface JavaProgram extends Comparable < JavaProgram >, Serializable, DeepCloneable < JavaProgram > {

    /**
     * Adds a program command line example.
     *
     * @param exampleCommandLine
     *            the {@link CommandLine} instance which shows a program command line usage, mustn't
     *            be <code>null</code> and must be valid.
     * @throws CommandLineException
     *             if an example command line can't be correctly parsed and isn't a valid example.
     * @since 1.3.0
     */
    void addExampleCommandLine(CommandLine exampleCommandLine) throws CommandLineException;

    /**
     * Adds a program known bug or limitation.
     *
     * @param bugOrLimitationDescription
     *            the {@link String} describing the program known bug or limitation, mustn't be
     *            <code>null</code> nor empty.
     * @throws CommandLineException
     *             if an example command line can't be correctly parsed and isn't a valid example.
     * @since 1.3.0
     */
    void addKnownBugOrLimitation(String bugOrLimitationDescription) throws CommandLineException;

    /**
     * Adds an option to the program.
     *
     * @param option
     *            the {@link Option} instance to add, mustn't be <code>null</code>.
     * @throws CommandLineException
     *             if the program already has the option, if the option name is duplicated or if the
     *             priority is duplicated.
     * @since 1.3.0
     */
    void addOption(Option option) throws CommandLineException;

    /**
     * Gets all executable options supported by the program.
     *
     * @return the {@link Set} of all {@link ExecutableOption} supported by the program.
     * @since 1.3.0
     */
    Set < ExecutableOption > getAllExecutableOptions();

    /**
     * Gets all executable options supported by the program of the following status.
     *
     * @param status
     *            the option status, telling if the executable options to look for are active,
     *            inactive or hidden, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link ExecutableOption} supported by the program.
     * @since 1.3.0
     */
    Set < ExecutableOption > getAllExecutableOptions(OptionStatus status);

    /**
     * Gets all executable options supported by the program of any status contained in the list.
     *
     * @param statusSet
     *            the option status set, telling if the executable options look for are active,
     *            inactive or hidden, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link ExecutableOption} supported by the program.
     * @since 1.3.0
     */
    Set < ExecutableOption > getAllExecutableOptions(Set < OptionStatus > statusSet);

    /**
     * Gets all mandatory options.
     *
     * @return the {@link Set} of all mandatory {@link Option}.
     * @since 1.3.0
     */
    Set < Option > getAllMandatoryOptions();

    /**
     * Gets all optional options which are considered active, meaning that they can be taken in the
     * command line.
     *
     * @return the {@link Set} of all optional {@link Option}.
     * @since 1.3.0
     */
    Set < Option > getAllOptionalActiveOptions();

    /**
     * Gets all options supported by the program.
     *
     * @return the {@link Set} of all {@link Option} supported by the program.
     * @since 1.3.0
     */
    Set < Option > getAllOptions();

    /**
     * Gets all options supported by the program of the following status.
     *
     * @param status
     *            the option status, telling if the executable options to look for are active,
     *            inactive or hidden, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link Option} supported by the program.
     * @since 1.3.0
     */
    Set < Option > getAllOptions(OptionStatus status);

    /**
     * Gets all options supported by the program of any status contained in the list.
     *
     * @param statusSet
     *            the option status set, telling if the executable options look for are active,
     *            inactive or hidden, mustn't be <code>null</code>.
     * @return the {@link Set} of all {@link Option} supported by the program.
     * @since 1.3.0
     */
    Set < Option > getAllOptions(Set < OptionStatus > statusSet);

    /**
     * Gets the list of program authors.
     * <p>
     * For instance it can be :<br>
     * - <i>Linus Torvalds</i><br>
     * - <i>Elizabeth II</i>
     * </p>
     *
     * @return the {@link List} of all program authors as {@link String}.
     * @since 1.3.0
     */
    List < String > getAuthors();

    /**
     * Gets the program full usage. It is composed of the program title description, the command
     * synopsis, the mandatory active options, active optional options and examples.
     * <p>
     * For instance it can be :<br>
     * <i>PlantUML Dependency - reverse engineering java source files to generate PlantUML
     * description (http://plantuml.sourceforge.net}<br>
     * Usage: <br>
     * java -jar plantuml-dependency.jar -o FILE [OPTIONS]<br>
     * <br>
     * where mandatory options are:<br>
     * -o, --output FILE<br>
     * To output file path where to generate the PlantUML description. If not specified, the default
     * is plantuml-DATE.txt<br>
     * FILE specifies a valid file path, not a directory. It can be absolute or relative.<br>
     * <br>
     * where optional options are:<br>
     * -about, --author, --authors<br>
     * To display information about PlantUML Dependency and its authors.<br>
     * <br>
     * Examples:<br>
     * java -jar plantuml-dependency.jar -h</i>
     * </p>
     *
     * @return the program full usage description as a {@link StringBuilder}, i.e. all explanation
     *         about how the program works and what it does.
     * @since 1.3.0
     */
    StringBuilder getFullUsage();

    /**
     * Gets the program description used in the full usage description. It is a single line
     * description explaining what the program does.
     * <p>
     * For instance it can be :<br>
     * - <i>reverse engineering java source files to generate PlantUML description</i><br>
     * - <i>copy files and directories</i>
     * </p>
     *
     * @return the program description as a {@link StringBuilder} used in the full usage
     *         description.
     * @since 1.3.0
     */
    StringBuilder getFullUsageDescription();

    /**
     * Gets the program examples description used in the full usage description.
     * <p>
     * For instance it can be :<br>
     * - <i>java -jar plantuml-dependency.jar -h</i><br>
     * - <i>java -jar plantuml-dependency.jar -o plantuml.txt -i *Test.java</i>
     * </p>
     *
     * @return the program description as a {@link StringBuilder} used in the full usage
     *         description.
     * @since 1.3.0
     */
    StringBuilder getFullUsageExamples();

    /**
     * Gets the program Jar name.
     * <p>
     * For instance it can be :<br>
     * - <i>Azureus2.jar</i><br>
     * - <i>plantuml.jar</i>
     * </p>
     *
     * @return the program jar name.
     * @since 1.3.0
     */
    String getJarName();

    /**
     * Gets the program known bugs or limitations description used in the full usage description.
     * <p>
     * For instance it can be :<br>
     * - <i>Doesn't work with dates prior to 1900</i><br>
     * - <i>Doesn't manage the UTF-8 encoding</i>
     * </p>
     *
     * @return the program known bugs or limitations description as a {@link StringBuilder} used in
     *         the full usage description.
     * @since 1.3.0
     */
    StringBuilder getKnownBugsOrLimitations();

    /**
     * Gets the list of program licenses.
     * <p>
     * For instance it can be :<br>
     * - <i>GPL v3</i><br>
     * - <i>Apache License</i>
     * </p>
     *
     * @return the {@link List} of all program licenses as {@link String}.
     * @since 1.3.0
     */
    List < String > getLicenseNames();

    /**
     * Gets the program main usage. It is composed of the program title description and the command
     * synopsis. Only active options are shown.
     * <p>
     * For instance it can be :<br>
     * <i>PlantUML Dependency - reverse engineering java source files to generate PlantUML
     * description (http://plantuml.sourceforge.net}<br>
     * <br>
     * Usage: <br>
     * java -jar plantuml-dependency.jar -o FILE [OPTIONS]</i>
     * </p>
     *
     * @return the program main usage description as a {@link StringBuilder}, i.e. the program
     *         description and command synopsis.
     * @since 1.3.0
     */
    StringBuilder getMainUsage();

    /**
     * Gets the program name.
     * <p>
     * For instance it can be :<br>
     * - <i>Azureus</i><br>
     * - <i>PlantUML</i>
     * </p>
     *
     * @return the program name.
     * @since 1.3.0
     */
    String getName();

    /**
     * Gets the program URL.
     * <p>
     * For instance it can be :<br>
     * - <i><a href="http://azureus.sourceforge.net">http://azureus.sourceforge.net</a></i><br>
     * - <i><a href="http://plantuml.sourceforge.net">http://plantuml.sourceforge.net</a></i>
     * </p>
     *
     * @return the program website URL.
     * @since 1.3.0
     */
    URL getUrl();

    /**
     * Gets the program version.
     *
     * @return the {@link ProgramVersion} instance.
     * @since 1.3.0
     */
    ProgramVersion getVersion();

    /**
     * Gets the program execution following the command line.
     *
     * @param commandLine
     *            the {@link CommandLine} instance to parse and to get the execution from, mustn't
     *            be <code>null</code>.
     * @return the {@link JavaProgramExecution} instance following the passed command line in order
     *         to execute the program.
     * @throws CommandLineException
     *             if any error occurs while reading and parsing the command line.
     * @since 1.3.0
     */
    JavaProgramExecution parseCommandLine(final CommandLine commandLine) throws CommandLineException;
}
