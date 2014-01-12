/*
 JavaType.java
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type;

import static java.util.Collections.unmodifiableMap;
import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_LANGUAGE_KEYWORD_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.UNKNOWN_JAVA_TYPE_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.JAVA_PARENT_TYPE_STRING_EMPTY_FINE;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.JAVA_TYPE_FOUND_FINE;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.BLANK_STRING;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNullOrEmpty;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isEmpty;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.type.DependencyType;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;

/**
 * The abstract class which describes all existing java types such as classes, interfaces,
 * enumerations and annotations.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
public abstract class JavaType implements Comparable < JavaType >, Serializable {

    /** Serial version UID. */
    private static final long serialVersionUID = 13586383951181146L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaType.class.getName());

    /** The "annotation" java type. */
    public static final JavaType ANNOTATION = new AnnotationJavaType("@interface");

    /** The "class" java type. */
    public static final JavaType CLASS = new ClassJavaType("class");

    /** The "enum" java type. */
    public static final JavaType ENUM = new EnumJavaType("enum");

    /** The "interface" java type. */
    public static final JavaType INTERFACE = new InterfaceJavaType("interface");

    /**
     * The {@link Map} containing all java types, which as their language keyword as keys and the
     * associated {@link JavaType} instance as values.
     */
    private static final Map < String, JavaType > JAVA_TYPE_MAP = createJavaTypeMap();

    /**
     * Creates the static {@link Map} containing all {@link JavaType}.
     *
     * @return the {@link Map} of all {@link JavaType} as values, with their associated language
     *         keyword as keys.
     * @since 1.3.0
     */
    private static Map < String, JavaType > createJavaTypeMap() {
        final Map < String, JavaType > javaTypeMap = new TreeMap < String, JavaType >();

        javaTypeMap.put(ANNOTATION.getLanguageKeyword(), ANNOTATION);
        javaTypeMap.put(CLASS.getLanguageKeyword(), CLASS);
        javaTypeMap.put(ENUM.getLanguageKeyword(), ENUM);
        javaTypeMap.put(INTERFACE.getLanguageKeyword(), INTERFACE);

        return unmodifiableMap(javaTypeMap);
    }

    /**
     * Gets the {@link Collection} of all {@link JavaType}.
     *
     * @return the {@link Collection} of all {@link JavaType} available.
     * @since 1.3.0
     */
    public static Collection < JavaType > getJavaTypeCollection() {
        return JAVA_TYPE_MAP.values();
    }

    /**
     * Gets the {@link JavaType} instance associated to the passed java type language keyword. Throw
     * an {@link IllegalArgumentException} if the java type name isn't recognized.
     *
     * @param javaTypeKeyword
     *            the java type language keyword to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @return the {@link JavaType} instance associated to the passed java type language keyword if
     *         available.
     * @since 1.3.0
     */
    public static JavaType valueOfIgnoringCase(final String javaTypeKeyword) {
        checkNullOrEmpty(javaTypeKeyword, JAVA_TYPE_LANGUAGE_KEYWORD_NULL_ERROR);

        final JavaType javaType = JAVA_TYPE_MAP.get(javaTypeKeyword.toLowerCase());
        if (javaType != null) {
            LOGGER.log(FINE, buildLogString(JAVA_TYPE_FOUND_FINE, javaTypeKeyword));
        } else {
            throw new IllegalArgumentException(buildLogString(UNKNOWN_JAVA_TYPE_ERROR, javaTypeKeyword));
        }

        return javaType;
    }

    /** The java type language keyword. */
    private String languageKeyword;

    /**
     * Default constructor.
     *
     * @param programmingLanguageKeyword
     *            The java type language keyword, mustn't be <code>null</code>.
     * @since 1.3.0
     */
    protected JavaType(final String programmingLanguageKeyword) {
        setLanguageKeyword(programmingLanguageKeyword);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int compareTo(final JavaType o) {
        if (this == o) {
            return EQUAL.getResult();
        }

        return getLanguageKeyword().compareTo(o.getLanguageKeyword());
    }

    /**
     * Creates the annotation {@link DependencyType} instance associated to the current java type
     * following the passed parameters.
     *
     * @param annotationName
     *            the dependency annotation name, such as "String", mustn't be <code>null</code>.
     * @param annotationPackageName
     *            the dependency annotation package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @return the {@link DependencyType} instance which is an annotation of the current java type,
     *         following the passed parameters.
     * @throws PlantUMLDependencyException
     *             if the requested java annotation type is incompatible with the current java type.
     * @since 1.2.0
     */
    public abstract DependencyType createAnnotationDependencyType(String annotationName, String annotationPackageName)
            throws PlantUMLDependencyException;

    /**
     * Creates the {@link DependencyType} instance associated to the current java type following
     * passed parameters.
     *
     * @param dependencyName
     *            the dependency name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            the dependency package name, such as "java.lang", mustn't be <code>null</code>.
     * @param isAbstract
     *            the boolean telling if the java dependency is abstract or not.
     * @param importDependencies
     *            the {@link ImportDependenciesCollection} containing all import dependencies which
     *            are needed by the current dependency type to work, mustn't be <code>null</code>.
     * @param parentExtensionsDependencies
     *            the {@link Set} of all {@link GenericDependency} which are extended, mustn't be
     *            <code>null</code>.
     * @param parentImplementationsDependencies
     *            the {@link Set} of all {@link GenericDependency} which are implemented, mustn't be
     *            <code>null</code>.
     * @param annotationDependencies
     *            the {@link Set} of all {@link GenericDependency} which are used as annotation,
     *            mustn't be <code>null</code>.
     * @return the {@link DependencyType} instance, following the current java type and the passed
     *         parameters.
     * @since 1.3.0
     */
    public abstract DependencyType createDependencyType(String dependencyName, String dependencyPackageName,
            boolean isAbstract, ImportDependenciesCollection importDependencies,
            Set < GenericDependency > parentExtensionsDependencies,
            Set < GenericDependency > parentImplementationsDependencies,
            Set < GenericDependency > annotationDependencies);

    /**
     * Creates the parent {@link DependencyType} instance associated to the current java type
     * following the {@link JavaParentType} and passed parameters.
     *
     * @param parentType
     *            the {@link JavaParentType} instance, mustn't be <code>null</code>.
     * @param parentName
     *            the dependency parent name, such as "String", mustn't be <code>null</code>.
     * @param parentPackageName
     *            the dependency parent package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @return the {@link DependencyType} instance which is the parent of the current java type,
     *         following the java java type and the passed parameters.
     * @throws PlantUMLDependencyException
     *             if the requested java parent type is incompatible with the current java type.
     * @since 1.3.0
     */
    public abstract DependencyType createParentDependencyType(JavaParentType parentType, String parentName,
            String parentPackageName) throws PlantUMLDependencyException;

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JavaType other = (JavaType) obj;
        if (languageKeyword == null) {
            if (other.languageKeyword != null) {
                return false;
            }
        } else if (!languageKeyword.equals(other.languageKeyword)) {
            return false;
        }
        return true;
    }

    /**
     * Parses and extracts the java source file content to know if it contains links to native code
     * through native methods.
     *
     * @param javaSourceFileContent
     *            the java source file content to analyze as a {@link String}, mustn't be
     *            <code>null</code>.
     * @return <code>true</code> if the dependency contains native methods, <code>false</code>
     *         otherwise.
     * @since 1.3.0
     */
    public abstract boolean extractNativeMethods(String javaSourceFileContent);

    /**
     * Parses and extracts the {@link Set} of parent dependency names of type
     * {@link JavaParentType#EXTENSION} from the passed {@link String}.
     *
     * @param extendsString
     *            the {@link String} which describes the dependencies which are extended by the
     *            current java type.
     *            <p>
     *            For instance it can be :<br>
     *            <i>Comparable, Cloneable</i><br>
     *            <i>Number</i><br>
     *            </p>
     * @return the {@link Set} of parent dependency names parsed from the {@link String}.
     * @throws PlantUMLDependencyException
     *             if the requested parent dependency names are incompatible with the current java
     *             type.
     * @since 1.3.0
     */
    public abstract Set < String > extractParentExtensions(String extendsString) throws PlantUMLDependencyException;

    /**
     * Parses and extracts the {@link Set} of parent dependency names of type
     * {@link JavaParentType#IMPLEMENTATION} from the passed {@link String}.
     *
     * @param implementsString
     *            the {@link String} which describes the dependencies which are implemented by the
     *            current java type.
     *            <p>
     *            For instance it can be :<br>
     *            <i>Serializable, Cloneable</i><br>
     *            <i>Number</i><br>
     *            </p>
     * @return the {@link Set} of parent dependency names parsed from the {@link String}.
     * @throws PlantUMLDependencyException
     *             if the requested parent dependency names are incompatible with the current java
     *             type.
     * @since 1.3.0
     */
    public abstract Set < String > extractParentImplementations(String implementsString)
            throws PlantUMLDependencyException;

    /**
     * Generic method to parse and extract the {@link Set} of parent dependency names of any type
     * from the passed {@link String}.
     *
     * @param parentsString
     *            the {@link String} which describes the parents dependencies of the current java
     *            type.
     *            <p>
     *            For instance it can be :<br>
     *            <i>Serializable, Cloneable</i><br>
     *            <i>Number</i><br>
     *            </p>
     * @return the {@link Set} of parent dependency names parsed from the {@link String}.
     * @since 1.3.0
     */
    protected Set < String > extractParents(final String parentsString) {
        final Set < String > parents = new TreeSet < String >();

        if (isEmpty(parentsString)) {
            LOGGER.log(FINE, JAVA_PARENT_TYPE_STRING_EMPTY_FINE);
        } else {
            final StringTokenizer tokenizer = new StringTokenizer(parentsString, COMMA_CHAR);
            while (tokenizer.hasMoreTokens()) {
                final String interfaceName = tokenizer.nextToken().replace(SPACE_CHAR, BLANK_STRING);
                parents.add(interfaceName);
            }
        }

        return parents;
    }

    /**
     * Gets the value of <code>languageKeyword</code>.
     *
     * @return the value of <code>languageKeyword</code>.
     * @since 1.3.0
     */
    public String getLanguageKeyword() {
        return languageKeyword;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((languageKeyword == null) ? 0 : languageKeyword.hashCode());
        return result;
    }

    /**
     * Sets the value of <code>languageKeyword</code>.
     *
     * @param value
     *            the <code>languageKeyword</code> to set, can be <code>null</code>.
     * @see #getLanguageKeyword()
     * @since 1.3.0
     */
    private void setLanguageKeyword(final String value) {
        checkNullOrEmpty(value, JAVA_TYPE_LANGUAGE_KEYWORD_NULL_ERROR);

        languageKeyword = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [languageKeyword=" + languageKeyword + "]";
    }
}
