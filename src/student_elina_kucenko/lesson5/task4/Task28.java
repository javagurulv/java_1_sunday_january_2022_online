package student_elina_kucenko.lesson5.task4;

import java.util.Arrays;

class Task28 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Random numbers in array: " + Arrays.toString(numbers));
        System.out.println("Min number in array: " + min);
    }
}
