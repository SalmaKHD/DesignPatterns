package creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(2);
        System.out.println("Data is " + singleton.getData());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Data is "+singleton2.getData());
        /*
        output
        Data is 2
        Data is 2
        */
    }
}
