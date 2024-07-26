package creational.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String product) {
        if(product.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if(product.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }
    
}
