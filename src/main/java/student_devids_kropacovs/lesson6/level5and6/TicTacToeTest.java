package student_devids_kropacovs.lesson6.level5and6;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.noWinnerCheck();
        ticTacToeTest.isWinnerDiagonalCheck();
        ticTacToeTest.isWinnerHorizontalCheck();
        ticTacToeTest.isWinnerVerticalCheck();
        ticTacToeTest.isWinnerCheck();
        ticTacToeTest.drawCheck();
        ticTacToeTest.correctFiledTest();
        TicTacToe ticTacToe = new TicTacToe();
        int[][]field = ticTacToe.createField();
        ticTacToe.printFieldToConsole(field);
    }

    public void isWinnerHorizontalCheck(){
        int [][] arr = { { 0, 0, 0},
                         { 1, 1, 0},
                         { 1, 0, 1} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(arr, 0);
        boolean expectedResult = true;
        if(realResult == expectedResult){
            System.out.println("Is Winner Horizontal Test PASS");
        }else{
            System.out.println("Is Winner Horizontal Test FAIL");
        }
    }

    public void isWinnerVerticalCheck(){
        int [][] arr = { { 0, 0, 1},
                         { 0, 1, 1},
                         { 0, 1, 0} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(arr, 0);
        boolean expectedResult = true;
        if(realResult == expectedResult){
            System.out.println("Is Winner Vertical Test PASS");
        }else{
            System.out.println("Is Winner Vertical Test FAIL");
        }
    }

    public void isWinnerDiagonalCheck(){
        int [][] arr = { { 1, 1, 0},
                         { 0, 0, 1},
                         { 0, 1, 0} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(arr, 0);
        boolean expectedResult = true;
        if(realResult == expectedResult){
            System.out.println("Is Winner Diagonal Test PASS");
        }else{
            System.out.println("Is Winner Diagonal Test FAIL");
        }
    }

    public void noWinnerCheck(){
        int [][] arr = { { 1, 0, 1},
                         { 0, 1, 1},
                         { 0, 1, 0} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(arr, 0);
        boolean expectedResult = false;
        if(realResult == expectedResult){
            System.out.println("No Winner Test PASS");
        }else{
            System.out.println("No Winner Test FAIL");
        }
    }
    public void isWinnerCheck(){
        int [][] arr = { { 1, 1, 0},
                         { 0, 0, 1},
                         { 0, 1, 0} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(arr, 0);
        boolean expectedResult = true;
        if(realResult == expectedResult){
            System.out.println("is Winner Test PASS");
        }else{
            System.out.println("is Winner Test FAIL");
        }
    }
    public void drawCheck(){
        int [][] arr = { { 1, 1, 0},
                         { 0, 0, 1},
                         { 1, 1, 0} };
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(arr);
        boolean expectedResult = true;
        if(realResult == expectedResult){
            System.out.println("is Draw Test PASS");
        }else{
            System.out.println("is Draw Test FAIL");
        }

    }
    public void correctFiledTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = ticTacToe.createField();
        int failTest = 0;
        for( int i = 0; i< field.length; i++){
            for( int j =0; j< field[i].length; j++) {
                if (field[i][j] != -1) {
                    System.out.println("Correct field test FAILFAILFAIL");
                    failTest++;
                }
            }
        }
        if(failTest == 0) {
            System.out.println("Correct field test PASS");
        }
    }




}
