/*
 ProgrammingLanguage.java
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument;

import static java.util.Collections.unmodifiableMap;
import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.PROGRAMMING_LANGUAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.UNKNOWN_PROGRAMMING_LANGUAGE_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.FineConstants.PROGRAMMING_LANGUAGE_FOUND_FINE;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNullOrEmpty;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.ProgrammingLanguageContext;

/**
 * The abstract class which describes all supported programming language which can be reverse
 * engineered.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public abstract class ProgrammingLanguage implements Comparable < ProgrammingLanguage >, Serializable {

    /** Serial version UID. */
    private static final long serialVersionUID = -4593346488847506817L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(ProgrammingLanguage.class.getName());

    /** The java programming language. */
    public static final ProgrammingLanguage JAVA = new JavaProgrammingLanguage("java");

    /** The c++ programming language. */
    public static final ProgrammingLanguage CPP = new CppProgrammingLanguage("cpp");

    /** The number of millisecond in one second. */
    private static final Map < String, ProgrammingLanguage > PROGRAMMING_LANGUAGE_MAP = createProgrammingLanguageMap();

    /**
     * Creates the static {@link Map} containing all {@link ProgrammingLanguage}.
     *
     * @return the {@link Map} of all {@link ProgrammingLanguage} as values, with their associated
     *         names as keys.
     * @since 1.0.0
     */
    private static Map < String, ProgrammingLanguage > createProgrammingLanguageMap() {
        final Map < String, ProgrammingLanguage > programmingLanguageMap = new TreeMap < String, ProgrammingLanguage >();

        programmingLanguageMap.put(CPP.getName(), CPP);
        programmingLanguageMap.put(JAVA.getName(), JAVA);

        return unmodifiableMap(programmingLanguageMap);
    }

    /**
     * Gets the {@link Collection} of all {@link ProgrammingLanguage}.
     *
     * @return the {@link Collection} of all {@link ProgrammingLanguage} available.
     * @since 1.0.0
     */
    public static Collection < ProgrammingLanguage > getProgrammingLanguageCollection() {
        return PROGRAMMING_LANGUAGE_MAP.values();
    }

    /**
     * Gets the {@link Set} of all programming languages names.
     *
     * @return the {@link Set} of all programming languages names available.
     * @since 1.0.0
     */
    public static Set < String > getProgrammingLanguageNamesSet() {
        final Set < String > names = new TreeSet < String >();

        for (final ProgrammingLanguage programmingLanguage : getProgrammingLanguageCollection()) {
            names.add(programmingLanguage.getName());
        }

        return names;
    }

    /**
     * Gets the {@link ProgrammingLanguage} instance associated to the passed name. Throw an
     * {@link IllegalArgumentException} if the programming language name isn't recognized.
     *
     * @param programmingLanguageName
     *            the programming language name to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @return the {@link ProgrammingLanguage} instance associated to the passed name if available.
     * @since 1.0.0
     */
    public static ProgrammingLanguage valueOfIgnoringCase(final String programmingLanguageName) {
        checkNullOrEmpty(programmingLanguageName, PROGRAMMING_LANGUAGE_NAME_NULL_ERROR);

        ProgrammingLanguage programmingLanguage = null;

        programmingLanguage = PROGRAMMING_LANGUAGE_MAP.get(programmingLanguageName.toLowerCase());
        if (programmingLanguage != null) {
            LOGGER.log(FINE, buildLogString(PROGRAMMING_LANGUAGE_FOUND_FINE, programmingLanguage));
        } else {
            throw new IllegalArgumentException(buildLogString(UNKNOWN_PROGRAMMING_LANGUAGE_ERROR,
                    programmingLanguageName));
        }

        return programmingLanguage;
    }

    /** The programming language name. */
    private String name;

    /**
     * Default constructor.
     *
     * @param programmingLanguageName
     *            the programming language name to get the instance from, mustn't be
     *            <code>null</code> nor empty.
     * @since 1.0.0
     */
    protected ProgrammingLanguage(final String programmingLanguageName) {
        setName(programmingLanguageName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public int compareTo(final ProgrammingLanguage o) {
        if (this == o) {
            return EQUAL.getResult();
        }

        return getName().compareTo(o.getName());
    }

    /**
     * Create a new {@link ProgrammingLanguageContext} following the language.
     *
     * @param displayTypesOpts
     *            the {@link Set} of display types options which filter type to appear in the
     *            plantUML description, mustn't be <code>null</code>.
     * @param displayPackageNamePattern
     *            the {@link Pattern} which filter package name to appear in the plantUML
     *            description, mustn't be <code>null</code>.
     * @param displayNamePattern
     *            the {@link Pattern} which filter name to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @return a new empty {@link ProgrammingLanguageContext} instance.
     * @since 1.0.0
     */
    public abstract ProgrammingLanguageContext createNewContext(final Set < DisplayType > displayTypesOpts,
            final Pattern displayPackageNamePattern, final Pattern displayNamePattern);

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
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
        final ProgrammingLanguage other = (ProgrammingLanguage) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    /**
     * Gets the value of <code>name</code>.
     *
     * @return the value of <code>name</code>.
     * @since 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * Reads the following source file content as a {@link String} to build the
     * {@link GenericDependency} instance. This method also modify the
     * <code>programmingLanguageContext</code> parameter by adding read objects and the parsed
     * dependencies.
     *
     * @param sourceFileContent
     *            the source file content as a {@link String} to read, mustn't be <code>null</code>.
     *            Should contain the expected programming language.
     * @param programmingLanguageContext
     *            the context instance containing all dependencies which have already been seen in
     *            previous treatment, and other information which can be shared when parsing several
     *            source files, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance if it has been found and correctly parsed,
     *         <code>null</code> otherwise. May also be <code>null</code> if the context display
     *         types options doesn't manage the dependency type.
     * @throws PlantUMLDependencyException
     *             if any parsing exception occurs while reading the source file.
     * @since 1.0.0
     */
    public abstract GenericDependency readDependencyFromFile(String sourceFileContent,
            ProgrammingLanguageContext programmingLanguageContext) throws PlantUMLDependencyException;

    /**
     * Sets the value of <code>name</code>.
     *
     * @param value
     *            the <code>name</code> to set, can be <code>null</code>.
     * @see #getName()
     * @since 1.0.0
     */
    private void setName(final String value) {
        checkNullOrEmpty(value, PROGRAMMING_LANGUAGE_NAME_NULL_ERROR);

        name = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name + "]";
    }
}
