import delivery_strategy.DeliveryStrategy;
import game.ComputerGame;
import observable.Observable;
import payment_strategy.PaymentStrategy;

import java.util.List;

public class ComputerGameCart extends Observable implements Cart {
    private List<ComputerGame> games;

    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public ComputerGameCart(List<ComputerGame> games, PaymentStrategy paymentStrategy,
                            DeliveryStrategy deliveryStrategy) {
        this.games = games;
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }

    public double computeTotalPrice() {
        double price = 0;
        for (ComputerGame game : games) {
            price += game.getGameParams().getPrice();
        }
        return price;
    }

    public boolean pay() {
        paymentStrategy.pay(computeTotalPrice());
        return true;
    }

    public boolean ship() {
        deliveryStrategy.deliver(games);
        return true;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy newPaymentStrategy) {
        this.paymentStrategy = newPaymentStrategy;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy newDeliveryStrategy) {
        this.deliveryStrategy = newDeliveryStrategy;
    }
}
