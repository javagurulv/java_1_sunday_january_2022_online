package student_yevgeniy_tolks.lesson_5.level_2;

import java.util.Arrays;

class Task14 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() * 100);
        numbers[1] = (int) (Math.random() * 100);
        numbers[2] = (int) (Math.random() * 100);
        int meanOfNumbers = (numbers[0] + numbers[1] + numbers[2])/ numbers.length;

        System.out.println(meanOfNumbers + " = mean value42 from  " + Arrays.toString(numbers));
    }
}
