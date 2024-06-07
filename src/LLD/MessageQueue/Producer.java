package LLD.MessageQueue;

import java.util.HashMap;
import java.util.Map;

class Producer {
     final Map<String, Topic> topics;

    public Producer() {
        this.topics = new HashMap<>();
    }

    public void createTopic(String topicName) {
        if (!topics.containsKey(topicName)) {
            topics.put(topicName, new Topic(topicName));
        }
    }

    public void publish(String topicName, Message message) {
        Topic topic = topics.get(topicName);
        if (topic != null) {
            topic.publish(message);
        } else {
            System.out.println("Topic '" + topicName + "' does not exist.");
        }
    }
}