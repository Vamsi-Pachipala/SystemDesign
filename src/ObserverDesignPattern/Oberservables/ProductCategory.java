package ObserverDesignPattern.Oberservables;

import ObserverDesignPattern.obersrvers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory implements Obeservables {

    private final List<Observer> observerList;

    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.removeIf(observer1 -> observer1.equals(observer));
    }

    @Override
    public void notifyObservers(String productName) {
        for (Observer observer : observerList) {
            observer.update(categoryName, productName);
        }
    }

    public void productInStock(String productName) {
        System.out.println(productName + " is now in stock in " + categoryName + " category.");
        notifyObservers(productName);
    }
}
