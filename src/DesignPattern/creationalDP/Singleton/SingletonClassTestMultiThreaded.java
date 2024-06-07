package DesignPattern.creationalDP.Singleton;

public class SingletonClassTestMultiThreaded {
    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBooking();
        Thread thread=new Thread(ticketBooking);
        Thread thread2=new Thread(ticketBooking);
        Thread thread3=new Thread(ticketBooking);

        thread.start();
        thread2.start();
        thread3.start();

    }
}
