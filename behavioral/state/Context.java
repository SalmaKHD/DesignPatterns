package behavioral.state;

public class Context {
   private MobileState mobileState = new Vibrant();

    public void alert() {
       mobileState.alert();
    }

    public void setState(MobileState newState) {
      mobileState = newState;
    }
}
