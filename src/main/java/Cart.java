import java.util.ArrayList;

public class Cart {
    public final ArrayList<ComputerGame> computerGames = new ArrayList<ComputerGame>();

    public void addComputerGame(ComputerGame computerGame) {
        computerGames.add(computerGame);
    }

    public ArrayList<ComputerGame> search(ComputerGameParams searchParams) {
        ArrayList<ComputerGame> matching = new ArrayList<ComputerGame>();
        for (ComputerGame computerGame: computerGames) {
            if (computerGame.getGameParams().matches(searchParams)) matching.add(computerGame);
        }
        return matching;
    }
}
