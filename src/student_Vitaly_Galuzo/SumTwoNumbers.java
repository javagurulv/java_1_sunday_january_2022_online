package student_Vitaly_Galuzo;


import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        //step 1 - zaprositj pervoe chislo
        //step 2 - zaprositj vtoroe chislo
        // step 3 - sum of two numbers
        // step 4 - vivesti na ekran

        System.out.println("Input first number:");
        int number1 = scr.nextInt();

        System.out.println("Input second number:");
        int number2 = scr.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);

    }
}
