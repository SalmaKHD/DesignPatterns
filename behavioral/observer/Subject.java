package behavioral.observer;

import java.util.ArrayList;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyStateChanged();
    public void notifyObservers();
}
class CricketData {
    int runs = 20;
    int wickets = 100;
    int overs = 10;

    @Override
    public String toString() {
        return "Runs: " + runs + ", Wickets: " + wickets +", Overs: " + overs;
    }
}

class Cricket implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    CricketData cricketData = new CricketData();

    boolean isStateChanged = false;

    @Override
    public void register(Observer observer) {
       if(!observers.contains(observer)) { 
           observers.add(observer);
       }
    }

    @Override
    public void unregister(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyStateChanged() {
        isStateChanged = true;
    }

    @Override
    public void notifyObservers() {
        if(isStateChanged) {
        for(Observer observer: observers) {
            observer.update(cricketData);
        }
    } 
    isStateChanged = false;
    }
    
}
