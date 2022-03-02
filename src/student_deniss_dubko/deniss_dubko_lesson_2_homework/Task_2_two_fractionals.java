package student_deniss_dubko.deniss_dubko_lesson_2_homework;

import java.util.Scanner;

public class Task_2_two_fractionals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first fractional number:"); // Step 1 - Prompt the user for the first fractional number
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second fractional number:"); // Step 2 - Prompt the user for the second fractional number
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber; // Step 3 - Sum two fractional numbers

        System.out.println("Sum = " + sum); // Step 4 - Show the result of sum on the console

        double difference = firstDoubleNumber - secondDoubleNumber; // Step 5 - Find the difference of two fractional numbers

        System.out.println("Difference = " + difference); // Step 6 - Show the result of difference on the console

        double multiply = firstDoubleNumber * secondDoubleNumber; // Step 7 - Multiply two fraction numbers

        System.out.println("Multiplication = " + multiply); // Step 8 - Show the result of multiplication on the console

        double division = firstDoubleNumber / secondDoubleNumber; // Step 9 - Division two fractional numbers

        System.out.println("Division = " + division); // Step 10 - Show the result of division on the console


    }


}
