public class ComputerGame {
    private static int idCounter;

    private final int id;
    private final ComputerGameParams gameParams;

    public ComputerGame(ComputerGameParams gameParams) {
        this.id = idCounter;
        idCounter++;
        this.gameParams = gameParams;
    }

    public ComputerGameParams getGameParams() {
        return gameParams;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        idCounter = 0;
    }
}
