package student_aleksandra_jefimova.lesson_2.level_3.task_9.task_10.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task9_multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int b = i;  // зачем тут нужна переменная b?
            System.out.println(a + "x" + b + "=" + a * b);

        }

    }
}

