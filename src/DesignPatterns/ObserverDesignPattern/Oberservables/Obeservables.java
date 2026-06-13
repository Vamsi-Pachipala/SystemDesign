package DesignPatterns.ObserverDesignPattern.Oberservables;

import DesignPatterns.ObserverDesignPattern.obersrvers.Observer;

public interface Obeservables {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String productName);
}
