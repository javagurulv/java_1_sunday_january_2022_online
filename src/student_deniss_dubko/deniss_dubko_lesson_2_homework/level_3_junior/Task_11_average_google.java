package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task_11_average_google {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double[] nums = {a, b, c};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Average = " + result / nums.length);


    }


}
