package LLD.MessageQueue;

class Message {
    private final String content;
    private final String sender;
    private final long timestamp;

    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
        this.timestamp = System.currentTimeMillis();
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public long getTimestamp() {
        return timestamp;
    }
}