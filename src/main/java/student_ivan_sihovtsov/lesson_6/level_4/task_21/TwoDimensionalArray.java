package student_ivan_sihovtsov.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] arr = MethodsForArrays.creatingDoubleArray(4,4);
        MethodsForArrays.fillingDoubleArrayWithRandomNumbers(random, arr, 50);
        int sum = MethodsForArrays.calculatingTheSumOfDoubleArrays(arr);
        MethodsForArrays.outputSumOnConsole(sum);
    }
}
