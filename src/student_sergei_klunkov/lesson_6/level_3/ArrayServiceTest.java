package student_sergei_klunkov.lesson_6.level_3;

class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.notContainsTest();
        arrayServiceTest.countOccurrencesTestPositive();
        arrayServiceTest.countOccurrencesTestNegative();
        arrayServiceTest.countOccurrencesTestSecondNegative();
        arrayServiceTest.countOccurrencesTestThirdNegative();
        arrayServiceTest.replaceFirstTest();
        arrayServiceTest.notReplaceFirstTest();
        arrayServiceTest.replaceAllTest();
        arrayServiceTest.notReplaceAllTest();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortingTest();


    }

    public void containsTest(){
        ArrayService contains = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        boolean found = true;
        if (found == contains.contains(testArray,1)){
            System.out.println(" Contains Test -  Passed! ");
        } else {
            System.out.println(" Contains Test -  Failed! ");
        }
    }

    public void notContainsTest(){
        ArrayService contains = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        boolean found = true;
        if (found == contains.contains(testArray,10)){
            System.out.println(" Not Contains Test -  Passed!");
        } else {
            System.out.println(" Not Contains Test -  Failed! ");
        }
    }

    public void countOccurrencesTestPositive(){
        ArrayServiceTest countTest = new ArrayServiceTest();
        int[] testArray = {3, 5, 6, 3, 5, 3, 3};
        check(4,testArray," Positive Occurrences Test ");
    }

    public void countOccurrencesTestNegative(){
        ArrayServiceTest countTest = new ArrayServiceTest();
        int[] testArray = {3, 5, 6, 3, 5, 3, 3};
        check2(2,testArray," Negative Occurrences Test ");
    }

    public void countOccurrencesTestSecondNegative(){
        ArrayServiceTest countTest = new ArrayServiceTest();
        int[] testArray = {0, 0, 0, 0, 0, 0, 0};
        check(0,testArray," Positive Occurrences Test ");
    }

    public void countOccurrencesTestThirdNegative(){
        ArrayServiceTest countTest = new ArrayServiceTest();
        int[] testArray = {0, 0, 0, 0, 0, 0, 0};
        check2(2,testArray," Negative Occurrences Test ");
    }

    public void check(int expectedResult, int[] testArray, String testName){
        ArrayService arrayService = new ArrayService();

        if (expectedResult == arrayService.countOccurrences(testArray, 3)) {
            System.out.println(" Test " + testName + " has passed! " );
        } else {
            System.out.println(" Test " + testName + " has failed! ");

        }
    }

    public void check2(int expectedResult, int[] testArray, String testName){
        ArrayService arrayService = new ArrayService();

        if (expectedResult != arrayService.countOccurrences(testArray, 3)) {
            System.out.println(" Test " + testName + " has passed! " );
        } else {
            System.out.println(" Test " + testName + " has failed! ");

        }
    }


    public void replaceFirstTest(){

        ArrayService arrayService = new ArrayService();
        int[] testArray = new int [5];
        boolean replace = true;
        arrayService.fillArray(testArray,2);
        boolean actualResult = arrayService.replaceFirst(testArray, 2, 3);
        if (actualResult == replace){
            System.out.println(" Replace First Test - PASSED! ");
        } else {
            System.out.println(" Replace First Test - FAILED! ");
        }
    }

    public void notReplaceFirstTest(){

        ArrayService arrayService = new ArrayService();
        int[] testArray = new int [5];
        boolean replace = true;
        arrayService.fillArray(testArray, 3);
        boolean actualResult = arrayService.replaceFirst(testArray, 1, 6);
        if (actualResult != replace){
            System.out.println(" Not Replace First Test - PASSED! ");
        } else {
            System.out.println(" Not Replace First Test - FAILED! ");
        }
    }

    public void replaceAllTest(){
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 2, 5, 2};
        int replace = 3;
        if(arrayService.replaceAll(array, 2, 3) == replace){
            System.out.println(" TEST PASSED! ");
        } else {
            System.out.println(" TEST FAILED! ");
        }
    }

    public void notReplaceAllTest(){
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 2, 5, 2};
        int replace = 3;
        if(arrayService.replaceAll(array, 8, 0) == 0){
            System.out.println(" TEST PASSED! ");
        } else {
            System.out.println(" TEST FAILED! ");
        }
    }

    public void revertTest(){

        int[] array = {1, 2, 3, 4, 5};
        arrayService.revert(array);
        if(array[0] == 5 && array[1] == 4 && array[2] == 3 && array[3] == 2 && array[4] == 1){
            System.out.println(" Test passed! ");
        } else {
            System.out.println(" Test failed! ");
        }
    }

    public void sortingTest(){
        int[] array = { 3, 2, 5, 11, 9 };
        arrayService.sorting(array);
        if(array[0] == 2 && array[1] == 3 && array[2] == 5 && array[3] == 9 && array[4] == 11){
            System.out.println(" Test passed! ");
        } else {
            System.out.println(" Test failed! ");
        }
    }
}

