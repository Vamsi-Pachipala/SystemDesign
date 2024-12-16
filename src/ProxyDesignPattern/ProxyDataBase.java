package ProxyDesignPattern;

public class ProxyDataBase implements DataFetcher {
    String query;

    DataBase database;
    public ProxyDataBase(String query){
        this.query = query;
    }
    @Override
    public void fetchData() {
        if (database == null){
            database = new DataBase(query);
        }
        database.fetchData();
    }
}
