package student_vitaly_galuzo.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter length of array: ");

        int length = scr.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter arrays elements: ");
            array[i] = scr.nextInt();
        }
        System.out.println(Arrays.toString(array));

        }

    }


