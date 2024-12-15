package ChainOfResponsibilityPattern;

public class TwoHundredHandler extends MoneyHandler{

    public TwoHundredHandler(MoneyHandler handler) {
        super(handler);
    }
    @Override
    void processRequest(int amount) {
        if(amount == 200){
            System.out.println("your "+amount+" withdraw successfully");
        }
        else {
            handler.processRequest(amount);
        }
    }
}
