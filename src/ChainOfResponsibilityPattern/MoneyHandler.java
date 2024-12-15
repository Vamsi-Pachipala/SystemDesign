package ChainOfResponsibilityPattern;

abstract public class MoneyHandler {

    MoneyHandler handler;

    // we can have interface as well but here functionality very similar for all impls so in do not want repeat the code

    public MoneyHandler(MoneyHandler handler){
        this.handler = handler;
    }

    abstract void processRequest(int amount);
}
