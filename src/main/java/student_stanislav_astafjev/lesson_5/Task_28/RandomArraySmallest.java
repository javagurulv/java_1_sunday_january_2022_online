package student_stanislav_astafjev.lesson_5.Task_28;

import java.util.Arrays;
import java.util.Random;


public class RandomArraySmallest {
    public static void main(String[] args) {
        Random random = new Random();
        int boundary = 100;

        int a = random.nextInt(boundary);

        System.out.println("Creating array of " + a + " length");
        int[] arr = new int[a];
        int biggestNumber = boundary;

        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(boundary);
            if (biggestNumber > number) {
                biggestNumber = number;
            }
            arr[i] = number;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest number is " + biggestNumber);
    }

}
