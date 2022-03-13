package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task_29 {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            if (numbers[i] % 2 == 0) {
                int evenNumbers = numbers[i];
                System.out.println("Even number from array " + evenNumbers);
            }
        }
        System.out.print("Random numbers array " + Arrays.toString(numbers));
    }
}

