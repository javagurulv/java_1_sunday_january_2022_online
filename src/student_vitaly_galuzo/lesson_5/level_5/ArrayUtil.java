package student_vitaly_galuzo.lesson_5.level_5;

import java.util.Random;

public class ArrayUtil {


Random random = new Random();


public double calculate (int arrayCount) {   //code refactoring
    int[] array = createArray(arrayCount);
    fillArrayWithRandomNumbers(array);
    printArrayToConsole(array);
    return array[arrayCount];



}

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i +"] = "+ array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

















}


































