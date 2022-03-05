package student_kristina_manevica.lesson2;

import java.util.Scanner;

public class SredneeArifmetic {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println ("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println ("Enter third number: ");
        int number3 = scanner.nextInt();

         int sum = number1 + number2 + number3;
         double srednee = sum / (double) 3;
        System.out.println("Srednee arifmetic is: " + srednee);

    }


}
