package student_elina_kucenko.lesson2.level2;

import java.util.Scanner;

public class Task8Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type your name");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
