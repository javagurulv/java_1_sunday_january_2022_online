package student_kristina_manevica.lesson2;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter please you second number:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum of yours number is:" + sum);
    }
}


