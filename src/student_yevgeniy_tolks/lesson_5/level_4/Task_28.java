package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            int arrayNumbers = numbers[i];
            System.out.println(arrayNumbers);

        }
        //pass array numbers to string
        System.out.println(Arrays.toString(numbers));

        int minNumber = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Smallest number in array: " + minNumber);
    }
}
