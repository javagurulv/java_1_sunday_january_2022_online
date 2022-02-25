package student_elina_kucenko.lesson2.level3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Radius");
        Double radius = scanner.nextDouble();
        double perimeter = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);


    }
}
