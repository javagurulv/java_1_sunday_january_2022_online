package student_vitaly_galuzo.lesson_4.level_4;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scr.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scr.nextInt();


        int result1 = calculator.sum(num1, num2);
        System.out.println("Sum = "+ result1);
        int result2 = calculator.subtraction(num1, num2);
        System.out.println("Subtraction = "+ result2);
        int result3 = calculator.multiplication(num1, num2);
        System.out.println("Multiplication = "+ result3);
        int result4 = calculator.division(num1, num2);
        System.out.println("Division = "+ result4);










        }

    }



