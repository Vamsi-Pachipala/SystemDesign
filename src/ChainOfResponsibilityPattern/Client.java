package ChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {


        MoneyHandler fiveHundred = new FiveHundredHandler(null);

        TwoHundredHandler twoHundredHandler = new TwoHundredHandler(fiveHundred);

        HunderdMoneyHandler moneyHandler = new HunderdMoneyHandler(twoHundredHandler);

        moneyHandler.processRequest(400);
    }
}
