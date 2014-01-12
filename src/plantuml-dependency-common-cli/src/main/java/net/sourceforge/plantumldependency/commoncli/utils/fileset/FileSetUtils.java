/*
 FileSetUtils.java
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

import static net.sourceforge.plantumldependency.common.utils.check.ParameterCheckerUtils.checkNull;
import static net.sourceforge.plantumldependency.commoncli.constants.log.ErrorConstants.COMMAND_LINE_ARGUMENTS_NULL_ERROR;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.FileSet;

/**
 * The class utilities simplifying some {@link FileSet} tasks.
 *
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 * @since 1.3.0
 * @version 1.3.0
 */
public abstract class FileSetUtils {

    /**
     * Creates a {@link FileSet} instance following passed parameters.
     *
     * @param baseDirectory
     *            the base directory, mustn't be <code>null</code>.
     * @param includePattern
     *            the include pattern, mustn't be <code>null</code>.
     * @return the {@link FileSet} instance following passed parameters.
     * @since 1.3.0
     */
    public static FileSet createFileSet(final File baseDirectory, final String includePattern) {
        checkNull(baseDirectory, COMMAND_LINE_ARGUMENTS_NULL_ERROR);
        checkNull(includePattern, COMMAND_LINE_ARGUMENTS_NULL_ERROR);

        final FileSet fileSet = new FileSet();
        final Project project = new Project();
        fileSet.setProject(project);
        fileSet.setDir(baseDirectory);
        fileSet.setIncludes(includePattern);
        return fileSet;
    }

    /**
     * Creates a {@link FileSet} instance following passed parameters.
     *
     * @param baseDirectory
     *            the base directory, mustn't be <code>null</code>.
     * @param includePattern
     *            the include pattern, mustn't be <code>null</code>.
     * @param excludePattern
     *            the exclude pattern, mustn't be <code>null</code>.
     * @return the {@link FileSet} instance following passed parameters.
     * @since 1.3.0
     */
    public static FileSet createFileSet(final File baseDirectory, final String includePattern,
            final String excludePattern) {
        checkNull(baseDirectory, COMMAND_LINE_ARGUMENTS_NULL_ERROR);
        checkNull(includePattern, COMMAND_LINE_ARGUMENTS_NULL_ERROR);
        checkNull(excludePattern, COMMAND_LINE_ARGUMENTS_NULL_ERROR);

        final FileSet fileSet = new FileSet();
        final Project project = new Project();
        fileSet.setProject(project);
        fileSet.setDir(baseDirectory);
        fileSet.setIncludes(includePattern);
        fileSet.setExcludes(excludePattern);
        return fileSet;
    }

    /**
     * Private constructor to prevent from instantiation.
     *
     * @since 1.3.0
     */
    private FileSetUtils() {
        super();
    }
}
