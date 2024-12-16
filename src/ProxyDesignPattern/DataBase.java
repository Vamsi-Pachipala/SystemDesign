package ProxyDesignPattern;

public class DataBase implements DataFetcher{
    private String query;

    public DataBase(String query) {
        this.query = query;
        connectAndExecuteQuery();
    }

    private void connectAndExecuteQuery() {
        System.out.println("Connecting to database and executing query: " + query);
    }

    @Override
    public void fetchData() {
        System.out.println("Returning data for query: " + query);
    }
}
