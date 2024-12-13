package ObserverDesignPattern;

import ObserverDesignPattern.Oberservables.ProductCategory;
import ObserverDesignPattern.obersrvers.User;

public class Main {

    public static void main(String[] args) {
        // Create product categories
        ProductCategory tvCategory = new ProductCategory("TV");
        ProductCategory mobileCategory = new ProductCategory("Mobile");

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Users subscribe to categories
        tvCategory.registerObserver(user1);
        tvCategory.registerObserver(user2);

        mobileCategory.registerObserver(user2);
        mobileCategory.registerObserver(user3);

        // Notify users when products come back in stock
        tvCategory.productInStock("Samsung Smart TV");
        mobileCategory.productInStock("iPhone 15");

        tvCategory.removeObserver(user1);

        tvCategory.productInStock("Samsung Smart TV");
    }
}
