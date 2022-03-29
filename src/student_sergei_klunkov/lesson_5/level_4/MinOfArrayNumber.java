package student_sergei_klunkov.lesson_5.level_4;

import java.util.Random;

class MinOfArrayNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i +"] = "+ array[i]);

        }

        int minNumberInArray = array[0];

        for (int i = 0; i < array.length; i++) {
            if ( minNumberInArray > array[i]) {
                minNumberInArray = array[i];

            }
        }

        System.out.println("Minimal number: " + minNumberInArray);

    }

}
