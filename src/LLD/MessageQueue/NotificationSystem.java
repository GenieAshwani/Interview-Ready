package LLD.MessageQueue;

public class NotificationSystem {
    public static void main(String[] args) {
        // Create producer
        Producer producer = new Producer();

        // Create topics
        producer.createTopic("topic1");
        producer.createTopic("topic2");

        // Create consumers
        SampleConsumer consumer1 = new SampleConsumer("Consumer1");
        SampleConsumer consumer2 = new SampleConsumer("Consumer2");

        // Subscribe consumers to topics
        producer.topics.get("topic1").subscribe(consumer1);
        producer.topics.get("topic2").subscribe(consumer2);

        // Publish messages
        producer.publish("topic1", new Message("Hello from Producer1", "Producer1"));
        producer.publish("topic2", new Message("Hello from Producer2", "Producer2"));
    }
}
