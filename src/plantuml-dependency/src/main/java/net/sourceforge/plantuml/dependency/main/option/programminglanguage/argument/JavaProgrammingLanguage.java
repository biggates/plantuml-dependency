/*
 JavaProgrammingLanguage.java
 Creation date : 19/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument;

import static java.lang.Class.forName;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.CharacterConstants.CARRIAGE_RETURN_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.INFERIOR_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.LINE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SLASH_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.STAR_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SUPERIOR_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.TAB_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.constants.CommonConstants.MINUS_ONE_RETURN_CODE;
import static net.sourceforge.mazix.components.utils.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.JAVA_LANG_PACKAGE;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLDependencyConstants.NATIVE_DEPENDENCY;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.JAVA_TYPE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.NORMAL_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.PACKAGE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.STATIC_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_CANT_BE_EXTRACTED_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.CREATING_DEPENDENCY_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.DEPENDENCY_ALREADY_SEEN_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.DEPENDENCY_NOT_SEEN_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.DISPLAY_MODE_ISNT_MANAGED_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.NO_PACKAGE_FOUND_FINE;
import static net.sourceforge.plantuml.dependency.constants.log.FineConstants.UPDATING_DEPENDENCY_FINE;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.EXTENSIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPLEMENTATIONS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.NATIVE_METHODS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl.JavaProgrammingLanguageContext;

/**
 * The Java {@link ProgrammingLanguage} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
class JavaProgrammingLanguage extends ProgrammingLanguage {

    /** Serial version UID. */
    private static final long serialVersionUID = 62105384573195242L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaProgrammingLanguage.class.getName());

    /**
     * Get the index of the character representing the end of a multi line java comment (i.e. star +
     * slash) in the passed string, starting from the passed index.
     * 
     * @param beginningIndex
     *            the index where to start to look for the end comment character, must be between 0
     *            and <code>str.length()</code>.
     * @param str
     *            the string where to look for the end comment character.
     * @return the index of the character representing the end of a multi line java comment. If not
     *         found, <code>beginningIndex</code> is returned.
     * @since 1.0
     */
    private static int getNextEndOfMultiLineCommentIndex(final int beginningIndex, final String str) {
        int index = beginningIndex;
        boolean found = false;

        while (index < str.length() && !found) {
            final char currentCharacter = str.charAt(index);
            if (currentCharacter == STAR_CHAR.charAt(0)) {
                if (index + 1 < str.length()) {
                    final char nextCharacter = str.charAt(index + 1);
                    if (nextCharacter == SLASH_CHAR.charAt(0)) {
                        index += 2;
                        found = true;
                    } else {
                        index++;
                    }
                } else {
                    index++;
                }
            } else {
                index++;
            }
        }

        if (!found) {
            index = beginningIndex;
        }

        return index;
    }

    /**
     * Default constructor.
     * 
     * @param programmingLanguageName
     *            the programming language name to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @since 1.0
     */
    protected JavaProgrammingLanguage(final String programmingLanguageName) {
        super(programmingLanguageName);
    }

    /**
     * Creates the {@link GenericDependency} instance from the raw dependency and the java source
     * file content.
     * 
     * @param javaRawDependency
     *            the {@link JavaRawDependency} containing raw data of the dependency contained in
     *            the source file, mustn't be <code>null</code>.
     * @param sourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance read from the source file and from the raw
     *         dependency.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading or parsing the source file content.
     * @since 1.0
     */
    private GenericDependency createDependencyFromRaw(final JavaRawDependency javaRawDependency,
            final String sourceFileContent, final ProgrammingLanguageContext programmingLanguageContext)
            throws PlantUMLDependencyException {

        final Set < GenericDependency > importDependencies = extractImportDependencies(sourceFileContent,
                programmingLanguageContext);

        if (programmingLanguageContext.hasToDisplay(NATIVE_METHODS) && javaRawDependency.hasNativeMethods()) {
            importDependencies.add(NATIVE_DEPENDENCY);
            programmingLanguageContext.addSeenDependencies(NATIVE_DEPENDENCY);
        } else {
            LOGGER.fine(buildLogString(DISPLAY_MODE_ISNT_MANAGED_FINE, NATIVE_DEPENDENCY));
        }

        Set < GenericDependency > parentImplementationsDependencies = null;
        if (programmingLanguageContext.hasToDisplay(IMPLEMENTATIONS)) {
            parentImplementationsDependencies = extractParentDependencies(javaRawDependency.getType(), IMPLEMENTATION,
                    javaRawDependency.getParentImplementations(), importDependencies, programmingLanguageContext,
                    javaRawDependency.getPackageName());
        } else {
            parentImplementationsDependencies = new HashSet < GenericDependency >();
            LOGGER.fine(buildLogString(DISPLAY_MODE_ISNT_MANAGED_FINE, IMPLEMENTATIONS));
        }

        Set < GenericDependency > parentExtentionsDependencies = null;
        if (programmingLanguageContext.hasToDisplay(EXTENSIONS)) {
            parentExtentionsDependencies = extractParentDependencies(javaRawDependency.getType(), EXTENSION,
                    javaRawDependency.getParentExtentions(), importDependencies, programmingLanguageContext,
                    javaRawDependency.getPackageName());
        } else {
            parentExtentionsDependencies = new HashSet < GenericDependency >();
            LOGGER.fine(buildLogString(DISPLAY_MODE_ISNT_MANAGED_FINE, EXTENSIONS));
        }

        final DependencyType dependencyType = javaRawDependency.getType().createDependencyType(
                javaRawDependency.getName(), javaRawDependency.getPackageName(), javaRawDependency.isAbstract(),
                importDependencies, parentImplementationsDependencies, parentExtentionsDependencies,
                javaRawDependency.hasNativeMethods());
        return createOrUpdateAbstractDependency(javaRawDependency, dependencyType, programmingLanguageContext);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public ProgrammingLanguageContext createNewContext(final Set < Display > displayOpt) {
        return new JavaProgrammingLanguageContext(displayOpt);
    }

    /**
     * Creates or updates the dependency type or the passed raw dependency. If the dependency has
     * already been seen (i.e. it appears in the <code>dependenciesMap</code>) it just updates its
     * {@link DependencyType}, otherwise it creates the dependency.
     * 
     * @param javaRawDependency
     *            the {@link JavaRawDependency} containing raw data of the dependency contained in
     *            the source file, mustn't be <code>null</code>.
     * @param dependencyType
     *            the {@link DependencyType} instance to set to the dependency, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} created or updated.
     * @since 1.0
     */
    private GenericDependency createOrUpdateAbstractDependency(final JavaRawDependency javaRawDependency,
            final DependencyType dependencyType, final ProgrammingLanguageContext programmingLanguageContext) {
        GenericDependency dependency = programmingLanguageContext.getDependencies(javaRawDependency.getFullName());

        if (dependency == null) {
            LOGGER.fine(buildLogString(CREATING_DEPENDENCY_FINE, new Object[] {javaRawDependency.getFullName(),
                    dependencyType}));
            dependency = new GenericDependencyImpl(dependencyType);
        } else {
            LOGGER.fine(buildLogString(UPDATING_DEPENDENCY_FINE, new Object[] {javaRawDependency.getFullName(),
                    dependencyType}));
            dependency.setDependencyType(dependencyType);
        }

        return dependency;
    }

    /**
     * Following the group found (i.e. the string defining an abstract class), tells if it is an
     * abstract class or not. Basically, the string is either "abstract" or "".
     * 
     * @param group
     *            the string defining an abstract class, can be <code>null</code>.
     * @return <code>true</code> if the {@link String} defines and abstract class,
     *         <code>false</code> otherwise.
     * @since 1.0
     */
    private boolean extractAbstract(final String group) {
        return isEmpty(group) ? false : true;
    }

    /**
     * Following a java source file content, reads, parses and extracts all import dependencies
     * (static and normal imports). This method also adds the import dependencies in the
     * dependencies {@link java.util.Map} if they have not been already seen.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link Set} of all import dependencies found in the java source file content.
     *         Returns an empty {@link Set} if no import has been found.
     * @since 1.0
     */
    private Set < GenericDependency > extractImportDependencies(final String javaSourceFileContent,
            final ProgrammingLanguageContext programmingLanguageContext) {

        final Set < GenericDependency > importDependenciesSet = new HashSet < GenericDependency >();

        if (programmingLanguageContext.hasToDisplay(IMPORTS)) {
            final Set < GenericDependency > normalImportDependenciesSet = extractImportDependenciesSet(
                    javaSourceFileContent, NORMAL_IMPORT_REGEXP, programmingLanguageContext);
            importDependenciesSet.addAll(normalImportDependenciesSet);
        } else {
            LOGGER.fine(buildLogString(DISPLAY_MODE_ISNT_MANAGED_FINE, IMPORTS));
        }

        if (programmingLanguageContext.hasToDisplay(STATIC_IMPORTS)) {
            final Set < GenericDependency > staticImportDependenciesSet = extractImportDependenciesSet(
                    javaSourceFileContent, STATIC_IMPORT_REGEXP, programmingLanguageContext);
            importDependenciesSet.addAll(staticImportDependenciesSet);
        } else {
            LOGGER.fine(buildLogString(DISPLAY_MODE_ISNT_MANAGED_FINE, STATIC_IMPORTS));
        }

        return importDependenciesSet;
    }

    /**
     * Following a java source file content and the import regular expression, reads, parses and
     * extracts all import dependencies. This method also adds the import dependencies in the
     * dependencies {@link java.util.Map} if they have not been already seen.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param importRegExp
     *            the import regular expression to analyze, mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link Set} of all import dependencies found in the java source file content.
     *         Returns an empty {@link Set} if no import has been found.
     * @since 1.0
     */
    private Set < GenericDependency > extractImportDependenciesSet(final String javaSourceFileContent,
            final Pattern importRegExp, final ProgrammingLanguageContext programmingLanguageContext) {
        final Set < GenericDependency > importDependenciesSet = new TreeSet < GenericDependency >();
        final Matcher matcher = importRegExp.matcher(javaSourceFileContent);

        while (matcher.find()) {
            final String packageName = matcher.group(1);
            final String name = matcher.group(2);
            final String fullName = packageName + DOT_CHAR + name;
            GenericDependency dependency = programmingLanguageContext.getDependencies(fullName);
            if (dependency == null) {
                LOGGER.fine(buildLogString(DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_FINE, fullName));
                dependency = new GenericDependencyImpl(name, packageName);
                programmingLanguageContext.addSeenDependencies(dependency);
            } else {
                LOGGER.fine(buildLogString(DEPENDENCY_ALREADY_SEEN_FINE, fullName));
            }
            importDependenciesSet.add(dependency);
        }

        return importDependenciesSet;
    }

    /**
     * Following the group found (i.e. the string defining the dependency name), extract the
     * interesting name of the dependency (i.e. without generic definition if any). Basically, the
     * string can be "String", "Serializable" or "Rectangle &#139; Square &#155;".
     * 
     * @param group
     *            the string defining the dependency name, mustn't be <code>null</code>.
     * @return the dependency raw name, without any generic definition.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while extracting name.
     * @since 1.0
     */
    private String extractName(final String group) throws PlantUMLDependencyException {
        if (isEmpty(group)) {
            throw new PlantUMLDependencyException(DEPENDENCY_NAME_NULL_ERROR);
        } else {
            return group;
        }
    }

    /**
     * Reads, parses and extracts the package name in the passed java source file content.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return the java package name if found, otherwise it returns a blank string.
     * @since 1.0
     */
    private String extractPackageName(final String javaSourceFileContent) {
        String packageName = BLANK_STRING;
        final Matcher matcher = PACKAGE_REGEXP.matcher(javaSourceFileContent);

        if (matcher.find()) {
            packageName = matcher.group(1).replace(SPACE_CHAR, BLANK_STRING);
        } else {
            LOGGER.info(NO_PACKAGE_FOUND_FINE);
        }

        return packageName;
    }

    /**
     * Creates parent dependencies instances.
     * 
     * @param type
     *            the current dependency {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param parents
     *            the {@link Set} of all parents' names or full names previously found, mustn't be
     *            <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @param currentPackageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @return the {@link Set} containing all parents' as {@link GenericDependency} instances.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while creating parent {@link GenericDependency}
     *             instances.
     * @since 1.0
     */
    private Set < GenericDependency > extractParentDependencies(final JavaType type, final JavaParentType parentType,
            final Set < String > parents, final Set < GenericDependency > importDependencies,
            final ProgrammingLanguageContext programmingLanguageContext, final String currentPackageName)
            throws PlantUMLDependencyException {

        final Set < GenericDependency > parentsSet = new TreeSet < GenericDependency >();
        for (final String parentName : parents) {
            final GenericDependency dependency = getOrCreateParentDependency(type, parentType, parentName,
                    currentPackageName, importDependencies, programmingLanguageContext);
            parentsSet.add(dependency);
        }

        return parentsSet;
    }

    /**
     * Finds the dependency following its name in the import dependencies {@link Set}. be careful,
     * this method doesn't take care of the package name.
     * 
     * @param dependencyName
     *            the dependency name to look for, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance associated to the passed name if found in the
     *         import {@link Set}, <code>null</code> otherwise.
     * @since 1.0
     */
    private GenericDependency findDependencyInImport(final String dependencyName,
            final Set < GenericDependency > importDependencies) {
        GenericDependency dependency = null;
        final Iterator < GenericDependency > iter = importDependencies.iterator();
        while (dependency == null && iter.hasNext()) {
            final GenericDependency abstractImportDependency = iter.next();
            if (abstractImportDependency.getName().equals(dependencyName)) {
                dependency = abstractImportDependency;
            }
        }
        return dependency;
    }

    /**
     * Finds the dependency following its name and its package name in the import dependencies
     * {@link Set}.
     * 
     * @param dependencyName
     *            the dependency name to look for, mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency package name to look for, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance associated to the passed name and package name
     *         if found in the import {@link Set}, <code>null</code> otherwise.
     * @since 1.0
     */
    private GenericDependency findDependencyInImport(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependencies) {
        GenericDependency dependency = null;
        final Iterator < GenericDependency > iter = importDependencies.iterator();
        while (dependency == null && iter.hasNext()) {
            final GenericDependency abstractImportDependency = iter.next();
            if (abstractImportDependency.getName().equals(dependencyName)
                    && abstractImportDependency.getPackageName().equals(dependencyPackageName)) {
                dependency = abstractImportDependency;
            }
        }
        return dependency;
    }

    /**
     * Get the index of the character representing the end of a generic definition (i.e. the last
     * superior character) in the passed string, starting from the passed index.
     * 
     * @param beginningIndex
     *            the index where to start to look for the end of a generic definition, must be
     *            between 0 and <code>str.length()</code>.
     * @param str
     *            the string where to look for the end comment character.
     * @return the index of the character representing the end of a generic definition. If not
     *         found, <code>beginningIndex</code> is returned.
     */
    private int getNextEndOfGenericIndex(final int beginningIndex, final String str) {
        int index = beginningIndex;
        int numberOfGenerics = 1;

        while (index < str.length() && numberOfGenerics != 0) {
            final char currentCharacter = str.charAt(index);
            if (currentCharacter == INFERIOR_CHAR.charAt(0)) {
                numberOfGenerics++;
                index++;
            } else if (currentCharacter == SUPERIOR_CHAR.charAt(0)) {
                numberOfGenerics--;
                index++;
            } else {
                index++;
            }
        }

        if (numberOfGenerics != 0) {
            index = beginningIndex;
        }

        return index;
    }

    /**
     * Get the index of the character representing the end of a single line java comment (i.e. line
     * separator) in the passed string, starting from the passed index.
     * 
     * @param beginningIndex
     *            the index where to start to look for the end comment character, must be between 0
     *            and <code>str.length()</code>.
     * @param str
     *            the string where to look for the end comment character.
     * @return the index of the character representing the end of a single line java comment. If not
     *         found (i.e. end of file) , <code>str.length() - 1</code> is returned.
     * @since 1.0
     */
    private int getNextEndOfSimpleLineCommentIndex(final int beginningIndex, final String str) {
        int index = beginningIndex;
        boolean found = false;

        while (index < str.length() && !found) {
            final char currentCharacter = str.charAt(index);
            if (currentCharacter == LINE_CHAR.charAt(0) || currentCharacter == CARRIAGE_RETURN_CHAR.charAt(0)) {
                index++;
                found = true;
            } else {
                index++;
            }
        }

        return index;
    }

    /**
     * Gets or creates the parent dependency.
     * 
     * @param type
     *            the current dependency {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param parentNameOrFullName
     *            the parent dependency name or full name, mustn't be <code>null</code>.
     * @param currentPackageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while getting or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency getOrCreateParentDependency(final JavaType type, final JavaParentType parentType,
            final String parentNameOrFullName, final String currentPackageName,
            final Set < GenericDependency > importDependencies,
            final ProgrammingLanguageContext programmingLanguageContext) throws PlantUMLDependencyException {

        GenericDependency dependency = null;
        final int packageSeparatorIndex = parentNameOrFullName.lastIndexOf(DOT_CHAR);

        if (packageSeparatorIndex == MINUS_ONE_RETURN_CODE) {
            dependency = getOrCreateParentDependencyWithName(type, parentType, currentPackageName, importDependencies,
                    programmingLanguageContext, parentNameOrFullName);
        } else {
            dependency = getOrCreateParentDependencyWithFullName(type, parentType, parentNameOrFullName,
                    importDependencies, programmingLanguageContext, packageSeparatorIndex);
        }

        return dependency;
    }

    /**
     * Gets or creates the parent dependency if it is not described with its full name, i.e. if it
     * is in the import, or in the same package or in the "java.lang" package.
     * 
     * @param type
     *            the current dependency {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param parentFullName
     *            the parent dependency full name, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @param packageSeparatorIndex
     *            the character separator index in the <code>parentFullName</code> string which
     *            separates the package from the dependency name, must be >= 0 and inferior to
     *            <code>parentFullName.length()</code>.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while getting or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency getOrCreateParentDependencyWithFullName(final JavaType type,
            final JavaParentType parentType, final String parentFullName,
            final Set < GenericDependency > importDependencies,
            final ProgrammingLanguageContext programmingLanguageContext, final int packageSeparatorIndex)
            throws PlantUMLDependencyException {
        final String parentName = parentFullName.substring(packageSeparatorIndex + 1);
        final String parentPackageName = parentFullName.substring(0, packageSeparatorIndex);
        GenericDependency dependency = findDependencyInImport(parentName, parentPackageName, importDependencies);

        if (dependency == null) {
            dependency = programmingLanguageContext.getDependencies(parentFullName);
            if (dependency == null) {
                final DependencyType dependencyType = type.createParentDependencyType(parentType, parentName,
                        parentPackageName);
                LOGGER.fine(buildLogString(DEPENDENCY_NOT_SEEN_FINE, new Object[] {parentFullName, dependencyType}));
                dependency = new GenericDependencyImpl(dependencyType);
                programmingLanguageContext.addSeenDependencies(dependency);
            } else {
                LOGGER.fine(buildLogString(DEPENDENCY_ALREADY_SEEN_FINE, parentFullName));
            }
        } else {
            LOGGER.fine(buildLogString(DEPENDENCY_ALREADY_SEEN_FINE, parentFullName));
            final DependencyType dependencyType = type.createParentDependencyType(parentType, dependency.getName(),
                    dependency.getPackageName());
            dependency.setDependencyType(dependencyType);
        }

        return dependency;
    }

    /**
     * Gets or creates the parent dependency if it is described with its simple name.
     * 
     * @param type
     *            the current dependency {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param currentPackageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @param parentName
     *            the parent dependency name, mustn't be <code>null</code>.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while getting or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency getOrCreateParentDependencyWithName(final JavaType type, final JavaParentType parentType,
            final String currentPackageName, final Set < GenericDependency > importDependencies,
            final ProgrammingLanguageContext programmingLanguageContext, final String parentName)
            throws PlantUMLDependencyException {
        GenericDependency dependency = null;
        dependency = findDependencyInImport(parentName, importDependencies);

        if (dependency == null) {
            final String parentFullNameWithSamePackage = currentPackageName + DOT_CHAR + parentName;
            dependency = programmingLanguageContext.getDependencies(parentFullNameWithSamePackage);
            if (dependency == null) {
                dependency = getOrCreateParentDependencyWithNameFromJavaLangOrSamePackage(type, parentType,
                        currentPackageName, programmingLanguageContext, parentName, parentFullNameWithSamePackage);
            } else {
                LOGGER.fine(buildLogString(DEPENDENCY_ALREADY_SEEN_FINE, parentFullNameWithSamePackage));
            }
        } else {
            LOGGER.fine(buildLogString(DEPENDENCY_ALREADY_SEEN_FINE, dependency.getFullName()));
            final DependencyType dependencyType = type.createParentDependencyType(parentType, dependency.getName(),
                    dependency.getPackageName());
            dependency.setDependencyType(dependencyType);
        }

        return dependency;
    }

    /**
     * Gets or creates the parent dependency if it is not described with its full name, i.e. if it
     * is in the same package or in the "java.lang" package.
     * 
     * @param type
     *            the current dependency {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param currentPackageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @param parentName
     *            the parent dependency name, mustn't be <code>null</code>.
     * @param parentFullNameWithSamePackage
     *            the parent dependency full name with the same package as the current dependency,
     *            mustn't be <code>null</code>.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while getting or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency getOrCreateParentDependencyWithNameFromJavaLangOrSamePackage(final JavaType type,
            final JavaParentType parentType, final String currentPackageName,
            final ProgrammingLanguageContext programmingLanguageContext, final String parentName,
            final String parentFullNameWithSamePackage) throws PlantUMLDependencyException {
        GenericDependency dependency = null;
        String parentPackageName = JAVA_LANG_PACKAGE;
        String parentFullName = parentPackageName + DOT_CHAR + parentName;

        try {
            forName(parentFullName);
        } catch (final ClassNotFoundException e) {
            parentFullName = parentFullNameWithSamePackage;
            parentPackageName = currentPackageName;
        }

        final DependencyType dependencyType = type
                .createParentDependencyType(parentType, parentName, parentPackageName);
        LOGGER.fine(buildLogString(DEPENDENCY_NOT_SEEN_FINE, new Object[] {parentFullName, dependencyType}));
        dependency = new GenericDependencyImpl(dependencyType);
        programmingLanguageContext.addSeenDependencies(dependency);

        return dependency;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public GenericDependency readDependencyFromFile(final String sourceFileContent,
            final ProgrammingLanguageContext programmingLanguageContext) throws PlantUMLDependencyException {
        final String preparedSourceFileContent = removeSourceFileCommentsAndGenerics(sourceFileContent);
        final GenericDependency genericDependency = readDependencyFromPreparedFile(preparedSourceFileContent,
                programmingLanguageContext);
        programmingLanguageContext.addParsedAndSeenDependencies(genericDependency);
        return genericDependency;
    }

    /**
     * Reads, parses and extracts the {@link GenericDependency} instance from the passed java source
     * file content.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance extracted from the java source file content.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading or creating the {@link GenericDependency}
     *             instance.
     * @since 1.0
     */
    private GenericDependency readDependencyFromPreparedFile(final String javaSourceFileContent,
            final ProgrammingLanguageContext programmingLanguageContext) throws PlantUMLDependencyException {
        final JavaRawDependency javaRawDependency = readJavaRawDependencyFromPreparedFile(javaSourceFileContent);
        return createDependencyFromRaw(javaRawDependency, javaSourceFileContent, programmingLanguageContext);
    }

    /**
     * Reads, parses and extracts the {@link JavaRawDependency} instance from the passed java source
     * file content.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return the {@link JavaRawDependency} instance extracted from the java source file content.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading or creating the {@link JavaRawDependency}
     *             instance.
     * @since 1.0
     */
    private JavaRawDependency readJavaRawDependencyFromPreparedFile(final String javaSourceFileContent)
            throws PlantUMLDependencyException {
        final JavaRawDependency javaRawDependency = new JavaRawDependency();

        final Matcher matcher = JAVA_TYPE_REGEXP.matcher(javaSourceFileContent);
        if (matcher.find()) {
            final String packageName = extractPackageName(javaSourceFileContent);
            javaRawDependency.setPackageName(packageName);

            final boolean isAbstract = extractAbstract(matcher.group(2));
            javaRawDependency.setAbstract(isAbstract);

            final JavaType type = JavaType.valueOfIgnoringCase(matcher.group(4));
            javaRawDependency.setType(type);

            final String name = extractName(matcher.group(5));
            javaRawDependency.setName(name);

            final Set < String > parentImplementations = type.extractParentImplementations(matcher.group(9));
            javaRawDependency.setParentImplementations(parentImplementations);

            final Set < String > parentExtentions = type.extractParentExtentions(matcher.group(7));
            javaRawDependency.setParentExtentions(parentExtentions);

            final boolean nativeMethods = type.extractNativeMethods(javaSourceFileContent);
            javaRawDependency.setNativeMethods(nativeMethods);
        } else {
            throw new PlantUMLDependencyException(buildLogString(JAVA_TYPE_CANT_BE_EXTRACTED_ERROR,
                    javaSourceFileContent));
        }

        return javaRawDependency;
    }

    /**
     * Prepares the java source file content to remove all unnecessary strings which are not used in
     * the analysis, i.e. comments and generic.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return the new java source file content without all unnecessary strings which are not used
     *         in the analysis.
     * @since 1.0
     */
    private String removeSourceFileCommentsAndGenerics(final String javaSourceFileContent) {
        final StringBuffer buffer = new StringBuffer();

        int cursor = 0;
        while (cursor < javaSourceFileContent.length()) {
            final char currentCharacter = javaSourceFileContent.charAt(cursor);
            if (currentCharacter == LINE_CHAR.charAt(0) || currentCharacter == CARRIAGE_RETURN_CHAR.charAt(0)
                    || currentCharacter == TAB_CHAR.charAt(0)) {
                cursor++;
            } else if (currentCharacter == SLASH_CHAR.charAt(0)) {
                if (cursor + 1 < javaSourceFileContent.length()) {
                    final char nextCharacter = javaSourceFileContent.charAt(cursor + 1);
                    if (nextCharacter == SLASH_CHAR.charAt(0)) {
                        cursor = getNextEndOfSimpleLineCommentIndex(cursor + 2, javaSourceFileContent);
                    } else if (nextCharacter == STAR_CHAR.charAt(0)) {
                        buffer.append(SPACE_CHAR);
                        cursor = getNextEndOfMultiLineCommentIndex(cursor + 2, javaSourceFileContent);
                    } else {
                        buffer.append(currentCharacter);
                        cursor++;
                    }
                } else {
                    buffer.append(currentCharacter);
                    cursor++;
                }
            } else if (currentCharacter == INFERIOR_CHAR.charAt(0)) {
                if (cursor + 1 < javaSourceFileContent.length()) {
                    cursor = getNextEndOfGenericIndex(cursor + 1, javaSourceFileContent);
                } else {
                    buffer.append(currentCharacter);
                    cursor++;
                }
            } else {
                buffer.append(currentCharacter);
                cursor++;
            }
        }

        return buffer.toString();
    }
}
