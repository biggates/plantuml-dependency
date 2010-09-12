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
import static net.sourceforge.mazix.components.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.READING_SOURCE_FILE_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.EXECUTION_TIME_INFO;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.execution.AbstractOptionExecution;
import net.sourceforge.mazix.cli.option.execution.OptionExecution;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext;

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
    // FIXME should have a serializable input file set
    private transient FileSet inputFileSet;

    /** The programming language to parse. */
    private ProgrammingLanguage programmingLanguage;

    /** The display option which have to appear in the plantUML description. */
    private Set < Display > displayOptions;

    /**
     * Default constructor.
     * 
     * @param file
     *            the output file where to generate the plantUML description, mustn't be
     *            <code>null</code>.
     * @param language
     *            The programming language to parse, mustn't be <code>null</code>.
     * @param includeExcludeFiles
     *            the {@link FileSet} describing all files to include or exclude and also the base
     *            directory where to look for, mustn't be <code>null</code>.
     * @param verboseModeActive
     *            the boolean telling if the verbose mode is active, to display log information.
     * @param displayOpt
     *            the display option which have to appear in the plantUML description.
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

        try {
            final ProgrammingLanguageContext programmingLanguageContext = readDependenciesMapFromFiles(
                    getProgrammingLanguage(), getInputFileSet(), isVerboseMode(), getDisplayOptions());
            programmingLanguageContext.writePlantUMLFile(getOutputFile());
        } catch (final PlantUMLDependencyException e) {
            LOGGER.severe(e.getMessage());
        }

        if (isVerboseMode()) {
            LOGGER.info(buildLogString(EXECUTION_TIME_INFO, (currentTimeMillis() - start)));
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
     *            the boolean telling if the verbose mode is active, to display log information.
     * @param displayOpt
     *            the display option which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @return the {@link Collection} of all parsed {@link GenericDependency}.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading and parsing the source files.
     * @since 1.0
     */
    @SuppressWarnings("unchecked")
    private ProgrammingLanguageContext readDependenciesMapFromFiles(final ProgrammingLanguage language,
            final FileSet includeExcludeFiles, final boolean verboseModeActive, final Set < Display > displayOpt)
            throws PlantUMLDependencyException {
        final ProgrammingLanguageContext programmingLanguageContext = language.createNewContext(displayOpt);

        final Iterator < FileResource > iter = includeExcludeFiles.iterator();
        while (iter.hasNext()) {
            final FileResource fileResource = iter.next();

            try {
                readDependencyFromFile(fileResource.getFile(), programmingLanguageContext, language, verboseModeActive,
                        displayOpt);
            } catch (final PlantUMLDependencyException e) {
                throw new PlantUMLDependencyException(
                        buildLogString(READING_SOURCE_FILE_ERROR, fileResource.getFile()), e);
            }
        }

        return programmingLanguageContext;
    }

    /**
     * Creates a dependency following a single file in the passed programming language. Also updates
     * the dependencies {@link Map} with other dependency seen in the source file.
     * 
     * @param file
     *            the source file to parse, mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @param language
     *            the programming language of the source files to parse, mustn't be
     *            <code>null</code>.
     * @param verboseModeActive
     *            the boolean telling if the verbose mode is active, to display log information.
     * @param displayOpt
     *            the display option which have to appear in the plantUML description.
     * @return the {@link GenericDependency} instance parsed in the source file.
     * @throws PlantUMLDependencyException
     *             if any parsing exception occurs while reading the source file.
     * @since 1.0
     */
    private GenericDependency readDependencyFromFile(final File file,
            final ProgrammingLanguageContext programmingLanguageContext, final ProgrammingLanguage language,
            final boolean verboseModeActive, final Set < Display > displayOpt) throws PlantUMLDependencyException {
        final String sourceFileContent = readFileIntoString(file);
        return language.readDependencyFromFile(sourceFileContent, programmingLanguageContext);
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
}
