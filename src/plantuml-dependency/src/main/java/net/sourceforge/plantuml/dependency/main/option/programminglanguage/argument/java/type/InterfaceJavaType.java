/*
 IntefaceJavaType.java
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

import static net.sourceforge.mazix.components.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.check.ParameterChecker.checkNull;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_STRING_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENTION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.DependencyType;
import net.sourceforge.plantuml.dependency.GenericDependency;
import net.sourceforge.plantuml.dependency.InterfaceDependencyTypeImpl;
import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;

/**
 * The interface {@link JavaType} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
class InterfaceJavaType extends JavaType {

    /**
     * Default constructor.
     * 
     * @param programmingLanguageKeyword
     *            The java type language keyword, mustn't be <code>null</code>.
     * @since 1.0
     */
    protected InterfaceJavaType(final String programmingLanguageKeyword) {
        super(programmingLanguageKeyword);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType createDependencyType(final String dependencyName, final String dependencyPackageName,
            final boolean isAbstract, final Set < GenericDependency > importDependencies,
            final Set < GenericDependency > parentImplementationsDependencies,
            final Set < GenericDependency > parentExtentionsDependencies) {
        return new InterfaceDependencyTypeImpl(dependencyName, dependencyPackageName, importDependencies,
                parentExtentionsDependencies);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public DependencyType createParentDependencyType(final JavaParentType parentType, final String parentName,
            final String parentPackageName) throws PlantUMLDependencyException {
        checkNull(parentType, JAVA_PARENT_TYPE_NULL_ERROR);
        checkNull(parentName, JAVA_PARENT_TYPE_NAME_NULL_ERROR);
        checkNull(parentPackageName, JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR);

        DependencyType dependencyType = null;

        if (EXTENTION == parentType) {
            dependencyType = new InterfaceDependencyTypeImpl(parentName, parentPackageName);
        } else if (IMPLEMENTATION == parentType) {
            throw new PlantUMLDependencyException(buildLogString(IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR, new Object[] {
                    parentType, getLanguageKeyword()}));
        } else {
            throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_NULL_ERROR, parentType));
        }

        return dependencyType;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentExtentions(final String extendsString) {
        checkNull(extendsString, JAVA_PARENT_TYPE_STRING_NULL_ERROR);

        return extractParents(extendsString);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentImplementations(final String implementsString) throws PlantUMLDependencyException {
        if (isNotEmpty(implementsString)) {
            throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR, new Object[] {
                    implementsString, getLanguageKeyword()}));
        } else {
            return new TreeSet < String >();
        }
    }
}
