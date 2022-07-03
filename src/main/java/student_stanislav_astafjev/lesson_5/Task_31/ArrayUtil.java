package student_stanislav_astafjev.lesson_5.Task_31;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int findMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) if (maxNumber < array[i]) maxNumber = array[i];
        System.out.println("Max number " + maxNumber);
        return maxNumber;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(100);
            array[i] = number;
        }
    }
}

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        int[] array = ArrayUtil.createArray(5);
        boolean result = array.getClass().isArray();
        System.out.println("Is this an array? - " + result);
    }

    public void shouldFindMaxNumber() {
        int targetMaxNumber = 175;
        int[] array = {41, 51, 23, targetMaxNumber};

        int result = ArrayUtil.findMaxNumber(array);
        if (result == targetMaxNumber) {
            System.out.println("Both numbers check out");
        } else {
            System.out.println("Max number is wrong");
        }
        System.out.println(targetMaxNumber + " vs " + result);
    }
}
