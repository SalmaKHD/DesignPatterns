package structural.bridge.example;

abstract class Shape {
    protected Color color1;
    protected Shape(Color color) {
        this.color1 = color;
    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
    
}

class Triangle  extends Shape {
    protected Triangle(Color color) {
        super(color);
    }
    @Override
    public void drawShape(int border) {
        System.out.println("Drawing a triangle");
    }
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("Modifying border...");
    }
}

class Rectangle extends Shape {
    protected Rectangle(Color color) {
        super(color);
    }
    @Override
    public void drawShape(int border) {
        System.out.println("Drawing a rectangle");
    }
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("Modifying border...");
    }
}
