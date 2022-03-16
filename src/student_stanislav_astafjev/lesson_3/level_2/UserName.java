package student_stanislav_astafjev.lesson_3.level_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String firstName = scanner.next();
        System.out.println("Hello " + firstName + "!");

    }
}
