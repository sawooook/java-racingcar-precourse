package racingcar.model;


import java.util.List;

public class RacingCar {

    private List<Car> cars;

    public RacingCar(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCarList() {
        return cars;
    }

    public Car getCarByIndex(int index) {
        return cars.get(index);
    }

}
