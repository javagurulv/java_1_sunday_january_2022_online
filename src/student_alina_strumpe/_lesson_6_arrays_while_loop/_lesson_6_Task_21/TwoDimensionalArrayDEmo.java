package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_21;

import java.util.Arrays;

 class TwoDimensionalArrayDEmo {

    public static void main(String[] args) {

       TwoDimensionalArray demArray = new TwoDimensionalArray();
        int [][] array = demArray.createArray(3,3);
        demArray.fillArrayRandomValue(array);
        int sumResult = demArray.calculateSumAllValues(array);
        demArray.printArray(array,sumResult);



/*        int sum = 0;
        int[][] mas = new int[4][4];
        mas[0][0] = 1;
        mas[0][1] = 1;
        mas[0][2] = 1;
        mas[0][3] = 1;
        mas[1][0] = 1;
        mas[1][1] = 1;
        mas[1][2] = 1;
        mas[1][3] = 1;
        mas[2][0] = 1;
        mas[2][1] = 1;
        mas[2][2] = 1;
        mas[2][3] = 1;
        mas[3][0] = 1;
        mas[3][1] = 1;
        mas[3][2] = 1;
        mas[3][3] = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[3][3];
            }

            System.out.println(sum);

        }*/

    }
}
