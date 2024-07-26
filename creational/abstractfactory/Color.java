package creational.abstractfactory;

interface Color {
    void fill();
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("fill color Green");   
    }
}

class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("fill color Yellow");
    }
    
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("fill color Blue");
    }
}
