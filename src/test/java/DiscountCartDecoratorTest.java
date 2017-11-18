import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DiscountCartDecoratorTest {
    private Cart cart;
    @Before
    public void setUp() throws Exception {
        cart = new DiscountCartDecorator(ComputerGameCartCreator.initialize2());
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(0d, cart.computeTotalPrice(), 0.001);
    }
}
