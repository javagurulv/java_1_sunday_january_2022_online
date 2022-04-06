package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_17_Sort;

 class ArraySortingTest {

    public static void main(String[] args){

        ArraySortingTest test = new ArraySortingTest();

    }

    public void shouldSortArray(){
        ArraySorting arraySorting = new ArraySorting();
        int[] testArray = new int[]{1,2,3,4,5};
        boolean expectedResult = true;
        arraySorting.bubbleSort(testArray);

    }
}
