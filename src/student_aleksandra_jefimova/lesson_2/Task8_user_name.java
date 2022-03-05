package student_aleksandra_jefimova.lesson_2;

import java.util.Scanner;

public class Task8_user_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String name = scanner.next();
        System.out.println("Hello" + " " + name + "!");

    }
}
