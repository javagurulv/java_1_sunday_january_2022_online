package student_ivan_sihovtsov.lesson_5.level_2;

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumbers = new int[3];

        for (int a = 0; a < randomNumbers.length; a++) {
            int randomNumber = random.nextInt(100);
            randomNumbers[a] = randomNumber;
        }

        int sum = (randomNumbers[0] + randomNumbers[1] + randomNumbers[2]) / 3;
        System.out.println(sum);
    }

}
