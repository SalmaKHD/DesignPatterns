

/*
Investigated Topic: Programming to an Interface (Design Principle#1)
*/
public class Computer {
    public static void main(String[] args) {
        Computer cm = new Computer();
        DisplayModule dm1 = new Monitor();
        DisplayModule dm2 = new Project();
        // polymorphism in action, will get 2 different behaviors
        cm.setDisplayModule(dm1);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();
    }
    
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }


static class Project implements DisplayModule {

    public void display() {
        System.out.println("Displaying from a project");
    }
}

static public interface DisplayModule {
    public void display();
    
}

static class Monitor implements DisplayModule {
    public void display() {
        System.out.println("Displaying from a monitor!");
    }
}
}

