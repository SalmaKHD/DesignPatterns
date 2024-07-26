package behavioral.command;

public class Stock {
    private String name = "Google";
    private int quantity = 100;

    public void buy() {
        System.out.println("Buying stocks " + name + " , " + quantity);
    }

    public void sell() {
        System.out.println("selling stock");
    }
}
