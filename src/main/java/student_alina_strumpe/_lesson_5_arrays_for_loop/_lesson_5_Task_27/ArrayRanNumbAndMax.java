package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_27;

import java.util.Arrays;
import java.util.Random;

 class ArrayRanNumbAndMax {

  /*  public static void main(String[] args){
        Random random = new Random();
         int[] studentMarks = new int[5];
         for (int i=0; i< studentMarks.length; i++){
             int marks = random.nextInt(11);
             studentMarks[i] = marks;}
         int max = studentMarks[0];
         for (int i=0; i< studentMarks.length; i++) {
             if (studentMarks[i] > max) {
                 max = studentMarks[i];}
             System.out.println("["+i+"] = "+studentMarks[i]);}
             System.out.println("max = "+ max);
         }
    }
*/

    /* public int[] setArray(int arrayLength) {
         return new int[arrayLength];
     }*/

   public int[] newArrayWithRandomLength(){
       Random random = new Random();
       return new int[random.nextInt (5)+2];
   }
     public void fillArrayWithRandomNum(int[] array) {
         Random random = new Random();
         for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(50);
         }
     }
     public void printArray(int[] array){System.out.println(Arrays.toString(array));}

     public int findMaxInArray(int[] array){
         int max = array[0];
         for(int element : array){

            /* for (int i=0; i<array.length; i++) {
                 if (array[i] > max) max = array[i];
             }  System.out.println("max "+max);*/

            if (element > max)
                max=element;
         }
         return max;
     }
 }


