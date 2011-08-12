package net.sourceforge.plantuml.dependency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Random;

import net.sourceforge.mazix.components.clone.DeepCloneable;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.ProgrammingLanguage;
import net.sourceforge.plantuml.dependency.main.option.programminglanguage.argument.java.JavaRawDependency;
import static java.util.Arrays.asList;
import static java.util.logging.Level.SEVERE;

public class TestDisplayOption extends BigInteger implements DeepCloneable < JavaRawDependency > {

    /**
     * 
     */
    private static final long serialVersionUID = 8210152156402402701L;

    public TestDisplayOption(byte[] arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }
    
    public native int testNative();
    
    native void hello ( ) ;
    
    static native    String   hello2   (    )    ;

    public TestDisplayOption(int arg0, byte[] arg1) {
        super(arg0, arg1);
        File file = new File("toto");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public TestDisplayOption(int arg0, int arg1, Random arg2) {
        super(arg0, arg1, arg2);
        // TODO Auto-generated constructor stub
    }

    public TestDisplayOption(int arg0, Random arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public TestDisplayOption(String arg0, int arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public TestDisplayOption(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    @Override
    public JavaRawDependency deepClone() {
        // TODO Auto-generated method stub
        return null;
    }
}
