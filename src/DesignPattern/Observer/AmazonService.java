package DesignPattern.Observer;

interface AmazonService {
    void addObserver(UserObserver observer);
    void removeObserver(UserObserver observer);
    void notifyObservers(String message);
}
