package student_aleksandra_jefimova.lesson_2;
import java.util.Scanner;

public class Task11_average {
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