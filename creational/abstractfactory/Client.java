package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color1= colorFactory.getColor("Green");
        color1.fill();
        /*
        OUTPUT
        Inside rec draw() class
        fill color Green
        */
    }
}
