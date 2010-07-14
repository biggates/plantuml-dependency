/*
 ClassAbstractDependencyTypeImpl.java
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

import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.ABSTRACT_PLANTUML;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public class ClassAbstractDependencyTypeImpl extends ClassDependencyTypeImpl {

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @since 1.0
     */
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new TreeSet < AbstractDependency >(),
                new TreeSet < AbstractDependency >(), new TreeSet < AbstractDependency >());
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param importDependenciesSet
     * @param parentInterfacesSet
     * @param parentClassesSet
     * @since 1.0
     */
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < AbstractDependency > importDependenciesSet,
            final Set < AbstractDependency > parentInterfacesSet, final Set < AbstractDependency > parentClassesSet) {
        super(dependencyName, dependencyPackageName, importDependenciesSet, parentInterfacesSet, parentClassesSet);
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDeclaration() {
        final StringBuffer buffer = new StringBuffer(ABSTRACT_PLANTUML);
        buffer.append(getFullName());
        return buffer;
    }
}
