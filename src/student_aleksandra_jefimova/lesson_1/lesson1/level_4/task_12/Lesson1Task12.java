package student_aleksandra_jefimova.lesson_1.lesson1.level_4.task_12;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Переменные не стоит называть a,b,d ... "
		+ "такие названия ничего не говорят о том, для чего эта"
		+ "переменная создана и что в ней хранится.")
class Lesson1Task12 {
    public static void main(String[] args)
    {
		// Не стоит создавать то что ты не используешь! Scanner тут не нужен.
        Scanner input = new Scanner (System.in);
        int a = 50;
        int b = 3;
        int d = (a*b);
        System.out.println();
        System.out.println(+d);
    }
}

