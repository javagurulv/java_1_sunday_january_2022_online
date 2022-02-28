package student_deniss_dubko.deniss_dubko_lesson_1_homework;

import java.util.Scanner;

public class Task_12_Multiplication {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");
        int a = input.nextInt();
        System.out.println("Enter the number B = ");
        int b = input.nextInt();
        int d = a*b;
        System.out.println();
        System.out.println("Multiplication = " +d);
    }
}
