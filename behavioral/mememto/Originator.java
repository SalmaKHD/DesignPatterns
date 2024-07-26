package behavioral.mememto;

public class Originator {
    private int lastState = 0;

    public void saveLastState(int lastState) {
        this.lastState = lastState;
    }

    public Memento createMemento() {
        return new Memento(lastState);
    }

     public int getLastStateFromMemento(Memento mememnto) {
         return mememnto.getState();
     }
  
}
