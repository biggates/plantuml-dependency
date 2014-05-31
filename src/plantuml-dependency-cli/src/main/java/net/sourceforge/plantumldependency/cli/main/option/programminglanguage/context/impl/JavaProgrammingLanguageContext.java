/*
 JavaProgrammingLanguageContext.java
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

package net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.impl;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.plantumldependency.cli.generic.GenericDependency;
import net.sourceforge.plantumldependency.cli.main.option.display.type.argument.DisplayType;
import net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.AbstractProgrammingLanguageContext;

/**
 * The java
 * {@link net.sourceforge.plantumldependency.cli.main.option.programminglanguage.context.ProgrammingLanguageContext}
 * implementation.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.0.0
 * @version 1.4.0
 */
public class JavaProgrammingLanguageContext extends AbstractProgrammingLanguageContext {

    /** Serial version UID. */
    private static final long serialVersionUID = 4151258525377938109L;

    /**
     * Default constructor.
     *
     * @since 1.0.0
     */
    public JavaProgrammingLanguageContext() {
        super();
    }

    /**
     * Medium constructor.
     *
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public JavaProgrammingLanguageContext(final Set < DisplayType > displayTypesOpt) {
        super(displayTypesOpt);
    }

    /**
     * Medium constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} which have been seen (as
     *            import for instance) and parsed to put in the context, mustn't be
     *            <code>null</code>.
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public JavaProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < DisplayType > displayTypesOpt) {
        super(parsedAndSeenDependencies, displayTypesOpt);
    }

    /**
     * Full constructor.
     *
     * @param parsedAndSeenDependencies
     *            the original {@link Set} of {@link GenericDependency} which have been seen (as
     *            import for instance) and parsed to put in the context, mustn't be
     *            <code>null</code>.
     * @param parsedDependencies
     *            the original {@link Set} of {@link GenericDependency} which have been parsed to
     *            put in the context, mustn't be <code>null</code>.
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public JavaProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies, final Set < DisplayType > displayTypesOpt) {
        super(parsedAndSeenDependencies, parsedDependencies, new TreeSet < GenericDependency >(), displayTypesOpt);
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
     * @param displayTypesOpt
     *            the display types options which have to appear in the plantUML description,
     *            mustn't be <code>null</code>.
     * @since 1.0.0
     */
    public JavaProgrammingLanguageContext(final Set < GenericDependency > parsedAndSeenDependencies,
            final Set < GenericDependency > parsedDependencies,
            final Set < GenericDependency > potentialJavaLangSeenDependencies, final Set < DisplayType > displayTypesOpt) {
        super(parsedAndSeenDependencies, parsedDependencies, potentialJavaLangSeenDependencies, displayTypesOpt);
    }
}
