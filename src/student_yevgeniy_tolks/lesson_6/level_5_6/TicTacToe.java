package student_yevgeniy_tolks.lesson_6.level_5_6;

class TicTacToe {

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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean winPosition = false;
        if (isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck)) {
            winPosition = true;
        }
        return winPosition;
    }

    public boolean isAllCellsEmpty(int[][] field) {
        boolean isEmpty = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean isDraw = false;
        if (!isWinPosition(field, 0) && !isWinPosition(field, 1) && !isAllCellsEmpty(field)) {
            isDraw = true;
        }
        return isDraw;
    }

    public int[][] createField() {

        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }


}
