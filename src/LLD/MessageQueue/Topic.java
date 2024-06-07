package LLD.MessageQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Topic {
    private final String name;
    private final List<SampleConsumer> subscribers;
    private final List<Message> messages;

    public Topic(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void subscribe(SampleConsumer consumer) {
        subscribers.add(consumer);
    }

    public void publish(Message message) {
        messages.add(message);
        notifySubscribers(message);
    }

    private void notifySubscribers(Message message) {
        for (SampleConsumer subscriber : subscribers) {
            subscriber.consume(message);
        }
    }
}
