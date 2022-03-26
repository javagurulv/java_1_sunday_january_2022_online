package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_33;

import java.util.Random;

 class ArrayUtilRandomDemo {


    public static void main(String[] args){
        ArrayUtilRandom arrayUtilRandom = new ArrayUtilRandom();
        int[] myArray = arrayUtilRandom.createMyArray(5);
        arrayUtilRandom.fillArrayRandomNumbers(myArray);
        arrayUtilRandom.printArray(myArray);
    }
}
