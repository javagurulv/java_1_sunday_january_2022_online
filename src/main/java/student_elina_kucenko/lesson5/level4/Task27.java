package student_elina_kucenko.lesson5.level4;

import java.util.Arrays;

class Task27 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Random numbers in array: " + Arrays.toString(numbers));
        System.out.println("Max number in array: " + max);
    }

}
