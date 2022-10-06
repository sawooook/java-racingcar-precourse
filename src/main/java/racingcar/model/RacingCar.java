package racingcar.model;


import racingcar.common.strategy.NumberStrategy;
import racingcar.model.dto.RacingResult;

import java.util.ArrayList;
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

    public List<RacingResult> getResult() {
        List<RacingResult> result = new ArrayList<>();

        for (Car car : cars) {
            result.add(new RacingResult(car.getName(), car.getMove()));
        }

        return result;
    }
}
