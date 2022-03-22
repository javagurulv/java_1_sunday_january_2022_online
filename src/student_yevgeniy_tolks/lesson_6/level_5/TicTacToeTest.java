package student_yevgeniy_tolks.lesson_6.level_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinTest();
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
}
