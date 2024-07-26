package creational.factory;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}

class RecFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    } 
}

class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class OvalFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Oval();
    }
}