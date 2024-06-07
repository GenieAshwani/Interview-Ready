package LLD.MessageQueue;

class SampleConsumer  {
    private final String name;

    public SampleConsumer(String name) {
        this.name = name;
    }

    public void consume(Message message) {
        System.out.println(name + " received message: " + message.getContent() + " from " + message.getSender());
    }
}