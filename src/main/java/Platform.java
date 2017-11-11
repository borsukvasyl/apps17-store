public enum Platform {
    WINDOWS("WINDOWS"), MACOS("MACOS"), LINUX("LINUX"),
    IOS("IOS"), ANDROID("ANDROID");

    private String name;

    Platform(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
