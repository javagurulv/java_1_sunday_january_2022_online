package student_yevgeniy_tolks.lesson_2_variables;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        double radius = scanner.nextDouble();

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = "+ area);

    }
}
