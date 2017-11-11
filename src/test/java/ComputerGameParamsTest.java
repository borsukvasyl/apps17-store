import org.junit.Before;
import org.junit.Test;

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
        params
    }

    @Test
    public void getPrice() throws Exception {
    }

    @Test
    public void setPrice() throws Exception {
    }

    @Test
    public void getAgeRestriction() throws Exception {
    }

    @Test
    public void setAgeRestriction() throws Exception {
    }

    @Test
    public void getGenres() throws Exception {
    }

    @Test
    public void setGenres() throws Exception {
    }

    @Test
    public void getPlatforms() throws Exception {
    }

    @Test
    public void setPlatforms() throws Exception {
    }
    */
}