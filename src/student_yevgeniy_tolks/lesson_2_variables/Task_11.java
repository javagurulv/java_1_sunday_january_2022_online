package student_yevgeniy_tolks.lesson_2_variables;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber= scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double thirdNumber=scanner.nextDouble();
        double meanArithmetical=(firstNumber+secondNumber+thirdNumber)/3;

        System.out.println("Mean arithmetical = "+meanArithmetical);
    }
}
