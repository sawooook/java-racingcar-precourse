package racingcar.controlelr;

import racingcar.common.strategy.RandomNumber;
import racingcar.model.RacingGame;
import racingcar.model.dto.RacingResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public void init() {
        RacingGame participant = inputCarName();
        List<RacingResult> result = participant.start(new RandomNumber(), new InputView().getRacingCount());

        OutputView.endGame();
        printRacingResult(result);
        printWinner(result);
    }

    private RacingGame inputCarName() {
        try {
            String carName = new InputView().getCarName();
            return new RacingGame(carName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            inputCarName();
        }

        return null;
    }

    private void printWinner(List<RacingResult> result) {
        List<String> winner = new ArrayList<>();
        for (RacingResult racingResult : result) {
            addWinner(winner, racingResult);
        }

        OutputView.winnerResult(winner);
    }

    private void addWinner(List<String> winner, RacingResult racingResult) {
        if (racingResult.isWinner) {
            winner.add(racingResult.getName());
        }
    }

    private void printRacingResult(List<RacingResult> racingResult) {
        for (RacingResult result : racingResult) {
            OutputView.gameResult(result);
        }
    }
}
