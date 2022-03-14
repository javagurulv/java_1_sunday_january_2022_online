package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task_30 {
    public static void main(String[] args) {


        int[] numbers = new int[5];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd number from created array " + number);
            }
        }
    }
}
