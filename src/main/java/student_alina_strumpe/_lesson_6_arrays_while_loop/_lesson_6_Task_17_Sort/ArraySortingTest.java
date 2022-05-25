package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_17_Sort;

 class ArraySortingTest {

     public static void main(String[] args) {

         ArraySortingTest test = new ArraySortingTest();
            test.shouldBubbleSortArray();
            test.shouldSortArrayAscending1();
            test.shouldSortArrayAscending2();
            test.shouldSortArrayAscending1FromIndexToIndex();
            test.shouldSortArrayDescending();
     }

     public void shouldBubbleSortArray() {
         ArraySorting arraySorting = new ArraySorting();
         int[] testArray = new int[]{2, 1, 3, 99, 17}; // 1,2,3,17,99
         arraySorting.bubbleSort(testArray);
         if (testArray[4] == 99) {
             System.out.println("Test should sorted (by Bubble method) an array ascending 1 is OK");
         } else {
             System.out.println("\"Test should sorted (by Bubble method) an array ascending 1 is FAIL\"");
         }
     }

     public void shouldSortArrayAscending1(){
         ArraySorting arraySorting = new ArraySorting();
         int[] testArray = new int[]{4,1,6,9,2};// 1,2,4,6,9
         arraySorting.sortArrayAscending1(testArray);
        if(testArray[2] == 4){
            System.out.println("Test should sorted an array ascending 1 is OK");
        } else {
            System.out.println("\"Test should sorted an array ascending 1 FAIL\"");
         }
     }

     public void shouldSortArrayAscending2(){
         ArraySorting arraySorting = new ArraySorting();
         int[] testArray = new int[]{99,77,55,33,11}; // 11,33,55,77,99
         arraySorting.sortArrayAscending2(testArray);
         if(testArray[0] == 11){
             System.out.println("Test should sorted an array ascending 2 is OK");
         } else {
             System.out.println("\"Test should sorted an array ascending 2 FAIL\"");
         }
     }

     public void shouldSortArrayAscending1FromIndexToIndex(){
         ArraySorting arraySorting = new ArraySorting();
         int[] testArray = new int[]{99,77,55,33,11,66,22,88,99}; // 11,33,66
         arraySorting.sortArrayAscending1FromIndexToIndex(testArray);
         if(testArray[3] == 11 && testArray[5] == 66){
             System.out.println("Test should sorted an array ascending *From Index To*  is OK");
         } else {
             System.out.println("\"Test should sorted an array ascending *From Index To* is  FAIL\"");
         }
     }

     public void shouldSortArrayDescending(){
         ArraySorting arraySorting = new ArraySorting();
         int[] testArray = new int[]{9,7,5,3,1,6,2,8,99};
         arraySorting.sortArrayDescending(testArray);
         if(testArray[0] == 99){
             System.out.println("Test should sorted an array descending is OK");
         } else {
             System.out.println("\"Test should sorted an array descending is  FAIL\"");
         }
     }


 }

