package student_stanislav_astafjev.lesson_11.lesson.Task_2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

class ArrayUtilImpl implements ArrayUtil {
    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int randomValue = new Random().nextInt(11);
            array[count] = randomValue;
        }

    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));

    }

    @Override
    public int findMaxNumber(int[] array) {
        int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }

    @Override
    public int findMinNumber(int[] array) {
        int minValue = -1;
        OptionalInt min = Arrays.stream(array).min();
        if (min.isPresent()) {

        }
        return minValue;
    }
}
