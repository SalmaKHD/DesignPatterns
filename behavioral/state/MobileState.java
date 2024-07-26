package behavioral.state;

public interface MobileState {
    public void alert();
}

class Silent implements MobileState {
    @Override
    public void alert() {
       System.out.println("Going into Silent mode...");  
    }
}

class Vibrant implements MobileState {
    @Override
    public void alert() {
        System.out.println("Going into Vibrant mode...");   
    }
}
