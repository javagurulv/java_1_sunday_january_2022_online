package student_stanislav_astafjev.lesson_4.Task_10;

import java.util.Scanner;

class ThreeIntegers {
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
        if (num1 > num2 && num2 > num3) {
            System.out.println("Greater is: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Greater is: " + num2);
        }
        else if (num3 > num2 && num3 > num1) {
            System.out.println("Greater is: " + num3);
        }
    }
}
