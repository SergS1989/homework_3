package chain;

public class Bugevent {
    public static void main(String[] args) {
        MessangeSender log = new LogReportMessageSender(PriorityLevel.LOW);
        MessangeSender email = new EmailMessageSender(PriorityLevel.MIDDLE);
        MessangeSender sms = new SMSMessageSender(PriorityLevel.HIGH);

        log.setNextMessangeSender(email);
        email.setNextMessangeSender(sms);

        log.messengeSenderManager("Something is happening!", PriorityLevel.LOW);
        System.out.println();
        log.messengeSenderManager("Something went wrong!", PriorityLevel.MIDDLE);
        System.out.println();
        log.messengeSenderManager("We had a problem!", PriorityLevel.HIGH);
    }
}
