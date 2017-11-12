import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void matchesTheSameObject() throws Exception {
        assertTrue(params.matches(params));
    }

    @Test
    public void matchesDifferentObjects() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams2();
        assertFalse(params.matches(otherParams));
    }

    @Test
    public void matchesDifferentNames() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams1();
        otherParams.setName("WOT");
        assertFalse(params.matches(otherParams));
    }

    @Test
    public void matchesDifferentPrice() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams1();
        otherParams.setPrice(10);
        assertFalse(params.matches(otherParams));
    }

    @Test
    public void matchesDifferentAgeRestriction() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams1();
        otherParams.setAgeRestriction(18);
        assertFalse(params.matches(otherParams));
    }

    @Test
    public void matchesDifferentGenres() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams1();
        otherParams.setGenres(new ArrayList<Genre>() {{add(Genre.ACTION);}});
        assertFalse(params.matches(otherParams));
    }

    @Test
    public void matchesDifferentPlatforms() throws Exception {
        ComputerGameParams otherParams = ComputerGameParamsCreator.initializeGameParams1();
        otherParams.setPlatforms(new ArrayList<Platform>() {{add(Platform.MACOS);}});
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

    @Test
    public void getGenres() throws Exception {
        assertTrue(params.getGenres().contains(Genre.ACTION)
                && params.getGenres().contains(Genre.MMORPG));
    }

    @Test
    public void setGenres() throws Exception {
        ArrayList<Genre> newGenres = new ArrayList<Genre>() {{add(Genre.ACTION);}};
        params.setGenres(newGenres);
        assertTrue(params.getGenres().containsAll(newGenres)
                && newGenres.containsAll(params.getGenres()));
    }

    @Test
    public void getPlatforms() throws Exception {
        assertTrue(params.getPlatforms().contains(Platform.WINDOWS)
                && params.getPlatforms().contains(Platform.MACOS)
                && params.getPlatforms().contains(Platform.LINUX));
    }

    @Test
    public void setPlatforms() throws Exception {
        ArrayList<Platform> newPlatforms = new ArrayList<Platform>() {{add(Platform.WINDOWS);}};
        params.setPlatforms(newPlatforms);
        assertTrue(params.getPlatforms().containsAll(newPlatforms)
                && newPlatforms.containsAll(params.getPlatforms()));
    }
}