package chain;

public class EmailMessageSender extends MessangeSender {
    public EmailMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
