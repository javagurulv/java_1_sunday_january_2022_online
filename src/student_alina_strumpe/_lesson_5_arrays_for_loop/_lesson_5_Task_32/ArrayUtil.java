package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_32;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

 class ArrayUtil {

    public void generateRandomMarks(int[] numbers){
        Random random = new Random();
        for(int i=0; i< numbers.length; i++){
            int randomNumbers = random.nextInt(15);
            numbers[i] = randomNumbers;
            System.out.println("["+i+"] = "+numbers[i]);
        }

    }
}
