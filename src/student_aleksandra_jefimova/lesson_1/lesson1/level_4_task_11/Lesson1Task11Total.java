package student_aleksandra_jefimova.lesson_1.lesson1.level_4_task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Переменные не стоит называть a,b,d ... "
		+ "такие названия ничего не говорят о том, для чего эта"
		+ "переменная создана и что в ней хранится.")
class Lesson1Task11Total {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // объект класса Scanner
        System.out.println("Введите число А = ");
        int a = scn.nextInt(); // считываем первое введенное число
        System.out.println("Введите число В = ");
        int b = scn.nextInt();
        System.out.println( + (a+b)); // что эта запись означает?
    }
}


