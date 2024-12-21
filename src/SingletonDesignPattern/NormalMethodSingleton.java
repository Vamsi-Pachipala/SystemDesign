package SingletonDesignPattern;

public class NormalMethodSingleton {

    private static  NormalMethodSingleton normalMethodSingleton;
    private NormalMethodSingleton(){
        System.out.println("singleton obj created");
    }

    public static NormalMethodSingleton getInstance(){
        if(normalMethodSingleton == null)
           normalMethodSingleton = new NormalMethodSingleton();
        return normalMethodSingleton;
    }
}
