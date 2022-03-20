package student_elina_kucenko.lesson5.level2;

import java.util.Arrays;

class Task13 {

    public static void main(String[] args) {
        double[] numbers = new double[3];

        numbers[0] = Math.random() * 100;
        numbers[1] = Math.random() * 100;
        numbers[2] = Math.random() * 100;
        double sum = numbers[0] + numbers[1] + numbers[2];

        System.out.println("Random numbers are: " + Arrays.toString(numbers));
        System.out.println("Sum of random numbers: " + sum);
    }
}
