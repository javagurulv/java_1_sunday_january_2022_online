package student_kristina_manevica.lesson2;

import java.util.Scanner;

public class EnterTwoDoubleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double minus = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;

        System.out.println("Your numbers sum is: " + sum);
        System.out.println("Your numbers minus is: " + minus);
        System.out.println("Your numbers miltiplication is: " + multiplication);
        System.out.println("Your numbers devision is: " + division);
    }
    }
