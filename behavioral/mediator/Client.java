package behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Auction mediator = new PaintingAuction();
        Customer customer1 = new Customer(mediator, "Salma");
        Customer customer2 = new Customer(mediator, "Haji");
        mediator.addCustomers(new Customer[] {customer1, customer2});
        customer1.placeBid(1000);
        customer2.placeBid(1200);
        customer1.placeBid(2000);

        mediator.declareProductWinner();
        /*
        OUTPUT:
        The highest bid is:2000
        Auction has ended Salma!
        Auction has ended Haji!
        */
    }
}
