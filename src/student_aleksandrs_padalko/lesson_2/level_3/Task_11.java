package student_aleksandrs_padalko.lesson_2.level_3;

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечение: обратите внимание, что результат может быть дробным числом.

import java.util.Scanner;

public class Task_11 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number:");
    double firstDoubleNumber = scanner.nextDouble();

    System.out.println("Enter second number:");
    double secondDoubleNumber = scanner.nextDouble();

    System.out.println("Enter third number:");
    double thirdDoubleNumber = scanner.nextDouble();

    double sum = (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber)/3;
    System.out.println("Average = " + sum);


}
}
