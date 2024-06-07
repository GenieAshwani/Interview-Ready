package DesignPattern.creationalDP.Singleton;

public class Driver {

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        System.out.println("hashcode : "+p1.hashCode()+" "+p2.hashCode());


    }
}
