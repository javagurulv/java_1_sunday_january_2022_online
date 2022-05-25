package student_alina_strumpe._lesson_4_if._level_1_intern_Task_1;

import java.util.Scanner;

public class Integer_positive_negative {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert number: ");
        int number = scan.nextInt();

        // решение 1
//         if (number > 0){
//             System.out.println("Positive number");
//          }else if (number < 0) {
//             System.out.println("Negative number");
//         }else  {
//             System.out.println("It is zero");
//         }


        // 2

         int [] mas1 = new int[] {number};
         for (int i = 0; i > mas1.length; i++) mas1[0] = 0;
                 if (number < 0) System.out.println("Negative");
                 else {
                     System.out.println("positive");
                 }
             }

         }





