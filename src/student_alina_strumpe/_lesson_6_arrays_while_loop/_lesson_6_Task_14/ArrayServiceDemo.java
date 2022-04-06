package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_14;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        ArrayService arrayService2 = new ArrayService();


        int[] array = arrayService.createArray(4);
        arrayService.fillArray(array,10);
        boolean replace = arrayService.replaceFirstElementInArray(array, 10, 8);
        arrayService2.printArray(array,10,8);

        int[] array2 = arrayService.createArray(6);
        arrayService.fillArray(array2,5);
        boolean replace2 = arrayService2.replaceFirstElementInArray(array2, 5, 100);
        arrayService2.printArray(array2,5,100);


    }
}
