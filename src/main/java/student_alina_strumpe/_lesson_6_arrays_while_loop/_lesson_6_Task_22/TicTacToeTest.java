package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_22;

import java.util.Arrays;

class TicTacToeTest {

public static void main(String[] args){

   TicTacToeTest ticTacToeTest = new TicTacToeTest();
   ticTacToeTest.shouldBeWinPositionTest();


    int number = 0;

    int[][] array = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            number = array[j][i];
            System.out.println("j- "+j+", i-" + i + "Num ="+number);
        }
    }
            System.out.println(Arrays.deepToString(array));
}

  public void shouldBeWinPositionTest() {
      TicTacToe ticTacToe = new TicTacToe();
      int[][] testArray = new int[3][3];
      boolean isWin = true;
      ticTacToe.fillArray(testArray, -1);
      boolean expectedResult = ticTacToe.isWinPositionForHorizontals(testArray, 0);
      if (isWin == expectedResult) {
          System.out.println("Test should be win position is OK");
      } else {
          System.out.println("Test should be win position is FALSE");
      }
  }}


