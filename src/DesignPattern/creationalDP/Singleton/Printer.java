package DesignPattern.creationalDP.Singleton;

public class Printer extends CommanUtils{


    public static final long serialVersionUID=1L;
    private static Printer INSTANCE=null;
    private static boolean isInstantiated=false;
    int a=10;
    private  Printer()
    {
        if(isInstantiated)
        {
            throw new RuntimeException("Object already created");
        }
        else {
            isInstantiated=true;
        }
        System.out.println("0:arg");
    }

    public static Printer getInstance()
    {
       /* if(INSTANCE==null)
        {
            INSTANCE= new Printer();
            return INSTANCE;
        }
        return INSTANCE;*/

        /*if (INSTANCE == null) {
            synchronized (Printer .class) {
                if (INSTANCE == null) {
                    INSTANCE = new Printer();
                }
            }
        }*/
        if (INSTANCE == null) { // First check (no locking)
            synchronized (Printer.class) {
                if (INSTANCE == null) { // Second check (with locking)
                    INSTANCE = new Printer();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       // return INSTANCE; //solution one
         throw new CloneNotSupportedException("Clone not supported");
    }

    public Object readResolve()
    {
        //return INSTANCE;
        throw new IllegalArgumentException("Deserializarion not allowed");
    }
    public Object writeReplace()
    {
        throw new IllegalArgumentException("serializarion not allowed");
    }

}
