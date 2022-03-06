package student_sergei_klunkov.lesson_2.level_3;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        // Просим у пользователя 3 целых числа
        // Выводим их среднее арифметиское число

        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number:");
        double firstNumber = myInput.nextInt();

        System.out.println("Enter second number:");
        double secondNumber = myInput.nextInt();

        System.out.println("Enter third number:");
        double thirdNumber = myInput.nextInt();

        double i = firstNumber + secondNumber + thirdNumber;
        double result = i / 3;

        System.out.println("Average number is: " + result);



    }
}
