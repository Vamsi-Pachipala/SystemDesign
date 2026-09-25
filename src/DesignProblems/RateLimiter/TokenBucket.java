package DesignProblems.RateLimiter;

import java.time.LocalDateTime;

public class TokenBucket {

    private int tokens;

    private int fillRate;

    private LocalDateTime lastFilledTime;

    private int capacity;

    public TokenBucket(int fillRate , int capacity) {
        this.tokens = capacity;
        this.fillRate = fillRate;
        this.lastFilledTime = LocalDateTime.now();
        this.capacity = capacity;
    }

    void refillTokens(){
        LocalDateTime now = LocalDateTime.now();
        long secondsSinceLastFill = java.time.Duration.between(lastFilledTime, now).getSeconds();
        int tokensToAdd = (int) (secondsSinceLastFill * fillRate);
        tokens  = Math.min(capacity, tokens + tokensToAdd);
        lastFilledTime = now;
    }

    public synchronized boolean allowRequest() {
        refillTokens();
        if (tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }
}
