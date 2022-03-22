package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_29;

import java.util.Arrays;
import java.util.Random;

 class ArrayRandomElemAndEven {

/*    public static void main(String[] args){
        Random random = new Random();
        int[] evenNumbers = new int[10];
        for(int i=0; i< evenNumbers.length; i++){
            int randomNumbers = random.nextInt(11);
            evenNumbers[i] = randomNumbers;
            System.out.println("["+i+"] = "+evenNumbers[i]);}
        for(int i=0; i< evenNumbers.length; i++){
            if(evenNumbers[i] %2 == 0){
                System.out.println(evenNumbers[i]);}}}*/


    public int[] setArray(int arrayLength){ return new int [arrayLength];}

    public void fillArrayWithRandomElements(int[] filledArray){
        Random random = new Random();
        for(int i=0; i< filledArray.length; i++){
            filledArray[i]= random.nextInt(101);
        }
    }

     public void printRandomFilledArray(int[] filledArray){
        System.out.println(Arrays.toString(filledArray));
     }

     public int printEvenElementsInArray(int[] filledArray){
        System.out.println("Even element from array: ");

        for (int elements : filledArray){
            if (elements %2  == 0){
                System.out.println(elements);
            }
        }
         return 0;
     }
}
