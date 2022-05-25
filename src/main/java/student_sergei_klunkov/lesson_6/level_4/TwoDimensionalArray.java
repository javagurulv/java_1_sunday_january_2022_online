package student_sergei_klunkov.lesson_6.level_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {


    public static void main(String[] args) {
        TwoDimensionalArray twoDimArray = new TwoDimensionalArray();


        int[][] twoDimensionalArray = new int[2][];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            twoDimensionalArray[i] = twoDimArray.createInnerArray();
        }
        int sum = twoDimArray.sum(twoDimensionalArray);
        twoDimArray.printArray(twoDimensionalArray);
        System.out.println("Sum=" + sum);

    }


    private void printArray(int [][] twoDimensionalArray){
        for(int[] ints : twoDimensionalArray){
            System.out.println(Arrays.toString(ints));
        }
    }

    public int[] createInnerArray() {
        int [] innerArray = new int[2];
        for (int j = 0; j < innerArray.length; j++) {
            innerArray[j] = (int) (Math.random()*100);
        }
        return innerArray;
    }

    public int sum(int[][] twoDimensionalArray){
        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++){
            int[] innerArray = twoDimensionalArray[i];
            for (int j = 0; j < innerArray.length; j++){
                sum = sum + innerArray[j];
            }
        }
        return sum;
    }

}
