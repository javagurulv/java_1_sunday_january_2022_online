package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_14;

import java.util.Arrays;
import java.util.Random;

public class RandAndAverage {

    public static void main(String[] args) {

        Random random = new Random();

        int[] mas1 = new int[3];
        int sum = 0;


        for (int i = 0; i < mas1.length; i++) {
            int randomNumbers = random.nextInt(50);
            mas1[i] = randomNumbers;

        }

        for(int i=0 ; i < mas1.length ; i++) {
            sum += mas1[i];
            double mean;
            mean = sum / (double) mas1.length;

            System.out.println(Arrays.toString(mas1));
            System.out.println(sum);
            System.out.println(mean);
        }
    }

    }

