package student_vladislavs_boicenko.lesson_2;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();

        double res = ((num1 + num2 + num3) / 3);
        System.out.println("Result: " + res);

    }
}
