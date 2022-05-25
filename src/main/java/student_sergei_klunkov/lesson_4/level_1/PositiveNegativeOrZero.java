package student_sergei_klunkov.lesson_4.level_1;

import java.util.Scanner;

class PositiveNegativeOrZero {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number...");

        int number = scanner.nextInt();

        if ( number == 0 ) {
            System.out.println("Your number is zero!");
        }
        if ( number > 0 && number != 0 ){
            System.out.println("Your number is positive!");
        }
        if ( number < 0 && number != 0 )
            System.out.println("Your number is negative!");
        }
}


