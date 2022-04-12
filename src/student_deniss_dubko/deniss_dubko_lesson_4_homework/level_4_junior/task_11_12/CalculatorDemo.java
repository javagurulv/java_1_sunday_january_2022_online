package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_4_junior.task_11_12;

import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Larger number is: " + calculator.maxOfTwoNumbers(firstNumber, secondNumber));
        System.out.println();
        System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.sum(firstNumber, secondNumber));
        System.out.println("Result is Even = " + calculator.isEven(calculator.sum(firstNumber,secondNumber)));
        System.out.println();
        System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.difference(firstNumber, secondNumber));
        System.out.println("Result is Even = " + calculator.isEven(calculator.difference(firstNumber,secondNumber)));
        System.out.println();
        System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.multiplication(firstNumber, secondNumber));
        System.out.println("Result is Even = " + calculator.isEven(calculator.multiplication(firstNumber,secondNumber)));
        System.out.println();
        System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.division(firstNumber, secondNumber));
        System.out.println("Result is Even = " + calculator.isEven(calculator.division(firstNumber,secondNumber)));
    }


}
