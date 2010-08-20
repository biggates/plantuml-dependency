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

import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.INFERIOR_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SUPERIOR_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.mazix.components.utils.string.StringUtils.removeAllSubtringsBetweenCharacters;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.COMMENT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.JAVA_TYPE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.LINE_OR_CARRIAGE_RETURN_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.NORMAL_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.PACKAGE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.STATIC_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.TAB_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_CANT_BE_EXTRACTED_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.CREATING_DEPENDENCY_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.DEPENDENCY_ALREADY_SEEN_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.DEPENDENCY_NOT_SEEN_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.NO_PACKAGE_FOUND_INFO;
import static net.sourceforge.plantuml.dependency.constants.log.InfoConstants.UPDATING_DEPENDENCY_INFO;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENTION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.impl.GenericDependencyImpl;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType;

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
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the {@link GenericDependency} instance read from the source file and from the raw
     *         dependency.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading or parsing the source file content.
     * @since 1.0
     */
    private GenericDependency createDependencyFromRaw(final JavaRawDependency javaRawDependency,
            final String sourceFileContent, final Map < String, GenericDependency > dependenciesMap)
            throws PlantUMLDependencyException {

        final Set < GenericDependency > importDependencies = extractImportDependencies(sourceFileContent,
                dependenciesMap);
        final Set < GenericDependency > parentImplementationsDependencies = extractParentDependencies(javaRawDependency
                .getType(), IMPLEMENTATION, javaRawDependency.getParentImplementations(), importDependencies,
                dependenciesMap, javaRawDependency.getPackageName());
        final Set < GenericDependency > parentExtentionsDependencies = extractParentDependencies(javaRawDependency
                .getType(), EXTENTION, javaRawDependency.getParentExtentions(), importDependencies, dependenciesMap,
                javaRawDependency.getPackageName());

        final DependencyType dependencyType = javaRawDependency.getType().createDependencyType(
                javaRawDependency.getName(), javaRawDependency.getPackageName(), javaRawDependency.isAbstract(),
                importDependencies, parentImplementationsDependencies, parentExtentionsDependencies);
        return createOrUpdateAbstractDependency(javaRawDependency, dependencyType, dependenciesMap);
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
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the {@link GenericDependency} created or updated.
     * @since 1.0
     */
    private GenericDependency createOrUpdateAbstractDependency(final JavaRawDependency javaRawDependency,
            final DependencyType dependencyType, final Map < String, GenericDependency > dependenciesMap) {
        GenericDependency dependency = dependenciesMap.get(javaRawDependency.getFullName());

        if (dependency == null) {
            LOGGER.info(buildLogString(CREATING_DEPENDENCY_INFO, new Object[] {javaRawDependency.getPackageName(),
                    dependencyType}));
            dependency = new GenericDependencyImpl(dependencyType);
        } else {
            LOGGER.info(buildLogString(UPDATING_DEPENDENCY_INFO, new Object[] {javaRawDependency.getPackageName(),
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
     * dependencies {@link Map} if they have not been already seen.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the {@link Set} of all import dependencies found in the java source file content.
     *         Returns an empty {@link Set} if no import has been found.
     */
    private Set < GenericDependency > extractImportDependencies(final String javaSourceFileContent,
            final Map < String, GenericDependency > dependenciesMap) {
        final Set < GenericDependency > importDependenciesSet = extractImportDependenciesSet(javaSourceFileContent,
                NORMAL_IMPORT_REGEXP, dependenciesMap);
        final Set < GenericDependency > staticImportDependenciesSet = extractImportDependenciesSet(
                javaSourceFileContent, STATIC_IMPORT_REGEXP, dependenciesMap);
        importDependenciesSet.addAll(staticImportDependenciesSet);
        return importDependenciesSet;
    }

    /**
     * Following a java source file content and the import regular expression, reads, parses and
     * extracts all import dependencies. This method also adds the import dependencies in the
     * dependencies {@link Map} if they have not been already seen.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the {@link Set} of all import dependencies found in the java source file content.
     *         Returns an empty {@link Set} if no import has been found.
     */
    private Set < GenericDependency > extractImportDependenciesSet(final String javaSourceFileContent,
            final Pattern importRegExp, final Map < String, GenericDependency > dependenciesMap) {
        final Set < GenericDependency > importDependenciesSet = new TreeSet < GenericDependency >();
        final Matcher matcher = importRegExp.matcher(javaSourceFileContent);

        while (matcher.find()) {
            final String packageName = matcher.group(1);
            final String name = matcher.group(2);
            final String fullName = packageName + DOT_CHAR + name;
            GenericDependency dependency = dependenciesMap.get(fullName);
            if (dependency == null) {
                LOGGER.info(buildLogString(DEPENDENCY_NOT_SEEN_DEFAULT_TYPE_INFO, fullName));
                dependency = new GenericDependencyImpl(name, packageName);
                dependenciesMap.put(fullName, dependency);
            } else {
                LOGGER.info(buildLogString(DEPENDENCY_ALREADY_SEEN_INFO, fullName));
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
     * @since 1.0
     */
    private String extractName(final String group) throws PlantUMLDependencyException {
        if (isEmpty(group)) {
            throw new PlantUMLDependencyException(DEPENDENCY_NAME_NULL_ERROR);
        } else {
            return removeAllSubtringsBetweenCharacters(group, INFERIOR_CHAR.charAt(0), SUPERIOR_CHAR.charAt(0)).trim();
        }
    }

    /**
     * Reads, parses and extracts the package name in the passed java source file content.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return the java package name if found, otherwise it returns a blank string.
     */
    private String extractPackageName(final String javaSourceFileContent) {
        String packageName = BLANK_STRING;
        final Matcher matcher = PACKAGE_REGEXP.matcher(javaSourceFileContent);

        if (matcher.find()) {
            packageName = matcher.group(1);
        } else {
            LOGGER.info(NO_PACKAGE_FOUND_INFO);
        }

        return packageName;
    }

    /**
     * Creates parent dependencies instances.
     * 
     * @param type
     *            the parent {@link JavaType}, mustn't be <code>null</code>.
     * @param parentType
     *            the parent {@link JavaParentType}, mustn't be <code>null</code>.
     * @param parents
     *            the {@link Set} of all parents' names previously found, mustn't be
     *            <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports, mustn't be
     *            <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @param packageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @return the {@link Set} containing all parents' as {@link GenericDependency} instances.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while creating parent {@link GenericDependency}
     *             instances.
     */
    private Set < GenericDependency > extractParentDependencies(final JavaType type, final JavaParentType parentType,
            final Set < String > parents, final Set < GenericDependency > importDependencies,
            final Map < String, GenericDependency > dependenciesMap, final String packageName)
            throws PlantUMLDependencyException {

        final Set < GenericDependency > parentsSet = new TreeSet < GenericDependency >();
        for (final String parentName : parents) {
            final GenericDependency dependency = getOrCreateParentDependency(type, parentType, parentName, packageName,
                    importDependencies, dependenciesMap);
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
     * Finds or creates the parent dependency.
     * 
     * @param parentName
     *            the parent dependency name, mustn't be <code>null</code>.
     * @param packageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while finding or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency findOrCreateParentDependencyInTreatedOrJavaLangObject(final JavaType type,
            final JavaParentType parentType, final String parentName, final String packageName,
            final Map < String, GenericDependency > dependenciesMap) throws PlantUMLDependencyException {
        GenericDependency dependency = null;

        final String fullName = packageName + DOT_CHAR + parentName;
        dependency = dependenciesMap.get(fullName);
        if (dependency == null) {
            // TODO the package name is either right or false : we don't know because the dependency
            // could have not been treated before this one
            final DependencyType dependencyType = type.createParentDependencyType(parentType, parentName, packageName);
            LOGGER.info(buildLogString(DEPENDENCY_NOT_SEEN_INFO, new Object[] {fullName, dependencyType}));
            dependency = new GenericDependencyImpl(dependencyType);
            dependenciesMap.put(fullName, dependency);
        } else {
            LOGGER.info(buildLogString(DEPENDENCY_ALREADY_SEEN_INFO, fullName));
        }

        return dependency;
    }

    /**
     * Gets or creates the parent dependency.
     * 
     * @param parentName
     *            the parent dependency name, mustn't be <code>null</code>.
     * @param packageName
     *            the current dependency package name, mustn't be <code>null</code>.
     * @param importDependencies
     *            the {@link Set} of all {@link GenericDependency} containing imports to look in,
     *            mustn't be <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the parent {@link GenericDependency} instance.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while getting or creating the parent
     *             {@link GenericDependency} instance.
     * @since 1.0
     */
    private GenericDependency getOrCreateParentDependency(final JavaType type, final JavaParentType parentType,
            final String parentName, final String packageName, final Set < GenericDependency > importDependencies,
            final Map < String, GenericDependency > dependenciesMap) throws PlantUMLDependencyException {
        GenericDependency dependency = findDependencyInImport(parentName, importDependencies);

        if (dependency == null) {
            // TODO log that the class isn't in the imports : means that it
            // is in the same
            // package or that it is a java.lang object
            dependency = findOrCreateParentDependencyInTreatedOrJavaLangObject(type, parentType, parentName,
                    packageName, dependenciesMap);
        } else {
            // TODO log that dependencies has been found in the import : not the same package,
            // we have to remove it from the import list to avoid duplication between imports
            // and extended classes
            // FIXME to remove !!
            importDependencies.remove(dependency);
            // TODO we also have to change the dependency from stub to interface
            final DependencyType dependencyType = type.createParentDependencyType(parentType, dependency.getName(),
                    dependency.getPackageName());
            dependency.setDependencyType(dependencyType);
        }

        return dependency;
    }

    /**
     * Prepares the java source file content to remove all unnecessary strings which are not used in
     * the analysis.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return the new java source file content without all unnecessary strings which are not used
     *         in the analysis.
     * @since 1.0
     */
    private String prepareSourceFileContent(final String javaSourceFileContent) {
        // TODO removing double slash comments
        // removing special characters
        String content = LINE_OR_CARRIAGE_RETURN_REGEXP.matcher(javaSourceFileContent).replaceAll(BLANK_STRING);
        content = TAB_REGEXP.matcher(content).replaceAll(SPACE_CHAR);

        // removing commentsregexp
        content = COMMENT_REGEXP.matcher(content).replaceAll(BLANK_STRING);

        return content;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public GenericDependency readDependencyFromFile(final String sourceFileContent,
            final Map < String, GenericDependency > dependenciesMap) throws PlantUMLDependencyException {
        final String preparedSourceFileContent = prepareSourceFileContent(sourceFileContent);
        return readDependencyFromPreparedFile(preparedSourceFileContent, dependenciesMap);
    }

    /**
     * Reads, parses and extracts the {@link GenericDependency} instance from the passed java source
     * file content.
     * 
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @param dependenciesMap
     *            the {@link Map} of dependencies already seen or treated, with their full name as
     *            keys and the associated {@link GenericDependency} instances as values.
     * @return the {@link GenericDependency} instance extracted from the java source file content.
     * @throws PlantUMLDependencyException
     *             if any exception occurs while reading or creating the {@link GenericDependency}
     *             instance.
     * @since 1.0
     */
    private GenericDependency readDependencyFromPreparedFile(final String javaSourceFileContent,
            final Map < String, GenericDependency > dependenciesMap) throws PlantUMLDependencyException {
        final JavaRawDependency javaRawDependency = readJavaRawDependencyFromPreparedFile(javaSourceFileContent);
        return createDependencyFromRaw(javaRawDependency, javaSourceFileContent, dependenciesMap);
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

            final boolean isAbstract = extractAbstract(matcher.group(1));
            javaRawDependency.setAbstract(isAbstract);

            final JavaType type = JavaType.valueOfIgnoringCase(matcher.group(2));
            javaRawDependency.setType(type);

            final String name = extractName(matcher.group(3));
            javaRawDependency.setName(name);

            final Set < String > parentImplementations = type.extractParentImplementations(matcher.group(7));
            javaRawDependency.setParentImplementations(parentImplementations);

            final Set < String > parentExtentions = type.extractParentExtentions(matcher.group(5));
            javaRawDependency.setParentExtentions(parentExtentions);
        } else {
            throw new PlantUMLDependencyException(buildLogString(JAVA_TYPE_CANT_BE_EXTRACTED_ERROR, javaSourceFileContent));
        }

        return javaRawDependency;
    }
}
