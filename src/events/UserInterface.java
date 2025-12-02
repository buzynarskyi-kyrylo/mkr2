package events;

public class UserInterface implements EventListener {

    @Override
    public void onEvent(EventType type, String data) {
        switch (type) {
            case USER_LOGIN:
                System.out.println("events.UserInterface. Ласкаво просимо, " + data + "!");
                break;
            case USER_LOGOUT:
                System.out.println("events.UserInterface. До побачення, " + data + "!");
                break;
            case ACCESS_ERROR:
                System.out.println("events.UserInterface. Відмовлено в доступі, " + data + ".");
                break;
        }
    }
}
