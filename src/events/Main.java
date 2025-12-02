package events;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = EventManager.getInstance();

        // Створюємо підписників
        LoggingModule loggingModule = new LoggingModule();
        UserInterface userInterface = new UserInterface();

        // Реєструємо підписників у менеджері подій
        eventManager.subscribe(loggingModule);
        eventManager.subscribe(userInterface);

        // Створюємо модуль авторизації
        AuthModule authModule = new AuthModule();

        // Демонстрація
        authModule.login("Kyrylo");
        System.out.println("-----");

        authModule.accessDenied("anonymous");
        System.out.println("-----");

        authModule.logout("Kyrylo");
    }
}
