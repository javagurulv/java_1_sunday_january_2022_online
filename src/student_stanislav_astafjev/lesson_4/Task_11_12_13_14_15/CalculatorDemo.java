package student_stanislav_astafjev.lesson_4.Task_11_12_13_14_15;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Sum = " + calculator.sum(firstNumber,secondNumber));
        System.out.println("Sub = " + calculator.sub(firstNumber,secondNumber));
        System.out.println("Div = " + calculator.division(firstNumber,secondNumber));
        System.out.println("Mul = " + calculator.multiplication(firstNumber,secondNumber));
    }
}
