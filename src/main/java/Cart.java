import deliveryStrategy.DeliveryStrategy;
import paymentStrategy.PaymentStrategy;

public interface Cart {
    double computeTotalPrice();

    boolean pay();

    boolean ship();

    PaymentStrategy getPaymentStrategy();
    void setPaymentStrategy(PaymentStrategy paymentStrategy);
    DeliveryStrategy getDeliveryStrategy();
    void setDeliveryStrategy(DeliveryStrategy deliveryStrategy);
}
