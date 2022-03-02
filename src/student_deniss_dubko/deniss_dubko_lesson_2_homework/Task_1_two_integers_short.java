package student_deniss_dubko.deniss_dubko_lesson_2_homework;

import java.util.Scanner;

public class Task_1_two_integers_short {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println("Difference = " + difference);

        int multiply = firstNumber * secondNumber;
        System.out.println("Multiplication = " + multiply);

        int division = firstNumber / secondNumber;
        System.out.println("Division = " + division);


    }


}
