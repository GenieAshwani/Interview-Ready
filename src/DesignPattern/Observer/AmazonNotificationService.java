package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

class AmazonNotificationService implements AmazonService {
    private List<UserObserver> observers;
    public AmazonNotificationService() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(UserObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for (UserObserver observer : observers) {
            observer.update(message);
        }
    }
    public void sendNotification(String message) {
        notifyObservers(message);
    }
}