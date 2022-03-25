package student_ivan_sihovtsov.lesson5.level_4;

import java.util.Random;

import static student_ivan_sihovtsov.lesson5.level_4.Task_28_1.getMin;

public class Task_28 {

    public static void main(String[] args) {

        int[] marks = new int[12];

        Random random = new Random();

        for (int i = 0; i < marks.length; i++) {
            int randomMark = random.nextInt(100) ;
            marks[i] = randomMark;
            System.out.println("Mark[" + (i + 1) + "] = " + marks[i]);
        }

        int min = getMin(marks);
        System.out.println("Minimum number is: " + min);

    }

}
