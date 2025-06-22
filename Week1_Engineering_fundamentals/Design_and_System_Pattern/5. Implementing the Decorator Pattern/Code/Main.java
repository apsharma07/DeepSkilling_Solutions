public class Main {
    public static void main(String[] args) {

        // Step 1: Start with base notifier (Email only)
        Notifier emailNotifier = new EmailNotifier();

        // Step 2: Add SMS notification using decorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Step 3: Add Slack notification on top of Email + SMS
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        // Final notification will go via Email + SMS + Slack
        fullNotifier.send("System maintenance at 10 PM today.");

        // Output:
        // Sending Email: System maintenance at 10 PM today.
        // Sending SMS: System maintenance at 10 PM today.
        // Sending Slack message: System maintenance at 10 PM today.
    }
}
