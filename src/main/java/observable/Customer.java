package observable;

public class Customer extends User {
    @Override
    public void update() {
        System.out.println("Customer started updating:");
        super.update();
    }
}
