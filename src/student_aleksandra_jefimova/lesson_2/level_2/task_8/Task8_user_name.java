package student_aleksandra_jefimova.lesson_2.level_2.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task8_user_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String name = scanner.next();
        System.out.println("Hello" + " " + name + "!");

    }
}
