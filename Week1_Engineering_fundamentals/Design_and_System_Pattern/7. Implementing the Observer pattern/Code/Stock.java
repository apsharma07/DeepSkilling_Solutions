// This is the Subject Interface
// It allows observers (like apps) to register, deregister, and get notified
public interface Stock {
    void registerObserver(Observer observer);      // Add a new observer
    void removeObserver(Observer observer);        // Remove an existing observer
    void notifyObservers();                        // Notify all registered observers
}
