package student_sergei_klunkov.lesson_4.level_1;

import java.util.Scanner;


class EvenAndOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number:");

        int number = scanner.nextInt();

        if ( number%2 == 0 && number != 0 ) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }
    }
}
