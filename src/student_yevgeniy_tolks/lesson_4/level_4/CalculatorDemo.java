package student_yevgeniy_tolks.lesson_4.level_4;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum = " + calc.sumOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Sub = " + calc.subOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Mul = " + calc.mulOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Div = " + calc.divOfTwoNumbers(firstNumber, secondNumber));

    }
}
