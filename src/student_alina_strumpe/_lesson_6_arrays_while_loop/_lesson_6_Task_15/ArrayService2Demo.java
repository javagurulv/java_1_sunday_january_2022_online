package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

import java.util.Arrays;

 class ArrayService2Demo {

    public static void main(String[] args){

        ArrayService2 array1 = new ArrayService2();
        int[] myArray = array1.createArray(4);
        array1.fillArray(myArray,8);
        int result = array1.replaceALL(myArray,8,2);
        array1.printArray(myArray,8,2);


        ArrayService2 array2 = new ArrayService2();
         int[] myArray2 = array2.createArray(6);
        array2.fillArray(myArray2,11);
        int result2 = array2.replaceALL(myArray2,11,50);
        array2.printArray(myArray2,11,50);

    }
}
