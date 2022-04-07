package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_22;

import java.util.Arrays;

 class array {

     public static void main(String[] args) {
  /*      int freeCell = -1;
        boolean isWin = true;
        int playerToCheck = 0;
        int playerToCheck2 = 1;
        int[][] array = {{-1,-1,-1},
                {-1, -1, -1},
                {-1, -1, -1}};
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                break;
            }

            for (int j = 0; j < array[i].length; j++) {
              if (array[i][j] == freeCell) {
                  array[i][j] = playerToCheck;
                  isWin = true;
            } else {
                isWin = false;

            }
                   //  System.out.println(isWin);
                    System.out.println("i [" + i + "], j[" +j+ "] = " + playerToCheck);

                }
            System.out.println(isWin);
            System.out.println(playerToCheck);
                    System.out.println(Arrays.deepToString(array));
            }

   //         System.out.println(Arrays.deepToString(array));
*/

         int freeCell = -1;
         boolean isWin = true;
         int playerToCheck = 0;
         int playerToCheck2 = 1;
         int[][] array = {{-1, -1, -1},
                 {-1, -1, -1},
                 {-1, -1, -1}};
         for (int i = 0; i < array.length; i++) {
             if (i < 2) {
                 continue;
             }
             for (int j = 0; j < array[i].length; j++)
                 if (array[j][i] == freeCell) {
                     array[j][i] = playerToCheck;
                     isWin = true;
                    if ( i == 1 && j==1 ) {

                      break;


                         } else {
                             isWin = false;

                         }
                         //  System.out.println(isWin);
                         System.out.println("i [" + i + "], j[" + j + "] = " + playerToCheck);

                     }
                     System.out.println(isWin);
                     System.out.println(playerToCheck);
                     System.out.println(Arrays.deepToString(array));
                 }

                 //         System.out.println(Arrays.deepToString(array));

             }}



//Я не знаю что сдесь делать