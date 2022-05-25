package student_alina_strumpe._lesson_4_if._level_1_Task_9;

import java.util.Scanner;

public class IncrDecrDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert three numbers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        IncrDecr numbers = new IncrDecr();
        String compare = numbers.compareNumbers(number1, number2, number3);
        //System.out.println(compare);
    }
}
