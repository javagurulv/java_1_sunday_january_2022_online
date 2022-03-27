package student_elina_kucenko.lesson6.level4.task21;

import java.util.Arrays;

import static java.lang.Math.random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimArray = new TwoDimensionalArray();

        int[][] twoDimensionalArray = new int[4][];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            twoDimensionalArray[i] = twoDimArray.createInnerArray();
        }
        int sum = twoDimArray.sum(twoDimensionalArray);
        twoDimArray.printArray(twoDimensionalArray);
        System.out.println("Sum=" + sum);
    }

    private void printArray(int[][] twoDimensionalArray) {
        for (int[] ints : twoDimensionalArray) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public int[] createInnerArray() {
        int[] innerArray = new int[2];
        for (int j = 0; j < innerArray.length; j++) {
            innerArray[j] = (int) (Math.random() * 100);
        }
        return innerArray;
    }

    public int sum(int[][] twoDimArray) {
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            int[] innerArray = twoDimArray[i];
            for (int j = 0; j < innerArray.length; j++) {
                sum = sum + innerArray[j];
            }
        }
        return sum;
    }
}
