package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_15;

import java.util.Arrays;
import java.util.Random;

 class IncreaseTwo {
    public static void main(String[] args) {

        Random random = new Random();


        int[] randomNumbers = new int[3];

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(50);
            randomNumbers[i] = randomNumber;
            System.out.println("Element value at index: " + randomNumbers[i]);
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] += 2;

            System.out.println("Element value + 2: "+randomNumbers[i]);
        }
    }
}







