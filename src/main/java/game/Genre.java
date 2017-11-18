package game;

public enum Genre {
    MMORPG("MMORPG"), ACTION("ACTION");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
