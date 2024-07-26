package structural.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Dock says...");
        duck.fly();
        duck.quack();

        // now the turkey is now able to say quack 
        System.out.println("\n The TurkeyAdapter says...");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
        /*
        Gobbling
        I am flying

        The Dock says...
        I'm flying
        Quack

        The TurkeyAdapter says...
        I am flying
        I am flying
        I am flying
        I am flying
        I am flying
        Gobbling
        */
    }
}
