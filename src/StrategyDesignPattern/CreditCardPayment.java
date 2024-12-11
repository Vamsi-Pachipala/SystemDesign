package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{

    private  String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("payment is paying using credit card"+cardNumber+" "+amount);
    }
}
