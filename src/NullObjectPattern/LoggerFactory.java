package NullObjectPattern;

// Step 4: Factory to decide which logger.java to return
class LoggerFactory {
    public static Logger getLogger(boolean isLoggingEnabled) {
        if (isLoggingEnabled) {
            return new ConsoleLogger();
        }
        return new NullLogger();
    }
}
