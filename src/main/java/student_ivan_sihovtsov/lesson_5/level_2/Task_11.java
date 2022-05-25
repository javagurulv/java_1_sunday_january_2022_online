package student_ivan_sihovtsov.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {


        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the first cell: ");
        array[0] = scanner.nextInt();
        System.out.print("Enter a number for the second cell: ");
        array[1] = scanner.nextInt();
        System.out.print("Enter a number for the third cell: ");
        array[2] = scanner.nextInt();

        System.out.println("Cell numbers is: " + array[0] + ", " + array[1] + ", " + array[2] + ".");

    }
}
