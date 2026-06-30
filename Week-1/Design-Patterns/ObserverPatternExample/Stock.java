// package Week-1.Design-Patterns.ObserverPatternExample;

public interface Stock {

    void registerObserver(Observer observer);

    void deregisterObserver(Observer observer);

    void notifyObservers();

}
