package ObserverDesignPattern.obersrvers;

public class User implements Observer {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String categoryName, String productName) {
        System.out.println("Notification for " + userName + ": " + productName + " is now available in " + categoryName + " category.");
    }
}
