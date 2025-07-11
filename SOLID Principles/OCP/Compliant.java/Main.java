//Usage

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();
        
        service.sendNotification(email, "Hello via Email!");
        service.sendNotification(sms, "Hello via SMS!");
    }
}
