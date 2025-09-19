package adapter;

public class USBAdapter implements USB{
    private MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyDate();
    }
}
