package student_jelena_voinica;

import java.util.Scanner;

public class lesson_1_Scan {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter secondNumber");
        double secondNumber = scanner.nextDouble();

       double sum = firstNumber + secondNumber;
       double minus = firstNumber - secondNumber;
       double multiplication = firstNumber * secondNumber;
       double division = firstNumber / secondNumber;

        System.out.println ("Sum =" + sum);
        System.out.println("Minus = " + minus);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);


    }
}
