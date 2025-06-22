// This is the Web App which also observes stock price updates
public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(appName + " (Web App) - Stock: " + stockName + ", New Price: ₹" + stockPrice);
    }
}
