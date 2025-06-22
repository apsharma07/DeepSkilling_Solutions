// Adds Slack notification feature
public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);     // Send previous notifications (Email, SMS)
        sendSlack(message);      // Add Slack message
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}
