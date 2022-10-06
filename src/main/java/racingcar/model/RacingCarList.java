package racingcar.model;


import java.util.List;

public class RacingCarList {

    private final List<Car> cars;

    public RacingCarList(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCarList() {
        return cars;
    }

    public Car getCarByIndex(int index) {
        return cars.get(index);
    }
}
