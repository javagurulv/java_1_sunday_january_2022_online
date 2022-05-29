package student_stanislav_astafjev.lesson_5.Task_12;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }

    }
}
