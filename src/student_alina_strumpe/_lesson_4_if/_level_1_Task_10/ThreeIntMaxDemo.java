package student_alina_strumpe._lesson_4_if._level_1_Task_10;

import java.util.Scanner;

public class ThreeIntMaxDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert three integers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        ThreeIntMax number = new ThreeIntMax();
           String maxValue = number.getMaxValue(number1, number2, number3);


    }
}
