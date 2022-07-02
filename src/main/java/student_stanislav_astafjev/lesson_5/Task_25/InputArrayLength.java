package student_stanislav_astafjev.lesson_5.Task_25;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrayLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array : ");
        int a = in.nextInt();

        System.out.println("Creating array of " + a + " length");
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Add number at index " + i);
            int number = in.nextInt();
            arr[i] = number;
        }

        System.out.println(Arrays.toString(arr));
    }

}
