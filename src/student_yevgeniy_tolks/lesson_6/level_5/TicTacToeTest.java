package student_yevgeniy_tolks.lesson_6.level_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinTest();
        ticTacToeTest.verticalWinTest();

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

    }public void verticalWinTest() {
        int[][] gameArray = {
                {0, 1, 0},
                {1, 0, 0},
                {0, 1, 0}};

        TicTacToe ticTacToe = new TicTacToe();
        boolean resultVerticalWin = ticTacToe.isWinPositionForVerticals(gameArray, 0);
        if (resultVerticalWin) {
            System.out.println("Vertical win  - TEST OK");
        } else {
            System.out.println("Vertical win FAILED");
        }

    }
}
