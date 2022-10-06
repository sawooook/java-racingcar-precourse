package racingcar.model;


import racingcar.common.strategy.NumberStrategy;

import java.util.List;

public class RacingCar {

    private final List<Car> cars;

    public RacingCar(List<Car> cars) {
        this.cars = cars;
    }

    public void start(NumberStrategy strategy) {
        for (Car car : cars) {
            car.race(strategy.generate());
        }
    }
}
