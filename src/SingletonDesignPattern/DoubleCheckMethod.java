package SingletonDesignPattern;

public class DoubleCheckMethod {

    private static DoubleCheckMethod doubleCheckMethod;
    private DoubleCheckMethod(){
        System.out.println("create");
    }

    public static synchronized DoubleCheckMethod getInstance(){
        if(doubleCheckMethod == null){
            synchronized(DoubleCheckMethod.class){
                if(doubleCheckMethod == null){
                    doubleCheckMethod =  new DoubleCheckMethod();
                }
                return doubleCheckMethod;
            }
        }
        return doubleCheckMethod;
    }
}
