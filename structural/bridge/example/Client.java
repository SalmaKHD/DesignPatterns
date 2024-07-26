package structural.bridge.example;

public class Client {
    public static void main(String[] args) {
        Color green = new Green();
        Color red = new Red();
        Shape rectgle = new Rectangle(red);
        Shape triangle = new Triangle(green);

        rectgle.drawShape(12);
        rectgle.modifyBorder(2, 5);

        triangle.drawShape(12);
        triangle.modifyBorder(3, 10);
        /*
        OUTPUT:
        Drawing a rectangle
        Modifying border...
        Drawing a triangle
        Modifying border...
        */
    }
}
