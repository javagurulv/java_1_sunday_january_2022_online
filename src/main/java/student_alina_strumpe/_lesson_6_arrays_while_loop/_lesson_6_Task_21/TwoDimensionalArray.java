package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_21;

import java.util.Arrays;
import java.util.Random;

 class TwoDimensionalArray {

 private int sum;

public int[][] createArray(int rowLength,int columnLength){return new int[rowLength] [columnLength];}

    public void fillArrayRandomValue(int[][] array){

        Random random = new Random();
     //   int array[][] = new int[random.nextInt(10)+1][];
        for(int i=0; i< array.length; i++){
            array[i] = new int[random.nextInt(3)+1];
            for(int j=0; j< array[i].length; j++){
                array[i][j] = random.nextInt(9);
            }
        }
    }

    public int calculateSumAllValues(int[][] array){
     //   int elemValue = array.length;
        int sum = 0;
        for(int i=0;i< array.length;i++){
            for(int j=0; j< array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
  public void printArray(int[][] array,int sum){
    this.sum = sum;
    System.out.println("Array "+ Arrays.deepToString(array)+", sum= "+sum);
  }

    }
