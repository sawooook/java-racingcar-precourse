package racingcar.model;


import racingcar.common.SplitUtil;
import racingcar.common.strategy.NumberStrategy;
import racingcar.model.dto.RacingResult;

import java.util.List;

public class RacingGame {

    private final List<Car> cars;
    private final int racingCount;

    private int progressRacingCount = 0;

    public RacingGame(String carName, int racingCount) {
        this.cars = carParticipate(carName);
        this.racingCount = racingCount;
    }

    public List<RacingResult> start(NumberStrategy strategy) {
        while (progressRacingCount != racingCount) {
            new RacingCar(cars).start(strategy);
            progressRacingCount += 1;
        }

        return new RacingCar(cars).getResult();
    }

    private List<Car> carParticipate(String carName) {
        return new Participate().addCar(SplitUtil.carSplit(carName));
    }
}
