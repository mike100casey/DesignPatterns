package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class FuelDepot {
    List<Observer> observers = new ArrayList<Observer>();
    double state;

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
        notifyAllObservers();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(observer.Observer::update);
    }

}