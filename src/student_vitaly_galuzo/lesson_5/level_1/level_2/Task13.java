package student_vitaly_galuzo.lesson_5.level_1.level_2;

import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int)(Math.random()*501);
        numbers[1] = (int)(Math.random()*501);
        numbers[2] = (int)(Math.random()*501);

        System.out.println(Arrays.toString(numbers));
        int sum = (numbers[0] + numbers[1] + numbers[2]);
        System.out.println("Sum of numbers = " + sum);

           }
        }


