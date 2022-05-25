package student_yevgeniy_tolks.lesson_5.level_5_6;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(12);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.println();
        System.out.println("Max number from the array: " + maxNumber);
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println("Min number from the array: " + minNumber);
    }
}
