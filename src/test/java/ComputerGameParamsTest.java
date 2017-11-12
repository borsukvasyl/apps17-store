import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ComputerGameParamsTest {
    private ComputerGameParams params;

    @Before
    public void setUp() throws Exception {
        params = ComputerGameParamsCreator.initializeGameParams1();
    }

    @Test
    public void matches1() throws Exception {
        assertTrue(params.matches(params));
    }

    @Test
    public void matches2() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams2();
        assertFalse(params.matches(otherParams));
    }

    /*
    * Getters and setters
    * */
    @Test
    public void getName() throws Exception {
        assertEquals(params.getName(), "World of Tanks");
    }

    @Test
    public void setName() throws Exception {
        params.setName("WOT");
        assertEquals(params.getName(), "WOT");
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals(params.getDescription(), "MMO action game");
    }

    @Test
    public void setDescription() throws Exception {
        params.setDescription("Game");
        assertEquals(params.getDescription(), "Game");
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(params.getPrice(), 0);
    }

    @Test
    public void setPrice() throws Exception {
        params.setPrice(100);
        assertEquals(params.getPrice(), 100);
    }

    @Test
    public void getAgeRestriction() throws Exception {
        assertEquals(params.getAgeRestriction(), 12);
    }

    @Test
    public void setAgeRestriction() throws Exception {
        params.setAgeRestriction(18);
        assertEquals(params.getAgeRestriction(), 18);
    }
}