package student_vitaly_galuzo.lesson_5.level_2;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            System.out.println("[" + i + "] = " + numbers[i]);

        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println("[" + i + "] = " + numbers[i]);

        }

    }
}