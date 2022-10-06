package racingcar.model;

import racingcar.model.enums.ErrorType;

public class CarName {

    private final String name;

    public CarName(String inputName) {
        if (inputName.length() > 5) {
            throw new IllegalArgumentException(ErrorType.INVALID_INPUT_CAR_NAME.getMessage());
        }

        if (inputName.length() < 1) {
            throw new IllegalArgumentException(ErrorType.INVALID_INPUT_CAR_NAME.getMessage());
        }

        this.name = inputName;
    }

    public String getName() {
        return name;
    }
}
