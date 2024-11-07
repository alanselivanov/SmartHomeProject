package smart_home.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    // Method to add an observer
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers with a given message
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Method to change state and notify all observers
    public void changeState(String newState) {
        System.out.println("DeviceManager: state changed to: " + newState);
        notifyObservers("State changed to: " + newState);
    }
}
