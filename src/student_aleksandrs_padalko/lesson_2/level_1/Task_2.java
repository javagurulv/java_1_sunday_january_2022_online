package student_aleksandrs_padalko.lesson_2.level_1;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
  //      (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
    //    Вещественные числа можно запрашивать с консоли используя обьект Scanner
      //  следующим образом:

import java.util.Scanner;

//Scanner scanner = new Scanner(System.in);
        //double firstDoubleNumber = scanner.nextDouble();

        public class Task_2 {
        public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number:");
    double firstDoubleNumber = scanner.nextDouble();

    System.out.println("Enter second number:");

    double secondDoubleNumber = scanner.nextDouble();

    double sum = firstDoubleNumber + secondDoubleNumber;
    System.out.println("Addition=" + sum);

    double sum2 = firstDoubleNumber - secondDoubleNumber;
    System.out.println("Deduction=" + sum2);

    double sum3 = firstDoubleNumber * secondDoubleNumber;
    System.out.println("Multiplication=" + sum3);

    double sum4 = firstDoubleNumber / secondDoubleNumber;
    System.out.println("Division=" + sum4);}
}
