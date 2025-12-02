package events;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggingModule implements EventListener {

    private static final String LOG_FILE = "logs.txt";

    @Override
    public void onEvent(EventType type, String data) {
        String message = "Подія: " + type + ", користувач: " + data;

        // 1) як і раніше — в консоль
        System.out.println("LoggingModule. " + message);

        // 2) додатково — у файл
        try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            out.println(message);
        } catch (IOException e) {
            // на мінімум: вивести помилку в консоль
            e.printStackTrace();
        }
    }
}
