package student_yevgeniy_tolks.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing order");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
