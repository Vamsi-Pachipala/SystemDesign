package Mock1;

public class RetryManager {

    Configurataion configurataion;

    public RetryManager(Configurataion configurataion) {
        this.configurataion = configurataion;
    }

    public  void retry(String httpCode) {
        if (httpCode.equals(configurataion.getHttpCode())) {
            for (int i = 0; i < configurataion.getRetryCount(); i++) {
                System.out.println("Retrying... Attempt " + (i + 1));
                try {
                    Thread.sleep(configurataion.getRetryDelay());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No retry needed for HTTP code: " + httpCode);
        }

    }
    public void check(String httpCode) {
        if (httpCode.equals(configurataion.getHttpCode())) {
            System.out.println("HTTP code matches. Retrying...");
            retry(httpCode);
        } else {
            System.out.println("HTTP code does not match. No retry needed.");
        }

    }

}
