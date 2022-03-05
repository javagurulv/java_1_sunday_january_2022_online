package student_aleksandrs_padalko.lesson_2.level_1;

//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;

public class Task_10 {  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Radius:");
    double enterDoubleNumber = scanner.nextDouble();


    double sum = enterDoubleNumber * 2 * 3.1415;
    System.out.println("Perimeter is = " + sum);


    double sum2 = enterDoubleNumber * enterDoubleNumber  * 3.1415;
    System.out.println("Area is = " + sum2);
}
}


