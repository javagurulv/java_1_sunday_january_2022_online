package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_28;

import java.util.Random;

public class RanNumAndMin {

    public static void main(String[] args) {

        Random random = new Random();

        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            int randomNumbers = random.nextInt(100);
            mas[i] = randomNumbers;
            System.out.println("["+i+"] = " + mas[i]);
        }
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];

            }
        }
        System.out.println("min = " + min);
    }
}