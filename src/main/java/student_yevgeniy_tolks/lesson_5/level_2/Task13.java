package student_yevgeniy_tolks.lesson_5.level_2;

import java.util.Arrays;

class Task13 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() * 100);
        numbers[1] = (int) (Math.random() * 100);
        numbers[2] = (int) (Math.random() * 100);
        int sumOfNumbers = numbers[0] + numbers[1] + numbers[2];

        System.out.println(sumOfNumbers + " = Sum of  " + Arrays.toString(numbers));
    }
}
