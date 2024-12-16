package NullObjectPattern;

// Step 3: Null Object Implementation
class NullLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("default implementation if required");
    }
}
