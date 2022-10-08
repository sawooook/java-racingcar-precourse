package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public int getRacingCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine());
    }
}
