import deliveryStrategy.DeliveryStrategy;
import paymentStrategy.PaymentStrategy;

public class CartDecorator implements Cart {
    private final Cart cart;

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }

    public double computeTotalPrice() {
        return cart.computeTotalPrice();
    }

    public boolean pay() {
        return cart.pay();
    }

    public boolean ship() {
        return cart.ship();
    }

    public PaymentStrategy getPaymentStrategy() {
        return cart.getPaymentStrategy();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        cart.setPaymentStrategy(paymentStrategy);
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        cart.setDeliveryStrategy(deliveryStrategy);
    }
}
