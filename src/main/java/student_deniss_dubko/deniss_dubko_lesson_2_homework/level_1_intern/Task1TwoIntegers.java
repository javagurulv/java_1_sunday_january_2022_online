package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_1_intern;

import java.util.Scanner;

class Task1TwoIntegers {

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

        System.out.println("Enter first number:"); // Step 1 - Prompt the user for the first integer number
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:"); // Step 2 - Prompt the user for the second integer number
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber; // Step 3 - Sum two numbers

        System.out.println("Sum = " + sum); // Step 4 - Show the result of sum on the console

        int difference = firstNumber - secondNumber; // Step 5 - Find the difference of two numbers

        System.out.println("Difference = " + difference); // Step 6 - Show the result of difference on the console

        int multiply = firstNumber * secondNumber; // Step 7 - Multiply two numbers

        System.out.println("Result of Multiplication = " + multiply); // Step 8 - Show the result of multiplication on the console

        int division = firstNumber / secondNumber; // Step 9 - Division two numbers

        System.out.println("Result of Division = " + division); // Step 10 - Show the result of division on the console
    }


}
