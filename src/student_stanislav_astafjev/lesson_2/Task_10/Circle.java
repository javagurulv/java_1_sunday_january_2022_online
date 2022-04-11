package student_stanislav_astafjev.lesson_2.Task_10;

import java.util.Scanner;

public class Circle {

        static Scanner sc = new Scanner(System.in);
        public static void main (String[]args)
    {
        System.out.println("Enter circle radius: ");

        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("area of the circle: " + area);
        Double circumference = Math.PI * 2 * radius;
        System.out.println("circumference is equal to: " + circumference);
    }

}