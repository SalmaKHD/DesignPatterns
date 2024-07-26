package behavioral.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
        /*
        OUTPUT
        Going into Vibrant mode...
        Going into Vibrant mode...
        Going into Silent mode...
        */
    }
}
