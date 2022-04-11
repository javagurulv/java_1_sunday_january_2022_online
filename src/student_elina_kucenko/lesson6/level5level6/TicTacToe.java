package student_elina_kucenko.lesson6.level5level6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck) {
            return true;
        } else if (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck);
    }

    public boolean hasNoEmptyField(int[][] field) {
        for (int[] inField : field) {
            int notZero = -1;
            for (int number : inField) {
                if (notZero == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isDrawPosition(int[][] field) {
        if (!isWinPosition(field, 1) && !isWinPosition(field, 0) && hasNoEmptyField(field)) {
            return true;
        }
        return false;
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

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter coordinate X [entry range 0-2]");
        int getX = scanner.nextInt();
        while (getX > 3) {
            System.out.println("Wrong input of X");
            System.out.println("Please enter coordinate X [entry range 0-2]");
            getX = scanner.nextInt();
        }

        System.out.println("Please enter coordinate Y [entry range 0-2]");
        int getY = scanner.nextInt();
        while (getY > 3) {
            System.out.println("Wrong input of Y");
            System.out.println("Please enter coordinate Y [entry range 0-2]");
            getY = scanner.nextInt();
        }

        return new Move(getX, getY);
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println("Your field is " + Arrays.deepToString(field));
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}

