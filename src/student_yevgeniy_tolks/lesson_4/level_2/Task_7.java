package student_yevgeniy_tolks.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber!= secondNumber) {
            System.out.println("Numbers are different!");
        } else {
            System.out.println("Numbers are equal!");
        }
    }
}
