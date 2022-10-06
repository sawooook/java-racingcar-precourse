package racingcar.model;

import static racingcar.common.Constants.INIT_MOVE_COUNT;

public class Car {
    private final CarName name;
    private final CarMove move;


    public Car(CarName name, CarMove move) {
        this.name = name;
        this.move = move;
    }

    public String getName() {
        return name.getName();
    }

    public int getMove() {
        return move.getMove();
    }

    public static Car participate(String inputName) {
        return new Car(new CarName(inputName), new CarMove(INIT_MOVE_COUNT));
    }
}
