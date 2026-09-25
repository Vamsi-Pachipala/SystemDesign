package DesignProblems.RateLimiter;

public class RateLimiterManager {

    TokenBucket tokenBucket;

    public RateLimiterManager(TokenBucket tokenBucket) {
        this.tokenBucket = tokenBucket;
    }

    public boolean allowRequest() {
        return tokenBucket.allowRequest();
    }

}
