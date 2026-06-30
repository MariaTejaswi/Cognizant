// package Week-1.Design-Patterns.ObserverPatternExample;

public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice("TCS", 4200);

        stockMarket.setStockPrice("Infosys", 1600);

    }

}
