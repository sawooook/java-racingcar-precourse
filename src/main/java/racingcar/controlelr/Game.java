package racingcar.controlelr;

import racingcar.common.strategy.NumberStrategy;
import racingcar.common.strategy.RandomNumber;
import racingcar.model.RacingGame;
import racingcar.model.dto.RacingResult;
import racingcar.view.InputView;

import java.util.List;

public class Game {

    public void init() {
        String carName = new InputView().getCarName();
        int racingCount = new InputView().getRacingCount();
        List<RacingResult> result = new RacingGame(carName, racingCount).start(new RandomNumber());

    }
}
