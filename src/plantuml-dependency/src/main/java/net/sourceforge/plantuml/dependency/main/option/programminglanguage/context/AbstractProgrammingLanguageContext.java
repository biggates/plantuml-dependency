/*
 AbstractProgrammingLanguageContext.java
 Creation date : 3/09/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.context;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.BEFORE;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.END_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.START_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.FILE_NULL_ERROR;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

/**
 * An abstract implementation of the {@link ProgrammingLanguageContext} interface, providing common
 * behaviors.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public abstract class AbstractProgrammingLanguageContext implements ProgrammingLanguageContext {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractProgrammingLanguageContext.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -2181655116426569842L;

    /**
     * The display options which have to appear in the plantUML description, mustn't be
     * <code>null</code>.
     */
    private Set < Display > displayOptions;

    /**
     * The {@link Map} containing all dependencies which have already been treated or seen, it
     * contains dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > parsedAndSeenDependenciesMap;

    /**
     * The {@link Map} containing all dependencies which have already been treated, it contains
     * dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > parsedDependenciesMap;

    /**
     * Default constructor.
     *
     * @since 1.0
     */
    protected AbstractProgrammingLanguageContext() {
        this(new HashSet < GenericDependency >(), new HashSet < Display >());
    }

    /**
     * Medium constructor.
     *
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    protected AbstractProgrammingLanguageContext(final Set < Display > displayOpt) {
        this(new HashSet < GenericDependency >(), displayOpt);
    }

    /**
     * Medium constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    protected AbstractProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < Display > displayOpt) {
        this(parsedAndSeenDependencies, parsedAndSeenDependencies, displayOpt);
    }

    /**
     * Full constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param parsedDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    protected AbstractProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies, final Set < Display > displayOpt) {
        // TODO test null
        final Map < String, GenericDependency > firstDependenciesMap = new TreeMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : parsedAndSeenDependencies) {
            firstDependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setParsedAndSeenDependenciesMap(firstDependenciesMap);
        final Map < String, GenericDependency > secondDependenciesMap = new TreeMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : parsedDependencies) {
            secondDependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setSeenDependenciesMap(new TreeMap < String, GenericDependency >(secondDependenciesMap));
        setDisplayOptions(new HashSet < Display >(displayOpt));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public void addParsedAndSeenDependencies(final GenericDependency dependency) {
        checkNull(dependency, DEPENDENCY_NULL_ERROR);
        getParsedDependenciesMap().put(dependency.getFullName(), dependency);
        getParsedAndSeenDependenciesMap().put(dependency.getFullName(), dependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public void addSeenDependencies(final GenericDependency dependency) {
        checkNull(dependency, DEPENDENCY_NULL_ERROR);
        getParsedAndSeenDependenciesMap().put(dependency.getFullName(), dependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 0.8
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO [graffity] Auto-generated method stub
        return super.clone();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public int compareTo(final ProgrammingLanguageContext o) {
        final int thisSize = getParsedDependencies().size();
        final int anotherSize = o.getParsedDependencies().size();
        return (thisSize < anotherSize ? BEFORE.getResult() : (thisSize == anotherSize ? EQUAL.getResult() : AFTER
                .getResult()));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public ProgrammingLanguageContext deepClone() {
        AbstractProgrammingLanguageContext a = null;

        try {
            a = (AbstractProgrammingLanguageContext) super.clone();
            a.parsedAndSeenDependenciesMap = new TreeMap < String, GenericDependency >();
            for (final GenericDependency genericDependency : getParsedAndSeenDependencies()) {
                a.parsedAndSeenDependenciesMap.put(genericDependency.getFullName(), genericDependency.deepClone());
            }
            a.parsedDependenciesMap = new TreeMap < String, GenericDependency >(a.parsedDependenciesMap);
            a.displayOptions = new HashSet < Display >(getDisplayOptions());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return a;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
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
        final AbstractProgrammingLanguageContext other = (AbstractProgrammingLanguageContext) obj;
        if (displayOptions == null) {
            if (other.displayOptions != null) {
                return false;
            }
        } else if (!displayOptions.equals(other.displayOptions)) {
            return false;
        }
        if (parsedAndSeenDependenciesMap == null) {
            if (other.parsedAndSeenDependenciesMap != null) {
                return false;
            }
        } else if (!parsedAndSeenDependenciesMap.equals(other.parsedAndSeenDependenciesMap)) {
            return false;
        }
        if (parsedDependenciesMap == null) {
            if (other.parsedDependenciesMap != null) {
                return false;
            }
        } else if (!parsedDependenciesMap.equals(other.parsedDependenciesMap)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public GenericDependency getDependencies(final String fullName) {
        checkNull(fullName, DEPENDENCY_NAME_NULL_ERROR);
        return getParsedAndSeenDependenciesMap().get(fullName);
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
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public Collection < GenericDependency > getParsedAndSeenDependencies() {
        return getParsedAndSeenDependenciesMap().values();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Collection < GenericDependency > getDisplayableParsedAndSeenDependencies(final Collection < Display > displayOpts) {
        final Set < GenericDependency > displayableParsedAndSeenDependencies = new HashSet < GenericDependency >();
        for (final GenericDependency dependency : getParsedAndSeenDependencies()) {
            if (dependency.getDependencyType().isDisplayable(displayOpts)) {
                displayableParsedAndSeenDependencies.add(dependency);
            }
        }

        return displayableParsedAndSeenDependencies;
    }

    /**
     * Gets the value of <code>parsedAndSeenDependenciesMap</code>.
     *
     * @return the value of <code>parsedAndSeenDependenciesMap</code>.
     * @see #setParsedAndSeenDependenciesMap(Map)
     * @since 1.0
     */
    private Map < String, GenericDependency > getParsedAndSeenDependenciesMap() {
        return parsedAndSeenDependenciesMap;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public Collection < GenericDependency > getParsedDependencies() {
        return getParsedDependenciesMap().values();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public Collection < GenericDependency > getDisplayableParsedDependencies(final Collection < Display > displayOpts) {
        final Set < GenericDependency > displayableParsedDependencies = new HashSet < GenericDependency >();
        for (final GenericDependency dependency : getParsedDependencies()) {
            if (dependency.getDependencyType().isDisplayable(displayOpts)) {
                displayableParsedDependencies.add(dependency);
            }
        }

        return displayableParsedDependencies;
    }

    /**
     * Gets the value of <code>parsedDependenciesMap</code>.
     *
     * @return the value of <code>parsedDependenciesMap</code>.
     * @see #setParsedDependenciesMap(Map)
     * @since 1.0
     */
    private Map < String, GenericDependency > getParsedDependenciesMap() {
        return parsedDependenciesMap;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((displayOptions == null) ? 0 : displayOptions.hashCode());
        result = prime * result
                + ((parsedAndSeenDependenciesMap == null) ? 0 : parsedAndSeenDependenciesMap.hashCode());
        result = prime * result + ((parsedDependenciesMap == null) ? 0 : parsedDependenciesMap.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public boolean hasToDisplay(final Display display) {
        return getDisplayOptions().contains(display);
    }

    /**
     * Sets the value of <code>displayOptions</code>.
     *
     * @param value
     *            the <code>displayOptions</code> to set, can be <code>null</code>.
     * @see #getDisplayOptions()
     * @since 1.0
     */
    private void setDisplayOptions(final Set < Display > value) {
        displayOptions = value;
    }

    /**
     * Sets the value of <code>parsedAndSeenDependenciesMap</code>.
     *
     * @param value
     *            the <code>parsedAndSeenDependenciesMap</code> to set, can be <code>null</code>.
     * @see #getParsedAndSeenDependenciesMap()
     * @since 1.0
     */
    private void setParsedAndSeenDependenciesMap(final Map < String, GenericDependency > value) {
        parsedAndSeenDependenciesMap = value;
    }

    /**
     * Sets the value of <code>seenDependenciesMap</code>.
     *
     * @param value
     *            the <code>seenDependenciesMap</code> to set, can be <code>null</code>.
     * @see #getSeenDependenciesMap()
     * @since 1.0
     */
    private void setSeenDependenciesMap(final Map < String, GenericDependency > value) {
        parsedDependenciesMap = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [parsedAndSeenDependenciesMap=" + parsedAndSeenDependenciesMap
                + ", parsedDependenciesMap=" + parsedDependenciesMap + ", displayOptions=" + displayOptions + "]";
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    public void writePlantUMLFile(final File file) {
        checkNull(file, FILE_NULL_ERROR);

        final StringBuffer buffer = new StringBuffer(START_PLANTUML);
        final StringBuffer buffer2 = new StringBuffer();

        for (final GenericDependency genericDependency : getDisplayableParsedAndSeenDependencies(getDisplayOptions())) {
            buffer.append(genericDependency.getDependencyType().getPlantUMLDeclaration(getDisplayOptions()));
            buffer2.append(genericDependency.getDependencyType().getPlantUMLLinksDescription(getDisplayOptions()));
        }

        buffer2.append(END_PLANTUML);
        writeIntoFile(buffer.toString(), file);
        writeIntoFile(buffer2.toString(), file, true);
    }
}
