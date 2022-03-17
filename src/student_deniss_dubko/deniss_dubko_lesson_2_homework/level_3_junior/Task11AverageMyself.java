package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task11AverageMyself {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();
        double thirdNumber = scanner.nextInt();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average = " + average);
    }


}
