package student_stanislav_astafjev.lesson_4.Task_7;

import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
