//Usage

public class Main {
    public static void main(String[] args) {
        NotificationService notifier = new NotificationService();
        
        notifier.sendNotification("Email", "Hello via Email!");
        notifier.sendNotification("SMS", "Hello via SMS!");
        
        // Problem: Can't add a new type of notification without modifying NotificationService
    }
}
