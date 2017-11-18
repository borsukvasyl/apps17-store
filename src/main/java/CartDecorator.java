import delivery_strategy.DeliveryStrategy;
import payment_strategy.PaymentStrategy;

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

    public void setPaymentStrategy(PaymentStrategy newPaymentStrategy) {
        cart.setPaymentStrategy(newPaymentStrategy);
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }

    public void setDeliveryStrategy(DeliveryStrategy newDeliveryStrategy) {
        cart.setDeliveryStrategy(newDeliveryStrategy);
    }
}
