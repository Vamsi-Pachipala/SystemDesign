package ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        DataFetcher dataFetcher = new ProxyDataBase("SELECT * FROM users");

        System.out.println("First fetch call:");
        dataFetcher.fetchData();

        System.out.println("\nSecond fetch call:");
        dataFetcher.fetchData(); // Reuses the already loaded database object.
    }
}
