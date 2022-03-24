package student_devids_kropacovs.lesson6.level4.task21;

import java.util.Random;

class TwoDimensionalArray {
    int [][]arr;

    public int [][] createTwoDimensionalArray(int firsNumber, int secondNumber){
        return arr = new int[firsNumber][secondNumber];
    }

    public void fillTwoDimensionalArrayWithRandomNumbers(int [][] arr){
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++ ){
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    public int sumOfTwoDimensionalArray(int [][] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++ ){
                sum = arr[i][j] + sum;
            }
        }

        return sum;
    }

}
