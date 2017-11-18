public class BonusCartDecorator extends CartDecorator {
    public BonusCartDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship() {
        super.ship();
        System.out.println("Sending bonus gift");
        return true;
    }
}
