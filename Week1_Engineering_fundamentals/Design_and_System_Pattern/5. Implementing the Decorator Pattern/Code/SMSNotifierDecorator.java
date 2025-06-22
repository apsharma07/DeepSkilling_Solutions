// Adds SMS sending functionality
public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    // First sends previous notifications, then adds SMS
    @Override
    public void send(String message) {
        super.send(message);  // Send original message (e.g., Email)
        sendSMS(message);     // Send SMS additionally
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
