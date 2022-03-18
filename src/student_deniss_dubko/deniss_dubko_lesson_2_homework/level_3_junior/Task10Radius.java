package student_deniss_dubko.deniss_dubko_lesson_2_homework.level_3_junior;

import java.util.Scanner;

public class Task10Radius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius:");

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }


}
