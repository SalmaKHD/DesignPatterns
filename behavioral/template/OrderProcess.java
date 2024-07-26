package behavioral.template;

public abstract class OrderProcess {
    public boolean isGift = true;

    public final void processOrder(boolean isGift) {
        this.isGift = isGift;
        doSelect();
        doOrder();
        doPayment();
        if(isGift) doGiftWrapping();
    }

    public abstract void doSelect();
    public abstract void doOrder();
    public abstract void doPayment();

    // hooker
    public void doGiftWrapping() {
        System.out.println("Doing gift wrapping");
    }
}

class OnlineOrderProcess extends OrderProcess {
    @Override
    public void doSelect() {
       System.out.println("Choosing items online");
    }

    @Override
    public void doOrder() {
        System.out.println("Placing order online"); 
    }

    @Override
    public void doPayment() {
        System.out.println("Making payment online"); 
    }
}

class InPersonOrderProcess extends OrderProcess {
    @Override
    public void doSelect() {
       System.out.println("Choosing items in person");
    }

    @Override
    public void doOrder() {
        System.out.println("Placing order in person"); 
    }

    @Override
    public void doPayment() {
        System.out.println("Making payment in person"); 
    }
}