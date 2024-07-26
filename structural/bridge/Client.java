package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufaccture();

        Bike bike = new Bike(new Produce(), new Assemble());
        bike.manufaccture();
    }
    /*
    OUTPUT
    Car
    Produced
    Assembled
    Produced
    Bike
    Produced
    Assembled
    Produced
    */
}
