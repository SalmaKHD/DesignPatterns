package structural.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println(classAdapter.getInteger());

        /*
        OUTPUT:
        7
        */
    }
}
