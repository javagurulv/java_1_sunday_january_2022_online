package student_aleksandra_jefimova.lesson_2.level_3.task_9.task_10.task_11;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task11_average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Arithmetic mean = " + average);

    }
}