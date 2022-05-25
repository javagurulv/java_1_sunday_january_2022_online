package student_kristina_manevica.lesson_2.level_7;

import java.util.Scanner;

public class Comment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: "); //wait or first number from client
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: "); //wait second number from client
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double minus = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;
        //make division from two clients entered numbers
        //result will be with as double number

        System.out.println("Your numbers sum is: " + sum);
        System.out.println("Your numbers minus is: " + minus);
        System.out.println("Your numbers miltiplication is: " + multiplication);
        System.out.println("Your numbers devision is: " + division);
    }
    }
