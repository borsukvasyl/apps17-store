import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BonusCartDecoratorTest {
    private Cart cart;
    @Before
    public void setUp() throws Exception {
        cart = new BonusCartDecorator(ComputerGameCartCreator.initialize2());
    }

    @Test
    public void ship() throws Exception {
        assertTrue(cart.ship());
    }
}
