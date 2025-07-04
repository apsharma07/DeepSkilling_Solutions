// This is the base decorator class
// It implements Notifier and holds a reference to another Notifier
public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    // Constructor takes the original notifier (can be Email, SMS, etc.)
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    // Calls the original send method
    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
