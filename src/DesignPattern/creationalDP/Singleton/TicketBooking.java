package DesignPattern.creationalDP.Singleton;

public class TicketBooking implements Runnable {

    @Override
    public void run() {
        System.out.println("ticker booking operations...");
        Printer p1=Printer.getInstance();
        System.out.println(p1.hashCode());
    }
}
