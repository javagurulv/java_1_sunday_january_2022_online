package student_vitaly_galuzo.lesson_5.level_1.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        numbers[0] = (int)(Math.random()*50);
        numbers[1] = (int)(Math.random()*50);
        numbers[2] = (int)(Math.random()*50);

        System.out.println(Arrays.toString(numbers));
        int average = (numbers[0] + numbers[1] + numbers[2]/numbers.length);
        System.out.println("Average of numbers = " + average);

        }
    }


