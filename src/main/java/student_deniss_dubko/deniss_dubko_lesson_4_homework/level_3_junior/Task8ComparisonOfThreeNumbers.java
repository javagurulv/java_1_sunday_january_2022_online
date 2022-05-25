package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_3_junior;

import java.util.Scanner;

class Task8ComparisonOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal!");
            } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
                System.out.println("All Numbers are different!");
            } else {
                System.out.println("Neither all numbers are equal or different!");
        }
    }


}
