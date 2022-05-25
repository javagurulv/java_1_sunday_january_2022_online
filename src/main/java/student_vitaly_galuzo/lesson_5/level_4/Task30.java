package student_vitaly_galuzo.lesson_5.level_4;

import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("[" + i +"] = "+ array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if ( array[i] %2 != 0) {
                System.out.println("Uneven numbers in array: "+ array[i]);
            }
        }
    }

}
