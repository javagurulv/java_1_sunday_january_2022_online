package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_35_36;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

 class ArrayUtilMaxNumber {

     public int getArrayLengthFromUser() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Insert an array length: ");
         return scanner.nextInt();
     }

     public int[] newArray(int arrayLength){
         return new int[arrayLength];
     }

     public void fillArrayWithRandomNumbers(int[] belovedArray) {
         Random random = new Random();
         for (int i = 0; i < belovedArray.length; i++) {
          //   int randomNumbers = random.nextInt(50);
          //   belovedArray[i] = randomNumbers;
             belovedArray[i] = random.nextInt(30);
         }
     }

     public void printArray(int[] belovedArray){
         System.out.println(Arrays.toString(belovedArray));
     }

     public int findMaxNumber(int[] belovedArray){
         int max = belovedArray[0];
         for (int element : belovedArray) {
             if(element > max) max = element;
         }
         return max;
     }
 }




