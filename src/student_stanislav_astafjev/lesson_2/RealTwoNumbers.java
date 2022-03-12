package student_stanislav_astafjev.lesson_2;

import java.util.Scanner;

public class RealTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first double number: ");
        double firstDoubleNumber = scanner.nextDouble();


        System.out.println("Enter second double number: ");
        double secondDoubleNumber = scanner.nextDouble();


        double sum = firstDoubleNumber + secondDoubleNumber;
        System.out.println("Sum + " + sum);


        double difference = firstDoubleNumber - secondDoubleNumber;
        System.out.println("Difference - "  + difference);


        double multiplication = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Multiplication * " + multiplication);


        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Division / " + division);



    }


}


