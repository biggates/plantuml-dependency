/*
 GenericDependencyImpl.java
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

package net.sourceforge.plantuml.dependency.generic.impl;

import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static net.sourceforge.mazix.components.constants.log.ErrorConstants.UNEXPECTED_ERROR;
import static net.sourceforge.mazix.components.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.DEPENDENCY_TYPE_NULL_ERROR;

import java.util.logging.Logger;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.impl.stubimpl.StubDependencyTypeImpl;

/**
 * The default implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.GenericDependency} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class GenericDependencyImpl implements GenericDependency {

    /** Serial version UID. */
    private static final long serialVersionUID = 4512036274880797908L;

    /** The class logger. */
    private static final transient Logger LOGGER = getLogger(GenericDependencyImpl.class.getName());

    /** The underlying dependency type, which determines the real nature of the dependency. */
    private DependencyType dependencyType;

    /**
     * Default constructor, with a dependency type. This constructor is usually used when the
     * concrete dependency type (class, interface etc..) is already known.
     * 
     * @param type
     *            the underlying dependency type, which determines the real nature of the
     *            dependency, mustn't be <code>null</code>.
     * @since 1.0
     */
    public GenericDependencyImpl(final DependencyType type) {
        checkNull(type, DEPENDENCY_TYPE_NULL_ERROR);

        dependencyType = type;
    }

    /**
     * Stub constructor. This constructor is usually used when the concrete dependency type (class,
     * interface etc..) is not known when created the dependency. In this case, the
     * {@link StubDependencyTypeImpl} is used instead.
     * 
     * @param dependencyName
     *            the dependency name, usually the class name, mustn't be <code>null</code> nor
     *            empty.
     * @param dependencyPackageName
     *            the dependency package name, mustn't be <code>null</code> nor empty.
     * @since 1.0
     */
    public GenericDependencyImpl(final String dependencyName, final String dependencyPackageName) {
        this(new StubDependencyTypeImpl(dependencyName, dependencyPackageName));
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public int compareTo(final GenericDependency a) {
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
     * 
     * @since 1.0
     */
    @Override
    public GenericDependency deepClone() {
        GenericDependencyImpl g = null;

        try {
            g = (GenericDependencyImpl) super.clone();
            g.dependencyType = getDependencyType().deepClone();
        } catch (final CloneNotSupportedException cnse) {
            LOGGER.log(SEVERE, UNEXPECTED_ERROR, cnse);
        }

        return g;
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
        final GenericDependencyImpl other = (GenericDependencyImpl) obj;
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
     * 
     * @since 1.0
     */
    @Override
    public DependencyType getDependencyType() {
        return dependencyType;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getFullName() {
        return getDependencyType().getFullName();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getName() {
        return getDependencyType().getName();
    }

    /**
     * {@inheritDoc}
     * 
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dependencyType == null) ? 0 : dependencyType.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public void setDependencyType(final DependencyType value) {
        dependencyType = value;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [dependencyType=" + dependencyType + "]";
    }
}
