package chain;

public abstract class MessangeSender {
    private PriorityLevel priorityLevel;
    private MessangeSender nextMessangeSender;

    public MessangeSender(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void setNextMessangeSender(MessangeSender nextMessangeSender) {
        this.nextMessangeSender = nextMessangeSender;
    }

    public void messengeSenderManager(String message, PriorityLevel level){
        if (level.ordinal() >= priorityLevel.ordinal()) {
            write(message);
        }
        if (nextMessangeSender != null) {
            nextMessangeSender.messengeSenderManager(message, level);
        }
    }

    public abstract void write(String message);
}
