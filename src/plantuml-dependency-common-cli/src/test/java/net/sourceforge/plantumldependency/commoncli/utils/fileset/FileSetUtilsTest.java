/*
 FileSetUtilsTest.java
 Creation date : 14/07/2010
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

package net.sourceforge.plantumldependency.commoncli.utils.fileset;

import static net.sourceforge.plantumldependency.common.constants.CommonConstants.CURRENT_DIRECTORY;
import static net.sourceforge.plantumldependency.commoncli.utils.fileset.FileSetUtils.createFileSet;
import static org.junit.Assert.assertNotNull;

import org.apache.tools.ant.types.FileSet;
import org.junit.Test;

/**
 * JUnit test classes for {@link FileSetUtils}.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public class FileSetUtilsTest {

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.fileset.FileSetUtils#createFileSet(java.io.File, java.lang.String)}
     * .
     */
    @Test
    public void testCreateFileSetFileString() {
        final FileSet fileset = createFileSet(CURRENT_DIRECTORY, "**/*");
        assertNotNull(fileset);
    }

    /**
     * Test method for
     * {@link net.sourceforge.plantumldependency.commoncli.utils.fileset.FileSetUtils#createFileSet(java.io.File, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public void testCreateFileSetFileStringString() {
        final FileSet fileset = createFileSet(CURRENT_DIRECTORY, "**/*", "**/*~");
        assertNotNull(fileset);
    }
}
