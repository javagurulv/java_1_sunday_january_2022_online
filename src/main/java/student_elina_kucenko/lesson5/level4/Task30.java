package student_elina_kucenko.lesson5.level4;

import java.util.Arrays;
import java.util.Random;

class Task30 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Random numbers in array: " + Arrays.toString(numbers));

        for (int notEvenNumbers : numbers) {
            if (notEvenNumbers % 2 != 0) {
                System.out.println("Not even numbers in array are " + notEvenNumbers);
            }

        }
    }

}
