package student_yevgeniy_tolks.lesson_6.level_5;

import java.util.Arrays;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean winPosForHorizontals = false;

        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            winPosForHorizontals = true;
        } else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            winPosForHorizontals = true;
        } else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            winPosForHorizontals = true;
        }
        return winPosForHorizontals;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean winPosForVerticals = false;

        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
            winPosForVerticals = true;
        } else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
            winPosForVerticals = true;
        } else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            winPosForVerticals = true;
        }
        return winPosForVerticals;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean winPosForDiagonals = false;

        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            winPosForDiagonals = true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            winPosForDiagonals = true;
        }
        return winPosForDiagonals;
    }
}
