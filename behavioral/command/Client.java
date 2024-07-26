package behavioral.command;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        // define commands
        BuyStock buyStock = new BuyStock(googleStock);
        SellStock sellStock = new SellStock(googleStock);

        Broker broker = new Broker();
        // pass commands
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        // execute commands
        broker.placeOrders();

        /*
        OUTPUT
        *
        Buying stocks Google , 100
        Buying stocks Google , 100
        */
    }
}
