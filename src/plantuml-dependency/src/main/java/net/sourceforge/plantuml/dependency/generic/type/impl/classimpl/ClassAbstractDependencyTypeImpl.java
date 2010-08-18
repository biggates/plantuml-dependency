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

package net.sourceforge.plantuml.dependency.generic.type.impl.classimpl;

import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.ABSTRACT_CLASS_PLANTUML;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;

/**
 * The class abstract implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class ClassAbstractDependencyTypeImpl extends ClassDependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = -8097477597427695042L;

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
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        // TODO check that the dependencies are not duplicated in the parentInterface and
        // parentClasses sets
        this(dependencyName, dependencyPackageName, new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());
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
     * @param parentClassesSet
     * @since 1.0
     */
    public ClassAbstractDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet,
            final Set < GenericDependency > parentClassesSet) {
        // TODO check that the dependencies are not duplicated in the parentInterface and
        // parentClasses sets
        super(dependencyName, dependencyPackageName, importDependenciesSet, parentInterfacesSet, parentClassesSet);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDeclaration() {
        final StringBuffer buffer = new StringBuffer(ABSTRACT_CLASS_PLANTUML);
        buffer.append(getFullName());
        return buffer;
    }
}
