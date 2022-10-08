package racingcar.model;


import racingcar.common.SplitUtil;
import racingcar.common.strategy.NumberStrategy;
import racingcar.model.dto.RacingResult;

import java.util.List;

public class RacingGame {

    private final List<Car> cars;

    private int progressRacingCount = 0;

    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    public List<RacingResult> start(NumberStrategy strategy, int racingCount) {
        while (progressRacingCount != racingCount) {
            new RacingCar(cars).start(strategy);
            progressRacingCount += 1;
        }

        return new RacingCar(cars).getResult();
    }
}
