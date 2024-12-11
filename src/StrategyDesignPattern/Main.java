package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-8903-1333"));

        paymentContext.excutePaymentProcess(100.0);

        paymentContext.setPaymentStrategy(new UpiPayment("vamsipachipala@ybl.com"));

        paymentContext.excutePaymentProcess(200.0);
    }
}
