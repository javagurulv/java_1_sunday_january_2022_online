package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task29 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Even number from created array " + numbers[i]);
            }
        }
    }
}
