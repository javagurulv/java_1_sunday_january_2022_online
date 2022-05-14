package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_5_6_middle.task_31_38;

class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int maxArrayElement = arrayUtil.findMaxNumber(array);
        System.out.println("Max Element of the array: " + maxArrayElement);
        int minArrayElement = arrayUtil.findMinNumber(array);
        System.out.println("Min Element of the array: " + minArrayElement);
    }

}
