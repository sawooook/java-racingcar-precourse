package racingcar.common.strategy;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber implements NumberStrategy {

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
