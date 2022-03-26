package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_33;
import java.util.Arrays;
import java.util.Random;
 class ArrayUtilRandom {

     public int[] createMyArray(int arrayLength){ return new int[arrayLength];}

    public void fillArrayRandomNumbers(int[] array){
        Random random = new Random();
        for(int i=0; i< array.length; i++){
     //   int arrayNumbers = random.nextInt(50);
     //   array[i] = arrayNumbers;
            array[i] = random.nextInt(50);  // 2 verhnii na odnu
    }
    }

    public void printArray(int[] array){
        for(int itArray : array){
            System.out.print(itArray+" ");
        }
    }
}
