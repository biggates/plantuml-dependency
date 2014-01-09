/*
 Class1.java
 Creation date : 27/06/2013
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

package net.sourceforge.plantumldependency.main.option.output;

import java.lang.annotation.ElementType;
import static java.util.Arrays.asList;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import net.sourceforge.plantumldependency.main.option.output.test.Class4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.bind.annotation.XmlType;
import javax.xml.ws.soap.Addressing;

/**
 * @author Benjamin Croizet (<a href="mailto:graffity2199@yahoo.fr>graffity2199@yahoo.fr</a>)
 *
 * @since 1.0
 * @version
 */
@  Testabstract
@  Deprecated
@  SuppressWarnings(  {   "deprecation"   ,    "unckeked"   }   )
@  Addressing  (   enabled  =  true  )
@  Annotationinterface
@  AnotherAnnotation(   {   CONSTRUCTOR   ,    ElementType.METHOD  }  )
@  MyAnnotation  (  tab   =  {  1  ,  2  ,  3  ,  4  , 5  }  )
@  XmlType  (  propOrder  =  {  "street"  ,   "city"   ,   "state" ,   "zip"  ,   "name"  }  )
@  MappedSuperclass
@ javax.annotation.Generated(value="")
public class Class1 implements Readable {

    public static native void register_Natives();

    public void test() {
        boolean j = 0 < 1;
    }

    @Override
    public int count() {
        boolean i = 1 > 0;
        // TODO Auto-generated method stub
        String t = "@test";
        return 0;
    }
}
