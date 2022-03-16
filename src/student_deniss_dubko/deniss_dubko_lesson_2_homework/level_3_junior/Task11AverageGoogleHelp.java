package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task11AverageGoogleHelp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        double[] nums = {firstNumber, secondNumber, thirdNumber};
        double result = 0;

        for (double d : nums) {
            result += d;
        }

        System.out.println("Average = " + result / nums.length);
    }


}
