package DesignPattern.creationalDP.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionApiTest {
    public static void main(String[] args) {

        try {
            Class c=Class.forName("DesignPattern.creationalDP.Singleton.Printer");
            Constructor con[]=c.getDeclaredConstructors();
            con[0].setAccessible(true);
          //  Printer p0=Printer.getInstance();
        Printer p1=    (Printer)con[0].newInstance();
        Printer p2=    (Printer)con[0].newInstance();
       // Printer p3=    (Printer)con[0].newInstance();
           // System.out.println(p0.hashCode());
          //  System.out.println(p1.hashCode());
           // System.out.println(p2.hashCode());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
