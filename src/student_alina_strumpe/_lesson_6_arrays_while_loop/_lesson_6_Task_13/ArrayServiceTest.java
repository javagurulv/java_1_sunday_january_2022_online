package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

 class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.findOccurrence();
        arrayServiceTest.findOccurrence2NegativeTest();
        arrayServiceTest.findOccurrence3NegativeTest();
        arrayServiceTest.findOccurrence4NegativeTest();
    }

    public void findOccurrence() {
        int[] testArray = {2, 2, 2, 2, 5, 5, 9, 6};
        check(4, testArray, "Positive test Find Occurrence ");
    }

    public void findOccurrence2NegativeTest(){
        int[] testArray = {2,2,2,2,6,8,9,9,10,10};
        check2(1,testArray,"Negative test Find  Occurrence ");
    }

    public void findOccurrence3NegativeTest(){
        int[] testArray = {0,0,0,0,0};
        check2(1,testArray,"Negative test Find  Occurrence ");
    }

    public void findOccurrence4NegativeTest(){
        int[] testArray = {0,0,0,0,0};
        check(0,testArray,"Positive test Find  Occurrence ");
    }


    public void check(int expectedResult, int[] testArray, String testName) {
        ArrayServices arrayServices = new ArrayServices();
        if (expectedResult == arrayServices.occurrenceInArray(testArray, 2)) {
            System.out.println("Test: " + testName + " is OK");
        } else {
            System.out.println( "Test: "+testName + " is FAIL");
        }
    }

    public void check2(int expectedResult, int[] testArray, String testName) {
        ArrayServices arrayServices = new ArrayServices();
        if (expectedResult != arrayServices.occurrenceInArray(testArray, 2)) {
            System.out.println("Test " + testName + " is OK");
        } else {
            System.out.println("Test " + testName + " is FAIL");
        }
    }
}