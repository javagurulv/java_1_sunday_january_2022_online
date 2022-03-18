package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task9NumberMultiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:"); // Prompt the user for the number

        int firstNumber = scanner.nextInt();

        for (int nextNumber = 1; nextNumber <= 10; nextNumber++) {

            int secondNumber = nextNumber;

            System.out.println(firstNumber + " " + "x" + " " + secondNumber + " " + "=" + " " + firstNumber * secondNumber);
        }
    }


}