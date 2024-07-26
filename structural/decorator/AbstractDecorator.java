package structural.decorator;

public class AbstractDecorator extends Component {
    protected Component com;

    public void setTheComponent(Component c) {
        com = c;
    }
    public void doJob() {
        if(com!=null) {
            com.doJob();
        }
    }
}


// extends class and add additional functionalities to the inherited methods
class ConcreteDecoaratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        System.out.println("I am explicitely from Ex_1");
    }
}

class ConcreteDecoaratorEx_2 extends AbstractDecorator {
    public void doJob() {
        super.doJob();

        System.out.println("I am explicitely from Ex_2");
    }
}