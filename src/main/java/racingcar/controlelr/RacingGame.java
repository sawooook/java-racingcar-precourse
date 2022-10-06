package racingcar.controlelr;


import racingcar.common.RandomNumber;
import racingcar.common.SplitUtil;
import racingcar.model.Car;
import racingcar.model.Participate;
import racingcar.model.RacingCarList;
import racingcar.view.InputView;

import java.util.List;

public class RacingGame {

    private int progressRacingCount = 0;

    public void start() {
        String carName = new InputView().getCarName();
        int racingCount = new InputView().getRacingCount();
        RacingCarList racingCar = new RacingCarList(carParticipate(carName));

        while (progressRacingCount != racingCount) {
            racingStart(racingCar.getCarList());
            progressRacingCount += 1;
        }
    }

    private void racingStart(List<Car> carList) {
        for (Car car : carList) {
            car.race(RandomNumber.generate());
        }
    }

    private List<Car> carParticipate(String carName) {
        return new Participate().addCar(SplitUtil.carSplit(carName));
    }
}
