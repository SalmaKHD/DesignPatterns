package behavioral.visitor;

public interface Element {
    public void accept(Visitor visitor);
}

class CD implements Element {
    private int price;
    private int weight;

    public CD(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCD(this);
    }

    public int getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
}

class DVD implements Element {
    private int price;
    private int weight;
    public DVD(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitDVD(this);
    }
    public int getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
}

class Book implements Element {
    private int price;
    private int weight;
    public Book(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
    public int getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
}
