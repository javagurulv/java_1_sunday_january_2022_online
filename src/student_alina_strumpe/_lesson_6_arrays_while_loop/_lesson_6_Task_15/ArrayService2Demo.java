package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

import java.util.Arrays;

public class ArrayService2Demo {

    public static void main(String[] args){

        ArrayService2 array1 = new ArrayService2();
        int[] myArray = array1.createArray(4);
        int numbers = array1.fillArray(myArray,8);
        System.out.println(Arrays.toString(myArray));
        int replaceAll = array1.replaceALL(myArray,8,2);
        System.out.println(Arrays.toString(myArray));

        ArrayService2 array2 = new ArrayService2();
        int[] myArray2 = {1,2,1,4,1};
        int replaceAll2 = array2.replaceALL(myArray2,1,50);
        System.out.println(Arrays.toString(myArray2));

    }
}
