package student_ivan_sihovtsov.lesson2.homework;

import java.util.Scanner;

public class Task_2_unfinished {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextInt();

        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " +
                (firstNumber + secondNumber));

        System.out.println(firstNumber + " - " + secondNumber + " = " +
                (firstNumber - secondNumber));

        System.out.println(firstNumber + " x " + secondNumber + " = " +
                (firstNumber * secondNumber));

        System.out.println(firstNumber + " / " + secondNumber + " = " +
                (firstNumber / secondNumber));





    }

}
