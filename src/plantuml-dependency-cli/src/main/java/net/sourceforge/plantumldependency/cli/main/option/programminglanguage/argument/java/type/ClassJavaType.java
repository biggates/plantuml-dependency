/*
 ClassJavaType.java
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type;

import static net.sourceforge.plantumldependency.cli.constants.RegularExpressionConstants.NATIVE_METHODS_REGEXP;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_ANNOTATION_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_ANNOTATION_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_PARENT_TYPE_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_PARENT_TYPE_UNKNOWN_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_ANNOTATIONS_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_EXTENTIONS_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_EXTENTIONS_TOO_MANY_ELEMENTS_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_IMPORTS_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.constants.log.ErrorConstants.JAVA_TYPE_PACKAGE_NAME_NULL_ERROR;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.EXTENSION;
import static net.sourceforge.plantumldependency.cli.main.option.programminglanguage.argument.java.type.JavaParentType.IMPLEMENTATION;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNumberOfElementsInCollection;
import static net.sourceforge.plantumldependency.common.utils.collection.CollectionUtils.getCollectionFirstElement;
import static net.sourceforge.plantumldependency.common.utils.log.LogUtils.buildLogString;

import java.util.Set;

import net.sourceforge.plantumldependency.cli.exception.PlantUMLDependencyException;
import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.generic.type.DependencyType;
import net.sourceforge.plantumldependency.cli.generic.type.ImportDependenciesCollection;
import net.sourceforge.plantumldependency.cli.generic.type.impl.annotationimpl.AnnotationDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassAbstractDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.classimpl.ClassDependencyTypeImpl;
import net.sourceforge.plantumldependency.cli.generic.type.impl.interfaceimpl.InterfaceDependencyTypeImpl;

/**
 * The class {@link JavaType} implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.3.0
 */
class ClassJavaType extends JavaType {

    /** Serial version UID. */
    private static final long serialVersionUID = -2531946270649532504L;

    /**
     * Default constructor.
     *
     * @param programmingLanguageKeyword
     *            The java type language keyword, mustn't be <code>null</code>.
     * @since 1.0.0
     */
    protected ClassJavaType(final String programmingLanguageKeyword) {
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
     * @since 1.0.0
     */
    @Override
    public DependencyType createDependencyType(final String dependencyName, final String dependencyPackageName,
            final boolean isAbstract, final ImportDependenciesCollection importDependencies,
            final Set < GenericDependency > parentExtensionsDependencies,
            final Set < GenericDependency > parentImplementationsDependencies,
            final Set < GenericDependency > annotationDependencies) {
        checkNull(dependencyName, JAVA_TYPE_NAME_NULL_ERROR);
        checkNull(dependencyPackageName, JAVA_TYPE_PACKAGE_NAME_NULL_ERROR);
        checkNull(importDependencies, JAVA_TYPE_IMPORTS_NULL_ERROR);
        checkNull(parentImplementationsDependencies, JAVA_TYPE_IMPLEMENTATIONS_NULL_ERROR);
        checkNull(parentExtensionsDependencies, JAVA_TYPE_EXTENTIONS_NULL_ERROR);
        checkNumberOfElementsInCollection(parentExtensionsDependencies, 1, JAVA_TYPE_EXTENTIONS_TOO_MANY_ELEMENTS_ERROR);
        checkNull(annotationDependencies, JAVA_TYPE_ANNOTATIONS_NULL_ERROR);

        DependencyType dependencyType = null;
        final GenericDependency parentExtensionDependency = getCollectionFirstElement(parentExtensionsDependencies);

        if (isAbstract) {
            dependencyType = new ClassAbstractDependencyTypeImpl(dependencyName, dependencyPackageName,
                    importDependencies, parentExtensionDependency, parentImplementationsDependencies,
                    annotationDependencies);
        } else {
            dependencyType = new ClassDependencyTypeImpl(dependencyName, dependencyPackageName, importDependencies,
                    parentExtensionDependency, parentImplementationsDependencies, annotationDependencies);
        }

        return dependencyType;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public DependencyType createParentDependencyType(final JavaParentType parentType, final String parentName,
            final String parentPackageName) throws PlantUMLDependencyException {
        checkNull(parentType, JAVA_PARENT_TYPE_NULL_ERROR);
        checkNull(parentName, JAVA_PARENT_TYPE_NAME_NULL_ERROR);
        checkNull(parentPackageName, JAVA_PARENT_TYPE_PACKAGE_NAME_NULL_ERROR);

        DependencyType dependencyType = null;

        if (EXTENSION == parentType) {
            dependencyType = new ClassDependencyTypeImpl(parentName, parentPackageName);
        } else if (IMPLEMENTATION == parentType) {
            dependencyType = new InterfaceDependencyTypeImpl(parentName, parentPackageName);
        } else {
            throw new PlantUMLDependencyException(buildLogString(JAVA_PARENT_TYPE_UNKNOWN_ERROR, parentType));
        }

        return dependencyType;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public boolean extractNativeMethods(final String javaSourceFileContent) {
        return NATIVE_METHODS_REGEXP.matcher(javaSourceFileContent).find();
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Set < String > extractParentExtensions(final String extendsString) throws PlantUMLDependencyException {
        return extractParents(extendsString);
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.0.0
     */
    @Override
    public Set < String > extractParentImplementations(final String implementsString)
            throws PlantUMLDependencyException {
        return extractParents(implementsString);
    }
}
