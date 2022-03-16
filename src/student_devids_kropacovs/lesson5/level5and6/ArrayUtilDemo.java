package student_devids_kropacovs.lesson5.level5and6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.fillArrayWithRandomNumbers(arrayUtil.createArray(5));
        arrayUtil.printArrayToConsole(arrayUtil.numbers);
        System.out.println(arrayUtil.findMaxNumber(arrayUtil.numbers));
        System.out.println(arrayUtil.findMinNumber(arrayUtil.numbers));
    }
}
