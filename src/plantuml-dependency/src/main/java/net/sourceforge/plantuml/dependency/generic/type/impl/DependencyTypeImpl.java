/*
 DependencyTypeImpl.java
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

package net.sourceforge.plantuml.dependency.generic.type.impl;

import static net.sourceforge.mazix.components.constants.CharacterConstants.DOT_CHAR;
import static net.sourceforge.mazix.components.constants.CommonConstants.LINE_SEPARATOR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.IMPLEMENTS_LEFT_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.USES_RIGHT_PLANTUML;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.AFTER;
import static net.sourceforge.mazix.components.utils.comparable.ComparableResult.EQUAL;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;

/**
 * The default implementation of the {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType}
 * interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.0
 */
public abstract class DependencyTypeImpl implements DependencyType {

    private final String name;
    private final String packageName;
    private final String fullName;
    private final Set < GenericDependency > importDependencies;
    private final Set < GenericDependency > parentInterfaces;
    private StringBuffer plantUMLDeclaration;
    private StringBuffer plantUMLLinksDescription;

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        this(dependencyName, dependencyPackageName, dependencyPackageName + DOT_CHAR + dependencyName,
                new TreeSet < GenericDependency >(), new TreeSet < GenericDependency >());
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param importDependenciesSet
     * @param parentInterfacesSet
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final Set < GenericDependency > importDependenciesSet, final Set < GenericDependency > parentInterfacesSet) {
        this(dependencyName, dependencyPackageName, dependencyPackageName + DOT_CHAR + dependencyName,
                importDependenciesSet, parentInterfacesSet);
    }

    /**
     * @param dependencyName
     * @param dependencyPackageName
     * @param fullDependencyName
     * @param importDependenciesSet
     * @param parentInterfacesSet
     * @since 1.0
     */
    protected DependencyTypeImpl(final String dependencyName, final String dependencyPackageName,
            final String fullDependencyName, final Set < GenericDependency > importDependenciesSet,
            final Set < GenericDependency > parentInterfacesSet) {
        name = dependencyName;
        packageName = dependencyPackageName;
        fullName = fullDependencyName;
        // TODO optimization
        importDependencies = importDependenciesSet;
        parentInterfaces = parentInterfacesSet;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public int compareTo(final DependencyType d) {
        int comparison = AFTER.getResult();

        if (this == d) {
            comparison = EQUAL.getResult();
        } else {
            comparison = getFullName().compareTo(d.getFullName());
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
        final DependencyTypeImpl other = (DependencyTypeImpl) obj;
        if (fullName == null) {
            if (other.fullName != null) {
                return false;
            }
        } else if (!fullName.equals(other.fullName)) {
            return false;
        }
        return true;
    }

    /**
     * @return
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDeclaration() {
        return new StringBuffer();
    }

    /**
     * @return
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionFooter() {
        return new StringBuffer();
    }

    /**
     * @return
     * @since 1.0
     */
    protected StringBuffer generatePlantUMLDescriptionHeader() {
        return new StringBuffer();
    }

    /**
     * @return
     * @since 1.0
     */
    private StringBuffer generatePlantUMLLinksDescription() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(generatePlantUMLDescriptionHeader());
        
        for (final GenericDependency abstractImportDependency : getImportDependencies()) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(getFullName());
            buffer.append(USES_RIGHT_PLANTUML);
            buffer.append(abstractImportDependency.getFullName());
        }

        for (final GenericDependency interfaceDependency : getParentInterfaces()) {
            buffer.append(LINE_SEPARATOR);
            buffer.append(interfaceDependency.getFullName());
            buffer.append(IMPLEMENTS_LEFT_PLANTUML);
            buffer.append(getFullName());
        }

        buffer.append(generatePlantUMLDescriptionFooter());
        return buffer;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getFullName() {
        return fullName;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getImportDependencies() {
        return importDependencies;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String getPackageName() {
        return packageName;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public Set < GenericDependency > getParentInterfaces() {
        return parentInterfaces;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLDeclaration() {
        if (plantUMLDeclaration == null) {
            plantUMLDeclaration = generatePlantUMLDeclaration();
        }
        return plantUMLDeclaration;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public StringBuffer getPlantUMLLinksDescription() {
        if (plantUMLLinksDescription == null) {
            plantUMLLinksDescription = generatePlantUMLLinksDescription();
        }
        return plantUMLLinksDescription;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [fullName=" + fullName + "]";
    }
}
