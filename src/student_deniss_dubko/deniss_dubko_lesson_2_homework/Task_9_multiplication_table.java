package student_deniss_dubko.deniss_dubko_lesson_2_homework;

import java.util.Scanner;

public class Task_9_multiplication_table {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number:"); // Prompt the user for the integer number
        int a = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int b = i;
            System.out.println(a + "x" + b + "=" + a * b);


        }


    }


}