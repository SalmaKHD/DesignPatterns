package structural.adapter.objectadapter;

interface Duck {
   public void quack();
   public void fly(); 
}

class MallardDuck implements Duck {
   public void quack() {
      System.out.println("Quack");
   }
   public void fly() {
      System.out.println("I'm flying");
   }
}
