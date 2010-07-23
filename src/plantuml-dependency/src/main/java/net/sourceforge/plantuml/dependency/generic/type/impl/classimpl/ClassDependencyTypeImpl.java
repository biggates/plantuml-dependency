/*
 ClassDependencyTypeImpl.java
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

import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.CLASS_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.IMPLEMENTS_LEFT_PLANTUML;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;

/**
 * The class implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.ClassDependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class ClassDependencyTypeImpl extends DependencyTypeImpl implements ClassDependencyType {

    /** Serial version UID. */
    private static final long serialVersionUID = -8464283913821256094L;

    private Set < GenericDependency > parentClasses;

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @since 1.0
     */
    public ClassDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, new TreeSet < GenericDependency >(),
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param importDependenciesSet
     * @param parentInterfacesSet
     * @param parentClassesSet
     * @since 1.0
     */
    public ClassDependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet,
            final Set < GenericDependency > parentClassesSet) {
        super(dependencyName, dependencyPackageName, importDependenciesSet, parentInterfacesSet);
        // TODO optimization
        // TODO check that the dependencies are not duplicated in the parentInterface and
        // parentClasses sets
        parentClasses = parentClassesSet;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType deepClone() {
        final ClassDependencyTypeImpl c = (ClassDependencyTypeImpl) super.deepClone();
        // TODO deepClone don't manage cycles
        c.parentClasses = new TreeSet < GenericDependency >(getParentClasses());
        return c;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDeclaration() {
        final StringBuffer buffer = new StringBuffer(CLASS_PLANTUML);
        buffer.append(getFullName());
        return buffer;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    protected StringBuffer generatePlantUMLDescriptionFooter() {
        final StringBuffer buffer = new StringBuffer();

        for (final GenericDependency classDependency : getParentClasses()) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(classDependency.getFullName());
            buffer.append(IMPLEMENTS_LEFT_PLANTUML);
            buffer.append(getFullName());
        }

        return buffer;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getParentClasses() {
        return parentClasses;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    protected boolean hasImportNotToBeGenerated(final GenericDependency genericDependency) {
        return getParentInterfaces().contains(genericDependency) || getParentClasses().contains(genericDependency);
    }
}
