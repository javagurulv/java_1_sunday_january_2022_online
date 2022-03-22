package student_ivan_sihovtsov.lesson5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumbers = new int[3];

        for (int a = 0; a < randomNumbers.length; a++) {
            int randomNumber = random.nextInt(100);
            randomNumbers[a] = randomNumber;
        }
        System.out.println(randomNumbers[0]);
        System.out.println(randomNumbers[1]);
        System.out.println(randomNumbers[2]);

        System.out.println();

        System.out.println(randomNumbers[0] + 2);
        System.out.println(randomNumbers[1] + 2);
        System.out.println(randomNumbers[2] + 2);

    }

}
