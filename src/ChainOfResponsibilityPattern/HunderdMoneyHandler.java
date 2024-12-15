package ChainOfResponsibilityPattern;

public class HunderdMoneyHandler extends MoneyHandler{
    public HunderdMoneyHandler(MoneyHandler handler) {
        super(handler);
    }

    @Override
    void processRequest(int amount) {
        if(amount == 100){
            System.out.println("your "+amount+" withdraw successfully");
        }
        else {
            handler.processRequest(amount);
        }
    }
}
