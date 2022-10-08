package racingcar.common;

import java.util.List;

public class MakePrintUtil {

    public static StringBuilder convertMove(int move) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < move; i++) {
            builder.append("-");
        }

        return builder;
    }

    public static StringBuilder convertWinner(List<String> winner) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < winner.size(); i++) {
            addWinner(builder, winner, i, winner.size());
        }

       return builder;
    }

    private static void addWinner(StringBuilder builder, List<String> winner, int index, int size) {
        builder.append(winner.get(index));

        if (size != index + 1) {
            builder.append(", ");
        }
    }
}
