package observable;

abstract public class User implements Observer {
    public void update() {
        System.out.println("Updating...");
    }
}
