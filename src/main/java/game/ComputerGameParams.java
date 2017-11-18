package game;

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
        if (!name.equals(otherParams.getName())) {
            return false;
        }
        if (price != otherParams.getPrice()) {
            return false;
        }
        if (ageRestriction != otherParams.getAgeRestriction()) {
            return false;
        }
        if (!(genres.containsAll(otherParams.getGenres())
                && otherParams.getGenres().containsAll(genres))) {
            return false;
        }
        if (!(platforms.containsAll(otherParams.getPlatforms())
                && otherParams.getPlatforms().containsAll(platforms))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return String.format("name: %s\ndescription: %s\nprice: %d\nage: %d\ngenres: %s\nplatforms: %s",
                name, description, price, ageRestriction, genres, platforms);
    }

    public String getName() { return name; }

    public void setName(String newName) { this.name = newName; }

    public String getDescription() { return description; }

    public void setDescription(String newDescription) { this.description = newDescription; }

    public int getPrice() { return price; }

    public void setPrice(int newPrice) { this.price = newPrice; }

    public int getAgeRestriction() { return ageRestriction; }

    public void setAgeRestriction(int newAgeRestriction) { this.ageRestriction = newAgeRestriction; }

    public ArrayList<Genre> getGenres() { return genres; }

    public void setGenres(ArrayList<Genre> newGenres) { this.genres = newGenres; }

    public ArrayList<Platform> getPlatforms() { return platforms; }

    public void setPlatforms(ArrayList<Platform> newPlatforms) { this.platforms = newPlatforms; }
}
