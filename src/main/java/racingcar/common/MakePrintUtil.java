package racingcar.common;

public class MakePrintUtil {

    public static StringBuilder convertMove(int move) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < move; i++) {
            builder.append("-");
        }

        return builder;
    }
}
