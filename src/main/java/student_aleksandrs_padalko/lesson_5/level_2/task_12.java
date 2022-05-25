package student_aleksandrs_padalko.lesson_5.level_2;

import java.util.Arrays;


class task_12 { public static void main(String[] args) {
    double[] numbers = new double[3];
    numbers[0] = ((double)Math.random() * 3);
    numbers[1] = ((double)Math.random() * 3);
    numbers[2] = ((double)Math.random() * 3);
    System.out.println("Array include random numbers " + Arrays.toString(numbers));
}}

