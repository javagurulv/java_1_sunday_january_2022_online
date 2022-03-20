package student_elina_kucenko.lesson5.level2;

import java.util.Arrays;

class Task12 {

    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = Math.random() * 100;
        numbers[1] = Math.random() * 100;
        numbers[2] = Math.random() * 100;

        System.out.println("Array include random numbers: " + Arrays.toString(numbers));
    }
}
