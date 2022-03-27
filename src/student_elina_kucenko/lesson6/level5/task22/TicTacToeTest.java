package student_elina_kucenko.lesson6.level5.task22;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinTest();
        ticTacToeTest.diagonalWinTest();
        ticTacToeTest.verticalWinTest();
        ticTacToeTest.anyWinPositionTest();
    }

    public void horizontalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] gameArray = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 1}};

        boolean HorizontalWin = ticTacToe.isWinPositionForHorizontals(gameArray, 1);
        if (HorizontalWin) {
            System.out.println("Horizontal win test - OK");
        } else {
            System.out.println("Horizontal win - failed");
        }
    }

    public void verticalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] gameArray = {
                {0, 1, 0},
                {0, 1, 0},
                {1, 0, 0}};

        boolean verticalWin = ticTacToe.isWinPositionForVerticals(gameArray, 0);
        if (verticalWin) {
            System.out.println("Vertical win test - OK");
        } else {
            System.out.println("Vertical win - failed ");
        }
    }

    public void diagonalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] gameArray = {
                {1, 1, 0},
                {0, 1, 0},
                {0, 0, 1}};

        boolean diagonalsWin = ticTacToe.isWinPositionForDiagonals(gameArray, 1);
        if (diagonalsWin) {
            System.out.println("Diagonal win test - OK");
        } else {
            System.out.println("Diagonal win - failed");
        }
    }

    public void anyWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] gameArray = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 1}};

        boolean anyPositionWin = ticTacToe.isWinPosition(gameArray, 1);
        if (anyPositionWin) {
            System.out.println("Any position win test - OK");
        } else {
            System.out.println("Any position win failed");
        }
    }
}

