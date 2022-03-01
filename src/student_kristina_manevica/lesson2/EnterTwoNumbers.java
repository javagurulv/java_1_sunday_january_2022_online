package student_kristina_manevica.lesson2;

import java.util.Scanner;

public class EnterTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter please you second number:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int minus = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;

        System.out.println("Sum of yours number is: " + sum);
        System.out.println("Minus of yours two numbers is: " + minus);
        System.out.println("Multiplication of yours two numbers is: " + multiplication);
        System.out.println("Division of yours yours numbers is: " + division);
    }
}


