package student_aleksandra_jefimova.lesson_2.level_1.task_1.task_2;

import java.util.Scanner;

class Task2_operations_with_real_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task1. Get  NumberOne
        System.out.println("Enter first number:");
        double firstDoubleNumber = scanner.nextDouble();

        // Task2. Get  NumberTwo
        System.out.println("Enter second number:");
        double secondDoubleNumber = scanner.nextDouble();

        // Task3. Sum two numbers
        double sum = firstDoubleNumber + secondDoubleNumber;

        // Task4. Substraction NumberOne minus NumberTwo
        double substraction = firstDoubleNumber - secondDoubleNumber;

        // Task5. Multiplication two numbers
        double multiplication = firstDoubleNumber * secondDoubleNumber;

        // Task6. Dividing two numbers
        double dividing = firstDoubleNumber / secondDoubleNumber;

        // Task7. Display 4 results
        System.out.println("Sum = " + sum);
        System.out.println("Substraction = " + substraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Dividing = " + dividing);

    }
}