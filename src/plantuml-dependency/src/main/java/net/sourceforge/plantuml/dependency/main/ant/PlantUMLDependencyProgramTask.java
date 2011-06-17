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
import static net.sourceforge.plantuml.dependency.main.program.PlantUMLDependencyProgram.main;

import java.io.IOException;
import java.util.logging.Logger;

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
     * {@inheritDoc}
     * 
     * @since 1.1.0
     */
    @Override
    public void execute() throws BuildException {
        super.execute();
        log("Starting PlantUML Dependency");
        try {
            main(new String[] {});
        } catch (final IOException e) {
            log(getStackTraceAsString(e));
            throw new BuildException(e);
        }
    }

    /**
     * Gets the value of <code>baseDir</code>.
     * 
     * @return the value of <code>baseDir</code>.
     * @see #setBaseDir(String)
     * @since 1.1.0
     */
    public String getBaseDir() {
        return baseDir;
    }

    /**
     * Gets the value of <code>display</code>.
     * 
     * @return the value of <code>display</code>.
     * @see #setDisplay(String)
     * @since 1.1.0
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Gets the value of <code>excludes</code>.
     * 
     * @return the value of <code>excludes</code>.
     * @see #setExcludes(String)
     * @since 1.1.0
     */
    public String getExcludes() {
        return excludes;
    }

    /**
     * Gets the value of <code>includes</code>.
     * 
     * @return the value of <code>includes</code>.
     * @see #setIncludes(String)
     * @since 1.1.0
     */
    public String getIncludes() {
        return includes;
    }

    /**
     * Gets the value of <code>output</code>.
     * 
     * @return the value of <code>output</code>.
     * @see #setOutput(String)
     * @since 1.1.0
     */
    public String getOutput() {
        return output;
    }

    /**
     * Gets the value of <code>programmingLanguage</code>.
     * 
     * @return the value of <code>programmingLanguage</code>.
     * @see #setProgrammingLanguage(String)
     * @since 1.1.0
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Gets the value of <code>verboseLevel</code>.
     * 
     * @return the value of <code>verboseLevel</code>.
     * @see #setVerboseLevel(String)
     * @since 1.1.0
     */
    public String getVerboseLevel() {
        return verboseLevel;
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
        baseDir = value;
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
        display = value;
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
        excludes = value;
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
        includes = value;
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
        output = value;
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
        programmingLanguage = value;
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
        verboseLevel = value;
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
