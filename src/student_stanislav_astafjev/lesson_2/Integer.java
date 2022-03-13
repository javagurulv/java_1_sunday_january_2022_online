package student_stanislav_astafjev.lesson_2;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum +" + sum);

        int difference = firstNumber - secondNumber;
        System.out.println("Difference -" + difference);

        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication * " + multiplication);

        int division = firstNumber / secondNumber;
        System.out.println("Division / " + division);
    }

}
