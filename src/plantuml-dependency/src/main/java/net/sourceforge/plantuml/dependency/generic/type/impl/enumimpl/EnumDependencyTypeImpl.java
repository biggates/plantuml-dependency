/*
 EnumDependencyTypeImpl.java
 Creation date : 31/05/2010
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

package net.sourceforge.plantuml.dependency.generic.type.impl.enumimpl;

import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.ENUM_PLANTUML;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;

/**
 * The enum implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType} interface.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class EnumDependencyTypeImpl extends DependencyTypeImpl {

    // TODO enum fields in the plantuml description

    /** Serial version UID. */
    private static final long serialVersionUID = 4101721547615760115L;

    /**
     * Default constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public EnumDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        super(dependencyName, dependencyPackageName, new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >(), false);
    }

    /**
     * Full constructor.
     *
     * @param dependencyName
     *            The dependency type name, such as "String", mustn't be <code>null</code>.
     * @param dependencyPackageName
     *            The dependency type package name, such as "java.lang", mustn't be
     *            <code>null</code>.
     * @param importDependenciesSet
     *            the {@link Set} of all {@link GenericDependency} which are needed by the current
     *            dependency type to work, mustn't be <code>null</code>.
     * @param parentInterfacesSet
     *            the {@link Set} of all parent interfaces as {@link GenericDependency} which are
     *            used by the current dependency type, mustn't be <code>null</code>.
     * @param hasNativeMethods
     *            the boolean indicating if the dependency has native methods inside.
     * @since 1.0
     */
    public EnumDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet,
            final boolean hasNativeMethods) {
        super(dependencyName, dependencyPackageName, importDependenciesSet, parentInterfacesSet, hasNativeMethods);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDeclaration() {
        final StringBuffer buffer = super.generatePlantUMLDeclaration();
        buffer.append(ENUM_PLANTUML);
        buffer.append(getFullName());
        return buffer;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0
     */
    @Override
    protected boolean hasImportNotToBeGenerated(final GenericDependency genericDependency) {
        return getParentInterfaces().contains(genericDependency);
    }
}
