package events;

public interface EventListener {
    void onEvent(EventType type, String data);
}