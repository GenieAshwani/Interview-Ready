package Interview.Multithreading;

class MyThread2 extends Thread {
    static Thread mt;  // Reference to the main thread

    public void run() {
        try {
            mt.join();  // Child thread waits for the main thread to die
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class JoinDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2.mt = Thread.currentThread();  // Set the reference to the main thread
        MyThread2 t = new MyThread2();
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);  // Main thread sleeps for 2 seconds
            System.out.println("Main Thread");
        }
    }
}

