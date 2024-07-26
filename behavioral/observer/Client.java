package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject cricket = new Cricket();
        Observer observer1 = new AverageScore();
        Observer observer2 = new CurrentScore();
        cricket.register(observer1);
        cricket.register(observer2);
        cricket.notifyStateChanged();
        cricket.notifyObservers();
        cricket.unregister(observer1);
        cricket.notifyStateChanged();
        cricket.notifyObservers();
        /*
        OUTPUT
       Class class behavioral.observer.AverageScore was just notified of the updates.
       Doing something with the data...
       Class class behavioral.observer.CurrentScore was just notified of the updates.
       Doing something with the data...
       Class class behavioral.observer.CurrentScore was just notified of the updates.
       Doing something with the data...
        */
    }
}