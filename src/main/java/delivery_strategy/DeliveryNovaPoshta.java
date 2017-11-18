package delivery_strategy;

import java.util.List;

import game.ComputerGame;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("Nova Poshta delivery");
        return true;
    }
}
