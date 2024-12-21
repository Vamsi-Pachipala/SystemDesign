package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        StaticInnerClassMethod singleton1 = StaticInnerClassMethod.getInstance();
        StaticInnerClassMethod singleton2 = StaticInnerClassMethod.getInstance();

        // Both references should point to the same instance
        System.out.println(singleton1 == singleton2); // Output: true
    }
}
