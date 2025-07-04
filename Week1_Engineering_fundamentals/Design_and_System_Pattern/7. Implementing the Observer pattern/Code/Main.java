public class Main {
    public static void main(String[] args) {
        // Create a stock (subject)
        StockMarket stockMarket = new StockMarket("Tata Motors");

        // Create some observers (clients)
        Observer mobile = new MobileApp("ShareTrack");
        Observer web = new WebApp("NSEWatch");

        // Register observers
        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        // Simulate stock price updates
        stockMarket.setStockPrice(410.50);
        stockMarket.setStockPrice(425.75);

        // Remove one observer
        stockMarket.removeObserver(web);

        // Simulate another update
        stockMarket.setStockPrice(430.10);
    }
}
