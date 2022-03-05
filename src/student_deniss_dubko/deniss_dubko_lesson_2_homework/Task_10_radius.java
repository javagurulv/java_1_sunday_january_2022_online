package student_deniss_dubko.deniss_dubko_lesson_2_homework;

import java.util.Scanner;

public class Task_10_radius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius:");

        double r = scanner.nextDouble();

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Perimeter is =" + perimeter);
        System.out.println("Area is =" + area);


    }


}
