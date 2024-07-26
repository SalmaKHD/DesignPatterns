package creational.factory;

public class Client {
    public static void main(String[] args) {
        // get an object of Circle
        System.out.println();
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
        Shape shape2 = new RecFactory().getShape();
        shape2.draw();
        Shape shape3 = new OvalFactory().getShape();
        shape3.draw();
    
        /*
        OUTPUT
        Inside Circle draw() class
        Inside rec draw() class
        Inside Oval draw() class
        */
        Shape shape4 = new ShapeFactory().getShape("CIRCLE");
        shape4.draw();
        /*
        Inside Circle draw() class
        */
    }
}
