package structural.bridge.example;

interface Color {
    public void fillWithColor(int border);
}

// we can now modify this without modifying the abstraction
class Red implements Color {
    @Override 
    public void fillWithColor(int border) {
        System.out.println("Color red!");
    }
}

class Green implements Color {
    @Override 
    public void fillWithColor(int border) {
        System.out.println("Green red!");
    }
}