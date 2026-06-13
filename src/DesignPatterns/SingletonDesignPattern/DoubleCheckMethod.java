package DesignPatterns.SingletonDesignPattern;

public class DoubleCheckMethod {

    private DoubleCheckMethod(){
        System.out.println("create");
    }


    // The volatile keyword ensures that multiple threads handle the instance variable correctly when it is being initialized to the Singleton instance.
    private static volatile DoubleCheckMethod instance;

    // This method uses double-checked locking to reduce the overhead of acquiring a lock by first checking the instance without synchronization.
    // Only if the instance is null does it synchronize and check again before creating the instance.
    public static DoubleCheckMethod getInstance() {
        if (instance == null) {                // First check (no locking)
            synchronized (DoubleCheckMethod.class) {
                if (instance == null) {        // Second check (with locking)
                    instance = new DoubleCheckMethod();
                }
            }
        }
        return instance;
    }
}
