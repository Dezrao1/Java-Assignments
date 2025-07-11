// The code below has 2 message types. Adding new type requires MODIFYING this method

public class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("Email")) {
            System.out.println("Sending Email: " + message);
        } 
        else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
        // Adding new type requires MODIFYING this method
        else {
            throw new IllegalArgumentException("Unsupported notification type");
        }
    }
}
