/*
 PlantUMLDependencyOutputOptionExecution.java
 Creation date : 9/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.output;

import static java.lang.System.currentTimeMillis;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.END_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.START_PLANTUML;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.execution.AbstractOptionExecution;
import net.sourceforge.mazix.cli.option.execution.OptionExecution;
import net.sourceforge.plantuml.dependency.AbstractDependency;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;

import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.resources.FileResource;

/**
 * The default option execution associated to the "-o" option, allowing to specify an output file,
 * processing the input source files and generating the plantUML description.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyOutputOptionExecution extends AbstractOptionExecution {

    /** Serial version UID. */
    private static final long serialVersionUID = 2237748681247499173L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyOutputOptionExecution.class.getName());

    /** The verbose mode which can affect the log information to display, if necessary. */
    private boolean verboseMode;

    /** The output file where to generate the plantUML description. */
    private File outputFile;

    /**
     * The {@link FileSet} describing all files to include or exclude and also the base directory
     * where to look for.
     */
    private FileSet inputFileSet;

    /** THe programming language to parse. */
    private ProgrammingLanguage programmingLanguage;

    /** The display option which have to appear in the plantUML description. */
    private Set < Display > displayOptions;

    /**
     * Default constructor.
     * 
     * @param file
     * @param language
     * @param includeExcludeFiles
     * @param verboseModeActive
     * @param displayOpt
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options</i>.
     * @since 1.0
     */
    public PlantUMLDependencyOutputOptionExecution(final File file, final ProgrammingLanguage language,
            final FileSet includeExcludeFiles, final boolean verboseModeActive, final Set < Display > displayOpt,
            final int optionPriority) {
        super(optionPriority);
        setVerboseMode(verboseModeActive);
        setOutputFile(file);
        setInputFileSet(includeExcludeFiles);
        setProgrammingLanguage(language);
        setDisplayOptions(displayOpt);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public OptionExecution deepClone() {
        final PlantUMLDependencyOutputOptionExecution p = (PlantUMLDependencyOutputOptionExecution) super.deepClone();
        p.outputFile = new File(outputFile.getAbsolutePath());
        p.inputFileSet = (FileSet) inputFileSet.clone();
        p.displayOptions = new TreeSet < Display >(displayOptions);
        return p;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public void execute() throws CommandLineException {
        // TODO see if the verbose mode can activate the logging
        final long start = currentTimeMillis();

        final Map < String, AbstractDependency > dependenciesMap = readDependenciesMapFromFiles(
                getProgrammingLanguage(), getInputFileSet(), isVerboseMode(), getDisplayOptions());
        writePlantUMLFile(dependenciesMap, getOutputFile());

        if (isVerboseMode()) {
            LOGGER.info("Executed in " + (currentTimeMillis() - start) + " ms");
        }
    }

    /**
     * Gets the value of <code>displayOptions</code>.
     * 
     * @return the value of <code>displayOptions</code>.
     * @see #setDisplayOptions(Set)
     * @since 1.0
     */
    private Set < Display > getDisplayOptions() {
        return displayOptions;
    }

    /**
     * Gets the value of <code>inputFileSet</code>.
     * 
     * @return the value of <code>inputFileSet</code>.
     * @see #setInputFileSet(FileSet)
     * @since 1.0
     */
    private FileSet getInputFileSet() {
        return inputFileSet;
    }

    /**
     * Gets the value of <code>outputFile</code>.
     * 
     * @return the value of <code>outputFile</code>.
     * @see #setOutputFile(File)
     * @since 1.0
     */
    private File getOutputFile() {
        return outputFile;
    }

    /**
     * Gets the value of <code>programmingLanguage</code>.
     * 
     * @return the value of <code>programmingLanguage</code>.
     * @see #setProgrammingLanguage(ProgrammingLanguage)
     * @since 1.0
     */
    private ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Gets the value of <code>verboseMode</code>.
     * 
     * @return the value of <code>verboseMode</code>.
     * @see #setVerboseMode(boolean)
     * @since 1.0
     */
    private boolean isVerboseMode() {
        return verboseMode;
    }

    /**
     * Creates a dependencies {@link Map} following a set of files in the passed programming
     * language. This methods parses each source files of the set in order to create the {@link Map}
     * .
     * 
     * @param language
     *            the programming language of the source files to parse, mustn't be
     *            <code>null</code>.
     * @param includeExcludeFiles
     *            the {@link FileSet} describing all files to include or exclude and also the base
     *            directory where to look for, mustn't be <code>null</code>.
     * @param verboseModeActive
     *            the boolean telling if the verbose mode is active.
     * @param displayOpt
     *            the display option which have to appear in the plantUML description.
     * @return the {@link Map} of parsed dependencies, with their full name as keys and the
     *         associated {@link AbstractDependency} instances as values.
     * @since 1.0
     */
    @SuppressWarnings("unchecked")
    private Map < String, AbstractDependency > readDependenciesMapFromFiles(final ProgrammingLanguage language,
            final FileSet includeExcludeFiles, final boolean verboseModeActive, final Set < Display > displayOpt) {
        final Map < String, AbstractDependency > dependenciesMap = new TreeMap < String, AbstractDependency >();

        final Iterator < FileResource > iter = includeExcludeFiles.iterator();
        while (iter.hasNext()) {
            final FileResource fileResource = iter.next();
            final AbstractDependency dependency = readDependencyFromFile(fileResource.getFile(), dependenciesMap,
                    language, verboseModeActive, displayOpt);
            dependenciesMap.put(dependency.getFullName(), dependency);
        }

        return dependenciesMap;
    }

    /**
     * @param file
     * @param dependenciesMap
     * @param language
     * @param verboseModeActive
     * @param displayOpt
     * @return
     * @since 1.0
     */
    private AbstractDependency readDependencyFromFile(final File file,
            final Map < String, AbstractDependency > dependenciesMap, final ProgrammingLanguage language,
            final boolean verboseModeActive, final Set < Display > displayOpt) {
        final String sourceFileContent = readFileIntoString(file);
        return language.readDependencyFromFile(sourceFileContent, dependenciesMap);
    }

    /**
     * Sets the value of <code>displayOptions</code>.
     * 
     * @param value
     *            the <code>displayOptions</code> to set, can be <code>null</code>.
     * @see #getdisplayOptions(
     * @since 1.0
     */
    private void setDisplayOptions(final Set < Display > value) {
        displayOptions = value;
    }

    /**
     * Sets the value of <code>inputFileSet</code>.
     * 
     * @param value
     *            the <code>inputFileSet</code> to set, can be <code>null</code>.
     * @see #getInputFileSet()
     * @since 1.0
     */
    private void setInputFileSet(final FileSet value) {
        inputFileSet = value;
    }

    /**
     * Sets the value of <code>outputFile</code>.
     * 
     * @param value
     *            the <code>outputFile</code> to set, can be <code>null</code>.
     * @see #getOutputFile()
     * @since 1.0
     */
    private void setOutputFile(final File value) {
        outputFile = value;
    }

    /**
     * Sets the value of <code>programmingLanguage</code>.
     * 
     * @param value
     *            the <code>programmingLanguage</code> to set, can be <code>null</code>.
     * @see #getProgrammingLanguage()
     * @since 1.0
     */
    private void setProgrammingLanguage(final ProgrammingLanguage value) {
        programmingLanguage = value;
    }

    /**
     * Sets the value of <code>verboseMode</code>.
     * 
     * @param value
     *            the <code>verboseMode</code> to set, can be <code>null</code>.
     * @see #isVerboseMode()
     * @since 1.0
     */
    private void setVerboseMode(final boolean value) {
        verboseMode = value;
    }

    /**
     * @param dependenciesMap
     * @param outputFile
     * @since 1.0
     */
    private void writePlantUMLFile(final Map < String, AbstractDependency > dependenciesMap, final File file) {
        final StringBuffer buffer = new StringBuffer(START_PLANTUML);

        // TODO 1 boucle avec 2 string buffer que l'on concatene
        for (final AbstractDependency abstractDependency : dependenciesMap.values()) {
            buffer.append(abstractDependency.getPlantUMLDeclaration());
        }

        for (final AbstractDependency abstractImportDependency : dependenciesMap.values()) {
            buffer.append(abstractImportDependency.getPlantUMLLinksDescription());
        }

        buffer.append(END_PLANTUML);
        writeIntoFile(buffer.toString(), file);
    }
}
