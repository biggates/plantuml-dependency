/*
 EnumJavaType.java
 Creation date : 19/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type;

import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENTION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.GenericDependency;
import net.sourceforge.plantuml.dependency.DependencyType;
import net.sourceforge.plantuml.dependency.EnumDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.InterfaceDependencyTypeImpl;

/**
 * The enum {@link JavaType} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
class EnumJavaType extends JavaType {

    /**
     * @param programmingLanguageName
     * @since 1.0
     */
    protected EnumJavaType(String programmingLanguageName) {
        super(programmingLanguageName);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentExtentions(String extendsString) {
        if (isNotEmpty(extendsString)) {
            // TODO throw exception, shouldn't happen
        } else {

        }
        return new TreeSet < String >();
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentImplementations(String implementsString) {
        return extractParents(implementsString);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType createDependencyType(String dependencyName, String dependencyPackageName, boolean isAbstract,
            Set < GenericDependency > importDependencies,
            Set < GenericDependency > parentImplementationsDependencies,
            Set < GenericDependency > parentExtentionsDependencies) {
        return new EnumDependencyTypeImpl(dependencyName, dependencyPackageName, importDependencies,
                parentImplementationsDependencies);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType createParentDependencyType(JavaParentType parentType, String parentName, String packageName) {
        DependencyType dependencyType = null;
        if (EXTENTION == parentType) {
            // TODO [graffity] throw logicexception
        } else if (IMPLEMENTATION == parentType) {
            dependencyType = new InterfaceDependencyTypeImpl(parentName, packageName);
        } else {
            // TODO [graffity] throw logicexception
        }
        return dependencyType;
    }
}
