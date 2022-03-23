package student_ivan_sihovtsov.lesson5.level_4;

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Array length is: " + arrayLength);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter the " + (i + 1) + "nd number of the array: ");
            array[i] = scanner.nextInt();
            System.out.println("Mark[" + (i + 1) + "] = " + array[i]);
        }




    }

}
