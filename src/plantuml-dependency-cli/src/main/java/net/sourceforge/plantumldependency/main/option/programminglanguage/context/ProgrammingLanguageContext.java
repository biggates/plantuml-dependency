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

package net.sourceforge.plantumldependency.main.option.programminglanguage.context;

import java.io.Serializable;
import java.util.Collection;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantumldependency.generic.GenericDependency;
import net.sourceforge.plantumldependency.main.option.display.argument.Display;
import net.sourceforge.plantumldependency.plantumldiagram.classes.PlantUMLClassesDiagram;

/**
 * The interface which describes a context shared by all dependencies which are parsed. It is mainly
 * used to save all treated dependencies but also global states.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.1.1
 */
public interface ProgrammingLanguageContext extends Comparable < ProgrammingLanguageContext >, Serializable,
        DeepCloneable < ProgrammingLanguageContext > {

    /**
     * Adds the dependency in the parsed and seen dependencies in the context. If the dependency is
     * already in the context, it is replaced.
     *
     * @param dependency
     *            the {@link GenericDependency} instance to add, mustn't be <code>null</code>.
     * @since 1.0
     */
    void addParsedAndSeenDependencies(GenericDependency dependency);

    /**
     * Adds the dependency in the parsed and seen dependencies in the context and marks it as a
     * potential "java.lang" dependency. This should be used when the dependency package can be
     * known between the current package and the "java.lang" package because dependencies are read
     * in a sequential way. If the dependency is already in the context, it is replaced.
     *
     * @param dependency
     *            the {@link GenericDependency} instance to add, mustn't be <code>null</code>.
     * @see #getPotentialJavaLangSeenDependencies()
     * @see #removePotentialJavaLangSeenDependency(String)
     * @see #removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang()
     * @since 1.2.0
     */
    void addPotentialJavaLangSeenDependencies(GenericDependency dependency);

    /**
     * Adds the dependency in the seen dependencies in the context.
     *
     * @param dependency
     *            the {@link GenericDependency} instance to add, mustn't be <code>null</code>.
     * @since 1.0
     */
    void addSeenDependencies(GenericDependency dependency);

    /**
     * Gets all dependencies which have been seen (as import for instance) and parsed within the
     * context.
     *
     * @return the {@link Collection} of all {@link GenericDependency} which have been seen (as
     *         import for instance) and parsed and associated with this context.
     * @since 1.0
     */
    Collection < GenericDependency > getParsedAndSeenDependencies();

    /**
     * Gets all dependencies which have been parsed within the context.
     *
     * @return the {@link Collection} of all {@link GenericDependency} which have been parsed and
     *         associated with this context.
     * @since 1.0
     */
    Collection < GenericDependency > getParsedDependencies();

    /**
     * Gets the dependency in the parsed context following its name.
     *
     * @param fullName
     *            the dependency full name to get, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance following its full name if found in the parsed
     *         context, <code>null</code> otherwise.
     * @since 1.2.0
     */
    GenericDependency getParsedDependency(String fullName);

    /**
     * Gets the dependency in the parsed and seen context following its name.
     *
     * @param fullName
     *            the dependency full name to get, mustn't be <code>null</code>.
     * @return the {@link GenericDependency} instance following its full name if found in the parsed
     *         and seen context, <code>null</code> otherwise.
     * @since 1.0
     */
    GenericDependency getParsedOrSeenDependency(String fullName);

    /**
     * Gets the {@link PlantUMLClassesDiagram} instance representing the context, following display
     * options.
     *
     * @return the plantUML diagram instance representing the context, following display options.
     * @since 1.1.1
     */
    PlantUMLClassesDiagram getPlantUMLClassesDiagram();

    /**
     * Gets all dependencies which have been marked as potential "java.lang" dependencies within the
     * context.
     *
     * @return the {@link Collection} of all {@link GenericDependency} which have been marked as
     *         potential "java.lang" dependencies within the context.
     * @see #addPotentialJavaLangSeenDependencies()
     * @see #removePotentialJavaLangSeenDependency(String)
     * @see #removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang()
     * @since 1.2.0
     */
    Collection < GenericDependency > getPotentialJavaLangSeenDependencies();

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
     * Removes all the marked as potential "java.lang" dependencies from the context and change
     * their package to "java.lang". This should be used at the end of the parsing process because
     * it means that marked dependencies haven't been parsed.
     *
     * @since 1.2.0
     */
    void removeAllPotentialJavaLangSeenDependencyAndChangePackageToJavaLang();

    /**
     * Remove the marked as potential "java.lang" dependency from the context. This should be used
     * each time a new dependency is parsed. If the dependency full name isn't marked as potential
     * "java.lang" dependency, this method doesn't do anything.
     *
     * @param fullName
     *            the dependency full name, usually the package and the dependency name.
     *            <p>
     *            For instance, in java it can be :<br>
     *            <i>java.lang.String</i><br>
     *            <i>java.io.Serializable</i><br>
     *            <i>sun.font.Decoration</i>
     *            </p>
     * @since 1.2.0
     */
    void removePotentialJavaLangSeenDependency(String fullName);
}
