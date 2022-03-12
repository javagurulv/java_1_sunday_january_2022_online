package student_vitaly_galuzo.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Input natural number :");
        int num = scr.nextInt();

        boolean numberPoz = num > 0;


        System.out.println(num + " = " + "" + "is positive" + " " + "("+ numberPoz+")");



        }

}


