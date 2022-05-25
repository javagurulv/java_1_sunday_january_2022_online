package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_1_intern;

import java.util.Scanner;

class Task4EvenOrOddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even!");
        } else {
            System.out.println("Number is Odd!");
        }
    }


}
