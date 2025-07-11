// Abstraction
public interface NotificationService {
    void sendNotification(String message);
}

// Low-level module
public class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}

// High-level module
public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void alert(String msg) {
        service.sendNotification(msg);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        NotificationService service = new EmailService();  // Inject via abstraction
        NotificationManager manager = new NotificationManager(service);
        manager.alert("Server down!");
    }
}
