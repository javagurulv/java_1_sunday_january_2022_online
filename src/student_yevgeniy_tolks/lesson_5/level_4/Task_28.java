package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = (int) (Math.random() * 100);
        numbers[1] = (int) (Math.random() * 100);
        numbers[2] = (int) (Math.random() * 100);
        numbers[3] = (int) (Math.random() * 100);
        numbers[4] = (int) (Math.random() * 100);

        int minNumberOfArray = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int arrayNumbers = numbers[i];
            System.out.println(arrayNumbers);
            if (numbers[i] < minNumberOfArray) {
                minNumberOfArray = numbers[i];
            }
        }
        System.out.println("Smallest number is " + minNumberOfArray);

    }
}
