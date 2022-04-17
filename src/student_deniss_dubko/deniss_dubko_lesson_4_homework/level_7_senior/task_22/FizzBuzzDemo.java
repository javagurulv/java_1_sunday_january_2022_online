package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_7_senior.task_22;

import java.util.Scanner;

class FizzBuzzDemo {

    public static void main(String[] args) {

        FizzBuzz detector = new FizzBuzz();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();

        System.out.println(detector.detect(number));
    }

}
