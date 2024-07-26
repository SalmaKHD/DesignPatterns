package behavioral.command;

public interface Order {
    public void execute();
}

class BuyStock implements Order {
    private Stock stock;

 BuyStock(Stock stock) {
        this.stock = stock;
    }
    public void execute() {
        this.stock.buy();
    }
}

class SellStock implements Order {
    Stock stock;
     SellStock(Stock stock) {
        this.stock = stock;
    }
    public void execute() {
        this.stock.buy();
    }
}
