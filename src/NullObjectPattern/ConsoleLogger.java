package NullObjectPattern;

// Step 2: Real Implementation
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}
