/*
 JavaProgrammingLanguageContext.java
 Creation date : 28/08/2010
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

/**
 * The java {@link ProgrammingLanguageContext} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaProgrammingLanguageContext implements ProgrammingLanguageContext {

    /** Serial version UID. */
    private static final long serialVersionUID = -2181655116426569842L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(JavaProgrammingLanguageContext.class.getName());

    /**
     * The {@link Map} containing all dependencies which have already been treated, it contains
     * dependencies full names (package + name) as keys and their associated
     * {@link GenericDependency} as values.
     */
    private Map < String, GenericDependency > dependenciesMap;

    /**
     * Default constructor.
     * 
     * @since 1.0
     */
    public JavaProgrammingLanguageContext() {
        this(new HashSet < GenericDependency >());
    }

    /**
     * Full constructor.
     * 
     * @param dependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @since 1.0
     */
    public JavaProgrammingLanguageContext(final Set < GenericDependency > dependencies) {
        // TODO test null
        final Map < String, GenericDependency > dependenciesMap = new HashMap < String, GenericDependency >();
        for (final GenericDependency genericDependency : dependencies) {
            dependenciesMap.put(genericDependency.getFullName(), genericDependency);
        }
        setDependenciesMap(dependenciesMap);
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
        JavaProgrammingLanguageContext j = null;

        try {
            j = (JavaProgrammingLanguageContext) super.clone();
            j.dependenciesMap = new HashMap < String, GenericDependency >();
            for (final GenericDependency genericDependency : getAllDependencies()) {
                j.dependenciesMap.put(genericDependency.getFullName(), genericDependency.deepClone());
            }
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return j;
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
        final JavaProgrammingLanguageContext other = (JavaProgrammingLanguageContext) obj;
        if (dependenciesMap == null) {
            if (other.dependenciesMap != null) {
                return false;
            }
        } else if (!dependenciesMap.equals(other.dependenciesMap)) {
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
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dependenciesMap == null) ? 0 : dependenciesMap.hashCode());
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
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [dependenciesMap=" + dependenciesMap + "]";
    }
}
