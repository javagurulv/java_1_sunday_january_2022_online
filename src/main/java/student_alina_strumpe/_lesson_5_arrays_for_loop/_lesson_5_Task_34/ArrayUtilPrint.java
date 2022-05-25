package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_34;

import java.util.Scanner;

class ArrayUtilPrint {

    public int[] createArray(int arrayLength){ return new int[arrayLength];}

     public void fillArrayFromConsole(int[] numberArray){
         Scanner scanner = new Scanner(System.in);
         for (int i=0; i< numberArray.length; i++){
             System.out.println("Insert an element number: "+(i+1));
             numberArray[i] = scanner.nextInt();
         }
     }

     public void printArrayToConsole(int[] numberArray){
         for(int i=0 ; i < numberArray.length ; i++ ){
             System.out.println("index ["+i+"] = "+numberArray[i]);
         }
     }
}
