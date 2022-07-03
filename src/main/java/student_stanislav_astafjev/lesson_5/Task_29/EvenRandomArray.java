package student_stanislav_astafjev.lesson_5.Task_29;

import java.util.Random;


public class EvenRandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int boundary = 100;

        int a = random.nextInt(boundary);

        System.out.println("Creating array of " + a + " length");
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int number = random.nextInt(boundary);
            if (number % 2 == 0) {
                System.out.println(number);
            }
            arr[i] = number;
        }
    }

}
