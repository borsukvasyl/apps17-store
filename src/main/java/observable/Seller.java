package observable;

public class Seller extends User {
    @Override
    public void update() {
        System.out.println("Seller started updating:");
        super.update();
    }
}
