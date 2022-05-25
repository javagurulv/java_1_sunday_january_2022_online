package student_alina_strumpe._lesson_4_if._level_1_Task_7;

import java.util.Scanner;

public class EqualsAndDifferentDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert two numbers ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        EqualsAndDifferent numbers = new EqualsAndDifferent();
        int compare = numbers.compare(firstNumber, secondNumber);


    }
}
