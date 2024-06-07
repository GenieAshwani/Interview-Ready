package Interview.Multithreading;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class SharedResource {
    private List<Integer> list = new LinkedList<>();
    private final int CAPACITY = 10;

    public synchronized void produce() throws InterruptedException {
        while (true) {
            if (list.size() == CAPACITY) {
                wait(); // Wait if the list is full
            }
            list.add(new Random().nextInt(100));
            System.out.println("Produced: " + list.size());
            notify(); // Notify the consumer that there is data available
            Thread.sleep(1000);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            if (list.isEmpty()) {
                wait(); // Wait if the list is empty
            }
            int value = list.remove(0);
            System.out.println("Consumed: " + value);
            notify(); // Notify the producer that space is available
            Thread.sleep(1000);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
