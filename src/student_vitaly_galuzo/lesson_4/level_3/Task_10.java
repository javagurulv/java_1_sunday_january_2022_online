package student_vitaly_galuzo.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {


    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);
        System.out.println("Enter three natural numbers below");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();      //a>b && a>c   a          1 2 3     1
                                           // b>a && b>c   b          2 1 3     2
                                              //    c                               3
                                                 //   ab   bc  ac



        if(num1 > num2 && num1 > num3) {
            System.out.println("Greatest is "+num1);
        }
        else if(num2 > num1 && num2 > num3) {
            System.out.println("Greatest is "+num2);
        }
        else if(num3 > num2 && num3 > num1) {
            System.out.println("Greatest is "+num3);
        }
        else{
            System.out.println("All numbers are equals");
        }

        }

    }

