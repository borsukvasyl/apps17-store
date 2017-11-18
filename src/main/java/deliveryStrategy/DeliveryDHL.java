package deliveryStrategy;

import java.util.List;

import game.ComputerGame;

public class DeliveryDHL implements DeliveryStrategy {
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("DHl delivery");
        return true;
    }
}
