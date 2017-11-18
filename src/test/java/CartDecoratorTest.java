import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import payment_strategy.PayPalStrategy;
import payment_strategy.PaymentStrategy;
import delivery_strategy.DeliveryNovaPoshta;
import delivery_strategy.DeliveryStrategy;

public class CartDecoratorTest {
    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new CartDecorator(ComputerGameCartCreator.initialize1());
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(0d, cart.computeTotalPrice(), 0.001);
    }

    @Test
    public void pay() throws Exception {
        assertTrue(cart.pay());
    }

    @Test
    public void ship() throws Exception {
        assertTrue(cart.ship());
    }

    @Test
    public void setPaymentStrategy() throws Exception {
        PaymentStrategy paymentStrategy = new PayPalStrategy();
        cart.setPaymentStrategy(paymentStrategy);
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        DeliveryStrategy deliveryStrategy = new DeliveryNovaPoshta();
        cart.setDeliveryStrategy(deliveryStrategy);
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }
}
