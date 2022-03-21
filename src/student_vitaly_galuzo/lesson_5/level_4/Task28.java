package student_vitaly_galuzo.lesson_5.level_4;

import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("[" + i +"] = "+ array[i]);
        }
        int minNumberInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( minNumberInArray > array[i]) {
                minNumberInArray = array[i];
            }
        }
        System.out.println("Min number in array: "+ minNumberInArray);


    }


}
