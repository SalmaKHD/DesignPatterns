package creational.singleton;

// Bill Pugh approach of creating a singleton
public class BillPughSingleton {
    private int data = 0;

    private BillPughSingleton(){}
    private static class SingletonHelper {
        private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }
    public void setData(int myData) {
        data = myData;
    }
    public int getData() {
        return data;
    }
}
