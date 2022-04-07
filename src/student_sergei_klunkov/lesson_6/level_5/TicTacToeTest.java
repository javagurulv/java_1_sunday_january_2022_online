package student_sergei_klunkov.lesson_6.level_5;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinTest();
        ticTacToeTest.verticalWinTest();
        ticTacToeTest.diagonalWinTest();
        ticTacToeTest.isWinTest();
        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.createFieldTest();

    }

    public void horizontalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = { {1, 1, 1} , {0, 1, 0} , {0, 0, 1} };
        boolean HorizontalWin = ticTacToe.isWinPositionForHorizontals(gameArray, 1);
        if (HorizontalWin) {
            System.out.println("Horizontal win test - PASSED!");
        } else {
            System.out.println("Horizontal win test - FAILED!");
        }

    }

    public void verticalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = { {0, 1, 0} ,
                               {0, 1, 0} ,
                               {1, 0, 0} };
        boolean VerticalWin = ticTacToe.isWinPositionForVerticals(gameArray, 0);
        if (VerticalWin) {
            System.out.println("Vertical win test - PASSED!");
        } else {
            System.out.println("Vertical win test - FAILED!");
        }

    }

    public void diagonalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = { {1, 1, 0} ,
                               {0, 1, 0} ,
                               {0, 0, 1} };
        boolean DiagonalWin = ticTacToe.isWinPositionForDiagonals(gameArray, 1);
        if (DiagonalWin) {
            System.out.println("Diagonal win test - PASSED!");
        } else {
            System.out.println("Diagonal win test - FAILED!");
        }

    }

    public void isWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = { {1, 1, 1} ,
                               {0, 1, 0} ,
                               {0, 0, 1} };
        boolean WinWinTest = ticTacToe.isWinPosition(gameArray, 1);
        if (WinWinTest) {
            System.out.println("IsWin win test - PASSED!");
        } else {
            System.out.println("IsWin win test - FAILED!");
        }
    }


    public void isDrawPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = { {0, 1, 0} ,
                               {1, 1, 0} ,
                               {0, 0, 1} };
        boolean DrawTest = ticTacToe.isDrawPosition(gameArray);
        if (DrawTest) {
            System.out.println("Draw win test - PASSED!");
        } else {
            System.out.println("Draw win test - FAILED!");
        }
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] gameArray = {{-1, -1, -1 },
                              {-1, -1, -1 },
                              {-1, -1, -1 }};

        int [][] resultFieldCreated = ticTacToe.createField();
        if(Arrays.deepEquals(gameArray, resultFieldCreated)){
            System.out.println("Create Field test - PASSED!");
        } else {
            System.out.println("Create Field test - FAILED!");
        }


    }

}
