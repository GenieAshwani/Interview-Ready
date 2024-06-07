package Interview.Multithreading;

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class Producer extends Thread {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    public void run() {
        synchronized (message) {
            System.out.println("Producer is producing a message...");
            message.setMessage("Hello from Producer");
            message.notifyAll();
        }
    }
}
class Consumer extends Thread {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public void run() {
        synchronized (message) {
            try {
                System.out.println("Consumer is waiting for a message...");
                message.wait();
                System.out.println("Consumer received a message: " + message.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NotifyAllDemo {

    public static void main(String[] args) throws InterruptedException {
        Message message = new Message(null);

        Producer producer = new Producer(message);
        Consumer consumer1 = new Consumer(message);
        Consumer consumer2 = new Consumer(message);



        consumer1.start();
        consumer2.start();
        Thread.sleep(2000);
        producer.start();
    }
}
