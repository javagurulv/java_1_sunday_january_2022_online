package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_1_intern;

import java.util.Scanner;

public class Task_1_two_integers {

    public static void main(String[] args) {

        // Step 1 - Prompt the user for the first integer number
        // Step 2 - Prompt the user for the second integer number
        // Step 3 - Sum two numbers
        // Step 4 - Show the result of sum on the console
        // Step 5 - Find the difference of two numbers
        // Step 6 - Show the result of difference on the console
        // Step 7 - Multiply two numbers
        // Step 8 - Show the result of multiplication on the console
        // Step 9 - Division two numbers
        // Step 10 - Show the result of division on the console

        Scanner scanner = new Scanner(System.in);

        // Step 1 - Prompt the user for the first integer number
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        // Step 2 - Prompt the user for the second integer number
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        // Step 3 - Sum two numbers
        int sum = firstNumber + secondNumber;

        // Step 4 - Show the result of sum on the console
        System.out.println("Sum = " + sum);

        // Step 5 - Find the difference of two numbers
        int difference = firstNumber - secondNumber;

        // Step 6 - Show the result of difference on the console
        System.out.println("Difference = " + difference);

        // Step 7 - Multiply two numbers
        int multiply = firstNumber * secondNumber;

        // Step 8 - Show the result of multiplication on the console
        System.out.println("Multiplication = " + multiply);

        // Step 9 - Division two numbers
        int division = firstNumber / secondNumber;

        // Step 10 - Show the result of division on the console
        System.out.println("Division = " + division);


    }


}
