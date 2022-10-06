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
        int moveCountA = 1;
        String testB = "testB";
        int moveCountB = 2;

        List<RacingResult> result =
                new RacingCar(Arrays.asList(Car.participate(testA, moveCountA), Car.participate(testB, moveCountB))).getResult();

        assertEquals(result.size(), 2);
        assertEquals(result.get(0).isWinner, false);
        assertEquals(result.get(1).isWinner, true);
        assertEquals(result.get(0).getName(), testA);
        assertEquals(result.get(0).getMove(), moveCountA);
        assertEquals(result.get(1).getName(), testB);
        assertEquals(result.get(1).getMove(), moveCountB);
    }
}