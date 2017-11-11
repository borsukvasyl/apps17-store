import java.util.ArrayList;

public class ComputerGameParams {
    private String name;
    private String description;
    private int price;
    private int ageRestriction;
    private ArrayList<Genre> genres;
    private ArrayList<Platform> platforms;

    public ComputerGameParams(String name, String description, int price, int ageRestriction,
                              ArrayList<Genre> genres, ArrayList<Platform> platforms) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ageRestriction = ageRestriction;
        this.genres = genres;
        this.platforms = platforms;
    }

    public boolean matches(ComputerGameParams otherParams) {
        if (!name.equals(otherParams.getName())) return false;
        if (price != otherParams.getPrice()) return false;
        if (ageRestriction != otherParams.getAgeRestriction()) return false;
        if (!(genres.containsAll(otherParams.getGenres()) && otherParams.getGenres().containsAll(genres))) return false;
        if (!(platforms.containsAll(otherParams.getPlatforms()) && otherParams.getPlatforms().containsAll(platforms))) return false;
        return true;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public int getAgeRestriction() { return ageRestriction; }

    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }

    public ArrayList<Genre> getGenres() { return genres; }

    public void setGenres(ArrayList<Genre> genres) { this.genres = genres; }

    public ArrayList<Platform> getPlatforms() { return platforms; }

    public void setPlatforms(ArrayList<Platform> platforms) { this.platforms = platforms; }
}
