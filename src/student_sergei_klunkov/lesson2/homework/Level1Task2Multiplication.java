package student_sergei_klunkov.lesson2.homework;

import java.util.Scanner;

public class Level1Task2Multiplication {

    public static void main(String[] args) {

        // 1. Get first  double number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I can help you...");
        System.out.println("Enter first double number, please");
        double firstDoubleNumber = scanner.nextDouble();

        // 2. Get second double number from user
        System.out.println("Enter second double number, please");
        double secondDoubleNumber = scanner.nextDouble();

        // 3. First number * second number
        double result = firstDoubleNumber * secondDoubleNumber;

        // 4. Print result to console
        System.out.println("Result = " + result);

    }
}
