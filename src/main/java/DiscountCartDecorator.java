public class DiscountCartDecorator extends CartDecorator {
    private static final double DISCOUNT = 1.5;

    public DiscountCartDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() / DISCOUNT;
    }
}
