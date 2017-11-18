package payment_strategy;

public class PayPalStrategy implements PaymentStrategy {
    public boolean pay(double money) {
        System.out.format("PayPal payment %fUAH", money);
        return true;
    }
}
