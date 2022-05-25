package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_3_junior;

import java.util.Scanner;

class Task10MaximumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Maximum is first number: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Maximum is second number: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Maximum is third number: " + thirdNumber);
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            System.out.println("Maximum are first number & second number: " + firstNumber);
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            System.out.println("Maximum are first number & third number: " + firstNumber);
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            System.out.println("Maximum are second number & third number: " + secondNumber);
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal: " + firstNumber);
        }
    }


}
