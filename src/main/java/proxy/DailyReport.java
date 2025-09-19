package proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class DailyReport implements Report {
    @Override
    public String[] prepareReport() {
        StringBuilder result = new StringBuilder();
        try {
            result.append(Files.readString(Paths.get("test.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString().trim().split("\\R");
    }

    @Override
    public String getReport(Integer id) {
        String[] date = prepareReport();

        String str = Arrays.stream(date).filter(i -> i.startsWith(id + " "))
                .findFirst()
                .orElse("");
        return str;
    }
}
