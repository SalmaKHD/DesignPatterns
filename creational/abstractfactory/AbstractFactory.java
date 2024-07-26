package creational.abstractfactory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        
    if(color.equalsIgnoreCase("Green")) {
        return new Green();
    }
        else return null;
    }

    @Override
    Shape getShape(String shape) {
        
        return null;
    }

}

class ShapeFactory  extends AbstractFactory {
    @Override
    Color getColor(String color) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
