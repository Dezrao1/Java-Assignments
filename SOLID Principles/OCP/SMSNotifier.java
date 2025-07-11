// Step 2: Implement different notifiers

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
