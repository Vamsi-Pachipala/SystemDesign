package DesignProblems.RateLimiter;

public class RateLimiterConfiguration {

    private  int maxTokens;

    private  int refillRate;

    public RateLimiterConfiguration(int maxTokens, int refillRate) {
        this.maxTokens = maxTokens;
        this.refillRate = refillRate;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public int getRefillRate() {
        return refillRate;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public void setRefillRate(int refillRate) {
        this.refillRate = refillRate;
    }
}
