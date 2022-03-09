package student_yevgeniy_tolks.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber>secondNumber){
            System.out.println(secondNumber + " is lowest between two entered numbers");
        }
        else{
            System.out.println(firstNumber + " is the lowest between two entered numbers");
        }

    }

}
