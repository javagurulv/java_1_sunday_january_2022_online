package student_ivan_sihovtsov.lesson_5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumbers = new int[3];

        for (int a = 0; a < randomNumbers.length; a++) {
            int randomNumber = random.nextInt(100);
            randomNumbers[a] = randomNumber;
            System.out.println(randomNumbers[a] );
        }
        System.out.println("--");

        for (int a = 0; a < randomNumbers.length; a++) {
            randomNumbers[a] = randomNumbers[a] + 2;
            System.out.println(randomNumbers[a]);
        }

    }
}
