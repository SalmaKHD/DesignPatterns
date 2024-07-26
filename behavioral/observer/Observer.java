package behavioral.observer;

public interface Observer {
    public void update(CricketData cricketData);
}

class AverageScore implements Observer {
    @Override
    public void update(CricketData cricketData) {
        System.out.println("Class " + this.getClass() + " was just notified of the updates.");
        System.out.println("Doing something with the data...");

    }
}

class CurrentScore implements Observer {
    @Override
    public void update(CricketData cricketData) {
        System.out.println("Class " + this.getClass() + " was just notified of the updates.");
        System.out.println("Doing something with the data...");
    }
}