package structural.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("DECORATOR pattern demo");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoaratorEx_1 cd_1 = new ConcreteDecoaratorEx_1();

        cd_1.setTheComponent(cc);
        cd_1.doJob();


    }
}
