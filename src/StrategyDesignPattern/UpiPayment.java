package StrategyDesignPattern;

public class UpiPayment implements PaymentStrategy{

    private  String upiID;

    public UpiPayment(String upiID) {
        this.upiID = upiID;
    }
    @Override
    public void pay(double amount) {

        System.out.println("using upi method payment is payed");
    }
}
