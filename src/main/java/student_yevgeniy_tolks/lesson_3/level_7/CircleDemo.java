package student_yevgeniy_tolks.lesson_3.level_7;

import java.util.Scanner;
//Task 30 - calculate the Area
public class CircleDemo {

    public static void main(String[] args) {

        Circle circle=new Circle();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius = ");
        double radiusValue = scanner.nextDouble();

        System.out.print("Calculated area = ");
        double area = circle.calculateArea(radiusValue);
        System.out.println(area);

    }
}
