package DesignPattern.creationalDP.Singleton;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        Printer p1=Printer.getInstance();
        System.out.println(p1.a);
       doSerialization(p1);
      Printer p2=  doDeSeralization();
      Printer p3=  doDeSeralization();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p3.a);

    }

    public static void doSerialization(Printer p)
    {
        try{
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("data.ser"));
            os.writeObject(p);
            os.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static Printer doDeSeralization()
    {
        Printer p=null;
        try {
            ObjectInputStream ip=new ObjectInputStream(new FileInputStream("data.ser"));
            p=(Printer) ip.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return p;
    }
}
