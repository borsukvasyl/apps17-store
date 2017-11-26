import game.ComputerGame;
import game.ComputerGameParams;
import game.ComputerGameParamsCreator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ComputerGameInventoryTest {
    private static ComputerGameInventory computerGameInventory = new ComputerGameInventory();

    @BeforeClass
    public static void beforeClass() {
        ComputerGame.main(new String[] {});
    }

    @Test
    public void addComputerGame1() throws Exception {
        ComputerGame computerGame = new ComputerGame(ComputerGameParamsCreator.initializeGameParams1());
        computerGameInventory.addComputerGame(computerGame);
        assertEquals(computerGame, computerGameInventory.getComputerGames().get(0));
    }

    @Test
    public void addComputerGame2() throws Exception {
        ComputerGame computerGame = new ComputerGame(ComputerGameParamsCreator.initializeGameParams2());
        computerGameInventory.addComputerGame(computerGame);
        assertEquals(computerGame, computerGameInventory.getComputerGames().get(1));
    }

    private boolean search(ComputerGameParams searchParams) {
        boolean result = false;
        for (ComputerGame computerGame: computerGameInventory.search(searchParams)) {
            if (computerGame.getGameParams().matches(searchParams)) result = true;
            else break;
        }
        return result;
    }

    @Test
    public void search1() throws Exception {
        assertTrue(search(ComputerGameParamsCreator.initializeGameParams1()));
    }

    @Test
    public void search2() throws Exception {
        assertFalse(search(ComputerGameParamsCreator.initializeGameParams3()));
    }
}