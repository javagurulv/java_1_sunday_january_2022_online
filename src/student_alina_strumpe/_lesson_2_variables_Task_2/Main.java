package student_alina_strumpe._lesson_2_variables_Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first number: ");
        float first = scanner.nextFloat();
        System.out.println("Insert second number: ");
        float second = scanner.nextFloat();

        float sum = first + second;
        float sum2 = first - second;
        float sum3 = first * second;
        float sum4 = first / second;

        System.out.println("Sum: " + sum + "\n" + "Sum2: " + sum2 + "\n" + "Sum3: " + sum3 + "\n" + "Sum4: " + sum4);
        scanner.close();
    }
}
