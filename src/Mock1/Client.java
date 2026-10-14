package Mock1;

public class Client {
    public static void main(String[] args) {

        Configurataion configurataion = new Configurataion(3, "503", 1000);
        RetryManager retryManager = new RetryManager(configurataion);


        // api call
        String httpCode = "503"; // Simulated HTTP response code this

        retryManager.check(httpCode);
    }
}
