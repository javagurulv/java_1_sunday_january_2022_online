package student_vitaly_galuzo.lesson_4.level_1;

import java.util.Scanner;

 class Task_3 {



    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Input any natural number from 1 to 7");

        int num = scr.nextInt();

        if (num == 1)
            System.out.println("Monday");
        if (num == 2)
            System.out.println("Tuesday");
        if (num == 3)
            System.out.println("Wednesday");
        if (num == 4)
            System.out.println("Thursday");
        if (num == 5)
            System.out.println("Friday");
        if (num == 6)
            System.out.println("Saturday");
        if (num == 7)
            System.out.println("Sunday");


    }

}
