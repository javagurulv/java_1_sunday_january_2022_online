package student_vitaly_galuzo.lesson_5.level_5;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        System.out.println(Arrays.toString(array));
        arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.println(Arrays.toString(array));













    }

}
