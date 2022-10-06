package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.dto.RacingResult;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    @Test
    @DisplayName("레이싱 경주의 결과를 받는다")
    void getRacingResult() {
        String testA = "testA";
        String testB = "testB";

        List<RacingResult> result =
                new RacingCar(Arrays.asList(Car.participate(testA), Car.participate(testB))).getResult();

        assertEquals(result.size(), 2);
    }
}