package student_deniss_dubko.deniss_dubko_lesson_1_homework.level_4_junior;

import java.util.Scanner;

class Task11Division {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");

        int aNumber = input.nextInt();
        System.out.println("Enter the number B = ");

        int bNumber = input.nextInt();

        int division = aNumber/bNumber;

        System.out.println();
        System.out.println("Division = " + division);
    }


}
