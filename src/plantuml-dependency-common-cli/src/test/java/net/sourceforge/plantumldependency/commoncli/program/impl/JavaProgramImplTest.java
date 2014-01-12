/*
 JavaProgramImplTest.java
 Creation date : 6/07/2010
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

import static java.util.Arrays.asList;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.common.utils.url.URLUtils.createURL;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE1;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE11;
import static net.sourceforge.plantumldependency.commoncli.command.impl.CommandLineImplTest.COMMAND_LINE6;
import static net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOptionTest.VERBOSE_OPTION1;
import static net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOptionTest.VERBOSE_OPTION2;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.ACTIVE_MANDATORY_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.HIDDEN_OPTIONAL_OPTION_STATUS;
import static net.sourceforge.plantumldependency.commoncli.option.status.OptionStatus.INACTIVE_OPTIONAL_OPTION_STATUS;
import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import net.sourceforge.plantumldependency.common.ComparableAndDeepCloneableObjectTest;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.impl.about.AboutOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.help.HelpOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.version.VersionOption;
import net.sourceforge.plantumldependency.commoncli.program.JavaProgram;
import net.sourceforge.plantumldependency.commoncli.program.execution.JavaProgramExecution;
import net.sourceforge.plantumldependency.commoncli.program.version.impl.ProgramVersionImpl;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

/**
 * JUnit test classes for {@link JavaProgramImpl}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class JavaProgramImplTest extends ComparableAndDeepCloneableObjectTest < JavaProgramImpl > {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaProgramImplTest.class.getName());

    /** Java program test 1 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM1 = createJavaProgram1();

    /** Java program test 2 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM2 = createJavaProgram2();

    /** Java program test 3 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM3 = createJavaProgram3();

    /** Java program test 4 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM4 = createJavaProgram4();

    /** Java program test 5 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM5 = createJavaProgram5();

    /** Java program test 6 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM6 = createJavaProgram6();

    /** Java program test 7 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM7 = createJavaProgram7();

    /** Java program test 8 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM8 = createJavaProgram8();

    /** Java program test 9 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM9 = createJavaProgram9();

    /** Java program test 10 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM10 = createJavaProgram10();

    /** Java program test 10 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM11 = createJavaProgram1();

    /** Java program test 11 instance. */
    @DataPoint
    public static final JavaProgram JAVA_PROGRAM12 = null;

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram1() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram10() {
        return new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"), "test.jar",
                asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0));
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram2() {
        final JavaProgram javaProgram = new JavaProgramImpl("Cli program",
                createURL("http://plantuml.sourceforge.net"), "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram3() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "mazix.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram4() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"Apache common license v2", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram5() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}), asList(new String[] {
                        "Benjamin Croizet (graffity2199@yahoo.fr)", "Linux Torvalds"}),
                new ProgramVersionImpl(1, 0, 0), new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram6() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 5, 389),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram7() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("Mazix program description"));

        try {
            javaProgram.addOption(new HelpOption(javaProgram, 1));
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram8() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new HelpOption(new StringBuilder("Help test."), javaProgram, 1,
                    ACTIVE_MANDATORY_OPTION_STATUS));
            javaProgram.addExampleCommandLine(COMMAND_LINE1);
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Creates a {@link JavaProgram} test instance.
     *
     * @return a {@link JavaProgram} test instance.
     * @since 1.3.0
     */
    private static JavaProgram createJavaProgram9() {
        final JavaProgram javaProgram = new JavaProgramImpl("Test program", createURL("http://mazix.sourceforge.net"),
                "test.jar", asList(new String[] {"LGPL v3", "GPL v3"}),
                asList(new String[] {"Benjamin Croizet (graffity2199@yahoo.fr)"}), new ProgramVersionImpl(1, 0, 0),
                new StringBuilder("test program description"));

        try {
            javaProgram.addOption(new AboutOption(javaProgram, 1));
            javaProgram.addOption(new OutputOption());
            final VerboseOption verboseOption = new VerboseOption(new StringBuilder("Verbose test."),
                    HIDDEN_OPTIONAL_OPTION_STATUS);
            javaProgram.addOption(verboseOption);
            javaProgram.addOption(new VersionOption(new StringBuilder("Version test."), javaProgram, 2,
                    HIDDEN_OPTIONAL_OPTION_STATUS));
            javaProgram.addOption(new HelpOption(new StringBuilder("Help test."), javaProgram, 3,
                    INACTIVE_OPTIONAL_OPTION_STATUS));
            javaProgram.addKnownBugOrLimitation("Doesn't work with dates prior to 1900");
            javaProgram.addKnownBugOrLimitation("Doesn't manage the UTF-8 encoding");
        } catch (final CommandLineException e) {
            LOGGER.log(SEVERE, e.getMessage(), e);
        }

        return javaProgram;
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#addExampleCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testAddExampleCommandLineWithExecutions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        assertEquals("Examples:\n\n\tjava -jar test.jar -about -h -version -v", javaProgram.getFullUsageExamples()
                .toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#addOption(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testAddOptionWithNoDuplicates() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION1);
        assertEquals(2, javaProgram.getAllOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#addOption(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testAddOptionWithOptionNameDuplicates() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(new HelpOption(javaProgram, 2));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#addOption(net.sourceforge.plantumldependency.commoncli.option.Option)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testAddOptionWithOptionPriorityDuplicates() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(new VersionOption(javaProgram, 1));
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllExecutableOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllExecutableOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(new VersionOption(javaProgram, 2));
        javaProgram.addOption(VERBOSE_OPTION1);
        assertEquals(2, javaProgram.getAllExecutableOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllExecutableOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllExecutableOptionsWithHiddenAndInActiveStatus() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        assertEquals(3, javaProgram.getAllExecutableOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllExecutableOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllExecutableOptionsWithStatus() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        assertEquals(1, javaProgram.getAllExecutableOptions(INACTIVE_OPTIONAL_OPTION_STATUS).size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllMandatoryOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllMandatoryOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(new VersionOption(javaProgram, 2));
        javaProgram.addOption(VERBOSE_OPTION2);
        assertEquals(1, javaProgram.getAllMandatoryOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllOptionalActiveOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllOptionalActiveOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        assertEquals(1, javaProgram.getAllOptionalActiveOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(new VersionOption(javaProgram, 2));
        javaProgram.addOption(VERBOSE_OPTION2);
        assertEquals(3, javaProgram.getAllOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllOptionsWithHiddenAndInActiveStatus() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        assertEquals(5, javaProgram.getAllOptions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAllOptions()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetAllOptionsWithStatus() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        assertEquals(1, javaProgram.getAllOptions(INACTIVE_OPTIONAL_OPTION_STATUS).size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getAuthors()}
     * .
     */
    @Test
    public void testGetAuthors() {
        assertEquals(1, JAVA_PROGRAM1.getAuthors().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsageDescription()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetFullUsageDescription() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        assertEquals("test program description", javaProgram.getFullUsageDescription().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsageExamples()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetFullUsageExamples() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        assertEquals("Examples:\n\n\tjava -jar test.jar -about -h -version -v", javaProgram.getFullUsageExamples()
                .toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsage()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetFullUsageWithNoOptionalOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM8.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        javaProgram.addKnownBugOrLimitation("Doesn't work with dates prior to 1900");
        assertEquals(
                "Test program - test program description (http://mazix.sourceforge.net)\n\nUsage:\n\tjava -jar test.jar -h -v \n\nwhere mandatory options are:\n\n\t-h, --help, -?\n\t\tHelp test.\n\n\t-v, --verbose\n\t\tTo display log information.\n\n\nExamples:\n\n\tjava -jar test.jar -about -h -version -v\n\nKnown bugs or program limitations:\n\n\tDoesn't work with dates prior to 1900",
                javaProgram.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsage()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetFullUsageWithOptionalHiddenAndInactiveOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM9.deepClone();
        javaProgram.addExampleCommandLine(COMMAND_LINE11);
        javaProgram.addKnownBugOrLimitation("Doesn't work with dates prior to 1900");
        assertEquals(
                "Test program - test program description (http://mazix.sourceforge.net)\n\nUsage:\n\tjava -jar test.jar -o FILE [OPTIONS]\n\nwhere mandatory options are:\n\n\t-o, --output FILE\n\t\tTo output file path\n\t\tFILE specifies a valid file path, where the file can exist or not and is not a directory. It can be absolute or relative. If the file already exists, it overrides it.\n\nwhere optional options are:\n\n\t-about, --author, --authors\n\t\tTo display information about Test program, its license and its authors.\n\nExamples:\n\n\tjava -jar test.jar -about -h -o / -v -version\n\nKnown bugs or program limitations:\n\n\tDoesn't manage the UTF-8 encoding\n\tDoesn't work with dates prior to 1900",
                javaProgram.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsage()}
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetFullUsageWithOptionalOptions() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        javaProgram.addKnownBugOrLimitation("Doesn't work with dates prior to 1900");
        assertEquals(
                "Test program - test program description (http://mazix.sourceforge.net)\n\nUsage:\n\tjava -jar test.jar -v [OPTIONS]\n\nwhere mandatory options are:\n\n\t-v, --verbose\n\t\tTo display log information.\n\nwhere optional options are:\n\n\t-h, --help, -?\n\t\tTo display this help message.\n\nExamples:\n\n\tjava -jar test.jar -about -h -version -v\n\nKnown bugs or program limitations:\n\n\tDoesn't work with dates prior to 1900",
                javaProgram.getFullUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getJarName()}
     * .
     */
    @Test
    public void testGetJarName() {
        assertEquals("test.jar", JAVA_PROGRAM1.getJarName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getFullUsageExamples()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetKnownBugsOrLimitations() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addKnownBugOrLimitation("Doesn't work with dates prior to 1900");
        javaProgram.addKnownBugOrLimitation("Doesn't manage the UTF-8 encoding");
        assertEquals(
                "Known bugs or program limitations:\n\n\tDoesn't manage the UTF-8 encoding\n\tDoesn't work with dates prior to 1900",
                javaProgram.getKnownBugsOrLimitations().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getLicenseNames()}
     * .
     */
    @Test
    public void testGetLicenseNames() {
        assertEquals(2, JAVA_PROGRAM1.getLicenseNames().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getMainUsage()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetMainUsage() throws CommandLineException {
        final JavaProgram javaProgram = JAVA_PROGRAM1.deepClone();
        javaProgram.addOption(VERBOSE_OPTION2);
        javaProgram.addExampleCommandLine(COMMAND_LINE1);
        assertEquals(
                "Test program - test program description (http://mazix.sourceforge.net)\n\nUsage:\n\tjava -jar test.jar -v [OPTIONS]",
                javaProgram.getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getMainUsage()}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testGetMainUsageWithEmptyDescription() throws CommandLineException {
        assertEquals("Test program (http://mazix.sourceforge.net)\n\nUsage:\n\tjava -jar test.jar ", JAVA_PROGRAM10
                .getMainUsage().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals("Test program", JAVA_PROGRAM1.getName());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getUrl()}.
     */
    @Test
    public void testGetUrl() {
        assertEquals("http://mazix.sourceforge.net", JAVA_PROGRAM1.getUrl().toString());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#getVersion()}
     * .
     */
    @Test
    public void testGetVersion() {
        assertEquals(new ProgramVersionImpl(1, 0, 0, JAVA_PROGRAM1.getVersion().getCompilationTime()),
                JAVA_PROGRAM1.getVersion());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithExecutions() throws CommandLineException {
        final JavaProgramExecution javaProgramExecution = JAVA_PROGRAM1.parseCommandLine(COMMAND_LINE1);
        assertEquals(1, javaProgramExecution.getOptionExecutions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test
    public void testParseCommandLineWithHiddenAndInactiveExecutions() throws CommandLineException {
        final JavaProgramExecution javaProgramExecution = JAVA_PROGRAM9.parseCommandLine(COMMAND_LINE11);
        assertEquals(2, javaProgramExecution.getOptionExecutions().size());
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.program.impl.JavaProgramImpl#parseCommandLine(net.sourceforge.plantumldependency.commoncli.command.CommandLine)}
     * .
     *
     * @throws CommandLineException
     */
    @Test(expected = CommandLineException.class)
    public void testParseCommandLineWithNoExecutions() throws CommandLineException {
        JAVA_PROGRAM1.parseCommandLine(COMMAND_LINE6);
    }
}
