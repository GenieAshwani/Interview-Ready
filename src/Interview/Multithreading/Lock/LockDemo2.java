package Interview.Multithreading.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Display {
    ReentrantLock l = new ReentrantLock(true); // Creating a fair ReentrantLock

    public void wish(String name) {
        l.lock(); // Acquiring the lock
        for(int i = 0; i < 5; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(2000); // Simulating some work
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
        l.unlock(); // Releasing the lock
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name); // Invoking the wish method of Display
    }
}

public class LockDemo2 {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuva Raj");
        MyThread t3 = new MyThread(d, "ViratKohli");

        t1.start(); // Starting threads
        t2.start();
        t3.start();
    }
}
