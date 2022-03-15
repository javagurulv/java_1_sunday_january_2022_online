package student_ivan_sihovtsov.lesson4.level_11;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative");
        }

        if (number > 0) {
            System.out.println("The number is positive");
        }

        if (number == 0) {
            System.out.println("This number is zero");

        }


    }

}
