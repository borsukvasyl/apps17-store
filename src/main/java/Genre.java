public enum Genre {
    MOBA("MOBA"), MMORPG("MMORPG"), ACTION("ACTION"), SIMULATOR("SIMULATOR");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
