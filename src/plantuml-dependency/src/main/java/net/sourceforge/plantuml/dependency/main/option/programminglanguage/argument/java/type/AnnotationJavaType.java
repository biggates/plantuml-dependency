/*
 AnnotationJavaType.java
 Creation date : 10/07/2013
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

import static net.sourceforge.mazix.components.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.mazix.components.utils.log.LogUtils.buildLogString;
import static net.sourceforge.mazix.components.utils.string.StringUtils.isEmpty;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_ANNOTATION_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_ANNOTATION_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_ANNOTATIONS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_EXTENTIONS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_IMPORTS_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantuml.dependency.constants.log.ErrorConstants.JAVA_TYPE_PACKAGE_NAME_NULL_ERROR;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantuml.dependency.exception.PlantUMLDependencyException;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.DependencyType;
import net.sourceforge.plantuml.dependency.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantuml.dependency.generic.type.impl.annotationimpl.AnnotationDependencyTypeImpl;

/**
 * The annotation {@link JavaType} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.2.0
 */
class AnnotationJavaType extends JavaType {

    /** Serial version UID. */
    private static final long serialVersionUID = -8422451071464390542L;

    /**
     * Default constructor.
     *
     * @param programmingLanguageKeyword
     *            The java type language keyword, mustn't be <code>null</code>.
     * @since 1.2.0
     */
    protected AnnotationJavaType(final String programmingLanguageKeyword) {
        super(programmingLanguageKeyword);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public DependencyType createAnnotationDependencyType(final String annotationName, final String annotationPackageName)
            throws PlantUMLDependencyException {
        checkNull(annotationName, JAVA_ANNOTATION_TYPE_NAME_NULL_ERROR);
        checkNull(annotationPackageName, JAVA_ANNOTATION_TYPE_PACKAGE_NAME_NULL_ERROR);
        return new AnnotationDependencyTypeImpl(annotationName, annotationPackageName);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public DependencyType createDependencyType(final String dependencyName, final String dependencyPackageName,
            final boolean isAbstract, final ImportDependenciesCollection importDependencies,
            final Set < GenericDependency > parentImplementationsDependencies,
            final Set < GenericDependency > parentExtentionsDependencies,
            final Set < GenericDependency > annotationDependencies, final boolean hasNativeMethods) {
        checkNull(dependencyName, JAVA_TYPE_NAME_NULL_ERROR);
        checkNull(dependencyPackageName, JAVA_TYPE_PACKAGE_NAME_NULL_ERROR);
        checkNull(importDependencies, JAVA_TYPE_IMPORTS_NULL_ERROR);
        checkNull(parentImplementationsDependencies, JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR);
        checkNull(parentExtentionsDependencies, JAVA_TYPE_EXTENTIONS_NULL_ERROR);
        checkNull(annotationDependencies, JAVA_TYPE_ANNOTATIONS_NULL_ERROR);

        return new AnnotationDependencyTypeImpl(dependencyName, dependencyPackageName, importDependencies,
                annotationDependencies);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public DependencyType createParentDependencyType(final JavaParentType parentType, final String parentName,
            final String parentPackageName) throws PlantUMLDependencyException {
        throw new PlantUMLDependencyException(buildLogString(IMPOSSIBLE_JAVA_PARENT_TYPE_NULL_ERROR, new Object[] {
                parentType, getLanguageKeyword()}));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public boolean extractNativeMethods(final String javaSourceFileContent) {
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public Set < String > extractParentExtentions(final String extendsString) throws PlantUMLDependencyException {
        if (isEmpty(extendsString)) {
            return new TreeSet < String >();
        }
        throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR,
                new Object[] {extendsString, getLanguageKeyword()}));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.2.0
     */
    @Override
    public Set < String > extractParentImplementations(final String implementsString)
            throws PlantUMLDependencyException {
        if (isEmpty(implementsString)) {
            return new TreeSet < String >();
        }
        throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_STRING_NOT_EMPTY_NULL_ERROR,
                new Object[] {implementsString, getLanguageKeyword()}));
    }
}
