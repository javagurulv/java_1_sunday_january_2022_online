package student_yevgeniy_tolks.lesson_2_variables;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        //command to enter name in console
        String name = scanner.nextLine();
        System.out.println("Hello " + name+ "!");
    }
}
