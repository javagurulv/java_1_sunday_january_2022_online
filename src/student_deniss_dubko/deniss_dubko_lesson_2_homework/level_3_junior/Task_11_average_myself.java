package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task_11_average_myself {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double x = (a + b + c) / 3;

        System.out.println("Average = " + x);


    }


}
