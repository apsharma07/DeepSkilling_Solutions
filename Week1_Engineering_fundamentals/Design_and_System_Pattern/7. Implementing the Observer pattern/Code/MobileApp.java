// This is the Mobile App which will be notified when stock price changes
public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(appName + " (Mobile App) - Stock: " + stockName + ", New Price: ₹" + stockPrice);
    }
}
