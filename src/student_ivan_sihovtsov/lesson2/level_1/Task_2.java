package student_ivan_sihovtsov.lesson2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();


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
