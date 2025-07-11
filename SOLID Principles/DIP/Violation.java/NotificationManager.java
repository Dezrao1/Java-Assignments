public class NotificationManager {
    private EmailService service;

    public NotificationManager() {
        this.service = new EmailService();  // Tight coupling
    }

    public void alert(String msg) {
        service.sendEmail(msg);  // Directly calls a low-level method
    }
}

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
