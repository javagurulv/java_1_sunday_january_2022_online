package student_vitaly_galuzo.lesson_4.level_1;

import java.util.Scanner;

 class task_2 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Input natural number :");
        int num = scr.nextInt();


        if(num > 0)
            System.out.println(num+" = positive");

        else if(num < 0)
            System.out.println(num+" = negative");

        else
            System.out.println("Is zero !");




    }
}
