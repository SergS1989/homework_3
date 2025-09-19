package adapter;

public class Main {
    public static void main(String[] args) {
        USB usbAdapter = new USBAdapter(new MemoryCard());
        usbAdapter.connectWithUsbCable();
    }
}
