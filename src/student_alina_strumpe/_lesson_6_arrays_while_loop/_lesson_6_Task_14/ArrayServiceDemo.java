package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_14;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

    //    int[] array = new int[]{1,2,3,4,5};
        int[] array = arrayService.createArray(5);
        arrayService.fillArray(array,10);
        boolean replace = arrayService.replaceFirstElementInArray(array, 10, 8);

        System.out.println(Arrays.toString(array) + array[0]);


    }
}
