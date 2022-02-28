package student_aleksandrs_padalko.lesson_2.level_1;


import java.util.Scanner;

public class Task_1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter first number:");
                int firstNumber = scanner.nextInt();

                System.out.println("Enter second number:");

                int secondNumber = scanner.nextInt();

                int sum = firstNumber + secondNumber;
                System.out.println("Sum=" + sum);

                int sum2 = firstNumber - secondNumber;
                System.out.println("Sum2=" + sum2);

                int sum3 = firstNumber * secondNumber;
                System.out.println("Sum3=" + sum3);

                int sum4 = firstNumber / secondNumber;
                System.out.println("Sum4=" + sum4);


        }
}


