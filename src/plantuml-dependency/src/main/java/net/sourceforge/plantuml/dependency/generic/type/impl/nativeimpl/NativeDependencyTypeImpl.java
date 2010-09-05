/*
 NativeDependencyTypeImpl.java
 Creation date : 5/09/2010
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

package net.sourceforge.plantuml.dependency.generic.type.impl.nativeimpl;

import static net.sourceforge.mazix.components.constants.CharacterConstants.INFERIOR_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SUPERIOR_CHAR;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.CLASS_PLANTUML;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.generic.type.impl.DependencyTypeImpl;

/**
 * The native implementation of the
 * {@link net.sourceforge.plantuml.dependency.generic.type.DependencyType} interface.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class NativeDependencyTypeImpl extends DependencyTypeImpl {

    /** Serial version UID. */
    private static final long serialVersionUID = 5835948478441508918L;

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
    public NativeDependencyTypeImpl(final String dependencyName, final String dependencyPackageName) {
        super(dependencyName, dependencyPackageName);
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
        buffer.append(SPACE_CHAR);
        buffer.append(INFERIOR_CHAR);
        buffer.append(INFERIOR_CHAR);
        buffer.append("N,yellow");
        buffer.append(SPACE_CHAR);
        buffer.append(SUPERIOR_CHAR);
        buffer.append(SUPERIOR_CHAR);
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
