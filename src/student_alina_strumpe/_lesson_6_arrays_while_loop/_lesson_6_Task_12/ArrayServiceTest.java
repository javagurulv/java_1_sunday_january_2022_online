package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_12;

 class ArrayServiceTest {

     public static void main(String[] args) {

         ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
         arrayServiceTest.shouldFindNumberInArray();
         arrayServiceTest.notShouldFindNumberInArrayTest2();

     }


     public void shouldFindNumberInArray() {
         ArrayService contains = new ArrayService();
         int[] testArray = {1,2,3,4,5,6};
         int numberToSearch = 1;
         contains.containsInArrayTheNumber(testArray,numberToSearch);
         System.out.println("The searching number is = "+numberToSearch);
     }


    public void notShouldFindNumberInArrayTest2() {
        ArrayService contains = new ArrayService();
        int[] testArray = {10, 20, 40, 50, 77};
        int numberToSearch = 100;
        contains.containsInArrayTheNumber(testArray, numberToSearch);
        System.out.println("The searching number is = "+numberToSearch);
    }
}



