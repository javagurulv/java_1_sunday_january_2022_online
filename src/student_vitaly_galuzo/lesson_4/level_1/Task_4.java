package student_vitaly_galuzo.lesson_4.level_1;

import java.util.Scanner;

 class Task_4 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Input natural number: ");
        int number = scr.nextInt();

        if (number%2 == 0)
            System.out.println("Number is even");

        else{
            System.out.println("Number is uneven ");
        }


    }
}