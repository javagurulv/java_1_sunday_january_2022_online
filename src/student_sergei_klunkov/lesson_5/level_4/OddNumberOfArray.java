package student_sergei_klunkov.lesson_5.level_4;

import java.util.Random;

class OddNumberOfArray {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i +"] = "+ array[i]);

        }

        for (int i = 0; i < array.length; i++) {
            if ( array[i] %2 != 0) {
                System.out.println("Odd number is: "+ array[i]);
            }
        }
    }

}
