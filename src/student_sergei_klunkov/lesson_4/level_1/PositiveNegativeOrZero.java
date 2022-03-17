package student_sergei_klunkov.lesson_4.level_1;

import java.util.Scanner;

class PositiveNegativeOrZero {
    int number = 0;
    boolean numberPositive = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number...");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive!");

        } else {

            if (number < 0) {
                System.out.println("You number is negative!");
            } else {
                if (number == 0) {
                    System.out.println("Your number is zero");

                }
            }






        }
    }
}


