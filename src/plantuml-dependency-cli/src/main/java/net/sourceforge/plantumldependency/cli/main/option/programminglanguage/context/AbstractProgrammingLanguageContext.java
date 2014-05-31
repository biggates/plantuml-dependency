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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.plantumldependency.cli.constants.PlantUMLDependencyConstants.JAVA_LANG_PACKAGE;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.DEPENDENCY_NULL_ERROR;
import static net.sourceforge.plantumldependency.common.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.BEFORE;
import static net.sourceforge.plantumldependency.common.utils.comparable.ComparableResult.EQUAL;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.PlantUMLClassesDiagram;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.element.PlantUMLClassesDiagramElement;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.impl.PlantUMLClassesDiagramImpl;
import net.sourceforge.plantumldependency.cli.plantumldiagram.classes.relation.PlantUMLClassesDiagramRelation;

/**
 * An abstract implementation of the {@link ProgrammingLanguageContext} interface, providing common
 * behaviors.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public abstract class AbstractProgrammingLanguageContext implements ProgrammingLanguageContext {

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractProgrammingLanguageContext.class.getName());

    /** Serial version UID. */
    private static final long serialVersionUID = -2181655116426569842L;

    /**
     * The display types options which have to appear in the plantUML description, mustn't be
     * <code>null</code>.
     */
    private Set < DisplayType > displayTypesOptions;

    /**
     * The {@link Map} containing all dependencies which have already been treated or seen, it
     * contains dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > parsedAndSeenDependenciesMap;

    /**
     * The {@link Map} containing all dependencies which have already been marked and seen as a
     * potential "java.lang" dependency. This should be used when the dependency package can be
     * known between the current package and the "java.lang" package because dependencies are read
     * in a sequential way.
     */
    private Map < String, GenericDependency > potentialJavaLangSeenDependenciesMap;

    /**
     * The {@link Map} containing all dependencies which have already been treated, it contains
     * dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > parsedDependenciesMap;

    /**
     * Default constructor.
     *
     * @since 1.0.0
     */
    protected AbstractProgrammingLanguageContext() {
        this(new TreeSet < GenericDependency >(), new TreeSet < DisplayType >());
    }

    /**
     * Medium constructor.
     *
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    protected AbstractProgrammingLanguageContext(final Set < DisplayType > displayTypesOpt) {
        this(new TreeSet < GenericDependency >(), displayTypesOpt);
    }

    /**
     * Medium constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original parsed and seen dependencies {@link Set} of {@link GenericDependency}
     *            to put in the context, mustn't be <code>null</code>.
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    protected AbstractProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < DisplayType > displayTypesOpt) {
        this(parsedAndSeenDependencies, parsedAndSeenDependencies, new TreeSet < GenericDependency >(), displayTypesOpt);
    }

    /**
     * Full constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original parsed and seen dependencies {@link Set} of {@link GenericDependency}
     *            to put in the context, mustn't be <code>null</code>.
     * @param parsedDependencies
     *            the original parsed dependencies {@link Set} of {@link GenericDependency} to put
     *            in the context, mustn't be <code>null</code>.
     * @param potentialJavaLangSeenDependencies
     *            the original potential "java.lang" seen dependencies {@link Set} of
     *            {@link GenericDependency} to put in the context, mustn't be <code>null</code>.
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    protected AbstractProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies,
            final Set < GenericDependency > potentialJavaLangSeenDependencies, final Set < DisplayType > displayTypesOpt) {
        // TODO test null
        final Map < String, GenericDependency > firstDependenciesMap = new TreeMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : parsedAndSeenDependencies) {
            firstDependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setParsedAndSeenDependenciesMap(firstDependenciesMap);

        // FIXME should test that all dependencies of the parsedDependencies Set are in the
        // parsedAndSeenDependencies Set
        final Map < String, GenericDependency > secondDependenciesMap = new TreeMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : parsedDependencies) {
            secondDependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setParsedDependenciesMap(secondDependenciesMap);

        // FIXME should test that all dependencies of the PotentialJavaLangSeenDependencies Set are
        // in the parsedAndSeenDependencies Set
        final Map < String, GenericDependency > thirdDependenciesMap = new TreeMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : potentialJavaLangSeenDependencies) {
            thirdDependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setPotentialJavaLangSeenDependenciesMap(thirdDependenciesMap);

        setDisplayTypesOptions(new TreeSet < DisplayType >(displayTypesOpt));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
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
     * @since 1.2.0
     */
    @Override
    public void addPotentialJavaLangSeenDependencies(final GenericDependency dependency) {
        checkNull(dependency, DEPENDENCY_NULL_ERROR);
        getParsedAndSeenDependenciesMap().put(dependency.getFullName(), dependency);
        getPotentialJavaLangSeenDependenciesMap().put(dependency.getFullName(), dependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public void addSeenDependencies(final GenericDependency dependency) {
        checkNull(dependency, DEPENDENCY_NULL_ERROR);
        getParsedAndSeenDependenciesMap().put(dependency.getFullName(), dependency);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public int compareTo(final ProgrammingLanguageContext o) {
        final int thisSize = getParsedDependencies().size();
        final int anotherSize = o.getParsedDependencies().size();
        return thisSize < anotherSize ? BEFORE.getResult() : thisSize == anotherSize ? EQUAL.getResult() : AFTER
                .getResult();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
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
            a.potentialJavaLangSeenDependenciesMap = new TreeMap < String, GenericDependency >(
                    a.potentialJavaLangSeenDependenciesMap);
            a.parsedDependenciesMap = new TreeMap < String, GenericDependency >(a.parsedDependenciesMap);
            a.displayTypesOptions = new TreeSet < DisplayType >(getDisplayTypesOptions());
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return a;
    }

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
        final AbstractProgrammingLanguageContext other = (AbstractProgrammingLanguageContext) obj;
        if (displayTypesOptions == null) {
            if (other.displayTypesOptions != null) {
                return false;
            }
        } else if (!displayTypesOptions.equals(other.displayTypesOptions)) {
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
        if (potentialJavaLangSeenDependenciesMap == null) {
            if (other.potentialJavaLangSeenDependenciesMap != null) {
                return false;
            }
        } else if (!potentialJavaLangSeenDependenciesMap.equals(other.potentialJavaLangSeenDependenciesMap)) {
            return false;
        }
        return true;
    }

    /**
     * Gets all dependencies which have been seen (as import for instance) and parsed within the
     * context and which have to be displayed following display types options.
     *
     * @param displayTypesOpts
     *            the {@link Set} of display types options, mustn't be <code>null</code>.
     * @return the {@link Collection} of all {@link GenericDependency} which have been seen (as
     *         import for instance) and parsed and associated with this context and which have to be
     *         displayed following display types options.
     * @since 1.1.1
     */
    private Collection < GenericDependency > getDisplayableParsedAndSeenDependencies(
            final Set < DisplayType > displayTypesOpts) {
        final Set < GenericDependency > displayableParsedAndSeenDependencies = new TreeSet < GenericDependency >();
        for (final GenericDependency dependency : getParsedAndSeenDependencies()) {
            if (dependency.getDependencyType().isDisplayable(displayTypesOpts)) {
                displayableParsedAndSeenDependencies.add(dependency);
            }
        }

        return displayableParsedAndSeenDependencies;
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
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Collection < GenericDependency > getParsedAndSeenDependencies() {
        return getParsedAndSeenDependenciesMap().values();
    }

    /**
     * Gets the value of <code>parsedAndSeenDependenciesMap</code>.
     *
     * @return the value of <code>parsedAndSeenDependenciesMap</code>.
     * @see #setParsedAndSeenDependenciesMap(Map)
     * @since 1.0.0
     */
    private Map < String, GenericDependency > getParsedAndSeenDependenciesMap() {
        return parsedAndSeenDependenciesMap;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Collection < GenericDependency > getParsedDependencies() {
        return getParsedDependenciesMap().values();
    }

    /**
     * Gets the value of <code>parsedDependenciesMap</code>.
     *
     * @return the value of <code>parsedDependenciesMap</code>.
     * @see #setParsedDependenciesMap(Map)
     * @since 1.0.0
     */
    private Map < String, GenericDependency > getParsedDependenciesMap() {
        return parsedDependenciesMap;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public GenericDependency getParsedDependency(final String fullName) {
        checkNull(fullName, DEPENDENCY_NAME_NULL_ERROR);
        return getParsedDependenciesMap().get(fullName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public GenericDependency getParsedOrSeenDependency(final String fullName) {
        checkNull(fullName, DEPENDENCY_NAME_NULL_ERROR);
        return getParsedAndSeenDependenciesMap().get(fullName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.1.1
     */
    @Override
    public PlantUMLClassesDiagram getPlantUMLClassesDiagram() {
        final Set < PlantUMLClassesDiagramElement > plantUMLClassesDiagramElements = new TreeSet < PlantUMLClassesDiagramElement >();
        final Set < PlantUMLClassesDiagramRelation > plantUMLClassesDiagramRelations = new TreeSet < PlantUMLClassesDiagramRelation >();

        for (final GenericDependency genericDependency : getDisplayableParsedAndSeenDependencies(getDisplayTypesOptions())) {
            plantUMLClassesDiagramElements
                    .add(genericDependency.getDependencyType().getPlantUMLClassesDiagramElement());
            plantUMLClassesDiagramRelations.addAll(genericDependency.getDependencyType()
                    .getPlantUMLClassesDiagramRelations(getDisplayTypesOptions()));
        }

        return new PlantUMLClassesDiagramImpl(plantUMLClassesDiagramElements, plantUMLClassesDiagramRelations);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public Collection < GenericDependency > getPotentialJavaLangSeenDependencies() {
        return getPotentialJavaLangSeenDependenciesMap().values();
    }

    /**
     * Gets the value of <code>potentialJavaLangSeenDependenciesMap</code>.
     *
     * @return the value of <code>potentialJavaLangSeenDependenciesMap</code>.
     * @see #setPotentialJavaLangSeenDependenciesMap(Map)
     * @since 1.2.0
     */
    private Map < String, GenericDependency > getPotentialJavaLangSeenDependenciesMap() {
        return potentialJavaLangSeenDependenciesMap;
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
        result = prime * result + ((displayTypesOptions == null) ? 0 : displayTypesOptions.hashCode());
        result = prime * result
                + ((parsedAndSeenDependenciesMap == null) ? 0 : parsedAndSeenDependenciesMap.hashCode());
        result = prime * result + ((parsedDependenciesMap == null) ? 0 : parsedDependenciesMap.hashCode());
        result = prime
                * result
                + ((potentialJavaLangSeenDependenciesMap == null) ? 0 : potentialJavaLangSeenDependenciesMap.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public boolean hasToDisplay(final DisplayType displayType) {
        return getDisplayTypesOptions().contains(displayType);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public void removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang() {
        for (final GenericDependency dependency : getPotentialJavaLangSeenDependencies()) {
            getParsedAndSeenDependenciesMap().remove(dependency.getFullName());
            dependency.getDependencyType().setFullName(JAVA_LANG_PACKAGE, dependency.getName());
            addSeenDependencies(dependency);
        }

        getPotentialJavaLangSeenDependenciesMap().clear();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public void removePotentialJavaLangSeenDependency(final String fullName) {
        checkNull(fullName, DEPENDENCY_NAME_NULL_ERROR);
        getPotentialJavaLangSeenDependenciesMap().remove(fullName);
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
     * Sets the value of <code>parsedAndSeenDependenciesMap</code>.
     *
     * @param value
     *            the <code>parsedAndSeenDependenciesMap</code> to set, can be <code>null</code>.
     * @see #getParsedAndSeenDependenciesMap()
     * @since 1.0.0
     */
    private void setParsedAndSeenDependenciesMap(final Map < String, GenericDependency > value) {
        parsedAndSeenDependenciesMap = value;
    }

    /**
     * Sets the value of <code>parsedDependenciesMap</code>.
     *
     * @param value
     *            the <code>parsedDependenciesMap</code> to set, can be <code>null</code>.
     * @see #getParsedDependenciesMap()
     * @since 1.0.0
     */
    private void setParsedDependenciesMap(final Map < String, GenericDependency > value) {
        parsedDependenciesMap = value;
    }

    /**
     * Sets the value of <code>potentialJavaLangSeenDependenciesMap</code>.
     *
     * @param value
     *            the <code>potentialJavaLangSeenDependenciesMap</code> to set, can be
     *            <code>null</code>.
     * @see #getPotentialJavaLangSeenDependenciesMap()
     * @since 1.2.0
     */
    private void setPotentialJavaLangSeenDependenciesMap(final Map < String, GenericDependency > value) {
        potentialJavaLangSeenDependenciesMap = value;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [displayTypesOptions=" + displayTypesOptions
                + ", parsedAndSeenDependenciesMap=" + parsedAndSeenDependenciesMap
                + ", potentialJavaLangSeenDependenciesMap=" + potentialJavaLangSeenDependenciesMap
                + ", parsedDependenciesMap=" + parsedDependenciesMap + "]";
    }
}
