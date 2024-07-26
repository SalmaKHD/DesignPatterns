package structural.flyweight;

public interface Player {
    
    void assingWeapon(String weapon);
    void mission();
}

class Terrorist implements Player {
    // intrinsic state
    private final String task ="";

    // extrinsic state
    String weapon = "";
    @Override
    public void assingWeapon(String weapon) {
        this.weapon = weapon;
        
    }
    @Override
    public void mission() {
        System.out.println("Mission is" + task);
    }
    
}

class CounterTerrorist implements Player {
    private final String task ="";
    // extrinsic state
    String weapon = "";
    @Override
    public void assingWeapon(String weapon) {
        this.weapon = weapon;
        
    }
    @Override
    public void mission() {
        System.out.println("Mission is" + task);
    }
    
}
