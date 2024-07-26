package behavioral.chainofresponsibility;

enum MessagePriority {
    Normal,
    High
}

public class Message {
    public String text;
    public MessagePriority messagePriority;
    public Message(String msg, MessagePriority priority) {
        text = msg;
        messagePriority = priority;
    }
}
