package student_yevgeniy_tolks.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " bigger than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " less than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }

    }
}
