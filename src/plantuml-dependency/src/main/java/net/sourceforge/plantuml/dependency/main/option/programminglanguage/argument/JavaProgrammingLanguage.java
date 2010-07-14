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

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.COMMENT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.JAVA_TYPE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.LINE_OR_CARRIAGE_RETURN_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.NORMAL_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.PACKAGE_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.STATIC_IMPORT_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.TAB_REGEXP;
import static net.sourceforge.plantuml.dependency.constants.RegularExpressionConstants.TEMPLATE_REGEXP;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ParentType.EXTENTION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ParentType.IMPLEMENTATION;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;

import net.sourceforge.plantuml.dependency.AbstractDependency;
import net.sourceforge.plantuml.dependency.AbstractDependencyImpl;
import net.sourceforge.plantuml.dependency.DependencyType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaType;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.ParentType;

/**
 * The Java {@link ProgrammingLanguage} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
class JavaProgrammingLanguage extends ProgrammingLanguage {

    /**
     * Default constructor.
     * 
     * @param programmingLanguageName
     *            the programming language name to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @since 1.0
     */
    protected JavaProgrammingLanguage(String programmingLanguageName) {
        super(programmingLanguageName);
    }

    /**
     * @param sourceFileContent
     * @return
     * @since 1.0
     */
    private String prepareSourceFileContent(final String sourceFileContent) {
        // TODO removing double slash comments
        // removing special characters
        String content = LINE_OR_CARRIAGE_RETURN_REGEXP.matcher(sourceFileContent).replaceAll(BLANK_STRING);
        content = TAB_REGEXP.matcher(content).replaceAll(SPACE_CHAR);

        // removing commentsregexp
        content = COMMENT_REGEXP.matcher(content).replaceAll(BLANK_STRING);

        return content;
    }

    /**
     * @param sourceFileContent
     * @param dependenciesMap
     * @return
     * @since 1.0
     */
    private AbstractDependency readDependencyFromPreparedFile(String sourceFileContent,
            Map < String, AbstractDependency > dependenciesMap) {
        JavaRawDependency javaRawDependency = readJavaRawDependencyFromPreparedFile(sourceFileContent);
        return createDependencyFromRaw(javaRawDependency, sourceFileContent, dependenciesMap);
    }

    /**
     * @param javaRawDependency
     * @param sourceFileContent
     * @param dependenciesMap
     * @return
     * @since 1.0
     */
    private AbstractDependency createDependencyFromRaw(JavaRawDependency javaRawDependency, String sourceFileContent,
            Map < String, AbstractDependency > dependenciesMap) {

        final Set < AbstractDependency > importDependencies = extractImportDependencies(sourceFileContent,
                dependenciesMap);
        final Set < AbstractDependency > parentImplementationsDependencies = extractParentDependencies(
                javaRawDependency.getType(), IMPLEMENTATION, javaRawDependency.getParentImplementations(),
                importDependencies, dependenciesMap, javaRawDependency.getPackageName());
        final Set < AbstractDependency > parentExtentionsDependencies = extractParentDependencies(javaRawDependency
                .getType(), EXTENTION, javaRawDependency.getParentExtentions(), importDependencies, dependenciesMap,
                javaRawDependency.getPackageName());

        final DependencyType dependencyType = javaRawDependency.getType().createDependencyType(
                javaRawDependency.getName(), javaRawDependency.getPackageName(), javaRawDependency.isAbstract(),
                importDependencies, parentImplementationsDependencies, parentExtentionsDependencies);
        return createOrUpdateAbstractDependency(javaRawDependency, dependencyType, dependenciesMap);
    }

    /**
     * @param javaRawDependency
     * @param dependencyType
     * @param dependenciesMap
     * @return
     * @since 1.0
     */
    private AbstractDependency createOrUpdateAbstractDependency(JavaRawDependency javaRawDependency,
            DependencyType dependencyType, Map < String, AbstractDependency > dependenciesMap) {
        AbstractDependency dependency = dependenciesMap.get(javaRawDependency.getFullName());
        if (dependency == null) {
            dependency = new AbstractDependencyImpl(javaRawDependency.getName(), javaRawDependency.getPackageName());
        } else {
            // TODO log that the dependency has already been seen
        }
        dependency.setDependencyType(dependencyType);
        return dependency;
    }

    private Set < AbstractDependency > extractParentDependencies(JavaType type, ParentType parentType,
            Set < String > parents, Set < AbstractDependency > importDependencies,
            Map < String, AbstractDependency > dependenciesMap, String packageName) {

        final Set < AbstractDependency > parentsSet = new TreeSet < AbstractDependency >();
        for (String parentName : parents) {
            AbstractDependency dependency = getOrCreateParentDependency(type, parentType, parentName, packageName,
                    importDependencies, dependenciesMap);
            parentsSet.add(dependency);
        }

        return parentsSet;
    }

    /**
     * @param parentName
     * @param packageName
     * @param importDependencies
     * @param dependenciesMap
     * @return
     * @since 1.0
     */
    private AbstractDependency getOrCreateParentDependency(JavaType type, ParentType parentType, String parentName,
            String packageName, Set < AbstractDependency > importDependencies,
            Map < String, AbstractDependency > dependenciesMap) {
        AbstractDependency dependency = findDependencyInImport(parentName, importDependencies);

        if (dependency == null) {
            // TODO log that the class isn't in the imports : means that it
            // is in the same
            // package or that it is a java.lang object
            dependency = findOrCreateDependencyInTreatedOrJavaLangObject(type, parentType, parentName, packageName,
                    dependenciesMap);
        } else {
            // TODO log that dependencies has been found in the import : not the same package,
            // we have to remove it from the import list to avoid duplication between imports
            // and extended classes
            importDependencies.remove(dependency);
            // TODO we also have to change the dependency from stub to interface
            DependencyType dependencyType = type.createParentDependencyType(parentType, dependency.getName(),
                    dependency.getPackageName());
            dependency.setDependencyType(dependencyType);
        }

        return dependency;
    }

    /**
     * @param parentName
     * @param packageName
     * @param dependenciesMap
     * @return
     * @since 1.0
     */
    private AbstractDependency findOrCreateDependencyInTreatedOrJavaLangObject(JavaType type, ParentType parentType,
            String parentName, String packageName, Map < String, AbstractDependency > dependenciesMap) {
        AbstractDependency dependency = null;

        final String fullName = packageName + DOT_CHAR + parentName;
        dependency = dependenciesMap.get(fullName);
        if (dependency == null) {
            // TODO log that the object has never been treated : has to create it following the
            // parent type
            DependencyType dependencyType = type.createParentDependencyType(parentType, parentName, packageName);
            dependency = new AbstractDependencyImpl(dependencyType);
            dependenciesMap.put(fullName, dependency);
        } else {
            // TODO log
        }

        return dependency;
    }

    /**
     * @param parentName
     * @param importDependencies
     * @return
     * @since 1.0
     */
    private AbstractDependency findDependencyInImport(String parentName, Set < AbstractDependency > importDependencies) {
        AbstractDependency dependency = null;
        final Iterator < AbstractDependency > iter = importDependencies.iterator();
        while (dependency == null && iter.hasNext()) {
            final AbstractDependency abstractImportDependency = iter.next();
            if (abstractImportDependency.getName().equals(parentName)) {
                dependency = abstractImportDependency;
            }
        }
        return dependency;
    }

    /**
     * @param sourceFileContent
     * @return
     * @since 1.0
     */
    private JavaRawDependency readJavaRawDependencyFromPreparedFile(String sourceFileContent) {
        JavaRawDependency javaRawDependency = new JavaRawDependency();

        final Matcher matcher = JAVA_TYPE_REGEXP.matcher(sourceFileContent);
        if (matcher.find()) {
            final String packageName = extractPackageName(sourceFileContent);
            javaRawDependency.setPackageName(packageName);

            final boolean isAbstract = extractAbstract(matcher.group(1));
            javaRawDependency.setAbstract(isAbstract);

            final JavaType type = JavaType.valueOfIgnoringCase(matcher.group(2));
            javaRawDependency.setType(type);

            String name = extractName(matcher.group(3));
            javaRawDependency.setName(name);

            Set < String > parentImplementations = type.extractParentImplementations(matcher.group(7));
            javaRawDependency.setParentImplementations(parentImplementations);

            Set < String > parentExtentions = type.extractParentExtentions(matcher.group(5));
            javaRawDependency.setParentExtentions(parentExtentions);

        } else {
            // TODO throw exception
        }

        return javaRawDependency;
    }

    /**
     * @param group
     * @return
     * @since 1.0
     */
    private String extractName(String group) {
        // TODO throw LogicException if group is null
        return TEMPLATE_REGEXP.matcher(group).replaceAll(BLANK_STRING).trim();
    }

    /**
     * @param group
     * @return
     * @since 1.0
     */
    private boolean extractAbstract(String group) {
        return isEmpty(group) ? false : true;
    }

    private Set < AbstractDependency > extractImportDependencies(final String javaSourceFileContent,
            final Map < String, AbstractDependency > javaObjectMap) {
        final Set < AbstractDependency > importDependenciesSet = extractNormalImportDependenciesSet(
                javaSourceFileContent, javaObjectMap);
        final Set < AbstractDependency > staticImportDependenciesSet = extractStaticImportDependenciesSet(
                javaSourceFileContent, javaObjectMap);
        importDependenciesSet.addAll(staticImportDependenciesSet);
        return importDependenciesSet;
    }

    private Set < AbstractDependency > extractNormalImportDependenciesSet(final String javaSourceFileContent,
            final Map < String, AbstractDependency > javaObjectMap) {
        final Set < AbstractDependency > importDependenciesSet = new TreeSet < AbstractDependency >();
        final Matcher matcher = NORMAL_IMPORT_REGEXP.matcher(javaSourceFileContent);

        while (matcher.find()) {
            final String packageName = matcher.group(1);
            final String name = matcher.group(2);
            final String fullName = packageName + DOT_CHAR + name;
            AbstractDependency dependency = javaObjectMap.get(fullName);
            if (dependency == null) {
                dependency = new AbstractDependencyImpl(name, packageName);
                javaObjectMap.put(fullName, dependency);
            } else {
                // TODO log
            }
            importDependenciesSet.add(dependency);
        }

        return importDependenciesSet;
    }

    private String extractPackageName(final String javaSourceFileContent) {
        String packageName = BLANK_STRING;
        final Matcher matcher = PACKAGE_REGEXP.matcher(javaSourceFileContent);
        if (matcher.find()) {
            packageName = matcher.group(1);
        } else {
            // TODO no package name found
        }
        return packageName;
    }

    private Set < AbstractDependency > extractStaticImportDependenciesSet(final String javaSourceFileContent,
            final Map < String, AbstractDependency > javaObjectMap) {
        final Set < AbstractDependency > importDependenciesSet = new TreeSet < AbstractDependency >();
        final Matcher matcher = STATIC_IMPORT_REGEXP.matcher(javaSourceFileContent);

        while (matcher.find()) {
            final String packageName = matcher.group(1);
            final String name = matcher.group(2);
            // String constant = matcher.group(3);
            final String fullName = packageName + DOT_CHAR + name;
            AbstractDependency dependency = javaObjectMap.get(fullName);
            if (dependency == null) {
                dependency = new AbstractDependencyImpl(name, packageName);
                javaObjectMap.put(fullName, dependency);
            } else {
                // TODO log
            }
            importDependenciesSet.add(dependency);
        }

        return importDependenciesSet;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public AbstractDependency readDependencyFromFile(String sourceFileContent,
            Map < String, AbstractDependency > dependenciesMap) {
        String preparedSourceFileContent = prepareSourceFileContent(sourceFileContent);
        return readDependencyFromPreparedFile(preparedSourceFileContent, dependenciesMap);
    }
}
