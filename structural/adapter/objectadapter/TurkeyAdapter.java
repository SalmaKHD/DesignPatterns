package structural.adapter.objectadapter;

public class TurkeyAdapter {
    // will have to adapt to the dock
   Turkey turkey; 

   public TurkeyAdapter(Turkey turkey) {
       this.turkey = turkey;
   }

   public void quack() {
       turkey.gobble();
   }

   public void fly() {
       for(int i = 0; i< 5; i++ ) {
           turkey.fly();
       }
   }
}
