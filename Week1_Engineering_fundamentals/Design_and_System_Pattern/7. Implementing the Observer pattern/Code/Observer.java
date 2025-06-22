// This is the Observer Interface
// All observers (like MobileApp, WebApp) must implement this
public interface Observer {
    void update(String stockName, double stockPrice); // What to do when stock price changes
}
