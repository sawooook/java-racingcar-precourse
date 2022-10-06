package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Participate {

    public List<Car> addCar(String[] carName) {
        List<Car> cars = new ArrayList<>();

        for (String name : carName) {
            Car car = Car.participate(name);
            cars.add(car);
        }

        return cars;
    }
}
