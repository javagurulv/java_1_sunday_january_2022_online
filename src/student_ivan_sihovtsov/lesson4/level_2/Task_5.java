package student_ivan_sihovtsov.lesson4.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("Largest number is: " + numberOne);
        }

        if (numberTwo > numberOne) {
            System.out.println("Largest number is: " + numberTwo);
        }


    }

}
