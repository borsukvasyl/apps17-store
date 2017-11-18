import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import game.ComputerGame;
import payment_strategy.CashStrategy;
import payment_strategy.PaymentStrategy;
import delivery_strategy.DeliveryDHL;
import delivery_strategy.DeliveryStrategy;

public class ComputerGameCartTest {
    private Cart cart;
    private List<ComputerGame> games = new ArrayList<ComputerGame>()
    {{
        add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams1()));
        add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams2()));
    }};

    private PaymentStrategy paymentStrategy = new CashStrategy();
    private DeliveryStrategy deliveryStrategy = new DeliveryDHL();

    @Before
    public void setUp() throws Exception {
        cart = new ComputerGameCart(games, paymentStrategy, deliveryStrategy);
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
    public void getPaymentStrategy() throws Exception {
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void setPaymentStrategy() throws Exception {
        PaymentStrategy paymentStrategy = new CashStrategy();
        cart.setPaymentStrategy(paymentStrategy);
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void getDeliveryStrategy() throws Exception {
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        DeliveryStrategy deliveryStrategy = new DeliveryDHL();
        cart.setDeliveryStrategy(deliveryStrategy);
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }
}
