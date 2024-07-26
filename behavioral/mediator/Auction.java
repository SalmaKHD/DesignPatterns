package behavioral.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public interface Auction {
    public void addCustomers(Customer[] customers);
    public void placeBid(Customer client, int bidPrice);
    public void declareProductWinner();
}

class PaintingAuction implements Auction {
    String product = "";
    HashMap<Customer, Integer> bids = new HashMap();


    @Override
    public void placeBid(Customer client, int bidPrice) {
            bids.put(client, bidPrice);
    }

    @Override
    public void declareProductWinner() {
        Integer highestbid = null;
        Iterator<Integer> iterator = bids.values().iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            if(highestbid==null || (highestbid != null && value > highestbid)) highestbid = value;
        }
        if(highestbid!=null) {
            System.out.println("The highest bid is:" + highestbid);
        } else {
            System.out.println("No offers exist yet.");
        }
        // let everyone know the auction has ended
        Iterator<Customer> customerIterator = bids.keySet().iterator();
        while(customerIterator.hasNext()) {
            customerIterator.next().notifyAuctionEnded();
        }
    }

    @Override
    public void addCustomers(Customer[] customers) {
        for(int i = 0; i< customers.length; i++) {
            bids.put(customers[i], 0);
        }   
    }
}