import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
    private static Cart cart = new Cart();

    @BeforeClass
    public static void beforeClass() {
        ComputerGame.main(new String[] {});
    }

    @Test
    public void addComputerGame1() throws Exception {
        ComputerGame computerGame = new ComputerGame(ComputerGameParamsCreator.initializeGameParams1());
        cart.addComputerGame(computerGame);
        assertEquals(cart.computerGames.get(0), computerGame);
    }

    @Test
    public void addComputerGame2() throws Exception {
        ComputerGame computerGame = new ComputerGame(ComputerGameParamsCreator.initializeGameParams2());
        cart.addComputerGame(computerGame);
        assertEquals(cart.computerGames.get(1), computerGame);
    }

    private boolean search(ComputerGameParams searchParams) {
        boolean result = false;
        for (ComputerGame computerGame: cart.search(searchParams)) {
            if (computerGame.getGameParams().matches(searchParams)) result = true;
        }
        return result;
    }

    @Test
    public void search1() throws Exception {
        assertEquals(search(ComputerGameParamsCreator.initializeGameParams1()), true);
    }

    @Test
    public void search2() throws Exception {
        assertEquals(search(ComputerGameParamsCreator.initializeGameParams3()), false);
    }
}