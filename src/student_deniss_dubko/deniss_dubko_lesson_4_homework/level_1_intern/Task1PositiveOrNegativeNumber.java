package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_1_intern;

import java.util.Scanner;

class Task1PositiveOrNegativeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive");
            } else if (number == 0) {
            System.out.println("Number = 0");
            } else {
            System.out.println("Number is Negative");
        }
    }


}
