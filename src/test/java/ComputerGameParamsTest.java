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

    @Test
    public void testToString() {
        assertEquals("name: World of Tanks\n" +
                "description: MMO action game\n" +
                "price: 0\n" +
                "age: 12\n" +
                "genres: [MMORPG, ACTION]\n" +
                "platforms: [WINDOWS, MACOS, LINUX]",
                params.toString());
    }

    /*
    * Getters and setters
    * */
    @Test
    public void getName() throws Exception {
        assertEquals("World of Tanks", params.getName());
    }

    @Test
    public void setName() throws Exception {
        params.setName("WOT");
        assertEquals("WOT", params.getName());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("MMO action game", params.getDescription());
    }

    @Test
    public void setDescription() throws Exception {
        params.setDescription("Game");
        assertEquals("Game", params.getDescription());
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(0, params.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        params.setPrice(100);
        assertEquals(100, params.getPrice());
    }

    @Test
    public void getAgeRestriction() throws Exception {
        assertEquals(12, params.getAgeRestriction());
    }

    @Test
    public void setAgeRestriction() throws Exception {
        params.setAgeRestriction(18);
        assertEquals(18, params.getAgeRestriction());
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