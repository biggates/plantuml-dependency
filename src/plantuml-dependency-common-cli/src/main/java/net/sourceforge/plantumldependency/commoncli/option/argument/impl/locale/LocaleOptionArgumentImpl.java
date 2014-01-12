/*
 LocaleOptionArgumentImpl.java
 Creation date : 20/06/2010
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

package net.sourceforge.plantumldependency.commoncli.option.argument.impl.locale;

import static java.util.Locale.ENGLISH;
import static java.util.Locale.FRENCH;
import static net.sourceforge.plantumldependency.common.utils.string.StringUtils.isNotEmpty;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.EMPTY_OPTION_ARGUMENT_ERROR;

import java.util.Locale;

import net.sourceforge.plantumldependency.commoncli.exception.CommandLineException;
import net.sourceforge.plantumldependency.commoncli.option.argument.AbstractOptionArgument;

/**
 * The locale implementation of the
 * {@link net.sourceforge.plantumldependency.commoncli.option.argument.OptionArgument} interface,
 * specifying a directory {@link Locale} argument.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class LocaleOptionArgumentImpl extends AbstractOptionArgument < Locale > {

    /** Serial version UID. */
    private static final long serialVersionUID = 5730167187613883418L;

    /** The argument main usage constant. */
    private static final String MAIN_USAGE = "LOCALE";

    /** The argument main usage description constant. */
    private static final String USAGE_DESCRIPTION = MAIN_USAGE + " specifies a locale, with the form \""
            + FRENCH.getLanguage() + "\", \"" + ENGLISH.getLanguage() + "\"";

    /**
     * Default constructor.
     *
     * @param optionArgumentIsMandatory
     *            <code>true</code> if the argument is mandatory, <code>false</code> otherwise.
     * @since 1.3.0
     */
    public LocaleOptionArgumentImpl(final boolean optionArgumentIsMandatory) {
        super(optionArgumentIsMandatory, new StringBuilder(USAGE_DESCRIPTION));
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    protected String getMainUsageDescription() {
        return MAIN_USAGE;
    }

    /**
     * {@inheritDoc}
     *
     * @since 1.3.0
     */
    @Override
    public Locale parseArgument(final String argument) throws CommandLineException {
        Locale locale = null;

        if (isNotEmpty(argument)) {
            locale = new Locale(argument);
        } else {
            throw new CommandLineException(EMPTY_OPTION_ARGUMENT_ERROR);
        }

        return locale;
    }
}
