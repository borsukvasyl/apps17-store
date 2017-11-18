import game.ComputerGame;
import game.ComputerGameParams;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ComputerGameTest {
    @BeforeClass
    public static void beforeClass() {
        ComputerGame.main(new String[] {});
    }

    @Test
    public void constructorInitialization1() {
        ComputerGameParams gameParams = ComputerGameParamsCreator.initializeGameParams1();
        ComputerGame computerGame = new ComputerGame(gameParams);
        assertTrue(computerGame.getGameParams().matches(gameParams));
        assertEquals(0, computerGame.getId());
    }

    @Test
    public void constructorInitialization2() {
        ComputerGameParams gameParams = ComputerGameParamsCreator.initializeGameParams2();
        ComputerGame computerGame = new ComputerGame(gameParams);
        assertTrue(computerGame.getGameParams().matches(gameParams));
        assertEquals(1, computerGame.getId());
    }
}