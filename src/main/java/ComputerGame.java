public class ComputerGame {
    private static int idCounter;

    private int id;
    private final ComputerGameParams gameParams;

    public ComputerGame(ComputerGameParams gameParams) {
        this.id = idCounter++;
        this.gameParams = gameParams;
    }

    public ComputerGameParams getGameParams() {
        return gameParams;
    }

    public int getId() {
        return id;
    }
}
