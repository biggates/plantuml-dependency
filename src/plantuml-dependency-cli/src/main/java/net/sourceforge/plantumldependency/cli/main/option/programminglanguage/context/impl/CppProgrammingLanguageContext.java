/*
 CppProgrammingLanguageContext.java
 Creation date : 31/08/2010
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.impl;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.argument.Display;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.AbstractProgrammingLanguageContext;

/**
 * The C++
 * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.ProgrammingLanguageContext}
 * implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version 1.2.0
 */
public class CppProgrammingLanguageContext extends AbstractProgrammingLanguageContext {

    /** Serial version UID. */
    private static final long serialVersionUID = -112668554824195713L;

    /**
     * Default constructor.
     *
     * @since 1.0
     */
    public CppProgrammingLanguageContext() {
        super();
    }

    /**
     * Medium constructor.
     *
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public CppProgrammingLanguageContext(final Set < Display > displayOpt) {
        super(displayOpt);
    }

    /**
     * Medium constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public CppProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < Display > displayOpt) {
        super(parsedAndSeenDependencies, displayOpt);
    }

    /**
     * Full constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param parsedDependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public CppProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies, final Set < Display > displayOpt) {
        super(parsedAndSeenDependencies, parsedDependencies, new TreeSet < GenericDependency >(), displayOpt);
    }

    /**
     * Full constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original parsed and seen dependencies {@link Set} of {@link GenericDependency}
     *            to put in the context, mustn't be <code>null</code>.
     * @param parsedDependencies
     *            the original parsed dependencies {@link Set} of {@link GenericDependency} to put
     *            in the context, mustn't be <code>null</code>.
     * @param potentialJavaLangSeenDependencies
     *            the original potential "java.lang" seen dependencies {@link Set} of
     *            {@link GenericDependency} to put in the context, mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public CppProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies,
            final Set < GenericDependency > potentialJavaLangSeenDependencies, final Set < Display > displayOpt) {
        super(parsedAndSeenDependencies, parsedDependencies, potentialJavaLangSeenDependencies, displayOpt);
    }
}
