import game.ComputerGame;
import delivery_strategy.DeliveryNovaPoshta;
import delivery_strategy.DeliveryDHL;
import game.ComputerGameParamsCreator;
import payment_strategy.CashStrategy;
import payment_strategy.PayPalStrategy;

import java.util.ArrayList;
import java.util.List;

public class ComputerGameCartCreator {
    public static ComputerGameCart initialize1() {
        List<ComputerGame> games = new ArrayList<ComputerGame>()
        {{
            add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams1()));
            add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams2()));
        }};
        return new ComputerGameCart(games, new PayPalStrategy(), new DeliveryNovaPoshta());
    }

    public static ComputerGameCart initialize2() {
        List<ComputerGame> games = new ArrayList<ComputerGame>()
        {{
            add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams2()));
            add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams2()));
            add(new ComputerGame(ComputerGameParamsCreator.initializeGameParams3()));
        }};
        return new ComputerGameCart(games, new CashStrategy(), new DeliveryDHL());
    }
}
