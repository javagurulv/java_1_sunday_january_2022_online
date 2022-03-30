package student_sergei_klunkov.lesson_5.level_5;

import java.util.Arrays;

class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(3);
        System.out.println(Arrays.toString(array));
        arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.println(Arrays.toString(array));
        arrayUtil.printArrayToConsole(array);
        System.out.println();
        int maxArray = arrayUtil.findMaxNumber(array);
        System.out.println("Maximum number is " + maxArray);
        int minArray = arrayUtil.findMinNumber(array);
        System.out.println("Minimal number is " + minArray);


    }

}
