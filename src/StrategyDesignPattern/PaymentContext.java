package StrategyDesignPattern;

public class PaymentContext {
    private  PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void executePaymentProcess(double amount){
        if (paymentStrategy == null){
            throw new RuntimeException("payment Strategy is null");
        }
        paymentStrategy.pay(amount);
    }

}
