package student_vitaly_galuzo.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scr.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scr.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scr.nextInt();

        if(num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }
        else if(num1 > num2 && num2 > num3){
            System.out.println("Decreasing");

        } else {
            System.out.println("Neither all are equal nor different");

        }



    }
}


