package events;

public class AuthModule {

    private final EventManager eventManager = EventManager.getInstance();

    public void login(String username) {
        System.out.println("AuthModule. Користувач авторизувався: " + username);
        eventManager.publish(EventType.USER_LOGIN, username);
    }

    public void logout(String username) {
        System.out.println("AuthModule. Користувач вийшов: " + username);
        eventManager.publish(EventType.USER_LOGOUT, username);
    }

    public void accessDenied(String username) {
        System.out.println("AuthModule. Помилка доступу для користувача: " + username);
        eventManager.publish(EventType.ACCESS_ERROR, username);
    }
}
