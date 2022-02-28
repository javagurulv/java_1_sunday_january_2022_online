package student_alina_strumpe._lesson_2_variables_Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert firstNumber: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Insert secondNumber: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sum2 = firstNumber - secondNumber;
        int sum3 = firstNumber * secondNumber;
        int sum4 = firstNumber / secondNumber;

        System.out.println("Sum: " + sum + "\n" + "Sum2: " + sum2 + "\n"
                + "Sum3: " + sum3 + "\n" + "Sum4: " + sum4);
        scanner.close();



    }
}
