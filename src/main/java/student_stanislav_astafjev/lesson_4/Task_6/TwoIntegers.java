package student_stanislav_astafjev.lesson_4.Task_6;

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
        if (num1 < num2) {
            System.out.println("The first number is lower then second");
        }
        else if (num1 > num2) {
            System.out.println("The second number is lower then second");
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}
