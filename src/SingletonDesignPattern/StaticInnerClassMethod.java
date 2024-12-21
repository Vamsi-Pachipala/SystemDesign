package SingletonDesignPattern;

public class StaticInnerClassMethod {


    private StaticInnerClassMethod(){

    }

    private static  class innerInstance{
        private static final StaticInnerClassMethod INSTANCE = new StaticInnerClassMethod();
    }

    public static StaticInnerClassMethod getInstance(){
        return innerInstance.INSTANCE;
    }
}
