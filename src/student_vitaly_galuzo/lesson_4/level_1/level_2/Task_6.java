package student_vitaly_galuzo.lesson_4.level_1.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scr.nextInt();
        System.out.println("Input second number: ");
        int num2 = scr.nextInt();


        if (num1 > num2)
            System.out.println("Result = " + num2);
        if (num2 > num1)
            System.out.println("Result = " + num1);

    }
}