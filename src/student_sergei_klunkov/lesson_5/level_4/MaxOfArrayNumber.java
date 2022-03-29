package student_sergei_klunkov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class MaxOfArrayNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i +"] = "+ array[i]);

        }

        int maxNumberInArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if ( maxNumberInArray < array[i]) {
                maxNumberInArray = array[i];

            }
        }

        System.out.println("Maximum number: " + maxNumberInArray);

    }
}

