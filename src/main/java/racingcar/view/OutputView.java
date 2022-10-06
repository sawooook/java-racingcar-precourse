package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.common.MakePrintUtil;
import racingcar.model.dto.RacingResult;

public class OutputView {

    public static void endGame() {
        System.out.println("실행 결과");
    }

    public static void gameResult(RacingResult result) {
        System.out.println(result.getName() + " : " + MakePrintUtil.convertMove(result.getMove()));
    }
}
