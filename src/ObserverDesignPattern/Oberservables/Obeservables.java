package ObserverDesignPattern.Oberservables;

import ObserverDesignPattern.obersrvers.Observer;

public interface Obeservables {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String productName);
}
