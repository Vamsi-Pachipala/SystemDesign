package SingletonDesignPattern;

public class SychronizedMethodSingleton {


    private static SychronizedMethodSingleton sychronizedMethodSingleton;
    private SychronizedMethodSingleton(){
        System.out.println("create");
    }

    public static synchronized SychronizedMethodSingleton getInstance(){
        if(sychronizedMethodSingleton == null){
            sychronizedMethodSingleton = new SychronizedMethodSingleton();
        }
        return sychronizedMethodSingleton;
    }
}
