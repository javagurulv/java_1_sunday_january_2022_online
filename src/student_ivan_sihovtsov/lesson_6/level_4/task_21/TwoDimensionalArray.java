package student_ivan_sihovtsov.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        //- создайте двумерный массив;
        //- заполните двумерный массив случайными числами;
        //- посчитайте сумму всех чисел в двумерном массиве.
        Random random = new Random();

        int[][] arr = new int[2][2];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0;i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of the numbers in a two-dimensional array is: " + sum);

    }

}


//for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
