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

package net.sourceforge.plantuml.dependency.main.ant;

import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.utils.exception.ExceptionUtils.getStackTraceAsString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import net.sourceforge.mazix.cli.option.impl.output.OutputOption;
import net.sourceforge.mazix.cli.option.impl.verbose.VerboseLevelOption;
import net.sourceforge.plantuml.dependency.main.option.basedirectory.PlantUMLDependencyBaseDirectoryOption;
import net.sourceforge.plantuml.dependency.main.option.display.PlantUMLDependencyDisplayOption;
import net.sourceforge.plantuml.dependency.main.option.exclude.PlantUMLDependencyExcludeOption;
import net.sourceforge.plantuml.dependency.main.option.include.PlantUMLDependencyIncludeOption;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.PlantUMLDependencyProgrammingLanguageOption;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.1.0
 * @version 1.1.0
 */
public class PlantUMLDependencyProgramTask extends Task {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyProgramTask.class.getName());

    private final Map < String, String > argsMap = new HashMap < String, String >();

    /** The output option. */
    private String output;

    /** The verbose option. */
    private String verboseLevel;

    /** The programming language option. */
    private String programmingLanguage;

    /** The include option. */
    private String includes;

    /** The exclude option. */
    private String excludes;

    /** The display option. */
    private String display;

    /** The base directory option. */
    private String baseDir;

    /**
     * @param argumentsMap
     * @return
     * @since 1.1.0
     */
    private String[] createArgs(final Map < String, String > argumentsMap) {

        final List < String > argsList = new ArrayList < String >();

        for (final Map.Entry < String, String > argument : argumentsMap.entrySet()) {
            final String argumentValue = argument.getValue();
            if (isNotEmpty(argumentValue)) {
                final String argumentSynopsis = argument.getKey();
                argsList.add(argumentSynopsis);
                argsList.add(argumentValue);
            } else {
                // TODO log
            }
        }

        return argsList.toArray(new String[argsList.size()]);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.0
     */
    @Override
    public void execute() throws BuildException {
        super.execute();
        log("Starting PlantUML Dependency");
        try {

            final String[] args = createArgs(getArgsMap());
            log("Arguments : " + Arrays.toString(args));
            main(args);
        } catch (final IOException e) {
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
     * @see #setDisplay(String)
     * @since 1.1.0
     */
    public String getDisplay() {
        return getArgsMap().get(PlantUMLDependencyDisplayOption.OPTION_MAIN_SYNOPSIS);
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
     * @param map
     * @param key
     * @param value
     * @since 1.1.0
     */
    private void putNonEmptyStringToMap(final Map < String, String > map, final String key, final String value) {
        if (isNotEmpty(key)) {
            if (isNotEmpty(value)) {
                map.put(key, value);
            } else {
                // TODO
            }
        } else {
            // TODO
        }
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
     * @see #getDisplay()
     * @since 1.1.0
     */
    public void setDisplay(final String value) {
        putNonEmptyStringToMap(getArgsMap(), PlantUMLDependencyDisplayOption.OPTION_MAIN_SYNOPSIS, value);
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
        return getClass().getSimpleName() + " [output=" + output + ", verboseLevel=" + verboseLevel
                + ", programmingLanguage=" + programmingLanguage + ", includes=" + includes + ", excludes=" + excludes
                + ", display=" + display + ", baseDir=" + baseDir + "]";
    }
}
