package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Michael on 11/18/2015.
 */
public class FuelDepot {

    List<Observer> observers = new ArrayList<Observer>();
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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