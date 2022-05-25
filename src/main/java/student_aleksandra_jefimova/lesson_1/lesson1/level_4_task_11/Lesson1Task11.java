package student_aleksandra_jefimova.lesson_1.lesson1.level_4_task_11;
import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Переменные не стоит называть a,b,d ... "
		+ "такие названия ничего не говорят о том, для чего эта"
		+ "переменная создана и что в ней хранится.")
class Lesson1Task11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is:" +d);
    }
}


