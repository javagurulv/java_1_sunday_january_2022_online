package student_elina_kucenko.lesson5.level7;

import java.util.Arrays;

class Task28 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.enterSizeLength();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.arrayWithRandomNumbers(array);
        arrayUtil.printArray(array);
        int min = arrayUtil.findMinNumber(array);
        System.out.println("Min number in array: " + min);
    }
}
