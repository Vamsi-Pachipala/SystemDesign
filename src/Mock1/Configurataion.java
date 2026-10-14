package Mock1;

public class Configurataion {

    private int retryCount;

   private String httpCode;

   private int retryDelay;

    public Configurataion(int retryCount, String httpCode, int retryDelay) {
        this.retryCount = retryCount;
        this.httpCode = httpCode;
        this.retryDelay = retryDelay;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    public int getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(int retryDelay) {
        this.retryDelay = retryDelay;
    }
}
