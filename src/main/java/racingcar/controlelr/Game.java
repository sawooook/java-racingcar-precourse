package racingcar.controlelr;

import racingcar.common.strategy.NumberStrategy;
import racingcar.common.strategy.RandomNumber;
import racingcar.model.RacingGame;
import racingcar.view.InputView;

public class Game {

    public void init() {
        String carName = new InputView().getCarName();
        int racingCount = new InputView().getRacingCount();
        new RacingGame(carName, racingCount).start(new RandomNumber());
    }
}
