package student_deniss_dubko.deniss_dubko_lesson_1_homework.level_4_junior;

import java.util.Scanner;

public class Task12Multiplication {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number A = ");
        int aNumber = input.nextInt();

        System.out.println("Enter the number B = ");
        int bNumber = input.nextInt();

        int multiplication = aNumber * bNumber;

        System.out.println();
        System.out.println("Result of Multiplication = " + multiplication);
    }


}