package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_28;

import java.util.Arrays;
import java.util.Random;

public class RanNumAndMin {

/*    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            int randomNumbers = random.nextInt(100);
            mas[i] = randomNumbers;
            System.out.println("["+i+"] = " + mas[i]);}
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];}}
        System.out.println("min = " + min);
    }*/

        public int[] setArray(int arrayLength){
                return new int [arrayLength];
        }

         public void fillArrayWithRandomValue(int[] array){
            Random random = new Random();
            for (int i=0; i<array.length; i++){
                array[i] = random.nextInt(50);
            }
         }

         public void printArray(int[] array){
            System.out.println(Arrays.toString(array));
         }

         public int findMinValueInArray(int[] array){
            int min = array[0];
            for(int element : array){
                if (element < min) min = element;
            }
            return min;
         }
}