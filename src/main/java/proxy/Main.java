package proxy;

public class Main {
    public static void main(String[] args) {
        Report report = new ProxyDailyReport();
        System.out.println(report.getReport(1));
    }
}
