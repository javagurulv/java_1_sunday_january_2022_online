package student_yevgeniy_tolks.lesson_6.level_5_6;

import java.util.Arrays;
import java.util.Scanner;

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

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean isDraw = !isWinPosition(field, 0) && !isWinPosition(field, 1)
                && !isAllCellsEmpty(field);
        return isDraw;
    }

    public int[][] createField() {

        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }


    public Move getNextMove() {
        Scanner coordinates = new Scanner(System.in);
        System.out.println("Enter X: ");
        int getX = coordinates.nextInt();
        System.out.println("Enter Y: ");
        int getY = coordinates.nextInt();

        return new Move(getX, getY);

    }

    public void printFieldToConsole(int[][] field) {
        System.out.println(Arrays.deepToString(field));
        System.out.println();
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 Win!!!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("Draw in the game!");
                break;
            }
            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 Win!!!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("Draw in the game!!!");
                break;
            }

        }

    }
}
