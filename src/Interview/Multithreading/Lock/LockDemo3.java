package Interview.Multithreading.Lock;

import java.util.concurrent.locks.ReentrantLock;

class MyThread4 extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThread4(String name) {
        super(name);
    }

    public void run() {
        if (l.tryLock()) { // Attempt to acquire the lock without waiting
            System.out.println(Thread.currentThread().getName() + " Got Lock and Performing Safe Operations");
            try {
                Thread.sleep(2000); // Simulating some safe operations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.unlock(); // Release the lock
        } else {
            System.out.println(Thread.currentThread().getName() + " Unable To Get Lock and Hence Performing Alternative Operations");
        }
    }
}

public class LockDemo3 {
    public static void main(String args[]) {
        MyThread4 t1 = new MyThread4("First Thread");
        MyThread4 t2 = new MyThread4("Second Thread");
        t1.start();
        t2.start();
    }
}
