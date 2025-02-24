package creational.prototype;

public class Client {
     public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");

        System.out.println("Shape: " + clonedShape1.getType());
        System.out.println("Shape: " + clonedShape2.getType());

        /*
        OUTPUT
        Shape: Circle
        Shape: Rectangle
        */
    }
}
