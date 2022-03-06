package student_aleksandra_jefimova.lesson_2.level_7.task_32;
import java.util.Scanner;

public class Comments {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get first number from user
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        //get second number from user
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        //get third number from user
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();

        //print result
        //use double data type
        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Arithmetic mean = " + average);

    }
}