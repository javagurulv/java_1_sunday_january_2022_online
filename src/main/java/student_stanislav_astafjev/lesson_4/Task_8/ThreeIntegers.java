package student_stanislav_astafjev.lesson_4.Task_8;

import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("Enter third number: ");
        num3 = input.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}
