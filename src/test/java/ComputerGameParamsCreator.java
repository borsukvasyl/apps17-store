import java.util.ArrayList;

public class ComputerGameParamsCreator {
    public static ComputerGameParams initializeGameParams1() {
        return new ComputerGameParams(
                "World of Tanks",
                "MMO action game",
                0,
                12,
                new ArrayList<Genre>() {{add(Genre.MMORPG); add(Genre.ACTION);}},
                new ArrayList<Platform>() {{add(Platform.WINDOWS); add(Platform.MACOS); add(Platform.LINUX);}}
        );
    }

    public static ComputerGameParams initializeGameParams2() {
        return new ComputerGameParams(
                "World of Tanks Blitz",
                "Mobile version of World of Tanks",
                0,
                12,
                new ArrayList<Genre>() {{add(Genre.MMORPG); add(Genre.ACTION);}},
                new ArrayList<Platform>() {{add(Platform.IOS); add(Platform.ANDROID);}}
        );
    }
    public static ComputerGameParams initializeGameParams3() {
        return new ComputerGameParams(
                "World of Warships",
                "MMO action game",
                0,
                12,
                new ArrayList<Genre>() {{add(Genre.MMORPG); add(Genre.ACTION);}},
                new ArrayList<Platform>() {{add(Platform.WINDOWS); add(Platform.MACOS); add(Platform.LINUX);}}
        );
    }
}
