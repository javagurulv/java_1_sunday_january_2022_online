package student_stanislav_astafjev.lesson_5.Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter length of array : ");
        int a = in.nextInt();

        System.out.println("Creating array of " + a + " length");
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(100);
            arr[i] = number;
        }

        System.out.println(Arrays.toString(arr));
    }

}
