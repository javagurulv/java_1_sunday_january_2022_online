package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_30;

import java.util.Arrays;
import java.util.Random;

 class ArrayRanNumOdd {

/*    public static void main(String[] args) {
        Random random = new Random();
        int[] numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            int number = random.nextInt(11);
            numbersArray[i] = number;
            System.out.println("[" + i + "]" + numbersArray[i]);}
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 != 0) {
                System.out.println("odd = " + numbersArray[i]);*/

     public int[] SetArray(int arrayLength) {
         return new int[arrayLength];
     }

     public void fillArrayWithRandomNumbers(int[] newArray) {
         Random random = new Random();
         for (int i = 0; i < newArray.length; i++) {
             newArray[i] = random.nextInt(101);
         }
     }

     public void printNewArray(int[] newArray) {
         System.out.println(Arrays.toString(newArray));
        /* System.out.println("Array: [");
         for (int element : newArray) {
             System.out.print(element + "  ");
         }
         System.out.println("]" + "\n");*/
     }

     public void printOddNumberInArray(int[] newArray) {
         System.out.print("Odd element from array: ");

         for (int i=0; i< newArray.length; i++) {
             if (newArray[i] % 2 != 0) {
                 System.out.println(newArray[i] + " ");
             }
         }

             System.out.println();

     }


     }









