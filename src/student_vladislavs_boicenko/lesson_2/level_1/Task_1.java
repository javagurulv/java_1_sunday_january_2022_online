package student_vladislavs_boicenko.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 / num2;
        int res4 = num1 * num2;

        System.out.println(num1 + "+" + num2 + "=" + res1);
        System.out.println(num1 + "-" + num2 + "=" + res2);
        System.out.println(num1 + "/" + num2 + "=" + res3);
        System.out.println(num1 + "*" + num2 + "=" + res4);

    }
}
