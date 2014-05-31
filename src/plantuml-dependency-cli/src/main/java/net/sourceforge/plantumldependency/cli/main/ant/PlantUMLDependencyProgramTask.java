/*
 PlantUMLDependencyProgramTask.java
 Creation date : 15/06/2011
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

package net.sourceforge.plantumldependency.cli.main.ant;

import static net.sourceforge.plantumldependency.cli.main.program.PlantUMLDependencyProgram.processProgramArguments;
import static net.sourceforge.plantumldependency.common.utils.exception.ExceptionUtils.getStackTraceAsString;
import static net.sourceforge.plantumldependency.common.utils.map.MapUtils.putNonEmptyStringToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption;
import net.sourceforge.plantumldependency.cli.main.option.display.type.PlantUMLDependencyDisplayTypeOption;
import net.sourceforge.plantumldependency.cli.main.option.exclude.PlantUMLDependencyExcludeOption;
import net.sourceforge.plantumldependency.cli.main.option.include.PlantUMLDependencyIncludeOption;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.output.OutputOption;
import net.sourceforge.plantumldependency.commoncli.option.impl.verbose.VerboseLevelOption;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * The PlantUML dependency <a href="http://ant.apache.org"><b>Ant</b></a> {@link Task}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.1.0
 * @version 1.4.0
 */
public class PlantUMLDependencyProgramTask extends Task {

    /**
     * Creates the array of {@link String} arguments to call PlantUML Dependency.
     *
     * @param argumentsMap
     *            the {@link Map} of arguments taken from the Ant build file. The {@link Map}
     *            perfectly matches the PlantUML Dependency command line arguments, with argument
     *            main synopsis as keys, and their associated value, mustn't be <code>null</code>.
     * @return the array of {@link String} containing PlantUML Dependency command line arguments.
     * @since 1.1.0
     */
    private static String[] createArgs(final Map < String, String > argumentsMap) {

        final List < String > argsList = new ArrayList < String >();

        for (final Map.Entry < String, String > argument : argumentsMap.entrySet()) {
            final String argumentSynopsis = argument.getKey();
            final String argumentValue = argument.getValue();
            argsList.add(argumentSynopsis);
            argsList.add(argumentValue);
        }

        return argsList.toArray(new String[argsList.size()]);
    }

    /**
     * The {@link Map} of arguments taken from the Ant build file. The {@link Map} perfectly matches
     * the PlantUML Dependency command line arguments, with argument main synopsis as keys, and
     * their associated value.
     */
    private final Map < String, String > argsMap = new HashMap < String, String >();

    /**
     * {@inheritDoc}
     *
     * @since 1.1.0
     */
    @Override
    public void execute() {
        try {
            final String[] args = createArgs(getArgsMap());
            processProgramArguments(args);
        } catch (final PlantUMLDependencyException e) {
            log(getStackTraceAsString(e));
            throw new BuildException(e);
        }
    }

    /**
     * Gets the value of <code>argsMap</code>.
     *
     * @return the value of <code>argsMap</code>.
     * @see #setArgsMap(Map)
     * @since 1.1.0
     */
    private Map < String, String > getArgsMap() {
        return argsMap;
    }

    /**
     * Gets the value of <code>baseDir</code>.
     *
     * @return the value of <code>baseDir</code>.
     * @see #setBaseDir(String)
     * @since 1.1.0
     */
    public String getBaseDir() {
        return getArgsMap().get(PlantUMLDependencyBaseDirectoryOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>display</code>.
     *
     * @return the value of <code>display</code>.
     * @see #setDisplayType(String)
     * @since 1.1.0
     */
    public String getDisplayType() {
        return getArgsMap().get(PlantUMLDependencyDisplayTypeOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>excludes</code>.
     *
     * @return the value of <code>excludes</code>.
     * @see #setExcludes(String)
     * @since 1.1.0
     */
    public String getExcludes() {
        return getArgsMap().get(PlantUMLDependencyExcludeOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>includes</code>.
     *
     * @return the value of <code>includes</code>.
     * @see #setIncludes(String)
     * @since 1.1.0
     */
    public String getIncludes() {
        return getArgsMap().get(PlantUMLDependencyIncludeOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>output</code>.
     *
     * @return the value of <code>output</code>.
     * @see #setOutput(String)
     * @since 1.1.0
     */
    public String getOutput() {
        return getArgsMap().get(OutputOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>programmingLanguage</code>.
     *
     * @return the value of <code>programmingLanguage</code>.
     * @see #setProgrammingLanguage(String)
     * @since 1.1.0
     */
    public String getProgrammingLanguage() {
        return getArgsMap().get(PlantUMLDependencyProgrammingLanguageOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Gets the value of <code>verboseLevel</code>.
     *
     * @return the value of <code>verboseLevel</code>.
     * @see #setVerboseLevel(String)
     * @since 1.1.0
     */
    public String getVerboseLevel() {
        return getArgsMap().get(VerboseLevelOption.OPTION_MAIN_SYNOPSIS);
    }

    /**
     * Sets the value of <code>baseDir</code>.
     *
     * @param value
     *            the <code>baseDir</code> to set, can be <code>null</code>.
     * @see #getBaseDir()
     * @since 1.1.0
     */
    public void setBaseDir(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyBaseDirectoryOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>display</code>.
     *
     * @param value
     *            the <code>display</code> to set, can be <code>null</code>.
     * @see #getDisplayType()
     * @since 1.1.0
     */
    public void setDisplayType(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyDisplayTypeOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>excludes</code>.
     *
     * @param value
     *            the <code>excludes</code> to set, can be <code>null</code>.
     * @see #getExcludes()
     * @since 1.1.0
     */
    public void setExcludes(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyExcludeOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>includes</code>.
     *
     * @param value
     *            the <code>includes</code> to set, can be <code>null</code>.
     * @see #getIncludes()
     * @since 1.1.0
     */
    public void setIncludes(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyIncludeOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>output</code>.
     *
     * @param value
     *            the <code>output</code> to set, can be <code>null</code>.
     * @see #getOutput()
     * @since 1.1.0
     */
    public void setOutput(final String value) {
        putNonEmptyStringToMap(getArgsMap(), OutputOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>programmingLanguage</code>.
     *
     * @param value
     *            the <code>programmingLanguage</code> to set, can be <code>null</code>.
     * @see #getProgrammingLanguage()
     * @since 1.1.0
     */
    public void setProgrammingLanguage(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyProgrammingLanguageOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * Sets the value of <code>verboseLevel</code>.
     *
     * @param value
     *            the <code>verboseLevel</code> to set, can be <code>null</code>.
     * @see #getVerboseLevel()
     * @since 1.1.0
     */
    public void setVerboseLevel(final String value) {
        putNonEmptyStringToMap(getArgsMap(), VerboseLevelOption.OPTION_MAIN_SYNOPSIS, value);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [output=" + getOutput() + ", verboseLevel=" + getVerboseLevel()
                + ", programmingLanguage=" + getProgrammingLanguage() + ", includes=" + getIncludes() + ", excludes="
                + getExcludes() + ", display=" + getDisplayType() + ", baseDir=" + getBaseDir() + "]";
    }
}
