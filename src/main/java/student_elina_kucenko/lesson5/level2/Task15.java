package student_elina_kucenko.lesson5.level2;

import java.util.Arrays;

class Task15 {

    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = Math.random() * 100;
        numbers[1] = Math.random() * 100;
        numbers[2] = Math.random() * 100;
        System.out.println("Random numbers are: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("Random numbers increased by 2: " + numbers[i]);

        }

    }
}
