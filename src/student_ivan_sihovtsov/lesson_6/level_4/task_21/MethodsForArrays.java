package student_ivan_sihovtsov.lesson_6.level_4.task_21;

import java.util.Random;

public class MethodsForArrays {


    public static int[][] creatingDoubleArray(int firstArray, int secondArray) {
        int[][] arr = new int[firstArray][secondArray];
        return arr;
    }

    public static void fillingDoubleArrayWithRandomNumbers(Random random, int[][] arr, int bound) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(bound);
            }
        }
    }

    public static int calculatingTheSumOfDoubleArrays(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void outputSumOnConsole(int sum) {
        System.out.println("The sum of the numbers in a two-dimensional array is: " + sum);
    }





}
