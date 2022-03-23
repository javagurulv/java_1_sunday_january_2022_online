package student_yevgeniy_tolks.lesson_6.level_5;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinTest();
        ticTacToeTest.verticalWinTest();
        ticTacToeTest.diagonalWinTest();
        ticTacToeTest.isWinPositionTest();
        ticTacToeTest.isDrawTest();
        ticTacToeTest.createFieldTest();
    }

    public void horizontalWinTest() {
        int[][] gameArray = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 0, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultHorizontalWin = ticTacToe.isWinPositionForHorizontals(gameArray, 1);
        if (resultHorizontalWin) {
            System.out.println("Horizontal win  - TEST OK");
        } else {
            System.out.println("Horizontal win FAILED");
        }
    }

    public void verticalWinTest() {
        int[][] gameArray = {
                {0, 1, 0},
                {0, 1, 0},
                {1, 0, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultVerticalWin = ticTacToe.isWinPositionForVerticals(gameArray, 0);
        if (resultVerticalWin) {
            System.out.println("Vertical win  - TEST OK");
        } else {
            System.out.println("Vertical win FAILED");
        }
    }

    public void diagonalWinTest() {
        int[][] gameArray = {
                {0, 1, 0},
                {1, 0, 0},
                {0, 1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultDiagonalsWin = ticTacToe.isWinPositionForDiagonals(gameArray, 0);
        if (resultDiagonalsWin) {
            System.out.println("Diagonal win  - TEST OK");
        } else {
            System.out.println("Diagonal win FAILED");
        }
    }

    public void isWinPositionTest() {
        int[][] gameArray = {
                {1, 0, 0},
                {1, 0, 0},
                {0, 1, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultIsWin = ticTacToe.isWinPosition(gameArray, 0);
        if (resultIsWin) {
            System.out.println("Win in one of three positions  - TEST OK");
        } else {
            System.out.println("Win in one of three position - FAILED");
        }
    }

    public void isDrawTest() {
        int[][] gameArray = {
                {0, 0, 1},
                {1, 1, 0},
                {0, 0, 1}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultIsWin = ticTacToe.isDrawPosition(gameArray);
        if (resultIsWin) {
            System.out.println("Draw between two players  - TEST OK");
        } else {
            System.out.println("One is a winner - FAILED");
        }
    }

    public void createFieldTest() {
        int[][] gameField = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };

        TicTacToe ticTacToe = new TicTacToe();
        int[][] resultFieldCreated = ticTacToe.createField();
        if (Arrays.deepEquals(gameField, resultFieldCreated)) {
            System.out.println("Field created with empty cells  - TEST OK");
        } else {
            System.out.println("Field cells are not empty  - FAILED");
        }
    }

}
