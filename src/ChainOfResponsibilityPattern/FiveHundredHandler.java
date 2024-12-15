package ChainOfResponsibilityPattern;

public class FiveHundredHandler extends MoneyHandler{

    public FiveHundredHandler(MoneyHandler handler) {
        super(handler);
    }

    @Override
    void processRequest(int amount) {
        if(amount == 500){
            System.out.println("your "+amount+" withdraw successfully");
        }
        else {
            if(handler !=null){
                handler.processRequest(amount);
            }
            else {
                System.out.println("your request is failed due wrong decimals");
            }
        }
    }
}
