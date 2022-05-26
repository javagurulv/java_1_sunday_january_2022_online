package student_stanislav_astafjev.lesson_5.Task_11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfIntegers {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second number : ");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter third number : ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}
