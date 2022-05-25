package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_37_38;

import java.util.Arrays;
import java.util.Scanner;

 class ArrayUtilScannerMinMax {


     public int[] createArray(int arrayLength) {
         return new int[arrayLength];
     }

     public void fillArrayFromUser(int[] array) {
         Scanner scanner = new Scanner(System.in);
         for (int i = 0; i < array.length; i++) {
             System.out.print("Insert the array elements: " + (i + 1)+" - ");
             array[i] = scanner.nextInt();
         }
     }

     public void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
         }
         System.out.println(Arrays.toString(array));
     }

     public int findMinInArray(int[] array) {
         int min = array[0];
         for (int element : array) {
             if (element < min) min = element;
         }
         return min;
     }

     public int findMaxInArray(int[] array){
         int max = array[0];
         for(int element : array){
             if(element>max) max=element;
         }
         return max;
     }
 }