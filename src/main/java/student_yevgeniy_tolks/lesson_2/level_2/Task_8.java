package student_yevgeniy_tolks.lesson_2.level_2;

import java.util.Scanner;

 class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        //command to enter name in next line of console
        String name = scanner.nextLine();
        System.out.println("Hello " + name+ "!");
    }
}
