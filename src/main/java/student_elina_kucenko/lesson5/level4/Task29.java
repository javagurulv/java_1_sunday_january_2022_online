package student_elina_kucenko.lesson5.level4;

import java.util.Arrays;

class Task29 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Random numbers in array: " + Arrays.toString(numbers));

        for (int evenNumber : numbers) {
            if (evenNumber % 2 == 0) {
                System.out.println("Even number in array: " + evenNumber);

            }
        }

    }
}


