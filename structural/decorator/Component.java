package structural.decorator;

public abstract class Component {
    public abstract void doJob();
    
}

class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("Closed for modification...");
    }
}
