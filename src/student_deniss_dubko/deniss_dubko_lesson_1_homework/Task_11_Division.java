package student_deniss_dubko.deniss_dubko_lesson_1_homework;

import java.util.Scanner;

public class Task_11_Division {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число A = ");
        int a = input.nextInt();
        System.out.println("Введите число B = ");
        int b = input.nextInt();
        int d = a/b;
        System.out.println();
        System.out.println("Результат деления = " +d);
    }
}
