/*
 LogFormatter.java
 Creation date : 15/05/2007
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

package net.sourceforge.plantumldependency.common.utils.log;

import static net.sourceforge.plantumldependency.common.constants.CharacterConstants.SPACE_CHAR;
import static net.sourceforge.plantumldependency.common.constants.CommonConstants.LINE_SEPARATOR;

import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * The class which manages to format log records.
 *
 * @author Benjamin Croizet (graffity2199@yahoo.fr)
 * @since 0.4
 * @version 0.7
 */
public class LogFormatter extends SimpleFormatter {

    /**
     * {@inheritDoc}
     *
     * @since 0.4
     */
    @Override
    public synchronized String format(final LogRecord record) {
        return super.format(record).replaceFirst(LINE_SEPARATOR, SPACE_CHAR);
    }

    /**
     * {@inheritDoc}
     *
     * @since 0.4
     */
    @Override
    public String getHead(final Handler h) {
        return "Program launched at " + new Date() + LINE_SEPARATOR;
    }

    /**
     * {@inheritDoc}
     *
     * @since 0.4
     */
    @Override
    public String getTail(final Handler h) {
        return "Program finished at " + new Date() + LINE_SEPARATOR + LINE_SEPARATOR;
    }
}
