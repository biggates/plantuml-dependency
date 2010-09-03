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

package net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.impl;

import static net.sourceforge.mazix.components.utils.file.FileUtils.writeIntoFile;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.END_PLANTUML;
import static net.sourceforge.plantuml.dependency.constants.PlantUMLConstants.START_PLANTUML;

import java.io.File;
import java.util.Set;

import net.sourceforge.plantuml.dependency.generic.GenericDependency;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.AbstractProgrammingLanguageContext;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.context.ProgrammingLanguageContext;

/**
 * The java {@link ProgrammingLanguageContext} implementation.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class JavaProgrammingLanguageContext extends AbstractProgrammingLanguageContext {

    /** Serial version UID. */
    private static final long serialVersionUID = 4151258525377938109L;

    /**
     * Default constructor.
     * 
     * @since 1.0
     */
    public JavaProgrammingLanguageContext() {
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
    public JavaProgrammingLanguageContext(final Set < Display > displayOpt) {
        super(displayOpt);
    }

    /**
     * Full constructor.
     * 
     * @param dependencies
     *            the original {@link Set} of {@link GenericDependency} to put in the context,
     *            mustn't be <code>null</code>.
     * @param displayOpt
     *            the display options which have to appear in the plantUML description, mustn't be
     *            <code>null</code>.
     * @since 1.0
     */
    public JavaProgrammingLanguageContext(final Set < GenericDependency > dependencies, final Set < Display > displayOpt) {
        super(dependencies, displayOpt);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public void writePlantUMLFile(final File file) {
        final StringBuffer buffer = new StringBuffer(START_PLANTUML);

        // TODO 1 boucle avec 2 string buffer que l'on concatene
        for (final GenericDependency abstractDependency : getAllDependencies()) {
            buffer.append(abstractDependency.getDependencyType().getPlantUMLDeclaration());
        }

        for (final GenericDependency abstractImportDependency : getAllDependencies()) {
            buffer.append(abstractImportDependency.getDependencyType().getPlantUMLLinksDescription());
        }

        buffer.append(END_PLANTUML);
        writeIntoFile(buffer.toString(), file);
    }
}
