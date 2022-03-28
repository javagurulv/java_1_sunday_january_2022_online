package student_sergei_klunkov.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class UserArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter first number: ");
        numbers[0] = scanner.nextInt();

        System.out.println("Enter second number: ");
        numbers[1] = scanner.nextInt();

        System.out.println("Enter third number: ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}
