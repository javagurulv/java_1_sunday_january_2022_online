package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_34;

import java.lang.reflect.Array;

 class ArrayUtilPrintDemo {
     public static void main(String[] args){

          ArrayUtilPrint arrayUtilPrint = new ArrayUtilPrint();
          int[] cakesArray = arrayUtilPrint.createArray(3);
          arrayUtilPrint.fillArrayFromConsole(cakesArray);
          arrayUtilPrint.printArrayToConsole(cakesArray);
     }


}
