import delivery_strategy.DeliveryStrategy;
import payment_strategy.PaymentStrategy;

public interface Cart {
    double computeTotalPrice();

    boolean pay();

    boolean ship();

    PaymentStrategy getPaymentStrategy();
    void setPaymentStrategy(PaymentStrategy newPaymentStrategy);
    DeliveryStrategy getDeliveryStrategy();
    void setDeliveryStrategy(DeliveryStrategy newDeliveryStrategy);
}
