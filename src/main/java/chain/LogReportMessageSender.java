package chain;

public class LogReportMessageSender extends MessangeSender {
    public LogReportMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Message sender using simple log report: " + message);
    }
}
