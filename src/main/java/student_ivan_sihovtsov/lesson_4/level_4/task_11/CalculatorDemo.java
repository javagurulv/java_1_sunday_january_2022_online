package student_ivan_sihovtsov.lesson_4.level_4.task_11;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        int resultOne = calculator.sum(firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + resultOne);

        int resultTwo = calculator.sub(firstNumber, secondNumber);
        System.out.println(firstNumber + " - " + secondNumber + " = " + resultTwo);

        int resultThird = calculator.div(firstNumber, secondNumber);
        System.out.println(firstNumber + " / " + secondNumber + " = " + resultThird);

        int resultFourth = calculator.mult(firstNumber, secondNumber);
        System.out.println(firstNumber + " * " + secondNumber + " = " + resultFourth);





    }

}
