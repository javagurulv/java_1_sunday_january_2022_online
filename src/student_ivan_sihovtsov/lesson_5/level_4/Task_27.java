package student_ivan_sihovtsov.lesson_5.level_4;

import java.util.Random;

import static student_ivan_sihovtsov.lesson_5.level_4.Task_27_1.getMax;

public class Task_27 {
    public static void main(String[] args) {

        int[] marks = new int[12];

        Random random = new Random();

        for (int i = 0; i < marks.length; i++) {
            int randomMark = random.nextInt(100) ;
            marks[i] = randomMark;
            System.out.println("Mark[" + (i + 1) + "] = " + marks[i]);
        }

        int max = getMax(marks);
        System.out.println("Maximum number is: " + max);
    }
}
