package student_vladislavs_boicenko.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        double res1 = num1 + num2;
        double res2 = num1 - num2;
        double res3 = num1 / num2;
        double res4 = num1 * num2;
        System.out.println(num1 + "+" + num2 + "=" + res1);
        System.out.println(num1 + "-" + num2 + "=" + res2);
        System.out.println(num1 + "/" + num2 + "=" + res3);
        System.out.println(num1 + "*" + num2 + "=" + res4);

    }
}
