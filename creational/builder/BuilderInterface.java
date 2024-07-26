package creational.builder;


// builds the product and returns 
interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class CarBuilder implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of the car");
    }

    @Override
     public void insertWheels() {
        product.add("2 headlights added)");
    }
    @Override
    public void addHeadLights() {
        product.add("2 Headlights added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycleBuilder implements BuilderInterface {
    Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of the motorcycle");
    }

    @Override
     public void insertWheels() {
        product.add("2 headlights added)");
    }
    @Override
    public void addHeadLights() {
        product.add("2 Headlights added");
    }
    @Override
    public Product getVehicle() {
        return product;
    }
}


