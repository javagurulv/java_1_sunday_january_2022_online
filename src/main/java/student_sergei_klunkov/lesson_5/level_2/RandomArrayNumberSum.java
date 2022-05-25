package student_sergei_klunkov.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;


class RandomArrayNumberSum {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextInt(99);
            System.out.println("[" + i +"] = " + numbers[i]);
        }

        int sum = (numbers[0]+numbers[1]+numbers[2]);
        System.out.println("Sum = " + sum);

    }
}
