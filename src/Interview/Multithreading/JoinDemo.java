package Interview.Multithreading;
class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sita Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // Handle exception
                e.printStackTrace();
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1();
        t.start();
        t.join(); // Uncommenting this line will change the program behavior
        for (int i = 0; i < 5; i++) {
            System.out.println("Rama Thread");
        }
    }
}
