/*
 AbstractDependencyImpl.java
 Creation date : 20/06/2010
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

package net.sourceforge.plantuml.dependency;

import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class AbstractDependencyImpl implements AbstractDependency {

    private DependencyType dependencyType;

    /**
     * @param type
     * @since 1.0
     */
    public AbstractDependencyImpl(final DependencyType type) {
        dependencyType = type;
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @since 1.0
     */
    public AbstractDependencyImpl(final String dependencyName, final String dependencyPackageName) {
        this(new StubDependencyTypeImpl(dependencyName, dependencyPackageName));
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public int compareTo(final AbstractDependency a) {
        int comparison = AFTER.getResult();

        if (this == a) {
            comparison = EQUAL.getResult();
        } else {
            comparison = getDependencyType().compareTo(a.getDependencyType());
        }

        return comparison;
    }

    /**
     * {@inheritDoc}
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
        final AbstractDependencyImpl other = (AbstractDependencyImpl) obj;
        if (dependencyType == null) {
            if (other.dependencyType != null) {
                return false;
            }
        } else if (!dependencyType.equals(other.dependencyType)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public DependencyType getDependencyType() {
        return dependencyType;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getFullName() {
        return getDependencyType().getFullName();
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getName() {
        return getDependencyType().getName();
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getPackageName() {
        return getDependencyType().getPackageName();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLDeclaration() {
        return getDependencyType().getPlantUMLDeclaration();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLLinksDescription() {
        return getDependencyType().getPlantUMLLinksDescription();
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dependencyType == null) ? 0 : dependencyType.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public void setDependencyType(final DependencyType value) {
        dependencyType = value;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [dependencyType=" + dependencyType + "]";
    }
}
