package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy1 = new OperationAdd();
        Strategy strategy2  = new OperationMultiply();
        Context context = new Context();
        int num1 = 1;
        int num2 = 10;
        int strategy1Result= context.doOperation(strategy1, num1, num2);
        int strategy2Reult = context.doOperation(strategy2, num1, num2);
        System.out.println("Strategy1 Result: " + strategy1Result);
        System.out.println("Strategy2 Result: " + strategy2Reult);;
        /*
        OUTPUT:
        Strategy1 Result: 11
        Strategy2 Result: 10
        */
    }
}
