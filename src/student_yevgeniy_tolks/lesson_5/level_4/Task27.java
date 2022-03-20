package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;

class Task27 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int maxNumberInArray = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);
            int arrayNumbers = numbers[i];
            System.out.println(arrayNumbers);

            if (numbers[i] > maxNumberInArray) {
                maxNumberInArray = numbers[i];
            }
        }
        System.out.println("1st Option - Largest number in array: " + maxNumberInArray);
        //pass array numbers to string
        System.out.println(Arrays.toString(numbers));
        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("2nd Option - Largest number in array: " + maxNumber);
    }
}

