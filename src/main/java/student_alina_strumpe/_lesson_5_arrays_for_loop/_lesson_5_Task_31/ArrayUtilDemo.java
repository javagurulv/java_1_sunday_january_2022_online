package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_31;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args){

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrays = arrayUtil.createNumberArray(4);
        System.out.println(arrays.length);
        System.out.print(Arrays.toString(arrays));

    }



}
