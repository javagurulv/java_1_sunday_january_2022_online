package student_aleksandra_jefimova.lesson_2;

import java.util.Scanner;

public class Task10_circle {
    public static void main(String[] args) {
        System.out.println("Enter circle radius: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double p = 3.14159;
        System.out.println("Perimeter= "+2*p*r);
        System.out.println("Space= "+p*r*r);

    }

}
