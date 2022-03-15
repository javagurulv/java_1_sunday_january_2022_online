package student_kristina_manevica.lesson_2.level_2;

import java.util.Scanner;

public class HelloKristina {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
    }
}
