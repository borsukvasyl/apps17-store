package delivery_strategy;

import java.util.List;

import game.ComputerGame;

public interface DeliveryStrategy {
    boolean deliver(List<ComputerGame> games);
}
