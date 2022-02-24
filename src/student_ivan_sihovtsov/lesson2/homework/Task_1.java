package student_ivan_sihovtsov.lesson2.homework;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " +
                (firstNumber + secondNumber));

        System.out.println(firstNumber + " - " + secondNumber + " = " +
                (firstNumber - secondNumber));

        System.out.println(firstNumber + " x " + secondNumber + " = " +
                (firstNumber * secondNumber));

        System.out.println(firstNumber + " / " + secondNumber + " = " +
                (firstNumber / secondNumber));

        System.out.println(" ");
        System.out.println("Have a nice day! ");



    }

}
