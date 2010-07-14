/*
 PlantUMLDependencyDisplayOption.java
 Creation date : 2/06/2010
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

package net.sourceforge.plantuml.dependency.main.option.display;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static net.sourceforge.mazix.components.constants.CharacterConstants.COMMA_CHAR;
import static net.sourceforge.mazix.components.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.CLASSES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.ENUMS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.IMPORTS;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.INTERFACES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.PACKAGES;
import static net.sourceforge.plantuml.dependency.main.option.display.argument.Display.STATIC_IMPORTS;

import java.util.Set;
import java.util.TreeSet;

import net.sourceforge.mazix.cli.command.CommandLine;
import net.sourceforge.mazix.cli.exception.CommandLineException;
import net.sourceforge.mazix.cli.option.AbstractOptionWithArgument;
import net.sourceforge.plantuml.dependency.main.option.display.argument.Display;
import net.sourceforge.plantuml.dependency.main.option.display.argument.PlantUMLDependencyDisplayOptionArgument;

/**
 * The display option, telling the program what to display in the generated file. <i>Note : no
 * option should have the same main or secondary names</i>.
 * 
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * 
 * @since 1.0
 * @version 1.0
 */
public class PlantUMLDependencyDisplayOption extends AbstractOptionWithArgument < Set < Display > > {

    /** Serial version UID. */
    private static final long serialVersionUID = -3061227816589361105L;

    /** The default option if not specified. */
    private static final String DEFAULT_OPTION = CLASSES + COMMA_CHAR + ENUMS + COMMA_CHAR + IMPORTS + COMMA_CHAR
            + INTERFACES + COMMA_CHAR + PACKAGES + COMMA_CHAR + STATIC_IMPORTS;

    /**
     * Default constructor.
     * 
     * @since 1.0
     */
    public PlantUMLDependencyDisplayOption() {
        super("-d", unmodifiableSet(new TreeSet < String >(asList(new String[] {"--display"}))), false,
                new PlantUMLDependencyDisplayOptionArgument(true), new StringBuffer(
                        "To specify class diagram objects to display. If not specified, the default is "
                                + DEFAULT_OPTION), SPACE_CHAR);
    }

    /**
     * {@inheritDoc}
     * 
     * @since 1.0
     */
    @Override
    public String getDefaultArgumentAsString(final CommandLine commandLine) throws CommandLineException {
        return DEFAULT_OPTION;
    }
}
