package behavioral.mememto;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareKeeper careKeeper = new CareKeeper();
        originator.saveLastState(2);
        careKeeper.saveState(originator.createMemento());
        originator.saveLastState(4);
        careKeeper.saveState(originator.createMemento());
        int firstState= originator.getLastStateFromMemento(careKeeper.getState(0));
        System.out.println("First state of object is: " + firstState);
        /*
        OUTPUT:
        First state of object is: 2
        */
    }
}
