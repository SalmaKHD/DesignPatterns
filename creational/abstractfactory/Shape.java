package creational.abstractfactory;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside rec draw() class");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle draw() class");
    }
}

class Oval implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Oval draw() class");
    }
}