/*
 InterfaceDependencyTypeImpl.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl.interfaceimpl;

import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.INTERFACE_PLANTUML;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;

/**
 * The interface implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class InterfaceDependencyTypeImpl extends DependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 5962361438336541275L;

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
    public InterfaceDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        super(dependencyName, dependencyPackageName, new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >());
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param importDependenciesSet
     * @param parentInterfacesSet
     * @since 1.0
     */
    public InterfaceDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet) {
        super(dependencyName, dependencyPackageName, importDependenciesSet, parentInterfacesSet);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDeclaration() {
        final StringBuffer buffer = new StringBuffer(INTERFACE_PLANTUML);
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
