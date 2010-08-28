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

import static net.sourceforge.mazix.components.utils.check.ParameterChecker.checkNull;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_NULL_ERROR;

import java.util.HashMap;
import java.util.Map;

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
        setDependenciesMap(new HashMap < String, GenericDependency >());
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
