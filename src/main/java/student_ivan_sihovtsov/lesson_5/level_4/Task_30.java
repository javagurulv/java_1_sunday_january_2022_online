package student_ivan_sihovtsov.lesson_5.level_4;

import java.util.Random;

public class Task_30 {

    public static void main(String[] args) {

        int[] marks = new int[12];

        Random random = new Random();

        for (int i = 0; i < marks.length; i++) {
            int randomMark = random.nextInt(100) ;
            marks[i] = randomMark;
            System.out.println("Mark[" + (i + 1) + "] = " + marks[i]);
        }

        System.out.println();
        System.out.println("Odd numbers is:");
        System.out.println();

        for(int i = 0;i < marks.length; i++)
        {
            if(marks[i] % 2 == 0)
            {

            }else {
                System.out.println("Mark:[" + (i+1) + "]; Number: " + marks[i]);
            }
        }

    }

}
