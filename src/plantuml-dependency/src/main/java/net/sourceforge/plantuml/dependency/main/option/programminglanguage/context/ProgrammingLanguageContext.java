/*
 ProgrammingLanguageContext.java
 Creation date : 28/08/2010
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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.context;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;

/**
 * The interface which describes a context shared by all dependencies which are parsed. It is mainly
 * used to save all treated dependencies but also global states.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public interface ProgrammingLanguageContext extends Comparable < ProgrammingLanguageContext >, Serializable,
        DeepCloneable < ProgrammingLanguageContext > {

    /**
     * Adds in the parsed and seen dependencies in the context. If the dependency is already in the
     * context, it is replaced.
     * 
     * @param dependency
     *            the {@link GenericDependency} instance to add, mustn't be <code>null</code>.
     * @since 1.0
     */
    void addParsedAndSeenDependencies(GenericDependency dependency);

    /**
     * Adds in the seen dependencies in the context.
     * 
     * @param dependency
     *            the {@link GenericDependency} instance to add, mustn't be <code>null</code>.
     * @since 1.0
     */
    void addSeenDependencies(GenericDependency dependency);

    /**
     * Gets the dependency in the context following its name.
     * 
     * @param fullName
     *            the dependency full name to get, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance following its full name if found in the
     *         context, <code>null</code> otherwise.
     * @since 1.0
     */
    GenericDependency getDependencies(String fullName);

    /**
     * Gets all dependencies within the context.
     * 
     * @return the {@link Collection} of all {@link GenericDependency} which have been associated
     *         with this context.
     * @since 1.0
     */
    Collection < GenericDependency > getParsedAndSeenDependencies();

    /**
     * Gets all dependencies within the context.
     * 
     * @return the {@link Collection} of all {@link GenericDependency} which have been associated
     *         with this context.
     * @since 1.0
     */
    Collection < GenericDependency > getParsedDependencies();

    /**
     * Tells if the following {@link Display} is managed or not by this context.
     * 
     * @param display
     *            the {@link Display}, mustn't be <code>null</code>.
     * @return <code>true</code> if the {@link Display} is managed by the context,
     *         <code>false</code> otherwise.
     * @since 1.0
     */
    boolean hasToDisplay(Display display);

    /**
     * Writes the PlantUML description output file following all dependencies and the display option
     * of the context.
     * 
     * @param file
     *            the output file where to generate the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    void writePlantUMLFile(File file);
}
