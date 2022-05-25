package student_aleksandra_jefimova.lesson_2.level_1.task_1.task_2;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task1_mathematical_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task1. Get  NumberOne
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        // Task2. Get  NumberTwo
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        // Task3. Sum two numbers
        int sum = firstNumber + secondNumber;

        // Task4. Substraction NumberOne minus NumberTwo
        int substraction = firstNumber - secondNumber;

        // Task5. Multiplication two numbers
        int multiplication = firstNumber * secondNumber;

        // Task6. Dividing two numbers
        int dividing = firstNumber / secondNumber;

        // Task7. Display 4 results
        System.out.println("Sum = " + sum);
        System.out.println("Substraction = " + substraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Dividing = " + dividing);

    }

}
