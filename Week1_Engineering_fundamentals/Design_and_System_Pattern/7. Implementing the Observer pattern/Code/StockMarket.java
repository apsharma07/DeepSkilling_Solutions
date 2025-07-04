import java.util.ArrayList;
import java.util.List;

// This is the main stock market class (Subject)
// It keeps track of all observers and notifies them on price change
public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName) {
        this.stockName = stockName;
    }

    // Add a new observer (like an app)
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all registered observers
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }

    // This method updates stock price and notifies observers
    public void setStockPrice(double newPrice) {
        System.out.println("\nStock price updated: ₹" + newPrice);
        this.stockPrice = newPrice;
        notifyObservers(); // Notify all observers of the change
    }
}
