package student_ivan_sihovtsov.lesson4.level_11;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int numberOne = number % 2;

        if (numberOne == 0) {
            System.out.println("Even number.");
        }else {
            System.out.println("Odd number.");
        }

    }

}
