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
import static net.sourceforge.mazix.components.utils.check.ParameterChecker.checkNull;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NULL_ERROR;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
 * @version 1.0
 */
public abstract class AbstractProgrammingLanguageContext implements ProgrammingLanguageContext {

    /** Serial version UID. */
    private static final long serialVersionUID = -2181655116426569842L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(AbstractProgrammingLanguageContext.class.getName());

    /**
     * The {@link Map} containing all dependencies which have already been treated, it contains
     * dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > dependenciesMap;

    /**
     * The display options which have to appear in the plantUML description, mustn't be
     * <code>null</code>.
     */
    private Set < Display > displayOptions;

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
     * Full constructor.
     * 
     * @param dependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    protected AbstractProgrammingLanguageContext(final Set < GenericDependency > dependencies,
            final Set < Display > displayOpt) {
        // TODO test null
        final Map < String, GenericDependency > dependenciesMap = new HashMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : dependencies) {
            dependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setDependenciesMap(dependenciesMap);
        setDisplayOptions(new HashSet < Display >(displayOpt));
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public void addOrReplaceDependencies(final GenericDependency dependency) {
        checkNull(dependency, DEPENDENCY_NULL_ERROR);
        getDependenciesMap().put(dependency.getFullName(), dependency);
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
            a.dependenciesMap = new HashMap < String, GenericDependency >();
            for (final GenericDependency genericDependency : getAllDependencies()) {
                a.dependenciesMap.put(genericDependency.getFullName(), genericDependency.deepClone());
            }
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
        if (dependenciesMap == null) {
            if (other.dependenciesMap != null) {
                return false;
            }
        } else if (!dependenciesMap.equals(other.dependenciesMap)) {
            return false;
        }
        if (displayOptions == null) {
            if (other.displayOptions != null) {
                return false;
            }
        } else if (!displayOptions.equals(other.displayOptions)) {
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
    public Collection < GenericDependency > getAllDependencies() {
        return getDependenciesMap().values();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public GenericDependency getDependencies(final String fullName) {
        checkNull(fullName, DEPENDENCY_NAME_NULL_ERROR);
        return getDependenciesMap().get(fullName);
    }

    /**
     * Gets the value of <code>dependenciesMap</code>.
     * 
     * @return the value of <code>dependenciesMap</code>.
     * @see #setDependenciesMap(Map)
     * @since 1.0
     */
    private Map < String, GenericDependency > getDependenciesMap() {
        return dependenciesMap;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dependenciesMap == null) ? 0 : dependenciesMap.hashCode());
        result = prime * result + ((displayOptions == null) ? 0 : displayOptions.hashCode());
        return result;
    }

    /**
     * Sets the value of <code>dependenciesMap</code>.
     * 
     * @param value
     *            the <code>dependenciesMap</code> to set, can be <code>null</code>.
     * @see #getDependenciesMap()
     * @since 1.0
     */
    private void setDependenciesMap(final Map < String, GenericDependency > value) {
        dependenciesMap = value;
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
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [dependenciesMap=" + dependenciesMap + ", displayOptions="
                + displayOptions + "]";
    }
}
