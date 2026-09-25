package DesignProblems.RateLimiter;

public class Main {

    public static void main(String[] args) {

        RateLimiterConfiguration rateLimiterConfiguration = new RateLimiterConfiguration(10, 5);

        RateLimiterManager rateLimiterManager = new RateLimiterManager(new TokenBucket(
                rateLimiterConfiguration.getRefillRate(),
                rateLimiterConfiguration.getMaxTokens()
        ));

        for (int i = 0; i < 20; i++) {
            if (rateLimiterManager.allowRequest()) {
                System.out.println("Request " + (i + 1) + " allowed.");
            } else {
                System.out.println("Request " + (i + 1) + " denied.");
            }
            try {
                Thread.sleep(500); // Sleep for 1 second between requests
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
