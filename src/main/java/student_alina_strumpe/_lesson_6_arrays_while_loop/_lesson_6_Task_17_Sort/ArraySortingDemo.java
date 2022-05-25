package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_17_Sort;



import java.util.Arrays;

public class ArraySortingDemo {

    public static void main(String[] args){

        ArraySorting arraySorting = new ArraySorting();
        int[] array = arraySorting.createArray(10);

        arraySorting.fillArrayRandomV(array);
        arraySorting.printFilledArray1(array);

        arraySorting.bubbleSort(array);
        arraySorting.printSortedArray2(array);

        arraySorting.reversArray(array);
       arraySorting.printReversedArray3(array);

        arraySorting.sortArrayAscending1(array);
        arraySorting.printSortedArray2(array);

        arraySorting.reversArray(array);
        arraySorting.printReversedArray3(array);

        arraySorting.sortArrayAscending2(array);
        arraySorting.printSortedArray2(array);

        arraySorting.sortArrayDescending(array);
        arraySorting.printSortedArray2(array);

        arraySorting.sortArrayAscending1FromIndexToIndex(array);
        arraySorting.printSortedArray2(array);

      /*  ArraySorting arraySorting1 = new ArraySorting();
        int[] da = arraySorting1.createArray(5);
        arraySorting1.fillArrayRandomV(da);
        arraySorting1.printFilledArray1(da);

        arraySorting1.bubbleSort(da);
        arraySorting1.printSortedArray2(da);

        arraySorting.bubbleSort2(da);
        arraySorting1.printSortedArray2(da);

        arraySorting1.reversArray(da);
        arraySorting1.printReversedArray3(da);
*/
    }


}
