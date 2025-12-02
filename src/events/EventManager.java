package events;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    // Єдиний екземпляр (Singleton)
    private static final EventManager INSTANCE = new EventManager();

    private final List<EventListener> listeners = new ArrayList<>();

    // Приватний конструктор, щоб ніхто не створив новий екземпляр
    private EventManager() {
    }

    // Глобальна точка доступу
    public static EventManager getInstance() {
        return INSTANCE;
    }

    // Реєстрація підписника
    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    // Відписка
    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    // Розсилка події всім підписникам
    public void publish(EventType type, String data) {
        for (EventListener listener : listeners) {
            listener.onEvent(type, data);
        }
    }
}
