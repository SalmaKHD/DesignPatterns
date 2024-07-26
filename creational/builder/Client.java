package creational.builder;

public class Client {
    public static void main(String[] args) {
        BuilderInterface builder1 = new CarBuilder();
        BuilderInterface builder2 = new MotorCycleBuilder();

        Director director = new Director();
        director.construct(builder1);
        Product product1 = builder1.getVehicle();
        director.construct(builder2);
        Product product2 = builder2.getVehicle();
        product1.show();
        product2.show();
    
    }
}
