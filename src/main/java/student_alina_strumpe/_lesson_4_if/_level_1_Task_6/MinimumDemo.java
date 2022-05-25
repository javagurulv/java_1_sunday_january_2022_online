package student_alina_strumpe._lesson_4_if._level_1_Task_6;

import java.util.Scanner;

public class MinimumDemo {

    public static void main(String[] args) {

        int[] mas1 = new int[2]; //

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Insert number");
            int number = scan.nextInt();
            mas1[i] = number;
        }

        Minimum m = new Minimum();
        System.out.println("Min value = " + m.min(mas1));


    }

}




// еще где-то 100 таких задач и вполне возможно это как то поддастся