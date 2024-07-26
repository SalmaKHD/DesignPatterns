package behavioral.template;

public class Client {
  public static void main(String[] args) {
      OrderProcess orderProcess1 = new OnlineOrderProcess();
      OrderProcess orderProcess2 = new InPersonOrderProcess();
      orderProcess1.processOrder(true);
      orderProcess2.processOrder(true);
      /*
      OUTPUT:
        Choosing items online
        Placing order online
        Making payment online
        Doing gift wrapping
        Choosing items in person
        Placing order in person
        Making payment in person
        Doing gift wrapping
      */
  }  
}
