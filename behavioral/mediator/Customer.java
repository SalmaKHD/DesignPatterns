package behavioral.mediator;

import java.util.Random;

public class Customer {
    Auction mediator;
    public Customer(Auction mediator,String name) {
        this.mediator = mediator;
        this.name = name;
        clientId = Math.random();
    }
    String name;
    double clientId;

    public void placeBid(int bid) {
        mediator.placeBid(this, bid);
    }

    public void notifyAuctionEnded() {
        System.out.println("Auction has ended " + name + "!");
    }
}
