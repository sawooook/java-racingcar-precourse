package racingcar.model;


import racingcar.common.SplitUtil;

import java.util.List;

public class RacingGame {

    private final List<Car> cars;
    private final int racingCount;

    private int progressRacingCount = 0;

    public RacingGame(String carName, int racingCount) {
        this.cars = carParticipate(carName);
        this.racingCount = racingCount;
    }

    public void start() {
        while (progressRacingCount != racingCount) {
            for (Car car : cars) {
            }
            progressRacingCount += 1;
        }
    }

    private List<Car> carParticipate(String carName) {
        return new Participate().addCar(SplitUtil.carSplit(carName));
    }
}
