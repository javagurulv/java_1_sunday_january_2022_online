package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_13;

import java.util.Arrays;
import java.util.Random;

class RandomSum {

    public static void main(String[] args) {

        Random random = new Random();

        int[] mas1 = new int[3];
        int sum = 0;

        for (int i = 0; i < mas1.length; i++) {
            int randomNumbers = random.nextInt(50);
            mas1[i] = randomNumbers;


            System.out.println(Arrays.toString(mas1)); // vivod po odnomu zapolneniju tri raza
        }
        for (int numbers : mas1){
            sum += numbers;
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(sum);   // srazu ves zapolnennij massiv

    }
}


