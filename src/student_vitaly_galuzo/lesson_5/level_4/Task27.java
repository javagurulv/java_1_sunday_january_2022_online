package student_vitaly_galuzo.lesson_5.level_4;

import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        Random random = new Random();
      int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("[" + i +"] = "+ array[i]);
        }
        int maxNumberInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( maxNumberInArray < array[i]) {
                maxNumberInArray = array[i];
            }
        }
        System.out.println("Max number in array: "+ maxNumberInArray);

    }

}
