package student_yevgeniy_tolks.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimArray {

    //1st step - creating new two dim array, returning int [][] array, input with two parameters
    public int[][] twoDimArray(int firstArrayLength, int secondArrayLength) {
        return new int[firstArrayLength][secondArrayLength];
    }

    // 2nd step - filling two dim array with random numbers, entry with one parameter
    public void fillArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 20);
                System.out.print(arr[i][j] + " ");

            }
        }
    }

    //3rd step - sum of all two dim arrays, returning int type sum;
    public int sumTwoDimArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
