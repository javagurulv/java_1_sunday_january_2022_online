package student_alina_strumpe._lesson_4_if._level_1_Task_2;

import java.util.Scanner;

public class Int_zero {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scan.nextInt();
           int mas1 [] = new int[] {number};
            for(int i =0; i < mas1.length; i++);
            mas1[0] = number;
            if (number > 0){
                System.out.println("Positive");
            } else if ( number < 0){
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
    }
}
