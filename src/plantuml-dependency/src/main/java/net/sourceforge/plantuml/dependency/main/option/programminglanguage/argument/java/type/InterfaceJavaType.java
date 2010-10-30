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
import static net.sourceforge.mazix.components.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_UNKNOWN_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_EXTENTIONS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_IMPORTS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;

/**
 * The interface {@link JavaType} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
class InterfaceJavaType extends JavaType {

    /** Serial version UID. */
    private static final long serialVersionUID = -5405937103390368720L;

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
            final Set < GenericDependency > parentExtentionsDependencies, final boolean hasNativeMethods) {
        checkNull(dependencyName, JAVA_TYPE_NAME_NULL_ERROR);
        checkNull(dependencyPackageName, JAVA_TYPE_PACKAGE_NAME_NULL_ERROR);
        checkNull(importDependencies, JAVA_TYPE_IMPORTS_NULL_ERROR);
        checkNull(parentImplementationsDependencies, JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR);
        checkNull(parentExtentionsDependencies, JAVA_TYPE_EXTENTIONS_NULL_ERROR);

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

        if (EXTENSION == parentType) {
            dependencyType = new InterfaceDependencyTypeImpl(parentName, parentPackageName);
        } else if (IMPLEMENTATION == parentType) {
            throw new PlantUMLDependencyException(buildLogString(IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR, new Object[] {
                    parentType, getLanguageKeyword()}));
        } else {
            throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_UNKNOWN_ERROR, parentType));
        }

        return dependencyType;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public boolean extractNativeMethods(final String javaSourceFileContent) {
        return false;
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentExtentions(final String extendsString) throws PlantUMLDependencyException {
        return extractParents(extendsString);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public Set < String > extractParentImplementations(final String implementsString)
            throws PlantUMLDependencyException {
        if (isNotEmpty(implementsString)) {
            throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR,
                    new Object[] {implementsString, getLanguageKeyword()}));
        } else {
            return new TreeSet < String >();
        }
    }
}
