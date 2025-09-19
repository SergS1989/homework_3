package proxy;

import java.util.Arrays;

public class ProxyDailyReport implements Report {

    private DailyReport dailyReport = new DailyReport();

    private String[] cache = null;

    @Override
    public String[] prepareReport() {
        if (cache == null) {
            cache = dailyReport.prepareReport();
        }
        return cache;
    }

    @Override
    public String getReport(Integer id) {
        if (cache == null) {
            cache = dailyReport.prepareReport();
        }
        String str = Arrays.stream(cache).filter(i -> i.startsWith(id + " "))
                .findFirst()
                .orElse("");
        return str;
    }

    public void clear() {
        cache = null;
    }
}
