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

package net.sourceforge.plantumldependency.cli.main.option.output;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.READING_SOURCE_FILE_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.InfoConstants.TREATED_DEPENDENCY_INFO;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.readFileIntoString;
import static net.sourceforge.plantumldependency.common.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.ProgrammingLanguageContext;
import net.sourceforge.plantumldependency.cli.plantumldiagram.PlantUMLDiagram;
import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.execution.AbstractOptionExecution;
import net.sourceforge.plantumldependency.commoncli.option.execution.OptionExecution;

import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.resources.FileResource;

/**
 * The default option execution associated to the "-o" option, allowing to specify an output file,
 * processing the input source files and generating the plantUML description.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class PlantUMLDependencyOutputOptionExecution extends AbstractOptionExecution {

    /** Serial version UID. */
    private static final long serialVersionUID = 2237748681247499173L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(PlantUMLDependencyOutputOptionExecution.class.getName());

    /**
     * Creates a dependencies {@link ProgrammingLanguageContext} following a set of files in the
     * passed programming language. This methods parses each source files of the set in order to add
     * them in the context.
     *
     * @param language
     *            the programming language of the source files to parse, mustn't be
     *            <code>null</code>.
     * @param includeExcludeFiles
     *            the {@link FileSet} describing all files to include or exclude and also the base
     *            directory where to look for, mustn't be <code>null</code>.
     * @param displayTypesOpts
     *            the {@link Set} of display types options which filter type to appear in the
     *            plantUML description, mustn't be <code>null</code>.
     * @param displayPackageNamePattern
     *            the {@link Pattern} which filter package name to appear in the plantUML
     *            description, mustn't be <code>null</code>.
     * @param displayNamePattern
     *            the {@link Pattern} which filter name to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @return the {@link ProgrammingLanguageContext} instance containing all parsed
     *         {@link GenericDependency}.
     * @since 1.0.0
     */
    private static ProgrammingLanguageContext readDependenciesContextFromFiles(final ProgrammingLanguage language,
            final FileSet includeExcludeFiles, final Set < DisplayType > displayTypesOpts,
            final Pattern displayPackageNamePattern, final Pattern displayNamePattern) {
        final ProgrammingLanguageContext programmingLanguageContext = language.createNewContext(displayTypesOpts,
                displayPackageNamePattern, displayNamePattern);

        final Iterator < FileResource > iter = includeExcludeFiles.iterator();
        while (iter.hasNext()) {
            final FileResource fileResource = iter.next();

            try {
                readDependencyFromFile(fileResource.getFile(), programmingLanguageContext, language);
            } catch (final PlantUMLDependencyException e) {
                LOGGER.log(SEVERE, buildLogString(READING_SOURCE_FILE_ERROR, fileResource.getFile()));
                LOGGER.log(INFO, e.getMessage(), e);
            }
        }

        programmingLanguageContext.removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang();
        return programmingLanguageContext;
    }

    /**
     * Creates a dependency following a single file in the passed programming language. Also updates
     * the dependencies {@link java.util.Map} with other dependency seen in the source file.
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
     * @return the {@link GenericDependency} instance parsed in the source file, may be
     *         <code>null</code> if the context display options doesn't manage the dependency type.
     * @throws PlantUMLDependencyException
     *             if any parsing exception occurs while reading the source file.
     * @since 1.0.0
     */
    private static GenericDependency readDependencyFromFile(final File file,
            final ProgrammingLanguageContext programmingLanguageContext, final ProgrammingLanguage language)
            throws PlantUMLDependencyException {
        final String sourceFileContent = readFileIntoString(file);
        return language.readDependencyFromFile(sourceFileContent, programmingLanguageContext);
    }

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

    /** The display types options which have to appear in the plantUML description. */
    private Set < DisplayType > displayTypesOptions;

    /**
     * The display package name pattern which have to appear in the plantUML description, mustn't be
     * <code>null</code>.
     */
    private Pattern displayPackageNamePattern;

    /**
     * The display name pattern which have to appear in the plantUML description, mustn't be
     * <code>null</code>.
     */
    private Pattern displayNamePattern;

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
     * @param displayTypesOpts
     *            the {@link Set} of display types options which filter type to appear in the
     *            plantUML description, mustn't be <code>null</code>.
     * @param displayPackageNamePatternOpt
     *            the {@link Pattern} which filter package name to appear in the plantUML
     *            description, mustn't be <code>null</code>.
     * @param displayNamePatternOpt
     *            the {@link Pattern} which filter name to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @param optionPriority
     *            the option priority as an integer. <i>Note : the priority must be unique amongst
     *            all options</i>.
     * @since 1.0.0
     */
    public PlantUMLDependencyOutputOptionExecution(final File file, final ProgrammingLanguage language,
            final FileSet includeExcludeFiles, final Set < DisplayType > displayTypesOpts,
            final Pattern displayPackageNamePatternOpt, final Pattern displayNamePatternOpt, final int optionPriority) {
        super(optionPriority);
        setOutputFile(file);
        setInputFileSet(includeExcludeFiles);
        setProgrammingLanguage(language);
        setDisplayTypesOptions(displayTypesOpts);
        setDisplayPackageNamePattern(displayPackageNamePatternOpt);
        setDisplayNamePattern(displayNamePatternOpt);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public OptionExecution deepClone() {
        final PlantUMLDependencyOutputOptionExecution p = (PlantUMLDependencyOutputOptionExecution) super.deepClone();
        p.outputFile = new File(outputFile.getAbsolutePath());
        p.inputFileSet = (FileSet) inputFileSet.clone();
        p.displayTypesOptions = new TreeSet < DisplayType >(displayTypesOptions);
        p.displayPackageNamePattern = displayPackageNamePattern;
        p.displayNamePattern = displayNamePattern;
        return p;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public void execute() throws CommandLineException {
        final ProgrammingLanguageContext programmingLanguageContext = readDependenciesContextFromFiles(
                getProgrammingLanguage(), getInputFileSet(), getDisplayTypesOptions(), getDisplayPackageNamePattern(),
                getDisplayNamePattern());
        final PlantUMLDiagram plantUMLDiagram = programmingLanguageContext.getPlantUMLClassesDiagram();
        writeIntoFile(plantUMLDiagram.getPlantUMLTextDescription(), getOutputFile());
        LOGGER.log(INFO,
                buildLogString(TREATED_DEPENDENCY_INFO, programmingLanguageContext.getParsedDependencies().size()));
    }

    /**
     * Gets the value of <code>displayNamePattern</code>.
     *
     * @return the value of <code>displayNamePattern</code>.
     * @see #setDisplayNamePattern(Pattern)
     * @since 1.4.0
     */
    private Pattern getDisplayNamePattern() {
        return displayNamePattern;
    }

    /**
     * Gets the value of <code>displayPackageNamePattern</code>.
     *
     * @return the value of <code>displayPackageNamePattern</code>.
     * @see #setDisplayPackageNamePattern(Pattern)
     * @since 1.4.0
     */
    private Pattern getDisplayPackageNamePattern() {
        return displayPackageNamePattern;
    }

    /**
     * Gets the value of <code>displayTypesOptions</code>.
     *
     * @return the value of <code>displayTypesOptions</code>.
     * @see #setDisplayTypesOptions(Set)
     * @since 1.0.0
     */
    private Set < DisplayType > getDisplayTypesOptions() {
        return displayTypesOptions;
    }

    /**
     * Gets the value of <code>inputFileSet</code>.
     *
     * @return the value of <code>inputFileSet</code>.
     * @see #setInputFileSet(FileSet)
     * @since 1.0.0
     */
    private FileSet getInputFileSet() {
        return inputFileSet;
    }

    /**
     * Gets the value of <code>outputFile</code>.
     *
     * @return the value of <code>outputFile</code>.
     * @see #setOutputFile(File)
     * @since 1.0.0
     */
    private File getOutputFile() {
        return outputFile;
    }

    /**
     * Gets the value of <code>programmingLanguage</code>.
     *
     * @return the value of <code>programmingLanguage</code>.
     * @see #setProgrammingLanguage(ProgrammingLanguage)
     * @since 1.0.0
     */
    private ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the value of <code>displayNamePattern</code>.
     *
     * @param value
     *            the <code>displayNamePattern</code> to set, can be <code>null</code>.
     * @see #getDisplayNamePattern()
     * @since 1.4.0
     */
    private void setDisplayNamePattern(final Pattern value) {
        displayNamePattern = value;
    }

    /**
     * Sets the value of <code>displayPackageNamePattern</code>.
     *
     * @param value
     *            the <code>displayPackageNamePattern</code> to set, can be <code>null</code>.
     * @see #getDisplayPackageNamePattern()
     * @since 1.4.0
     */
    private void setDisplayPackageNamePattern(final Pattern value) {
        displayPackageNamePattern = value;
    }

    /**
     * Sets the value of <code>displayTypesOptions</code>.
     *
     * @param value
     *            the <code>displayTypesOptions</code> to set, can be <code>null</code>.
     * @see #getDisplayTypesOptions()
     * @since 1.0.0
     */
    private void setDisplayTypesOptions(final Set < DisplayType > value) {
        displayTypesOptions = value;
    }

    /**
     * Sets the value of <code>inputFileSet</code>.
     *
     * @param value
     *            the <code>inputFileSet</code> to set, can be <code>null</code>.
     * @see #getInputFileSet()
     * @since 1.0.0
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
     * @since 1.0.0
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
     * @since 1.0.0
     */
    private void setProgrammingLanguage(final ProgrammingLanguage value) {
        programmingLanguage = value;
    }
}
