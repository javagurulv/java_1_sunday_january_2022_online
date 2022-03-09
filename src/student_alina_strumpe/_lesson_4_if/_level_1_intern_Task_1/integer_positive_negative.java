package student_alina_strumpe._lesson_4_if._level_1_intern_Task_1;

import java.util.Scanner;

public class integer_positive_negative {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert number: ");
        int number = scan.nextInt();
         if (number > 0){
             System.out.println("Positive number");
         }else if (number < 0) {
             System.out.println("Negative number");
         }else  {
             System.out.println("It is zero");
         }
    }

}
