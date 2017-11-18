package paymentStrategy;

public class CashStrategy implements PaymentStrategy {
    public boolean pay(double money) {
        System.out.format("Cash payment %fUAH", money);
        return true;
    }
}
